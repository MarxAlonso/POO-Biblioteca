package Controladores;

import DAO.CRUDCliente;
import DAO.CRUDLibro;
import DAO.CRUDRegistrarVenta;
import DAO.CRUDTrabajadores;
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import DAO.ConectarBD;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Reportes {

    public void ReportesClientes() {
        Document documento = new Document();
        CRUDCliente crud = new CRUDCliente();
        try {
            // Obtener la fecha actual
            Date fechaActual = new Date();
            SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyyMMdd_HHmmss");
            String fechaFormateada = formatoFecha.format(fechaActual);

            // Obtener la ruta del directorio del proyecto
            String directorioProyecto = System.getProperty("user.dir");

            // Crear directorio si no existe
            String directorio = directorioProyecto + "/src/Reportes/";
            new File(directorio).mkdirs();

            String nombreArchivo = "Reporte_Clientes_" + fechaFormateada + ".pdf";
            String rutaCompleta = directorio + nombreArchivo;

            PdfWriter.getInstance(documento, new FileOutputStream(rutaCompleta));
            Image header = Image.getInstance("src/img/bibliotecaLogo.png");
            header.scaleToFit(180, 210);
            header.setAlignment(Chunk.ALIGN_CENTER);
            // formato al texto
            Paragraph parrafo = new Paragraph();
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo.add("Reporte creado por \nMarx Chipana © BookWise\n\n");
            parrafo.setFont(FontFactory.getFont("Tahoma", 18, Font.BOLD, BaseColor.DARK_GRAY));
            parrafo.add("Reporte de Clientes \n\n");

            documento.open();
            // agregamos los datos
            documento.add(header);
            documento.add(parrafo);

            PdfPTable tabla = new PdfPTable(6);  // Ajustar el número de columnas
            tabla.setWidthPercentage(100);  // Ajustar el ancho de la tabla al 100% de la página

            tabla.addCell("Codigo");
            tabla.addCell("Nombres");
            tabla.addCell("DNI");
            tabla.addCell("Genero");
            tabla.addCell("Telefono");
            tabla.addCell("Correo");

            try {
                Connection cn = ConectarBD.conectar();
                PreparedStatement pst = cn.prepareStatement(
                        "select idCliente, concat(nombre, ' ', apellido) as nombres, dni, genero,telefono, correo from cliente where indicador = 'S'");
                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                    do {
                        tabla.addCell(rs.getString(1));
                        tabla.addCell(rs.getString(2));
                        tabla.addCell(rs.getString(3));
                        tabla.addCell(rs.getString(4));
                        tabla.addCell(rs.getString(5));
                        tabla.addCell(rs.getString(6));
                    } while (rs.next());
                    documento.add(tabla);
                    // Calcular la cantidad total de clientes
                    int cantidadTotalClientes = crud.calcularCantidadTotalClientes();
                    documento.add(new Paragraph("\n"));

                    // Agregar la cantidad total de clientes
                    Paragraph cantidadTotalClientesParrafo = new Paragraph();
                    cantidadTotalClientesParrafo.setAlignment(Paragraph.ALIGN_RIGHT);
                    cantidadTotalClientesParrafo.add("Cantidad Total de Clientes: " + cantidadTotalClientes);

                    documento.add(cantidadTotalClientesParrafo);
                }

            } catch (SQLException e) {
                System.out.println("Error 4 en: " + e);
            }
            documento.close();

            JOptionPane.showMessageDialog(null, "Reporte creado");
            abrirPDF(rutaCompleta);
        } catch (DocumentException e) {
            System.out.println("Error 1 en: " + e);
        } catch (FileNotFoundException ex) {
            System.out.println("Error 2 en: " + ex);
        } catch (IOException ex) {
            System.out.println("Error 3 en: " + ex);
        }
    }

    public void ReportesTrabajadores() {
        Document documento = new Document();
        CRUDTrabajadores crud = new CRUDTrabajadores();
        try {
            // Obtener la fecha actual
            Date fechaActual = new Date();
            SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyyMMdd_HHmmss");
            String fechaFormateada = formatoFecha.format(fechaActual);

            // Obtener la ruta del directorio del proyecto
            String directorioProyecto = System.getProperty("user.dir");

            // Crear directorio si no existe
            String directorio = directorioProyecto + "/src/Reportes/";
            new File(directorio).mkdirs();

            String nombreArchivo = "Reporte_Trabajador_" + fechaFormateada + ".pdf";
            String rutaCompleta = directorio + nombreArchivo;

            PdfWriter.getInstance(documento, new FileOutputStream(rutaCompleta));
            Image header = Image.getInstance("src/img/bibliotecaLogo.png");
            header.scaleToFit(180, 210);
            header.setAlignment(Chunk.ALIGN_CENTER);

            // formato al texto
            Paragraph parrafo = new Paragraph();
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo.add("Reporte creado por \nMarx Chipana © BookWise\n\n");
            parrafo.setFont(FontFactory.getFont("Tahoma", 18, Font.BOLD, BaseColor.DARK_GRAY));
            parrafo.add("Reporte de Trabajadores \n\n");

            documento.open();
            // agregamos los datos
            documento.add(header);
            documento.add(parrafo);

            PdfPTable tabla = new PdfPTable(8);  // Ajustar el número de columnas
            tabla.setWidthPercentage(100);  // Ajustar el ancho de la tabla al 100% de la página

            tabla.addCell("Codigo");
            tabla.addCell("Nombres");
            tabla.addCell("DNI");
            tabla.addCell("Celular");
            tabla.addCell("Correo");
            tabla.addCell("Contraseña");
            tabla.addCell("Cargo");
            tabla.addCell("Sueldo");

            try {
                Connection cn = ConectarBD.conectar();
                PreparedStatement pst = cn.prepareStatement(
                        "SELECT idTrab, CONCAT(nombre, ' ', apellido) AS nombres, dni, celular, correo, password, cargo, sueldo FROM trabajador where indicador = 'S'");
                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                    do {
                        tabla.addCell(rs.getString(1));
                        tabla.addCell(rs.getString(2));
                        tabla.addCell(rs.getString(3));
                        tabla.addCell(rs.getString(4));
                        tabla.addCell(rs.getString(5));
                        tabla.addCell(rs.getString(6));
                        tabla.addCell(rs.getString(7));
                        tabla.addCell(rs.getString(8));
                    } while (rs.next());
                    documento.add(tabla);
                    // Calcular la cantidad total de trabajadores
                    int cantidadTotalTrabajadores = crud.calcularCantidadTotalTrabajadores();
                    documento.add(new Paragraph("\n"));

                    // Agregar la cantidad total de trabajadores
                    Paragraph cantidadTotalTrabajadoresParrafo = new Paragraph();
                    cantidadTotalTrabajadoresParrafo.setAlignment(Paragraph.ALIGN_RIGHT);
                    cantidadTotalTrabajadoresParrafo.add("Cantidad Total de Trabajadores: " + cantidadTotalTrabajadores);

                    documento.add(cantidadTotalTrabajadoresParrafo);
                }

            } catch (SQLException e) {
                System.out.println("Error 4 en: " + e);
            }
            documento.close();

            JOptionPane.showMessageDialog(null, "Reporte creado");
            abrirPDF(rutaCompleta);
        } catch (DocumentException e) {
            System.out.println("Error 1 en: " + e);
        } catch (FileNotFoundException ex) {
            System.out.println("Error 2 en: " + ex);
        } catch (IOException ex) {
            System.out.println("Error 3 en: " + ex);
        }
    }

    public void ReportesLibros() {
        Document documento = new Document();
        CRUDLibro crud = new CRUDLibro();
        try {
            // Obtener la fecha actual
            Date fechaActual = new Date();
            SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyyMMdd_HHmmss");
            String fechaFormateada = formatoFecha.format(fechaActual);

            // Obtener la ruta del directorio del proyecto
            String directorioProyecto = System.getProperty("user.dir");

            // Crear directorio si no existe
            String directorio = directorioProyecto + "/src/Reportes/";
            new File(directorio).mkdirs();

            String nombreArchivo = "Reporte_Libros_" + fechaFormateada + ".pdf";
            String rutaCompleta = directorio + nombreArchivo;

            PdfWriter.getInstance(documento, new FileOutputStream(rutaCompleta));
            Image header = Image.getInstance("src/img/bibliotecaLogo.png");
            header.scaleToFit(180, 210);
            header.setAlignment(Chunk.ALIGN_CENTER);

            // formato al texto
            Paragraph parrafo = new Paragraph();
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo.add("Reporte creado por \nMarx Chipana © BookWise\n\n");
            parrafo.setFont(FontFactory.getFont("Tahoma", 18, Font.BOLD, BaseColor.DARK_GRAY));
            parrafo.add("Reporte de Libros \n\n");

            documento.open();
            // agregamos los datos
            documento.add(header);
            documento.add(parrafo);

            PdfPTable tabla = new PdfPTable(7);  // Ajustar el número de columnas
            tabla.setWidthPercentage(100);  // Ajustar el ancho de la tabla al 100% de la página

            tabla.addCell("Codigo");
            tabla.addCell("Titulo");
            tabla.addCell("Autor");
            tabla.addCell("Idioma");
            tabla.addCell("Cantidad");
            tabla.addCell("Precio");
            tabla.addCell("Categoria");

            try {
                Connection cn = ConectarBD.conectar();
                PreparedStatement pst = cn.prepareStatement(
                        "SELECT idLibro, titulo, autor, idioma, cantidad, precio, categoria FROM libros where indicador = 'S'");
                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                    do {
                        tabla.addCell(rs.getString(1));
                        tabla.addCell(rs.getString(2));
                        tabla.addCell(rs.getString(3));
                        tabla.addCell(rs.getString(4));
                        tabla.addCell(rs.getString(5));
                        tabla.addCell(rs.getString(6));
                        tabla.addCell(rs.getString(7));
                    } while (rs.next());
                    documento.add(tabla);
                    // Calcular la cantidad total de libros
                    int cantidadTotalLibros = crud.calcularCantidadTotalLibros();
                    documento.add(new Paragraph("\n"));

                    // Agregar la cantidad total de libros
                    Paragraph cantidadTotalLibrosParrafo = new Paragraph();
                    cantidadTotalLibrosParrafo.setAlignment(Paragraph.ALIGN_RIGHT);
                    cantidadTotalLibrosParrafo.add("Cantidad Total de Libros: " + cantidadTotalLibros);

                    documento.add(cantidadTotalLibrosParrafo);
                }

            } catch (SQLException e) {
                System.out.println("Error 4 en: " + e);
            }
            documento.close();

            JOptionPane.showMessageDialog(null, "Reporte creado");
            abrirPDF(rutaCompleta);
        } catch (DocumentException e) {
            System.out.println("Error 1 en: " + e);
        } catch (FileNotFoundException ex) {
            System.out.println("Error 2 en: " + ex);
        } catch (IOException ex) {
            System.out.println("Error 3 en: " + ex);
        }
    }

    public void ReportesGestionarVentas() {
        Document documento = new Document();
        CRUDRegistrarVenta crud = new CRUDRegistrarVenta();
        try {
            // Obtener la fecha actual
            Date fechaActual = new Date();
            SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyyMMdd_HHmmss");
            String fechaFormateada = formatoFecha.format(fechaActual);

            // Obtener la ruta del directorio del proyecto
            String directorioProyecto = System.getProperty("user.dir");

            // Crear directorio si no existe
            String directorio = directorioProyecto + "/src/Reportes/";
            new File(directorio).mkdirs();

            String nombreArchivo = "Reporte_Ventas_" + fechaFormateada + ".pdf";
            String rutaCompleta = directorio + nombreArchivo;

            PdfWriter.getInstance(documento, new FileOutputStream(rutaCompleta));
            Image header = Image.getInstance("src/img/bibliotecaLogo.png");
            header.scaleToFit(180, 210);
            header.setAlignment(Chunk.ALIGN_CENTER);

            // formato al texto
            Paragraph parrafo = new Paragraph();
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo.add("Reporte creado por \nMarx Chipana © BookWise\n\n");
            parrafo.setFont(FontFactory.getFont("Tahoma", 18, Font.BOLD, BaseColor.DARK_GRAY));
            parrafo.add("Reporte de Ventas \n\n");

            documento.open();
            // agregamos los datos
            documento.add(header);
            documento.add(parrafo);

            PdfPTable tabla = new PdfPTable(5);  // Ajustar el número de columnas
            tabla.setWidthPercentage(100);  // Ajustar el ancho de la tabla al 100% de la página

            tabla.addCell("ID");
            tabla.addCell("Cliente");
            tabla.addCell("Total Pagado");
            tabla.addCell("Fecha de Venta");
            tabla.addCell("Estado");

            try {
                Connection cn = ConectarBD.conectar();
                PreparedStatement pst = cn.prepareStatement(
                        "SELECT cv.idCabeceraVenta AS id, CONCAT(c.nombre, ' ', c.apellido) AS cliente, "
                        + "cv.valorPagar AS total, cv.fechaVenta AS fecha, "
                        + "CASE WHEN cv.estado = 1 THEN 'Vendido' ELSE 'En Proceso' END AS estado "
                        + "FROM cabeceraventa AS cv, cliente AS c WHERE cv.idCliente = c.idCliente");
                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                    do {
                        tabla.addCell(rs.getString(1));
                        tabla.addCell(rs.getString(2));
                        tabla.addCell(rs.getString(3));
                        tabla.addCell(rs.getString(4));
                        tabla.addCell(rs.getString(5));
                    } while (rs.next());
                    documento.add(tabla);
                    // Calcular el total recaudado
                    double totalRecaudado = crud.obtenerTotalRecaudado();
                    documento.add(new Paragraph("\n"));

                    // Agregar el total recaudado
                    Paragraph totalRecaudadoParrafo = new Paragraph();
                    totalRecaudadoParrafo.setAlignment(Paragraph.ALIGN_RIGHT);
                    totalRecaudadoParrafo.add("Total Recaudado: S/" + totalRecaudado);

                    documento.add(totalRecaudadoParrafo);
                }

            } catch (SQLException e) {
                System.out.println("Error 4 en: " + e);
            }
            documento.close();

            JOptionPane.showMessageDialog(null, "Reporte creado");
            abrirPDF(rutaCompleta);
        } catch (DocumentException e) {
            System.out.println("Error 1 en: " + e);
        } catch (FileNotFoundException ex) {
            System.out.println("Error 2 en: " + ex);
        } catch (IOException ex) {
            System.out.println("Error 3 en: " + ex);
        }
    }

    private void abrirPDF(String rutaPDF) {
        try {
            File file = new File(rutaPDF);
            if (file.exists()) {
                if (Desktop.isDesktopSupported()) {
                    Desktop.getDesktop().open(file);
                } else {
                    System.out.println("El entorno de escritorio no es compatible con la apertura automática.");
                }
            } else {
                System.out.println("El archivo PDF no existe en la ruta proporcionada.");
            }
        } catch (IOException e) {
            System.out.println("Error al abrir el PDF: " + e);
        }
    }
}
