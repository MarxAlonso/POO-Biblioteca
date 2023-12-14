package Controladores;

import DAO.*;
import Modelo.Cliente;
import Vista.FormClientes;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class ControladorFormCliente implements ActionListener {
    FormClientes fcli;
    CRUDCliente crud;
    public ControladorFormCliente(FormClientes fcli) {
        this.fcli = fcli;
        this.crud = new CRUDCliente();
        crud.MostrarClienteEnTabla(fcli.jtblMostrarCliente);
        fcli.jbtnRegistrarUsuario.addActionListener(this);
        fcli.jbtnActualizarCliente.addActionListener(this);
        fcli.jbtnEliminarCliente.addActionListener(this);
        fcli.jbtnReportes.addActionListener(this);
        fcli.setTitle("Gestionar Clientes");
        fcli.jbtnBuscarCliente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BuscarClientePorDNI();
            }
        });
    }

    public void RegistrarCliente() {
        Cliente cliente = new Cliente();
        CRUDCliente crud = new CRUDCliente();
        if (!fcli.jtxtCodigoCliente.getText().isEmpty() && !fcli.jtxtNombreCliente.getText().isEmpty()
                && !fcli.jtxtApellidosCliente.getText().isEmpty() && !fcli.jtxtDniCliente.getText().isEmpty()) {
            if (!crud.existeCliente(fcli.jtxtDniCliente.getText().trim())) {
                cliente.setCodigo(fcli.jtxtCodigoCliente.getText().trim());
                cliente.setNombres(fcli.jtxtNombreCliente.getText().trim());
                cliente.setApellidos(fcli.jtxtApellidosCliente.getText().trim());
                cliente.setGenero(fcli.jtxtGeneroCliente.getText().trim());
                cliente.setDni(fcli.jtxtDniCliente.getText().trim());
                cliente.setNumCelular(fcli.jtxtNumCelCliente.getText().trim());
                cliente.setCorreoPersonal(fcli.jtxtCorreoPersonalCliente.getText().trim());

                if (crud.guardar(cliente)) {
                    JOptionPane.showMessageDialog(null, "Registro Guardado");
                    fcli.jtxtCodigoCliente.setBackground(Color.green);
                    fcli.jtxtNombreCliente.setBackground(Color.green);
                    fcli.jtxtApellidosCliente.setBackground(Color.green);
                    fcli.jtxtGeneroCliente.setBackground(Color.green);
                    fcli.jtxtDniCliente.setBackground(Color.green);
                    fcli.jtxtNumCelCliente.setBackground(Color.green);
                    fcli.jtxtCorreoPersonalCliente.setBackground(Color.green);
                } else {
                    JOptionPane.showMessageDialog(null, "Error al Guardar");
                }
            } else {
                JOptionPane.showMessageDialog(null, "El cliente ya está registrado en la Base de Datos.");
                fcli.jtxtCodigoCliente.setBackground(Color.white);
                fcli.jtxtNombreCliente.setBackground(Color.white);
                fcli.jtxtApellidosCliente.setBackground(Color.white);
                fcli.jtxtGeneroCliente.setBackground(Color.white);
                fcli.jtxtDniCliente.setBackground(Color.white);
                fcli.jtxtNumCelCliente.setBackground(Color.white);
                fcli.jtxtCorreoPersonalCliente.setBackground(Color.white);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Completa todos los campos");
            fcli.jtxtCodigoCliente.setBackground(Color.red);
            fcli.jtxtNombreCliente.setBackground(Color.red);
            fcli.jtxtApellidosCliente.setBackground(Color.red);
            fcli.jtxtGeneroCliente.setBackground(Color.red);
            fcli.jtxtDniCliente.setBackground(Color.red);
            fcli.jtxtNumCelCliente.setBackground(Color.red);
            fcli.jtxtCorreoPersonalCliente.setBackground(Color.red);
        }
        // Método para limpiar los campos
        ActualizarTabla();
        LimpiarCampos();
    }

    public void LimpiarCampos() {
        fcli.jtxtCodigoCliente.setText("CLI00000");
        fcli.jtxtNombreCliente.setText("");
        fcli.jtxtApellidosCliente.setText("");
        fcli.jtxtDniCliente.setText("");
        fcli.jtxtGeneroCliente.setText("");
        fcli.jtxtNumCelCliente.setText("");
        fcli.jtxtCorreoPersonalCliente.setText("");
    }

    void ActualizarTabla() {
        crud = new CRUDCliente();
        crud.MostrarClienteEnTabla(fcli.jtblMostrarCliente);
    }

    public void BuscarClientePorDNI() {
        String dniABuscar = fcli.jtxtBuscarDniCli.getText().trim();

        if (!dniABuscar.isEmpty()) {
            // Llama al método de la clase CRUDCliente para buscar el cliente por DNI
            Cliente cliente = crud.buscarPorDNI(dniABuscar);

            if (cliente != null) {
                // Si se encuentra el cliente, muestra los datos en los campos del formulario
                fcli.jtxtCodigoCliente.setText(cliente.getCodigo());
                fcli.jtxtNombreCliente.setText(cliente.getNombres());
                fcli.jtxtApellidosCliente.setText(cliente.getApellidos());
                fcli.jtxtGeneroCliente.setText(cliente.getGenero());
                fcli.jtxtDniCliente.setText(cliente.getDni());
                fcli.jtxtNumCelCliente.setText(cliente.getNumCelular());
                fcli.jtxtCorreoPersonalCliente.setText(cliente.getCorreoPersonal());
            } else {
                // Cliente no encontrado, puedes mostrar un mensaje de error o limpiar los campos
                JOptionPane.showMessageDialog(null, "Cliente no encontrado");
                LimpiarCampos();
            }
        } else {
            // DNI está vacío, puedes mostrar un mensaje de error si lo deseas
            JOptionPane.showMessageDialog(null, "Ingresa un DNI para buscar");
        }
    }

    public void ActualizarCliente() {
        // Obtener los datos ingresados en el formulario
        String codigo = fcli.jtxtCodigoCliente.getText().trim();
        String nombres = fcli.jtxtNombreCliente.getText().trim();
        String apellidos = fcli.jtxtApellidosCliente.getText().trim();
        String genero = fcli.jtxtGeneroCliente.getText().trim();
        String dni = fcli.jtxtDniCliente.getText().trim();
        String numCelular = fcli.jtxtNumCelCliente.getText().trim();
        String correoPersonal = fcli.jtxtCorreoPersonalCliente.getText().trim();

        if (!codigo.isEmpty() && !nombres.isEmpty() && !apellidos.isEmpty() && !dni.isEmpty()) {
            // Crear un objeto Cliente con los datos ingresados
            Cliente cliente = new Cliente();
            cliente.setCodigo(codigo);
            cliente.setNombres(nombres);
            cliente.setApellidos(apellidos);
            cliente.setGenero(genero);
            cliente.setDni(dni);
            cliente.setNumCelular(numCelular);
            cliente.setCorreoPersonal(correoPersonal);

            // Llamar al método de la clase CRUDCliente para actualizar el cliente
            if (crud.actualizar(cliente, codigo)) {
                JOptionPane.showMessageDialog(null, "Cliente actualizado correctamente");
                ActualizarTabla(); // Actualizar la tabla después de la actualización
                LimpiarCampos();
            } else {
                JOptionPane.showMessageDialog(null, "Error al actualizar el cliente");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Completa todos los campos antes de actualizar el cliente");
        }
    }

    public void EliminarCliente() {
        int filaSeleccionada = fcli.jtblMostrarCliente.getSelectedRow();

        if (filaSeleccionada >= 0) {
            DefaultTableModel model = (DefaultTableModel) fcli.jtblMostrarCliente.getModel();
            String idCliente = model.getValueAt(filaSeleccionada, 0).toString(); // Suponiendo que la columna 0 contiene el ID del cliente

            // Llama al método de la clase CRUDCliente para eliminar el cliente de la base de datos
            if (crud.eliminar(idCliente)) {
                model.removeRow(filaSeleccionada); // Elimina la fila de la tabla en la interfaz
                JOptionPane.showMessageDialog(null, "Cliente eliminado de la tabla y de la base de datos");
            } else {
                JOptionPane.showMessageDialog(null, "Error al eliminar el cliente");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecciona un cliente para eliminar de la tabla");
        }
        LimpiarCampos();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == fcli.jbtnRegistrarUsuario) {
            RegistrarCliente();
            ActualizarTabla(); // Para actualizar la tabla después de registrar el cliente
        }
        if (e.getSource() == fcli.jbtnActualizarCliente) {
            ActualizarCliente();
        }
        if (e.getSource() == fcli.jbtnEliminarCliente) {
            EliminarCliente();
        }
        if (e.getSource() == fcli.jbtnReportes) {
            Reportes reporte = new Reportes();
            reporte.ReportesClientes();
        }
    }
}
