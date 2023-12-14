package Modelo;

public class Cliente{
    private String nombres;
    private String apellidos;
    private String dni;
    private String codigo;
    private String numCelular;
    private String genero;
    private String correoPersonal;
    
    //Constructor
    public Cliente() {
        this.codigo = "";
        this.nombres = "";
        this.apellidos = "";
        this.genero = "";
        this.dni = "";
        this.numCelular = "";
        this.correoPersonal = "";
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNumCelular() {
        return numCelular;
    }

    public void setNumCelular(String numCelular) {
        this.numCelular = numCelular;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCorreoPersonal() {
        return correoPersonal;
    }

    public void setCorreoPersonal(String correoPersonal) {
        this.correoPersonal = correoPersonal;
    }

    //metodo propio que retorna un arreglo de tipo Object[]
    //para que sea agregado en JTable
    public Object[] registroCliente(){
        //object: es un tipo de dato comodin porque almacena cualquier tipo de datos
        Object[] fila2 = {codigo,nombres,apellidos,genero,dni,numCelular,correoPersonal};
        return fila2;
    }
}
