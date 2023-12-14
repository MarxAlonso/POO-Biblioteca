package Controladores;  
import Vista.IngresarSesion;
import Vista.Sistema_Biblioteca;
import DAO.ConectarBD;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
public class ControladorIniciarSesion implements ActionListener {
    IngresarSesion ingreso;
    ConectarBD miConexion;
    public ControladorIniciarSesion(IngresarSesion ingreso) {
        this.ingreso = ingreso;
        ingreso.jbtnIniciarSesion.addActionListener(this);
        ingreso.setResizable(false);
        ingreso.setLocationRelativeTo(null);
        ingreso.setSize(new Dimension(1026,720));
        miConexion = new ConectarBD();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String correoElectronico = ingreso.jtxtcorreoelectronico.getText();
        String contrasena = new String(ingreso.jtxtcontraseña.getPassword());

        if (correoElectronico.isEmpty() || contrasena.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Falta ingresar datos");
            return;
        }

        Connection connection = miConexion.conectar();

        if (connection != null) {
            String sql = "SELECT * FROM trabajador WHERE correo = ? AND password = ?";
            try {
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, correoElectronico);
                preparedStatement.setString(2, contrasena);
                ResultSet resultSet = preparedStatement.executeQuery();
                if (resultSet.next()) {
                    // Iniciar sesión exitosa
                    String cargo = resultSet.getString("cargo");

                    // Abre el formulario Sistema_Biblioteca solo si el cargo es SISTEMAS o ADMINISTRADOR
                    if ("SISTEMAS".equalsIgnoreCase(cargo) || "ADMINISTRADOR".equalsIgnoreCase(cargo)) {
                        Sistema_Biblioteca sistemaBiblioteca = new Sistema_Biblioteca();
                        ControladorSistemaBiblioteca sistema = new ControladorSistemaBiblioteca(sistemaBiblioteca);
                        sistemaBiblioteca.setVisible(true);

                        // Cierra el formulario de inicio de sesión
                        ingreso.dispose();

                        // Muestra un JOptionPane indicando el cargo del usuario
                        JOptionPane.showMessageDialog(null, "Has iniciado sesión como: " + cargo);
                    } else {
                        JOptionPane.showMessageDialog(null, "No tienes permisos para acceder al sistema.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
                }

                connection.close();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error al intentar iniciar sesión: " + ex.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error al conectar con la base de datos");
        }
    }
}
