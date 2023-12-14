package Modelo;
import Interfaces.ConstantesTrabajador;
public class PersonalBiblioteca extends Trabajadores implements ConstantesTrabajador{
    private String cargo;

    public String getCargo() {return cargo;}
    public void setCargo(String cargo) {this.cargo = cargo;}
    
    public Object[] registrarDatosTrabajador(){
        //object: es un tipo de dato comodin porque almacena cualquier tipo de datos
        Object[] fila = {super.getCodTrab(),super.getNomTrab(),super.getApeTrab(),super.getDni(),
            super.getCelular(), cargo,super.getCorreoTrab(), super.getContraseña() ,super.getSueldo()};
        return fila;
    }
}
