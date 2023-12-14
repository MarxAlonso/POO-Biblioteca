package Modelo;
public abstract class Trabajadores {
    private String nomTrab;
    private String apeTrab;
    private String dni;
    private String sueldo;
    private String correoTrab;
    private String contraseña;
    private String celular;
    private String codTrab;
    static int contador=0;
    public Trabajadores(){
    }

    public String getNomTrab() {return nomTrab;}
    public void setNomTrab(String nomTrab) {this.nomTrab = nomTrab;}

    public String getApeTrab() {return apeTrab;}
    public void setApeTrab(String apeTrab) {this.apeTrab = apeTrab;}

    public String getDni() {return dni;}
    public void setDni(String dni) {this.dni = dni;}

    public String getSueldo() {return sueldo;}
    public void setSueldo(String sueldo) {this.sueldo = sueldo;}

    public String getCodTrab() {return codTrab;}
    public void setCodTrab(String codTrab) {this.codTrab = codTrab;}
    
    public String getCorreoTrab() {return correoTrab;}
    public void setCorreoTrab(String correoTrab) {this.correoTrab = correoTrab;}

    public String getCelular() {return celular;}
    public void setCelular(String celular) {this.celular = celular;}

    public String getContraseña() {return contraseña;}

    public void setContraseña(String contraseña) {this.contraseña = contraseña;}
    
    
    
}
