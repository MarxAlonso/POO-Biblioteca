 package Modelo;

public class Libro {   
    //Atributos
    private String idLibro;
    private String titulo;
    private String autor;
    private String idioma;
    private String sinopsis;
    private int cantidad;
    private double precio;
    private int porcentajeIGV;
    private String categoria;
    //Contructor
    public Libro(){
        this.idLibro = "";
        this.titulo = "";
        this.autor = "";
        this.idioma = "";
        this.sinopsis = "";
        this.cantidad = 0;
        this.precio = 0.0;
        this.porcentajeIGV = 0;
        this.categoria = "";
    }
    //Contructor sobrecargado
    public Libro(String idLibro, String titulo, String autor, String idioma, String sinopsis, int cantidad, double precio, int porcentajeIGV, String Categoria) {
        this.idLibro = idLibro;
        this.titulo = titulo;
        this.autor = autor;
        this.idioma = idioma;
        this.sinopsis = sinopsis;
        this.cantidad = cantidad;
        this.precio = precio;
        this.porcentajeIGV = porcentajeIGV;
        this.categoria = categoria;
    }

    public String getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(String idLibro) {
        this.idLibro = idLibro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getPorcentajeIGV() {
        return porcentajeIGV;
    }

    public void setPorcentajeIGV(int porcentajeIGV) {
        this.porcentajeIGV = porcentajeIGV;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String Categoria) {
        this.categoria = Categoria;
    }

}
