package Controladores;
import Vista.*;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JInternalFrame;

public class ControladorSistemaBiblioteca implements ActionListener {

    Sistema_Biblioteca sistema;
    public ControladorSistemaBiblioteca(Sistema_Biblioteca sistema) {
        this.sistema = sistema;
        sistema.jbtnFacturacion.addActionListener(this);
        sistema.jbtnIngresarFormCliente.addActionListener(this);
        sistema.jbtnIngresarFormAgregarLibros.addActionListener(this);
        sistema.jbtnIngresarFormTrabajadores.addActionListener(this);
        sistema.jbtnFacturacion.addActionListener(this);
        sistema.setTitle("SISTEMA BIBLIOTECA");
        Image img = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/bibliotecaLogo.png"));
        sistema.setIconImage(img);
        sistema.setLocationRelativeTo(null);
        sistema.jbtnGestionarVenta.addActionListener(this);
        sistema.jbtnCerrarSesion.addActionListener(this);
        sistema.jbtnInformacionBiblioteca.addActionListener(this);
        sistema.jbtnFechaVenta.addActionListener(this);
        sistema.jbtnGrafica.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == sistema.jbtnFacturacion) {
            FormRegistrarVenta fact = new FormRegistrarVenta();
            ControladorFormRegistrarVenta venta = new ControladorFormRegistrarVenta(fact);
            AgregarFrame(fact);
            fact.setVisible(true);
        }
        if (e.getSource() == sistema.jbtnIngresarFormCliente) {
            FormClientes cli = new FormClientes();
            ControladorFormCliente fcli = new ControladorFormCliente(cli);
            AgregarFrame(cli);
            cli.setVisible(true);
        }

        if (e.getSource() == sistema.jbtnIngresarFormAgregarLibros) {
            FormAgregarLibros lib = new FormAgregarLibros();
            ControladorFormAgregarLibros flib = new ControladorFormAgregarLibros(lib);
            AgregarFrame(lib);
            lib.setVisible(true);
        }

        if (e.getSource() == sistema.jbtnIngresarFormTrabajadores) {
            FormTrabajadores trab = new FormTrabajadores();
            ControladorFormTrabajador ctrb = new ControladorFormTrabajador(trab);
            AgregarFrame(trab);
            trab.setVisible(true);
        }

        if (e.getSource() == sistema.jbtnGestionarVenta) {
            FormGestionarVentas gves = new FormGestionarVentas();
            ControladorFormGestionarVentas cgv = new ControladorFormGestionarVentas(gves);
            AgregarFrame(gves);
            gves.setVisible(true);
        }
        if (e.getSource() == sistema.jbtnInformacionBiblioteca) {
            InformacionBiblioteca info  = new InformacionBiblioteca();
            AgregarFrame(info);
            info.setVisible(true);
        }
        if (e.getSource() == sistema.jbtnFechaVenta) {
            FormFechasGraficas fecha  = new FormFechasGraficas();
            AgregarFrame(fecha);
            fecha.setVisible(true);
        }
        if (e.getSource() == sistema.jbtnGrafica) {
            FormGraficaVentas graf  = new FormGraficaVentas();
            AgregarFrame(graf);
            graf.setVisible(true);
        }
        
        if (e.getSource() == sistema.jbtnCerrarSesion) {
            System.exit(0);
        }
    }
    //metodo que permite agregar un InternalFrame al DesktopPane

    void AgregarFrame(JInternalFrame frame) {
        sistema.jdspBiblioteca.removeAll();
        sistema.jdspBiblioteca.add(frame);
        sistema.jdspBiblioteca.repaint();
    }
}
