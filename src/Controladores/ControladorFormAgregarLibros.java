package Controladores;
import DAO.CRUDLibro;
import Modelo.*;
import Vista.FormAgregarLibros;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class ControladorFormAgregarLibros implements ActionListener {
    FormAgregarLibros flib;
    CRUDLibro crud;
    public ControladorFormAgregarLibros(FormAgregarLibros flib) {
        this.flib = flib;
        this.crud = new CRUDLibro();
        crud.MostrarLibroEnTabla(flib.jtblaMostrarLibro);
        flib.jbtnAgregarLibroRegistro.addActionListener(this);
        flib.jbtnBuscarLibros.addActionListener(this);
        flib.jbtnActualizarLibro.addActionListener(this);
        flib.jbtnEliminarLibro.addActionListener(this);
        flib.jbtnReporteLibro.addActionListener(this);
        flib.setTitle("Gestionar Libros");
        flib.panelDatosLibros.setEnabled(false);//inhabilita el panel
        flib.jbtnBuscarLibros.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BuscarLibroID();
            }
        });
        ActualizarTabla();
    }
    // Método para actualizar la tabla
    void ActualizarTabla() {
        crud = new CRUDLibro();
        crud.MostrarLibroEnTabla(flib.jtblaMostrarLibro);
    }
    public void RegistrarLibro() {
        Libro libro = new Libro();
        CRUDLibro crud = new CRUDLibro();
        if (!flib.jtxtCodigoLibro.getText().isEmpty() && !flib.jtxtTituloLibro.getText().isEmpty()
                && !flib.jtxtAutorLibro.getText().isEmpty() && !flib.jtxtIdiomaLibro.getText().isEmpty() && !flib.jtxtCategoria.getText().isEmpty()) {
            if (!crud.existeLibro(flib.jtxtCodigoLibro.getText().trim())) {
                libro.setIdLibro(flib.jtxtCodigoLibro.getText().trim());
                libro.setTitulo(flib.jtxtTituloLibro.getText().trim());
                libro.setAutor(flib.jtxtAutorLibro.getText().trim());
                libro.setIdioma(flib.jtxtIdiomaLibro.getText().trim());
                libro.setSinopsis(flib.jtxaSinopsisLibro.getText().trim());
                // Conversión de la cantidad a entero
                int cantidad = 0;
                try {
                    cantidad = Integer.parseInt(flib.jtxtCantidad.getText().trim());
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "La cantidad debe ser un número válido.");
                    return;
                }
                libro.setCantidad(cantidad);
                // Obtener el valor seleccionado del JComboBox para el porcentaje de IGV
                String igv = flib.jcboIGV.getSelectedItem().toString();
                String precioTXT = "";
                double Precio = 0.0;
                precioTXT = flib.jtxtPrecio.getText().trim();
                boolean aux = false;
                for (int i = 0; i < precioTXT.length(); i++) {
                    if (precioTXT.charAt(i) == ',') {
                        String precioNuevo = precioTXT.replace(",", ".");
                        Precio = Double.parseDouble(precioNuevo);
                        aux = true;
                    }
                }
                if (aux == true) {
                    libro.setPrecio(Precio);
                } else {
                    Precio = Double.parseDouble(precioTXT);
                    libro.setPrecio(Precio);
                }
                if (igv.equalsIgnoreCase("18%")) {
                    libro.setPorcentajeIGV(18);
                }
                libro.setCategoria(flib.jtxtCategoria.getText().trim());


                if (crud.GuardarLibro(libro)) {
                    JOptionPane.showMessageDialog(null, "Registro Guardado");
                    flib.jtxtCodigoLibro.setBackground(Color.green);
                    flib.jtxtTituloLibro.setBackground(Color.green);
                    flib.jtxtAutorLibro.setBackground(Color.green);
                    flib.jtxaSinopsisLibro.setBackground(Color.green);
                    flib.jtxtCantidad.setBackground(Color.green);
                    flib.jtxtCategoria.setBackground(Color.green);
                    flib.jtxtPrecio.setBackground(Color.green);
                    flib.jtxtIdiomaLibro.setBackground(Color.green);
                } else {
                    JOptionPane.showMessageDialog(null, "Error al Guardar");
                }
            } else {
                JOptionPane.showMessageDialog(null, "El libro ya está registrado en la Base de Datos.");
                flib.jtxtCodigoLibro.setBackground(Color.white);
                flib.jtxtTituloLibro.setBackground(Color.white);
                flib.jtxtAutorLibro.setBackground(Color.white);
                flib.jtxaSinopsisLibro.setBackground(Color.white);
                flib.jtxtCantidad.setBackground(Color.white);
                flib.jtxtCategoria.setBackground(Color.white);
                flib.jtxtPrecio.setBackground(Color.white);
                flib.jtxtIdiomaLibro.setBackground(Color.white);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Completa todos los campos");
            flib.jtxtCodigoLibro.setBackground(Color.red);
            flib.jtxtTituloLibro.setBackground(Color.red);
            flib.jtxtAutorLibro.setBackground(Color.red);
            flib.jtxaSinopsisLibro.setBackground(Color.red);
            flib.jtxtCantidad.setBackground(Color.red);
            flib.jtxtCategoria.setBackground(Color.red);
            flib.jtxtPrecio.setBackground(Color.red);
            flib.jtxtIdiomaLibro.setBackground(Color.red);
        }
        ActualizarTabla();
        LimpiarCampos();
    }
    public void LimpiarCampos() {
        flib.jtxtCodigoLibro.setText("LIB00000");
        flib.jtxtTituloLibro.setText("");
        flib.jtxtAutorLibro.setText("");
        flib.jtxtCantidad.setText("");
        flib.jtxaSinopsisLibro.setText("");
        flib.jtxtIdiomaLibro.setText("");
        flib.jtxtPrecio.setText("");
        flib.jtxtCategoria.setText("");
    }
    public void BuscarLibroID() {
        String idABuscar = flib.jtxtBuscarCodigoLib.getText().trim();
        if (!idABuscar.isEmpty()) {
            // Llama al método de la clase CRUDLibro para buscar el libro por su ID
            Libro libro = crud.buscarPorID(idABuscar);
            if (libro != null) {
                // Si se encuentra el libro, muestra los datos en los campos del formulario
                flib.jtxtCodigoLibro.setText(libro.getIdLibro());
                flib.jtxtTituloLibro.setText(libro.getTitulo());
                flib.jtxtAutorLibro.setText(libro.getAutor());
                flib.jtxtIdiomaLibro.setText(libro.getIdioma());
                flib.jtxaSinopsisLibro.setText(libro.getSinopsis());
                flib.jtxtCantidad.setText(Integer.toString(libro.getCantidad())); // Convierte a String
                // Asumiendo que flib.jcboIGV es un JComboBox
                flib.jcboIGV.setSelectedItem(libro.getPorcentajeIGV()); // Establece el ítem seleccionado
                flib.jtxtPrecio.setText(Double.toString(libro.getPrecio())); // Convierte a String
                flib.jtxtCategoria.setText(libro.getCategoria());
            } else {
                // Libro no encontrado, puedes mostrar un mensaje de error o limpiar los campos
                JOptionPane.showMessageDialog(null, "Libro no encontrado");
                LimpiarCampos();
            }
        } else {
            // ID está vacío, puedes mostrar un mensaje de error si lo deseas
            JOptionPane.showMessageDialog(null, "Ingresa un ID para buscar");
        }
    }
    public void ActualizarLibro() {
        // Obtener los datos ingresados en el formulario
        String codigo = flib.jtxtCodigoLibro.getText().trim();
        String titulo = flib.jtxtTituloLibro.getText().trim();
        String autor = flib.jtxtAutorLibro.getText().trim();
        String idioma = flib.jtxtIdiomaLibro.getText().trim();
        String sinopsis = flib.jtxaSinopsisLibro.getText().trim();
        // Parsear los campos de cantidad y precio a sus respectivos tipos de datos
        int cantidad = 0;
        double precio = 0.0;
        try {
            cantidad = Integer.parseInt(flib.jtxtCantidad.getText().trim());
            precio = Double.parseDouble(flib.jtxtPrecio.getText().trim());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "La cantidad y el precio deben ser números válidos.");
            return;
        }
        String porcentajeIGV = flib.jcboIGV.getSelectedItem().toString();
        String categoria = flib.jtxtCategoria.getText().trim();
        if (!codigo.isEmpty() && !titulo.isEmpty() && !autor.isEmpty() && !idioma.isEmpty() && !categoria.isEmpty()) {
            // Crear un objeto Libro con los datos ingresados
            Libro libro = new Libro();
            libro.setIdLibro(codigo);
            libro.setTitulo(titulo);
            libro.setAutor(autor);
            libro.setIdioma(idioma);
            libro.setSinopsis(sinopsis);
            libro.setCantidad(cantidad);
            libro.setPrecio(precio);
            // Asignar valores de igv y categoría
            if (porcentajeIGV.equalsIgnoreCase("No grava igv")) {
                libro.setPorcentajeIGV(0);
            } else if (porcentajeIGV.equalsIgnoreCase("18%")) {
                libro.setPorcentajeIGV(18);
            }
            libro.setCategoria(categoria);
            // Llamar al método de la clase CRUDLibro para actualizar el libro
            if (crud.actualizarLibro(libro, codigo)) {
                JOptionPane.showMessageDialog(null, "Libro actualizado correctamente");
                ActualizarTabla(); // Actualizar la tabla después de la actualización
                LimpiarCampos();
            } else {
                JOptionPane.showMessageDialog(null, "Error al actualizar el libro");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Completa todos los campos antes de actualizar el libro");
        }
    }
    public void EliminarLibro() {
        int filaSeleccionada = flib.jtblaMostrarLibro.getSelectedRow();

        if (filaSeleccionada >= 0) {
            DefaultTableModel model = (DefaultTableModel) flib.jtblaMostrarLibro.getModel();
            String idLibro = model.getValueAt(filaSeleccionada, 0).toString(); // Suponiendo que la columna 0 contiene el ID del libro

            // Llama al método de la clase CRUDLibro para eliminar el libro de la base de datos
            if (crud.eliminarLibro(idLibro)) {
                model.removeRow(filaSeleccionada); // Elimina la fila de la tabla en la interfaz
                JOptionPane.showMessageDialog(null, "Libro eliminado de la tabla");
            } else {
                JOptionPane.showMessageDialog(null, "Error al eliminar el libro");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecciona un libro para eliminar de la tabla");
        }
        LimpiarCampos();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == flib.jbtnAgregarLibroRegistro) {
            RegistrarLibro();
            ActualizarTabla(); // Para actualizar la tabla después de registrar el cliente
        }
        if (e.getSource() == flib.jbtnActualizarLibro) {
            ActualizarLibro();
        }
        if (e.getSource() == flib.jbtnEliminarLibro) {
            EliminarLibro();
        }
        if (e.getSource() == flib.jbtnReporteLibro) {
            Reportes reporte = new Reportes();
            reporte.ReportesLibros();
        }
    }
}
