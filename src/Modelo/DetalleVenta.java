package Modelo;
public class DetalleVenta {
    //Atributos
    private int idDetalleVenta;
    private int idCabeceraVenta;
    private String idLibro;
    //esta de mas
    private String nombre;
    private int cantidad;
    private double precioUnitario;
    private double subTotal;
    private double descuento;
    private double igv;
    private double totalPagar;
    private int estado;

    //Contructor
    public DetalleVenta() {
        this.idDetalleVenta = 0;
        this.idCabeceraVenta = 0;
        this.idLibro = "";
        this.nombre = "";
        this.cantidad = 0;
        this.precioUnitario = 0.0;
        this.subTotal = 0.0;
        this.descuento = 0.0;
        this.igv = 0.0;
        this.totalPagar = 0.0;
        this.estado = 0;
    }
    
    //Contructor sobrebargado

    public DetalleVenta(int idDetalleVenta, int idCabeceraVenta, String idLibro, String nombre, int cantidad, double precioUnitario, double subTotal, double descuento, double igv, double totalPagar, int estado) {
        this.idDetalleVenta = idDetalleVenta;
        this.idCabeceraVenta = idCabeceraVenta;
        this.idLibro = idLibro;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.subTotal = subTotal;
        this.descuento = descuento;
        this.igv = igv;
        this.totalPagar = totalPagar;
        this.estado = estado;
    }
    
    //get and set

    public int getIdDetalleVenta() {
        return idDetalleVenta;
    }

    public void setIdDetalleVenta(int idDetalleVenta) {
        this.idDetalleVenta = idDetalleVenta;
    }

    public int getIdCabeceraVenta() {
        return idCabeceraVenta;
    }

    public void setIdCabeceraVenta(int idCabeceraVenta) {
        this.idCabeceraVenta = idCabeceraVenta;
    }

    public String getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(String idLibro) {
        this.idLibro = idLibro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getIgv() {   return igv; }
    public void setIgv(double igv) {this.igv = igv;}

    public double getTotalPagar() {    return totalPagar; }
    public void setTotalPagar(double totalPagar) {this.totalPagar = totalPagar;}

    public int getEstado() {return estado;}
    public void setEstado(int estado) {  this.estado = estado; }
    
    //toString
    @Override
    public String toString() {
        return "DetalleVenta{" + "idDetalleVenta=" + idDetalleVenta + ", idCabeceraVenta=" + idCabeceraVenta + ", idLibro=" + idLibro + ", nombre=" + nombre + ", cantidad=" + cantidad + ", precioUnitario=" + precioUnitario + ", subTotal=" + subTotal + ", descuento=" + descuento + ", iva=" + igv + ", totalPagar=" + totalPagar + ", estado=" + estado + '}';
    }
}
