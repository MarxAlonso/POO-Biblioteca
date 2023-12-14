package Controladores;

import DAO.CRUDTrabajadores;
import Modelo.*;
import Vista.*;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ControladorFormTrabajador implements ActionListener {

    FormTrabajadores ftrb;
    CRUDTrabajadores crud;

    //Constructor
    public ControladorFormTrabajador(FormTrabajadores forma) {
        this.ftrb = forma;
        this.crud = new CRUDTrabajadores();
        crud.MostrarTrabajadoresEnTabla(ftrb.jtblTablaTrabajador);
        ftrb.jbtnRegistrarTrabajador.addActionListener(this);
        ftrb.jbtnActualizarTrabajador.addActionListener(this);
        ftrb.jbtnEliminarTrabajador.addActionListener(this);
        ftrb.jbtnReporteTrabajador.addActionListener(this);
        ftrb.setTitle("Gestionar Trabajadores");
        ftrb.jbtnBuscarTrab.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BuscarTrabajadorPorDNI();
            }
        });
        ftrb.jbtnBuscarTrab.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BuscarTrabajadorPorDNI();
            }
        });
    }

    // Método para actualizar la tabla
    void ActualizarTabla() {
        crud = new CRUDTrabajadores();
        crud.MostrarTrabajadoresEnTabla(ftrb.jtblTablaTrabajador);
    }

    public void RegistrarTrabajador() {
        PersonalBiblioteca trabajador = new PersonalBiblioteca();
        CRUDTrabajadores crud = new CRUDTrabajadores();
        if (!ftrb.jtxtCodigoTrabajador.getText().isEmpty() && !ftrb.jtxtNombreTrabajador.getText().isEmpty()
                && !ftrb.jtxtApellidosTrabajador.getText().isEmpty() && !ftrb.jtxtDNITrabajador.getText().isEmpty() && !ftrb.jtxtCorreoTrabajador.getText().isEmpty()
                && !ftrb.jtxtCelularTtabajador.getText().isEmpty()) {
            if (!crud.existeTrabajador(ftrb.jtxtDNITrabajador.getText().trim())) {
                trabajador.setCodTrab(ftrb.jtxtCodigoTrabajador.getText().trim());
                trabajador.setNomTrab(ftrb.jtxtNombreTrabajador.getText().trim());
                trabajador.setApeTrab(ftrb.jtxtApellidosTrabajador.getText().trim());
                trabajador.setDni(ftrb.jtxtDNITrabajador.getText().trim());
                trabajador.setCorreoTrab(ftrb.jtxtCorreoTrabajador.getText().trim());
                trabajador.setCelular(ftrb.jtxtCelularTtabajador.getText().trim());
                trabajador.setCelular(ftrb.jtxtCelularTtabajador.getText().trim());
                trabajador.setContraseña(ftrb.jtxtContraseña.getText().trim());
                String cargo = ftrb.jcboCargoTrabajador.getSelectedItem().toString();
                if (cargo.equalsIgnoreCase("SISTEMAS")) {
                    trabajador.setCargo("SISTEMAS");
                } else if (cargo.equalsIgnoreCase("ADMINISTRADOR")) {
                    trabajador.setCargo("ADMINISTRADOR");
                } else if (cargo.equalsIgnoreCase("LOGISTICA")) {
                    trabajador.setCargo("LOGISTICA");
                } else if (cargo.equalsIgnoreCase("CONTABILIDAD")) {
                    trabajador.setCargo("CONTABILIDAD");
                }

                trabajador.setSueldo(ftrb.jtxtSueldo.getText().trim());
                if (crud.guardar(trabajador)) {
                    JOptionPane.showMessageDialog(null, "Registro Guardado");
                    ftrb.jtxtCodigoTrabajador.setBackground(Color.green);
                    ftrb.jtxtNombreTrabajador.setBackground(Color.green);
                    ftrb.jtxtApellidosTrabajador.setBackground(Color.green);
                    ftrb.jtxtDNITrabajador.setBackground(Color.green);
                    ftrb.jtxtCorreoTrabajador.setBackground(Color.green);
                    ftrb.jtxtCelularTtabajador.setBackground(Color.green);
                    ftrb.jtxtContraseña.setBackground(Color.green);
                    ftrb.jtxtSueldo.setBackground(Color.green);
                } else {
                    JOptionPane.showMessageDialog(null, "Error al Guardar");
                }
            } else {
                JOptionPane.showMessageDialog(null, "El trabajador ya está registrado en la Base de Datos.");
                ftrb.jtxtCodigoTrabajador.setBackground(Color.white);
                ftrb.jtxtNombreTrabajador.setBackground(Color.white);
                ftrb.jtxtApellidosTrabajador.setBackground(Color.white);
                ftrb.jtxtDNITrabajador.setBackground(Color.white);
                ftrb.jtxtCorreoTrabajador.setBackground(Color.white);
                ftrb.jtxtCelularTtabajador.setBackground(Color.white);
                ftrb.jtxtContraseña.setBackground(Color.white);
                ftrb.jtxtSueldo.setBackground(Color.white);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Completa todos los campos");
            ftrb.jtxtCodigoTrabajador.setBackground(Color.red);
            ftrb.jtxtNombreTrabajador.setBackground(Color.red);
            ftrb.jtxtApellidosTrabajador.setBackground(Color.red);
            ftrb.jtxtDNITrabajador.setBackground(Color.red);
            ftrb.jtxtCorreoTrabajador.setBackground(Color.red);
            ftrb.jtxtCelularTtabajador.setBackground(Color.red);
            ftrb.jtxtContraseña.setBackground(Color.red);
            ftrb.jtxtSueldo.setBackground(Color.red);
        }
        // Método para limpiar los campos
        ActualizarTabla();
        LimpiarCampos();

    }

    public void LimpiarCampos() {
        ftrb.jtxtCodigoTrabajador.setText("TRB000");
        ftrb.jtxtNombreTrabajador.setText("");
        ftrb.jtxtApellidosTrabajador.setText("");
        ftrb.jtxtDNITrabajador.setText("");
        ftrb.jtxtCorreoTrabajador.setText("");
        ftrb.jtxtContraseña.setText("");
        ftrb.jtxtCelularTtabajador.setText("");
        ftrb.jtxtSueldo.setText("");
    }

    public void BuscarTrabajadorPorDNI() {
        String dniABuscar = ftrb.jtxtDniBuscar.getText().trim();

        if (!dniABuscar.isEmpty()) {
            // Llama al método de la clase CRUDCliente para buscar el cliente por DNI
            PersonalBiblioteca trabajador = crud.buscarPorDNI(dniABuscar);

            if (trabajador != null) {
                // Si se encuentra el cliente, muestra los datos en los campos del formulario
                ftrb.jtxtCodigoTrabajador.setText(trabajador.getCodTrab());
                ftrb.jtxtNombreTrabajador.setText(trabajador.getNomTrab());
                ftrb.jtxtApellidosTrabajador.setText(trabajador.getApeTrab());
                ftrb.jtxtDNITrabajador.setText(trabajador.getDni());
                ftrb.jtxtCorreoTrabajador.setText(trabajador.getCorreoTrab());
                ftrb.jtxtCelularTtabajador.setText(trabajador.getCelular());
                ftrb.jtxtContraseña.setText(trabajador.getCelular());
                ftrb.jcboCargoTrabajador.setSelectedItem(trabajador.getCargo());
                ftrb.jtxtSueldo.setText(trabajador.getSueldo());

            } else {
                // Cliente no encontrado, puedes mostrar un mensaje de error o limpiar los campos
                JOptionPane.showMessageDialog(null, "Trabajador no encontrado");
                LimpiarCampos();
            }
        } else {
            // DNI está vacío, puedes mostrar un mensaje de error si lo deseas
            JOptionPane.showMessageDialog(null, "Ingresa un DNI para buscar");
        }
    }

    public void ActualizarTrabajador() {
        // Obtener los datos ingresados en el formulario
        String codigo = ftrb.jtxtCodigoTrabajador.getText().trim();
        String nombres = ftrb.jtxtNombreTrabajador.getText().trim();
        String apellidos = ftrb.jtxtApellidosTrabajador.getText().trim();
        String dni = ftrb.jtxtDNITrabajador.getText().trim();
        String correo = ftrb.jtxtCorreoTrabajador.getText().trim();
        String celular = ftrb.jtxtCelularTtabajador.getText().trim();
        String contraseña = ftrb.jtxtContraseña.getText().trim();
        String cargo = ftrb.jcboCargoTrabajador.getSelectedItem().toString();
        String sueldo = ftrb.jtxtSueldo.getText().trim();

        if (!codigo.isEmpty() && !nombres.isEmpty() && !apellidos.isEmpty() && !dni.isEmpty()) {
            // Crear un objeto Trabajador con los datos ingresados
            PersonalBiblioteca trabajador = new PersonalBiblioteca();
            trabajador.setCodTrab(codigo);
            trabajador.setNomTrab(nombres);
            trabajador.setApeTrab(apellidos);
            trabajador.setDni(dni);
            trabajador.setCorreoTrab(correo);
            trabajador.setContraseña(contraseña);
            trabajador.setCelular(celular);
            trabajador.setCargo(cargo);
            trabajador.setSueldo(sueldo);

            // Llamar al método de la clase CRUDTrabajador para actualizar el trabajador
            if (crud.actualizar(trabajador)) {
                JOptionPane.showMessageDialog(null, "Trabajador actualizado correctamente");
                ActualizarTabla(); // Actualizar la tabla después de la actualización
                LimpiarCampos();
            } else {
                JOptionPane.showMessageDialog(null, "Error al actualizar el trabajador");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Completa todos los campos antes de actualizar el trabajador");
        }
    }

    public void EliminarTrabajador() {
        int filaSeleccionada = ftrb.jtblTablaTrabajador.getSelectedRow();

        if (filaSeleccionada >= 0) {
            DefaultTableModel model = (DefaultTableModel) ftrb.jtblTablaTrabajador.getModel();
            String idTrabajador = model.getValueAt(filaSeleccionada, 0).toString(); // Suponiendo que la columna 0 contiene el ID del trabajador

            // Llama al método de la clase CRUDTrabajador para eliminar el trabajador de la base de datos
            if (crud.eliminar(idTrabajador)) {
                model.removeRow(filaSeleccionada); // Elimina la fila de la tabla en la interfaz
                JOptionPane.showMessageDialog(null, "Trabajador eliminado de la tabla y de la base de datos");
            } else {
                JOptionPane.showMessageDialog(null, "Error al eliminar el trabajador");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecciona un trabajador para eliminar de la tabla");
        }
        LimpiarCampos();
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ftrb.jbtnRegistrarTrabajador) {
            RegistrarTrabajador();
            ActualizarTabla(); // Para actualizar la tabla después de registrar el cliente
        }
        if (e.getSource() == ftrb.jbtnActualizarTrabajador) {
            ActualizarTrabajador();
        }
        if (e.getSource() == ftrb.jbtnEliminarTrabajador) {
            EliminarTrabajador();
        }
        if (e.getSource() == ftrb.jbtnReporteTrabajador) {
            Reportes reporte = new Reportes();
            reporte.ReportesTrabajadores();
        }
    }
}
