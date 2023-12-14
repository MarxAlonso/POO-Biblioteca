package DAO;

import Modelo.PersonalBiblioteca;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CRUDTrabajadores extends ConectarBD {

    // metodo para guardar un nuevo clientw
    public void MostrarTrabajadoresEnTabla(JTable tabla) {
        String[] titulos = {"Id Trabajador", "Nombre", "Apellido", "DNI", "Correo", "Contraseña", "Celular", "Cargo", "Sueldo"};
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        tabla.setModel(modelo);
        try {
            Connection cn = ConectarBD.conectar(); // Asegúrate de obtener la conexión
            String sql = "SELECT idTrab, nombre, apellido, dni, correo, password, celular, cargo, sueldo FROM trabajador where indicador = 'S';";
            PreparedStatement preparedStatement = cn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                String codigo = rs.getString("idTrab");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String dni = rs.getString("dni");
                String correo = rs.getString("correo");
                String contraseña = rs.getString("password");
                String celular = rs.getString("celular");
                String cargo = rs.getString("cargo");
                String sueldo = rs.getString("sueldo");

                modelo.addRow(new Object[]{codigo, nombre, apellido, dni, correo, contraseña, celular, cargo, sueldo});
            }
            cn.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR al mostrar los registros de trabajadores: " + ex);
        }
    }

    public boolean guardar(PersonalBiblioteca objeto) {
        boolean respuesta = false;
        Connection cn = ConectarBD.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement("INSERT INTO trabajador (idTrab, nombre, apellido, dni, correo, password, celular, cargo, sueldo, indicador) VALUES (?,?,?,?,?,?,?,?,?,'S')");
            consulta.setString(1, objeto.getCodTrab());
            consulta.setString(2, objeto.getNomTrab());
            consulta.setString(3, objeto.getApeTrab());
            consulta.setString(4, objeto.getDni());
            consulta.setString(5, objeto.getCorreoTrab());
            consulta.setString(6, objeto.getContraseña());
            consulta.setString(7, objeto.getCelular());
            consulta.setString(8, objeto.getCargo());
            consulta.setString(9, objeto.getSueldo());
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al guardar trabajador: " + e);
        }
        return respuesta;
    }

    // metodo para consultar si el producto ya esta registrado en la BBDD
    public boolean existeTrabajador(String dni) {
        boolean respuesta = false;
        String sql = "select dni from trabajador where dni = '" + dni + "';";
        Statement st;
        try {
            Connection cn = ConectarBD.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                respuesta = true;
            }
        } catch (SQLException e) {
            System.out.println("Error al consultar trabajador: " + e);
        }
        return respuesta;
    }

    //metodo para actualizar un trabajador
    public boolean actualizar(PersonalBiblioteca objeto) {
        boolean respuesta = false;
        Connection cn = ConectarBD.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement("update trabajador set idTrab=?, nombre=?, apellido=?, dni=?, correo=?, password=?, celular=?, cargo=?, sueldo=? where idTrab = ?");
            consulta.setString(1, objeto.getCodTrab());
            consulta.setString(2, objeto.getNomTrab());
            consulta.setString(3, objeto.getApeTrab());
            consulta.setString(4, objeto.getDni());
            consulta.setString(5, objeto.getCorreoTrab());
            consulta.setString(6, objeto.getContraseña());
            consulta.setString(7, objeto.getCelular());
            consulta.setString(8, objeto.getCargo());
            consulta.setString(9, objeto.getSueldo());
            consulta.setString(10, objeto.getCodTrab());
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al actualizar trabajador: " + e);
        }
        return respuesta;
    }

    // metodo para eliminar un cliente
    public boolean eliminar(String codigo) {
        boolean respuesta = false;
        Connection cn = ConectarBD.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement(
                    "update trabajador set indicador='N' where idTrab ='" + codigo + "'");
            consulta.executeUpdate();

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al eliminar trabajador: " + e);
        }
        return respuesta;
    }
    // Agrega este método a tu clase

    public int calcularCantidadTotalTrabajadores() {
        int cantidadTotal = 0;

        try {
            Connection cn = ConectarBD.conectar();
            PreparedStatement pst = cn.prepareStatement("SELECT COUNT(*) FROM trabajador where indicador = 'S'");
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                cantidadTotal = rs.getInt(1);
            }

            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al calcular la cantidad total de trabajadores: " + e);
        }

        return cantidadTotal;
    }

    public PersonalBiblioteca buscarPorDNI(String dni) {
        PersonalBiblioteca trabEncontrado = null;
        Connection cn = ConectarBD.conectar();
        try {
            String sql = "SELECT idTrab, nombre, apellido, dni, correo, password, celular, cargo, sueldo FROM trabajador WHERE dni = ?";
            PreparedStatement preparedStatement = cn.prepareStatement(sql);
            preparedStatement.setString(1, dni);
            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {
                trabEncontrado = new PersonalBiblioteca();
                trabEncontrado.setCodTrab(rs.getString("idTrab"));
                trabEncontrado.setNomTrab(rs.getString("nombre"));
                trabEncontrado.setApeTrab(rs.getString("apellido"));
                trabEncontrado.setDni(rs.getString("dni"));
                trabEncontrado.setCorreoTrab(rs.getString("correo"));
                trabEncontrado.setContraseña(rs.getString("password"));
                trabEncontrado.setCelular(rs.getString("celular"));
                trabEncontrado.setCargo(rs.getString("cargo"));
                trabEncontrado.setSueldo(rs.getString("sueldo"));
            }
        } catch (SQLException e) {
            System.out.println("Error al buscar trabajador por DNI: " + e);
        } finally {
            try {
                if (cn != null) {
                    cn.close();
                }
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e);
            }
        }
        return trabEncontrado;
    }
    
}
