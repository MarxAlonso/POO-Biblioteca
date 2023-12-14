package Principal;
import Vista.IngresarSesion;
import Vista.Sistema_Biblioteca;
import Controladores.ControladorIniciarSesion;
public class Main {
    static Sistema_Biblioteca sistema;
    static IngresarSesion form1;
    static ControladorIniciarSesion inicio;
    public static void main(String[] args) {
        form1 = new IngresarSesion();
        inicio = new ControladorIniciarSesion(form1);
        form1.setVisible(true);
        form1.setLocationRelativeTo(null);
        form1.setTitle("BooKWise Solutions");
    }   
}