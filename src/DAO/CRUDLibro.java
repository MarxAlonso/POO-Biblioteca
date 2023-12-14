package DAO;

import Modelo.Libro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CRUDLibro {

    // metodo para guardar un nuevo clientw
    public void MostrarLibroEnTabla(JTable tabla) {
        String[] titulos = {"Id Libro", "Titulo", "Autor", "Idioma", "Sinopsis", "Cantidad", "Precio", "IGV", "Cateogoria"};
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        tabla.setModel(modelo);
        try {
            Connection cn = ConectarBD.conectar(); // Asegúrate de obtener la conexión
            String sql = "select * from libros where indicador = 'S';";
            PreparedStatement preparedStatement = cn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                String idLibro = rs.getString("idLibro");
                String titulo = rs.getString("titulo");
                String autor = rs.getString("autor");
                String idioma = rs.getString("idioma");
                String sinopsis = rs.getString("sinopsis");
                int cantidad = rs.getInt("cantidad");
                double precio = rs.getDouble("precio");
                int igv = rs.getInt("porcentajeIGV");
                String categoria = rs.getString("categoria");

                modelo.addRow(new Object[]{idLibro, titulo, autor, idioma, sinopsis, cantidad, precio, igv, categoria});
            }

            cn.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR al mostrar los registros de libros: " + ex);
        }
    }
    // metodo para guardar un nuevo producto

    public boolean GuardarLibro(Libro objeto) {
        boolean respuesta = false;
        Connection cn = ConectarBD.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("insert into libros(idLibro,titulo,autor,idioma,sinopsis,cantidad,precio,porcentajeIGV,categoria,indicador) values(?,?,?,?,?,?,?,?,?,'S')");
            consulta.setString(1, objeto.getIdLibro());//id
            consulta.setString(2, objeto.getTitulo());
            consulta.setString(3, objeto.getAutor());
            consulta.setString(4, objeto.getIdioma());
            consulta.setString(5, objeto.getSinopsis());
            consulta.setInt(6, objeto.getCantidad());
            consulta.setDouble(7, objeto.getPrecio());
            consulta.setInt(8, objeto.getPorcentajeIGV());
            consulta.setString(9, objeto.getCategoria());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }

            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al guardar producto: " + e);
        }

        return respuesta;
    }

    // metodo para consultar si el producto ya esta registrado en la BBDD
    public boolean existeLibro(String libro) {
        boolean respuesta = false;
        String sql = "select idLibro from libros where titulo = '" + libro + "';";
        Statement st;

        try {
            Connection cn = ConectarBD.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                respuesta = true;
            }

        } catch (SQLException e) {
            System.out.println("Error al consultar producto: " + e);
        }
        return respuesta;
    }

    public int calcularCantidadTotalLibros() {
        int cantidadTotal = 0;

        try {
            Connection cn = ConectarBD.conectar();
            PreparedStatement pst = cn.prepareStatement("SELECT COUNT(*) FROM libros WHERE indicador = 'S'");
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                cantidadTotal = rs.getInt(1);
            }

            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al calcular la cantidad total de libros: " + e);
        }

        return cantidadTotal;
    }

    // metodo para actualizar un producto
    public boolean actualizarLibro(Libro objeto, String idLibro) {
        boolean respuesta = false;
        Connection cn = ConectarBD.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("update libros set idLibro=?, titulo = ?, autor = ?, idioma = ?, sinopsis = ?, cantidad = ?, precio = ?, porcentajeIGV = ?, categoria = ? where idLibro ='" + idLibro + "'");
            consulta.setString(1, objeto.getIdLibro());//id
            consulta.setString(2, objeto.getTitulo());
            consulta.setString(3, objeto.getAutor());
            consulta.setString(4, objeto.getIdioma());
            consulta.setString(5, objeto.getSinopsis());
            consulta.setInt(6, objeto.getCantidad());
            consulta.setDouble(7, objeto.getPrecio());
            consulta.setInt(8, objeto.getPorcentajeIGV());
            consulta.setString(9, objeto.getCategoria());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al actualizar Libro " + e);
        }
        return respuesta;
    }

    // metodo para eliminar un producto
    public boolean eliminarLibro(String idLibro) {
        boolean respuesta = false;
        Connection cn = ConectarBD.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement(
                    "update libros set indicador='N' where idLibro ='" + idLibro + "'");
            consulta.executeUpdate();

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al eliminar producto: " + e);
        }
        return respuesta;
    }

    public Libro buscarPorID(String idLibro) {
        Libro libroEncontrado = null;
        Connection cn = ConectarBD.conectar();

        try {
            String sql = "SELECT idLibro, titulo, autor, idioma, sinopsis, cantidad, precio, porcentajeIGV, categoria FROM libros WHERE idLibro = ?";
            PreparedStatement preparedStatement = cn.prepareStatement(sql);
            preparedStatement.setString(1, idLibro);

            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                libroEncontrado = new Libro();
                libroEncontrado.setIdLibro(rs.getString("idLibro"));
                libroEncontrado.setTitulo(rs.getString("titulo"));
                libroEncontrado.setAutor(rs.getString("autor"));
                libroEncontrado.setIdioma(rs.getString("idioma"));
                libroEncontrado.setSinopsis(rs.getString("sinopsis"));
                libroEncontrado.setCantidad(rs.getInt("cantidad")); // Cambio a getInt para columnas int
                libroEncontrado.setPrecio(rs.getDouble("precio")); // Cambio a getDouble para columnas double
                libroEncontrado.setPorcentajeIGV(rs.getInt("porcentajeIGV")); // Cambio a getDouble para columnas double
                libroEncontrado.setCategoria(rs.getString("categoria"));
            }
        } catch (SQLException e) {
            System.out.println("Error al buscar libro por ID: " + e);
        } finally {
            try {
                if (cn != null) {
                    cn.close();
                }
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e);
            }
        }

        return libroEncontrado;
    }
}
