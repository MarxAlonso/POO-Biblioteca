package DAO;

import Modelo.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CRUDCliente extends ConectarBD {

    // metodo para guardar un nuevo clientw
    public void MostrarClienteEnTabla(JTable tabla) {
        String[] titulos = {"Id Cliente", "Nombre", "Apellido", "Genero", "DNI", "Telefono", "Correo"};
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        tabla.setModel(modelo);
        try {
            Connection cn = ConectarBD.conectar(); // Asegúrate de obtener la conexión
            String sql = "SELECT idCliente, nombre, apellido, genero, dni, telefono, correo FROM cliente where indicador='S'";
            PreparedStatement preparedStatement = cn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                String idCliente = rs.getString("idCliente");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String genero = rs.getString("genero");
                String dni = rs.getString("dni");
                String telefono = rs.getString("telefono");
                String correo = rs.getString("correo");

                modelo.addRow(new Object[]{idCliente, nombre, apellido, genero, dni, telefono, correo});
            }

            cn.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR al mostrar los registros de clientes: " + ex);
        }
    }

    public boolean guardar(Cliente objeto) {
        boolean respuesta = false;
        Connection cn = ConectarBD.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement("INSERT INTO cliente (idCliente, nombre, apellido, genero, dni, telefono, correo, indicador) VALUES (?,?,?,?,?,?,?,'S')");
            consulta.setString(1, objeto.getCodigo());
            consulta.setString(2, objeto.getNombres());
            consulta.setString(3, objeto.getApellidos());
            consulta.setString(4, objeto.getGenero());
            consulta.setString(5, objeto.getDni());
            consulta.setString(6, objeto.getNumCelular());
            consulta.setString(7, objeto.getCorreoPersonal());
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al guardar cliente: " + e);
        }
        return respuesta;
    }

    // metodo para consultar si el producto ya esta registrado en la BBDD
    public boolean existeCliente(String dni) {
        boolean respuesta = false;
        String sql = "select dni from cliente where dni = '" + dni + "';";
        Statement st;
        try {
            Connection cn = ConectarBD.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                respuesta = true;
            }
        } catch (SQLException e) {
            System.out.println("Error al consultar cliente: " + e);
        }
        return respuesta;
    }

    //metodo para actualizar un cliente
    public boolean actualizar(Cliente objeto, String codigo) {
        boolean respuesta = false;
        Connection cn = ConectarBD.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement("update cliente set nombre=?, apellido=?, genero=?, dni=?, telefono=?, correo=? where idCliente = ?");

            consulta.setString(1, objeto.getNombres());
            consulta.setString(2, objeto.getApellidos());
            consulta.setString(3, objeto.getGenero());
            consulta.setString(4, objeto.getDni());
            consulta.setString(5, objeto.getNumCelular());
            consulta.setString(6, objeto.getCorreoPersonal());
            consulta.setString(7, codigo); // id

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al actualizar cliente: " + e);
        }
        return respuesta;
    }

    // metodo para eliminar un cliente
    public boolean eliminar(String codigo) {
        boolean respuesta = false;
        Connection cn = ConectarBD.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement(
                    "update cliente set indicador = 'N' where idCliente ='" + codigo + "'");
            consulta.executeUpdate();

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al eliminar cliente: " + e);
        }
        return respuesta;
    }
    public int calcularCantidadTotalClientes() {
        int cantidadTotal = 0;

        try {
            Connection cn = ConectarBD.conectar();
            PreparedStatement pst = cn.prepareStatement("SELECT COUNT(*) FROM cliente where indicador = 'S'");
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                cantidadTotal = rs.getInt(1);
            }

            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al calcular la cantidad total de clientes: " + e);
        }

        return cantidadTotal;
    }

    public Cliente buscarPorDNI(String dni) {
        Cliente clienteEncontrado = null;
        Connection cn = ConectarBD.conectar();

        try {
            String sql = "SELECT idCliente, nombre, apellido, genero, dni, telefono, correo FROM cliente WHERE dni = ? and indicador = 'S'";
            PreparedStatement preparedStatement = cn.prepareStatement(sql);
            preparedStatement.setString(1, dni);

            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                clienteEncontrado = new Cliente();
                clienteEncontrado.setCodigo(rs.getString("idCliente"));
                clienteEncontrado.setNombres(rs.getString("nombre"));
                clienteEncontrado.setApellidos(rs.getString("apellido"));
                clienteEncontrado.setGenero(rs.getString("genero"));
                clienteEncontrado.setDni(rs.getString("dni"));
                clienteEncontrado.setNumCelular(rs.getString("telefono"));
                clienteEncontrado.setCorreoPersonal(rs.getString("correo"));
            }
        } catch (SQLException e) {
            System.out.println("Error al buscar cliente por DNI: " + e);
        } finally {
            try {
                if (cn != null) {
                    cn.close();
                }
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e);
            }
        }

        return clienteEncontrado;
    }

}
