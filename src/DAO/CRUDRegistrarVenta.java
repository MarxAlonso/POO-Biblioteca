package DAO;

import DAO.ConectarBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import Modelo.CabeceraVenta;
import Modelo.DetalleVenta;

public class CRUDRegistrarVenta {

    
    //ultimo id de la cabecera
    public static int idCabeceraRegistrada;
    java.math.BigDecimal iDColVar;
    
    // metodo para guardar la cabecera de venta
    public boolean guardar(CabeceraVenta objeto) {
        boolean respuesta = false;
        Connection cn = ConectarBD.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement("insert into cabeceraventa values(?,?,?,?,?)",
                    Statement.RETURN_GENERATED_KEYS);
            consulta.setInt(1, 0);//id
            consulta.setString(2, objeto.getIdCliente());
            consulta.setDouble(3, objeto.getValorPagar());
            consulta.setString(4, objeto.getFechaVenta());
            consulta.setInt(5, objeto.getEstado());
            
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            
            ResultSet rs = consulta.getGeneratedKeys();
            while(rs.next()){
                iDColVar = rs.getBigDecimal(1);
                idCabeceraRegistrada = iDColVar.intValue();
            }
            
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al guardar cabecera de venta: " + e);
        }
        return respuesta;
    }
    
    //metodo para guardar el detalle de venta
    
    public boolean guardarDetalle(DetalleVenta objeto) {
        boolean respuesta = false;
        Connection cn = ConectarBD.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement("insert into detalleventa values(?,?,?,?,?,?,?,?,?,?)");
            consulta.setInt(1, 0);//id
            consulta.setInt(2, idCabeceraRegistrada);
            consulta.setString(3, objeto.getIdLibro());
            consulta.setInt(4, objeto.getCantidad());
            consulta.setDouble(5, objeto.getPrecioUnitario());
            consulta.setDouble(6, objeto.getSubTotal());
            consulta.setDouble(7, objeto.getDescuento());
            consulta.setDouble(8, objeto.getIgv());
            consulta.setDouble(9, objeto.getTotalPagar());
            consulta.setInt(10, objeto.getEstado());
            
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al guardar detalle de venta: " + e);
        }
        return respuesta;
    }
    
    //metodo para actualizar un libro 
    public boolean actualizar(CabeceraVenta objeto, String idCabeceraVenta) {
        boolean respuesta = false;
        Connection cn = ConectarBD.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement(
                    "update cabeceraventa set idCliente = ?, estado = ? "
                            + "where idCabeceraVenta ='" + idCabeceraVenta + "'");
            consulta.setString(1, objeto.getIdCliente());
            consulta.setInt(2, objeto.getEstado());
           
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al actualizar cabecera de venta: " + e);
        }
        return respuesta;
    }
    public double obtenerTotalRecaudado() {
        double totalRecaudado = 0;
        Connection con = ConectarBD.conectar();
        String sql = "SELECT SUM(valorPagar) AS total FROM cabeceraventa";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                totalRecaudado = rs.getDouble("total");
            }
            con.close();
        } catch (SQLException e) {
            System.out.println("Error al obtener el total recaudado: " + e);
        }
        return totalRecaudado;
    }
}
