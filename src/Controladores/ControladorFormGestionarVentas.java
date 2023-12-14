package Controladores;

import DAO.CRUDRegistrarVenta;
import DAO.ConectarBD;
import Modelo.CabeceraVenta;
import Vista.FormGestionarVentas;
import com.sun.java.accessibility.util.AWTEventMonitor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ControladorFormGestionarVentas implements ActionListener {

    FormGestionarVentas vista;
    CRUDRegistrarVenta crud;
    String idCliente = "";
    int idVenta;
    DefaultTableModel model;

    public ControladorFormGestionarVentas(FormGestionarVentas vista) {
        this.vista = vista;
        this.crud = new CRUDRegistrarVenta();
        this.model = new DefaultTableModel();
        vista.jbtnActualizar.addActionListener(this);
        vista.jbtnTotalRecaudado.addActionListener(this);
        vista.jbtnReporteVenta.addActionListener(this);
        CargarComboClientes();
        CargarTablaVentas();
    }

    /* metodo para limpiar*/
    public void Limpiar() {
        vista.jtxtTotalPagar.setText("");
        vista.jtxtfecha.setText("");
        vista.jcboCliente.setSelectedItem("Seleccione cliente:");
        vista.jcboEstado.setSelectedItem("Vendido");
        idCliente = "";
    }

    // metodo para mostrar todos los clientes registrados
    public void CargarTablaVentas() {
        Connection con = ConectarBD.conectar();
        String sql = "select cv.idCabeceraVenta as id, concat(c.nombre, ' ', c.apellido) as cliente, "
                + "cv.valorPagar as total, cv.fechaVenta as fecha, cv.estado "
                + "from cabeceraventa as cv, cliente as c where cv.idCliente = c.idCliente;";
        Statement st;
        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            vista.jtblVentasRegistradas = new JTable(model);
            vista.jScrollPane1.setViewportView(vista.jtblVentasRegistradas);

            model.addColumn("N°");//ID
            model.addColumn("Cliente");
            model.addColumn("Total Pagar");
            model.addColumn("Fecha Venta");
            model.addColumn("Estado");

            while (rs.next()) {
                Object fila[] = new Object[5];
                for (int i = 0; i < 5; i++) {
                    if (i == 4) {
                        String estado = String.valueOf(rs.getObject(i + 1));
                        if (estado.equalsIgnoreCase("1")) {
                            fila[i] = "Vendido";
                        } else {
                            fila[i] = "En proceso";
                        }
                    } else {
                        fila[i] = rs.getObject(i + 1);
                    }
                }
                model.addRow(fila);
            }
            con.close();
        } catch (SQLException e) {
            System.out.println("Error al llenar la tabla de ventas: " + e);
        }
        configurarEventoTabla();
        //evento para obtener campo al cual el usuario da click
        //y obtener la interfaz que mostrara la informacion general
        vista.jtblVentasRegistradas.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila_point = vista.jtblVentasRegistradas.rowAtPoint(e.getPoint());
                int columna_point = 0;

                if (fila_point > -1) {
                    idVenta = (int) model.getValueAt(fila_point, columna_point);
                    EnviarDatosVentaSeleccionada(idVenta);//metodo
                }
            }
        });
    }

    public void configurarEventoTabla() {
        vista.jtblVentasRegistradas.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila_point = vista.jtblVentasRegistradas.rowAtPoint(e.getPoint());
                int columna_point = 0;

                if (fila_point > -1) {
                    idVenta = (int) model.getValueAt(fila_point, columna_point);
                    EnviarDatosVentaSeleccionada(idVenta);
                }
            }
        });
    }

    // Metodo que envia datos seleccionados
    private void EnviarDatosVentaSeleccionada(int idVenta) {
        try {
            Connection con = ConectarBD.conectar();
            PreparedStatement pst = con.prepareStatement(
                    "select cv.idCabeceraVenta, cv.idCliente, concat(c.nombre, ' ', c.apellido) as cliente, "
                    + "cv.valorPagar, cv.fechaVenta, cv.estado  from cabeceraventa as cv, "
                    + "cliente as c where  cv.idCabeceraVenta = '" + idVenta + "' and cv.idCliente = c.idCliente;");
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                vista.jcboCliente.setSelectedItem(rs.getString("cliente"));
                vista.jtxtTotalPagar.setText(rs.getString("valorPagar"));
                vista.jtxtfecha.setText(rs.getString("fechaVenta"));
                int estado = rs.getInt("estado");
                if (estado == 1) {
                    vista.jcboEstado.setSelectedItem("Vendido");
                } else {
                    vista.jcboEstado.setSelectedItem("En Proceso");
                }
            }
            con.close();
        } catch (SQLException e) {
            System.out.println("Error al seleccionar venta: " + e);
        }
    }

    /*
    Metodo para cargar los clientes en el jComboBox
     */
    public void CargarComboClientes() {
        Connection cn = ConectarBD.conectar();
        String sql = "select * from cliente";
        Statement st;
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            vista.jcboCliente.removeAllItems();
            vista.jcboCliente.addItem("Seleccione cliente:");
            while (rs.next()) {
                vista.jcboCliente.addItem(rs.getString("nombre") + " " + rs.getString("apellido"));
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("¡Error al cargar clientes, !" + e);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.jbtnActualizar) {
            CabeceraVenta cabeceraVenta = new CabeceraVenta();
            String cliente, estado;
            cliente = vista.jcboCliente.getSelectedItem().toString().trim();
            estado = vista.jcboEstado.getSelectedItem().toString().trim();

            //obtener el id del cliente
            try {
                Connection cn = ConectarBD.conectar();
                PreparedStatement pst = cn.prepareStatement(
                        "select idCliente, concat(nombre, ' ', apellido) as cliente "
                        + "from cliente where concat(nombre, ' ', apellido) = '" + cliente + "'");
                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                    idCliente = rs.getString("idCliente");
                }
                cn.close();
            } catch (Exception ex) {
                System.out.println("Error en cargar el id cliente: " + ex);
            }

            //Actualizar datos
            if (!cliente.equalsIgnoreCase("Seleccione cliente:")) {
                cabeceraVenta.setIdCliente(idCliente);
                if (estado.equalsIgnoreCase("Vendido")) {
                    cabeceraVenta.setEstado(1);
                } else {
                    cabeceraVenta.setEstado(0);
                }

                if (crud.actualizar(cabeceraVenta, Integer.toString(idVenta))) {
                    JOptionPane.showMessageDialog(null, "¡Registro Actualizado!");
                    this.CargarTablaVentas();
                    this.Limpiar();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al Actualizar");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Seleccione un registro para actualizar datos");
            }
        }
        if (e.getSource() == vista.jbtnTotalRecaudado) {
            double totalRecaudado = crud.obtenerTotalRecaudado();
            JOptionPane.showMessageDialog(null, "Total recaudado: S/" + totalRecaudado);
        }
        if (e.getSource() == vista.jbtnReporteVenta) {
            Reportes reporte = new Reportes();
            reporte.ReportesGestionarVentas();
        }
    }
}
