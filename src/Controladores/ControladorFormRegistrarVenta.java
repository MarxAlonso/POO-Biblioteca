package Controladores;

import DAO.CRUDCliente;
import DAO.CRUDRegistrarVenta;
import DAO.ConectarBD;
import Modelo.CabeceraVenta;
import Modelo.DetalleVenta;
import Vista.FormRegistrarVenta;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class ControladorFormRegistrarVenta implements ActionListener {

    FormRegistrarVenta vista;
    CRUDRegistrarVenta crud;
    ArrayList<DetalleVenta> listaVentas = new ArrayList<>();
    //Modelo de los datos
    DefaultTableModel modeloDatosVentas;
    DetalleVenta libro;
    String idCliente = "";//id del cliente sleccionado
    String idLibro = "";
    String titulo = "";
    int cantidadLibroBBDD = 0;
    double precioUnitario = 0.0;
    int porcentajeIgv = 0;
    int cantidad = 0;//cantidad de productos a comprar
    double subtotal = 0.0;//cantidad por precio
    double descuento = 10.0;
    double igv = 0.0;
    double totalPagar = 0.0;
    //variables para calculos globales
    double subtotalGeneral = 0.0;
    double descuentoGeneral = 0.0;
    double igvGeneral = 0.0;
    double totalPagarGeneral = 0.0;
    //fin de variables de calculos globales
    int auxIdDetalle = 1;//id del detalle de venta

    public ControladorFormRegistrarVenta(FormRegistrarVenta vista) {
        this.vista = vista;
        this.crud = new CRUDRegistrarVenta();
        vista.jbtnAñadirLibro.addActionListener(this);
        vista.jbtnBuscarCliente.addActionListener(this);
        vista.jbtnCalcularCambio.addActionListener(this);
        vista.jbtnRegistrarVentas.addActionListener(this);
        vista.setSize(new Dimension(800,650));
        vista.setTitle("Registrar Venta");
        vista.repaint();
        vista.jtxtSubTotal.setText("0.0");
        vista.jtxtIgv.setText("0.0");
        vista.jtxtDescuento.setText("0.0");
        vista.jtxtTotalPagar.setText("0.0");
        vista.setTitle("Gestionar Ventas");
        vista.setSize(new Dimension(947,625));
        vista.repaint();
        vista.jtxtEfectivo.setEnabled(false);
        vista.jbtnCalcularCambio.setEnabled(false);
        // Inicializar el modelo de datos aquí
        this.modeloDatosVentas = new DefaultTableModel();
        // añadir columnas
        this.modeloDatosVentas.addColumn("N");
        this.modeloDatosVentas.addColumn("Nombre");
        this.modeloDatosVentas.addColumn("Cantidad");
        this.modeloDatosVentas.addColumn("P. Unitario");
        this.modeloDatosVentas.addColumn("SubTotal");
        this.modeloDatosVentas.addColumn("Descuento");
        this.modeloDatosVentas.addColumn("Ivg");
        this.modeloDatosVentas.addColumn("Total Pagar");
        this.modeloDatosVentas.addColumn("Accion");
        // agregar los datos del modelo a la tabla
        this.vista.jtblFacturacion.setModel(this.modeloDatosVentas);
        CargarComboClientes();
        CargarComboLibros();
        vista.jtblFacturacion.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                int fila_point = vista.jtblFacturacion.rowAtPoint(evt.getPoint());

                // Verificar que haya al menos una fila en la tabla
                if (fila_point >= 0 && fila_point < modeloDatosVentas.getRowCount()) {
                    int columna_point = 0;
                    int idArrayList = (int) modeloDatosVentas.getValueAt(fila_point, columna_point);
                    int opcion = JOptionPane.showConfirmDialog(null, "¿Eliminar Producto?");
                    // Opciones de confirm dialog - (si = 0; no = 1; cancel = 2; close = -1)
                    switch (opcion) {
                        case 0: // Presionó sí
                            listaVentas.remove(idArrayList - 1);
                            CalcularTotalPagar();
                            listaTablaLibrosVenta();
                            break;
                        case 1: // Presionó no
                            break;
                        default: // Presionó cancel (2) o close (-1)
                            break;
                    }
                }
            }
        });
    }
    //metodo para inicializar la tabla de los productos
    // Método para inicializar la tabla de los productos

    public void inicializarTablaLibroVenta() {
        this.modeloDatosVentas = new DefaultTableModel();
        // añadir columnas
        this.modeloDatosVentas.addColumn("N");
        this.modeloDatosVentas.addColumn("Nombre");
        this.modeloDatosVentas.addColumn("Cantidad");
        this.modeloDatosVentas.addColumn("P. Unitario");
        this.modeloDatosVentas.addColumn("SubTotal");
        this.modeloDatosVentas.addColumn("Descuento");
        this.modeloDatosVentas.addColumn("Ivg");
        this.modeloDatosVentas.addColumn("Total Pagar");
        this.modeloDatosVentas.addColumn("Accion");
        // agregar los datos del modelo a la tabla
        this.vista.jtblFacturacion.setModel(this.modeloDatosVentas);
    }

    //metodo para presentar la informacion de la tavla DetalleVenta
    public void listaTablaLibrosVenta() {
        this.modeloDatosVentas.setRowCount(listaVentas.size());
        for (int i = 0; i < listaVentas.size(); i++) {
            DetalleVenta venta = listaVentas.get(i);

            if (venta != null) {
                this.modeloDatosVentas.setValueAt(i + 1, i, 0);
                this.modeloDatosVentas.setValueAt(venta.getNombre(), i, 1);
                this.modeloDatosVentas.setValueAt(venta.getCantidad(), i, 2);
                this.modeloDatosVentas.setValueAt(venta.getPrecioUnitario(), i, 3);
                this.modeloDatosVentas.setValueAt(venta.getSubTotal(), i, 4);
                this.modeloDatosVentas.setValueAt(venta.getDescuento(), i, 5);
                this.modeloDatosVentas.setValueAt(venta.getIgv(), i, 6);
                this.modeloDatosVentas.setValueAt(venta.getTotalPagar(), i, 7);
                this.modeloDatosVentas.setValueAt("Eliminar", i, 8);
            }
        }
        this.vista.jtblFacturacion.setModel(this.modeloDatosVentas);
    }

    public void CargarComboClientes() {
        Connection cn = ConectarBD.conectar();
        String sql = "select * from cliente where indicador = 'S'";
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

    public void CargarComboLibros() {    //    Metodo para cargar los productos en el jComboBox
        Connection cn = ConectarBD.conectar();
        String sql = "select * from libros where indicador = 'S'";
        Statement st;
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            vista.jcboLibro.removeAllItems();
            vista.jcboLibro.addItem("Seleccione libro:");
            while (rs.next()) {
                vista.jcboLibro.addItem(rs.getString("titulo"));
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("¡Error al cargar libro, !" + e);
        }
    }

    public boolean validar(String valor) {//        Metodo para validar que el usuario no ingrese caracteres no numericos
        try {
            int num = Integer.parseInt(valor);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public boolean validarDouble(String valor) { //    Metodo para validar que el usuario no ingrese caracteres no numericos
        try {
            double num = Double.parseDouble(valor);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public void DatosDelProducto() { //   Metodo para mostrar los datos del producto seleccionado
        try {
            String sql = "select * from libros where titulo = '" + vista.jcboLibro.getSelectedItem() + "'";
            Connection cn = ConectarBD.conectar();
            Statement st;
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                idLibro = rs.getString("idLibro");
                titulo = rs.getString("titulo");
                cantidadLibroBBDD = rs.getInt("cantidad");
                precioUnitario = rs.getDouble("precio");
                porcentajeIgv = rs.getInt("porcentajeIGV");
                this.CalcularIgv(precioUnitario, porcentajeIgv);//calcula y retorna el ivg
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener datos del libro, " + e);
        }
    }

    public double CalcularIgv(double precio, int porcentajeIgv) {//        Metodo para calcular iva
        int p_igv = porcentajeIgv;

        switch (p_igv) {
            case 0:
                igv = 0.0;
                break;
            case 18:
                igv = (precio * cantidad) * 0.18;
                break;
            default:
                break;
        }

        return igv;
    }

    public void CalcularTotalPagar() { //Metodo para calcular el total a pagar de todos los productos agregados
        subtotalGeneral = 0;
        descuentoGeneral = 0.0;
        igvGeneral = 0;
        totalPagarGeneral = 0;

        for (DetalleVenta elemento : listaVentas) {
            if (elemento != null) {
                subtotalGeneral += elemento.getSubTotal();
                descuentoGeneral += elemento.getDescuento();
                igvGeneral += elemento.getIgv();
                totalPagarGeneral += elemento.getTotalPagar();
            }
        }
        //redondear decimales
        subtotalGeneral = (double) Math.round(subtotalGeneral * 100) / 100;
        igvGeneral = (double) Math.round(igvGeneral * 100) / 100;
        descuentoGeneral = (double) Math.round(descuentoGeneral * 100) / 100;
        totalPagarGeneral = (double) Math.round(totalPagarGeneral * 100) / 100;

        //enviar datos a la vista
        vista.jtxtSubTotal.setText(String.valueOf(subtotalGeneral));
        vista.jtxtIgv.setText(String.valueOf(igvGeneral));
        vista.jtxtDescuento.setText(String.valueOf(descuentoGeneral));
        vista.jtxtTotalPagar.setText(String.valueOf(totalPagarGeneral));
    }

    /*
    Metodo para obtener id del cliente
     */
    public void ObtenerIdCliente() {
        try {
            String sql = "select * from cliente where concat(nombre,' ',apellido) = '" + vista.jcboCliente.getSelectedItem() + "' ";
            Connection cn = ConectarBD.conectar();
            Statement st;
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                idCliente = rs.getString("idCliente");
            }

        } catch (SQLException e) {
            System.out.println("Error al obtener id del cliente, " + e);
        }
    }

    //metodo para restar la cantidad (stock) de los productos vendidos
    public void RestarStockLibros(String idLibro, int cantidad) {
        int cantidadLibrosBaseDeDatos = 0;
        try {
            Connection cn = ConectarBD.conectar();
            String sql = "select idLibro, cantidad from libros where idLibro = '" + idLibro + "' and indicador='S'";
            Statement st;
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                cantidadLibrosBaseDeDatos = rs.getInt("cantidad");
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al restar cantidad 1, " + e);
        }

        try {
            Connection cn = ConectarBD.conectar();
            PreparedStatement consulta = cn.prepareStatement("update libros set cantidad=? where idLibro = '" + idLibro + "'");
            int cantidadNueva = cantidadLibrosBaseDeDatos - cantidad;
            consulta.setInt(1, cantidadNueva);
            if (consulta.executeUpdate() > 0) {
                //System.out.println("Todo bien");
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al restar cantidad 2, " + e);
        }
    }

    public void manejarClicTabla(MouseEvent evt) {
        int fila_point = vista.jtblFacturacion.rowAtPoint(evt.getPoint());
        int columna_point = 0;
        if (fila_point > -1) {
            int idArrayList = (int) modeloDatosVentas.getValueAt(fila_point, columna_point);
            int opcion = JOptionPane.showConfirmDialog(null, "¿Eliminar Producto?");
            //opciones de confir dialog - (si = 0; no = 1; cancel = 2; close = -1)
            switch (opcion) {
                case 0: //presione si
                    listaVentas.remove(idArrayList - 1);
                    CalcularTotalPagar();
                    listaTablaLibrosVenta();
                    break;
                case 1: //presione no
                    break;
                default://sea que presione cancel (2) o close (-1)
                    break;
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.jbtnBuscarCliente) {
            String clienteBuscar = vista.jtxtClienteBuscar.getText().trim();
            Connection cn = ConectarBD.conectar();
            String sql = "select nombre, apellido from cliente where dni = '" + clienteBuscar + "'";
            Statement st;
            try {
                st = cn.createStatement();
                ResultSet rs = st.executeQuery(sql);

                if (rs.next()) {
                    vista.jcboCliente.setSelectedItem(rs.getString("nombre") + " " + rs.getString("apellido"));
                } else {
                    vista.jcboCliente.setSelectedItem("Seleccione cliente:");
                    JOptionPane.showMessageDialog(null, "¡Dni de cliente incorrecta o no encontrada!");
                }
                vista.jtxtClienteBuscar.setText("");
                cn.close();
            } catch (Exception ex) {
                System.out.println("¡Error al buscar cliente!, " + ex);
            }
        }

        if (e.getSource() == vista.jbtnAñadirLibro) {
            String combo = vista.jcboLibro.getSelectedItem().toString();
            //validar que seleccione un producto
            if (combo.equalsIgnoreCase("Seleccione libro:")) {
                JOptionPane.showMessageDialog(null, "Seleccione un libro");
            } else {
                //validar que ingrese una cantidad
                if (!vista.jtxtCantidad.getText().isEmpty()) {
                    //validar que el usuario no ingrese caracteres no numericos
                    boolean validacion = validar(vista.jtxtCantidad.getText());
                    if (validacion == true) {
                        //validar que la cantidad sea mayor a cero
                        if (Integer.parseInt(vista.jtxtCantidad.getText()) > 0) {
                            cantidad = Integer.parseInt(vista.jtxtCantidad.getText());
                            //ejecutar metodo para obtener datos del producto
                            this.DatosDelProducto();
                            //validar que la cantidad de productos seleccionado no sea mayor al stock de la base de datos
                            if (cantidad <= cantidadLibroBBDD) {

                                subtotal = precioUnitario * cantidad;
                                totalPagar = subtotal + igv - descuento;

                                //redondear decimales
                                subtotal = (double) Math.round(subtotal * 100) / 100;
                                igv = (double) Math.round(igv * 100) / 100;
                                descuento = (double) Math.round(descuento * 100) / 100;
                                totalPagar = (double) Math.round(totalPagar * 100) / 100;

                                //se crea un nuevo producto
                                libro = new DetalleVenta(auxIdDetalle,//idDetalleVenta
                                        1, //idCabecera
                                        idLibro,
                                        titulo,
                                        Integer.parseInt(vista.jtxtCantidad.getText()),
                                        precioUnitario,
                                        subtotal,
                                        descuento,
                                        igv,
                                        totalPagar,
                                        1//estado
                                );
                                // Añadir a la lista (este bloque está duplicado)
                                listaVentas.add(libro);
                                JOptionPane.showMessageDialog(null, "Libro Agregado");
                                auxIdDetalle++;
                                vista.jtxtCantidad.setText("");//limpiar el campo
                                // volver a cargar combo productos
                                this.CargarComboLibros();
                                this.CalcularTotalPagar();
                                vista.jtxtEfectivo.setEnabled(true);
                                vista.jbtnCalcularCambio.setEnabled(true);

                                // Llama al método después de agregar el libro (este bloque está duplicado)
                                this.listaTablaLibrosVenta();

                            } else {
                                JOptionPane.showMessageDialog(null, "La cantidad supera el Stock");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "La cantidad no puede ser cero (0), ni negativa");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "En la cantidad no se admiten caracteres no numericos");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Ingresa la cantidad de productos");
                }
            }
        }
        if (e.getSource() == vista.jbtnCalcularCambio) {
            if (!vista.jtxtEfectivo.getText().isEmpty()) {
                //validamos que el usuario no ingrese otros caracteres no numericos 
                boolean validacion = validarDouble(vista.jtxtEfectivo.getText());
                if (validacion == true) {
                    //validar que el efectivo sea mayor a cero
                    double efc = Double.parseDouble(vista.jtxtEfectivo.getText().trim());
                    double top = Double.parseDouble(vista.jtxtTotalPagar.getText().trim());

                    if (efc < top) {
                        JOptionPane.showMessageDialog(null, "El Dinero en efectivo no es suficiente");
                    } else {
                        double cambio = (efc - top);
                        double cambi = (double) Math.round(cambio * 100d) / 100;
                        String camb = String.valueOf(cambi);
                        vista.jtxtCambio.setText(camb);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No de admiten caracteres no numericos");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ingrese dinero en efectivo para calcular cambio");
            }
        }
        if (e.getSource() == vista.jbtnRegistrarVentas) {
            CabeceraVenta cabeceraVenta = new CabeceraVenta();
            DetalleVenta detalleVenta = new DetalleVenta();
            CRUDRegistrarVenta controlVenta = new CRUDRegistrarVenta();

            String fechaActual = "";
            Date date = new Date();
            fechaActual = new SimpleDateFormat("yyyy/MM/dd").format(date);

            if (!vista.jcboCliente.getSelectedItem().equals("Seleccione cliente:")) {
                if (listaVentas.size() > 0) {

                    //metodo para obtener el id del cliente
                    this.ObtenerIdCliente();
                    //registrar cabecera
                    cabeceraVenta.setIdCabeceraventa(0);
                    cabeceraVenta.setIdCliente(idCliente);
                    cabeceraVenta.setValorPagar(Double.parseDouble(vista.jtxtTotalPagar.getText()));
                    cabeceraVenta.setFechaVenta(fechaActual);
                    cabeceraVenta.setEstado(1);

                    if (controlVenta.guardar(cabeceraVenta)) {
                        JOptionPane.showMessageDialog(null, "¡Venta Registrada!");

                        //Generar la factura de venta
                        ControladorVentaPDF pdf = new ControladorVentaPDF();
                        pdf.DatosCliente(idCliente);
                        pdf.generarFacturaPDF(idCliente, vista.jtblFacturacion, vista.jtxtTotalPagar);

                        //guardar detalle
                        for (DetalleVenta elemento : listaVentas) {
                            detalleVenta.setIdDetalleVenta(0);
                            detalleVenta.setIdCabeceraVenta(0);
                            detalleVenta.setIdLibro(elemento.getIdLibro());
                            detalleVenta.setCantidad(elemento.getCantidad());
                            detalleVenta.setPrecioUnitario(elemento.getPrecioUnitario());
                            detalleVenta.setSubTotal(elemento.getSubTotal());
                            detalleVenta.setDescuento(elemento.getDescuento());
                            detalleVenta.setIgv(elemento.getIgv());
                            detalleVenta.setTotalPagar(elemento.getTotalPagar());
                            detalleVenta.setEstado(1);

                            if (controlVenta.guardarDetalle(detalleVenta)) {
                                //System.out.println("Detalle de Venta Registrado");

                                vista.jtxtSubTotal.setText("0.0");
                                vista.jtxtIgv.setText("0.0");
                                vista.jtxtDescuento.setText("0.0");
                                vista.jtxtTotalPagar.setText("0.0");
                                vista.jtxtEfectivo.setText("");
                                vista.jtxtCambio.setText("0.0");
                                auxIdDetalle = 1;

                                this.CargarComboClientes();
                                this.RestarStockLibros(elemento.getIdLibro(), elemento.getCantidad());

                            } else {
                                JOptionPane.showMessageDialog(null, "¡Error al guardar detalle de venta!");
                            }
                        }
                        //vaciamos la lista
                        listaVentas.clear();
                        listaTablaLibrosVenta();

                    } else {
                        JOptionPane.showMessageDialog(null, "¡Error al guardar cabecera de venta!");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "¡Seleccione un libro!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "¡Seleccione un cliente!");
            }
        }
    }
}
