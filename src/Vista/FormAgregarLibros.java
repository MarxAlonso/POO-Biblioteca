package Vista;
public class FormAgregarLibros extends javax.swing.JInternalFrame {
    public FormAgregarLibros() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelDatosLibros = new javax.swing.JPanel();
        jtxtTituloLibro = new javax.swing.JTextField();
        jtxtAutorLibro = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtxaSinopsisLibro = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtblaMostrarLibro = new javax.swing.JTable();
        jtxtBuscarCodigoLib = new javax.swing.JTextField();
        jbtnBuscarLibros = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jbtnAgregarLibroRegistro = new javax.swing.JButton();
        jbtnActualizarLibro = new javax.swing.JButton();
        jbtnEliminarLibro = new javax.swing.JButton();
        jtxtCantidad = new javax.swing.JTextField();
        jtxtCodigoLibro = new javax.swing.JTextField();
        jtxtIdiomaLibro = new javax.swing.JTextField();
        jcboIGV = new javax.swing.JComboBox<>();
        jtxtPrecio = new javax.swing.JTextField();
        jtxtCategoria = new javax.swing.JTextField();
        jbtnReporteLibro = new javax.swing.JButton();

        setBackground(new java.awt.Color(222, 171, 128));
        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelDatosLibros.setBackground(new java.awt.Color(228, 177, 113));
        panelDatosLibros.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "AGREGAR LIBROS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(102, 0, 0))); // NOI18N
        panelDatosLibros.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtTituloLibro.setBackground(new java.awt.Color(255, 204, 102));
        jtxtTituloLibro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jtxtTituloLibro.setForeground(new java.awt.Color(102, 0, 0));
        jtxtTituloLibro.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TITULO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 10))); // NOI18N
        panelDatosLibros.add(jtxtTituloLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 330, 60));

        jtxtAutorLibro.setBackground(new java.awt.Color(255, 204, 102));
        jtxtAutorLibro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jtxtAutorLibro.setForeground(new java.awt.Color(102, 0, 0));
        jtxtAutorLibro.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "AUTOR", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 10))); // NOI18N
        panelDatosLibros.add(jtxtAutorLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 330, 70));

        jtxaSinopsisLibro.setBackground(new java.awt.Color(255, 204, 102));
        jtxaSinopsisLibro.setColumns(20);
        jtxaSinopsisLibro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jtxaSinopsisLibro.setForeground(new java.awt.Color(102, 0, 0));
        jtxaSinopsisLibro.setRows(5);
        jtxaSinopsisLibro.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SINOPSIS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 10))); // NOI18N
        jScrollPane2.setViewportView(jtxaSinopsisLibro);

        panelDatosLibros.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 40, 420, 140));

        jPanel2.setBackground(new java.awt.Color(222, 171, 128));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtblaMostrarLibro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jtblaMostrarLibro);

        jPanel4.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 870, 290));

        jTabbedPane1.addTab("LIBROS AGREGADOS", jPanel4);

        jPanel2.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 950, 370));

        jtxtBuscarCodigoLib.setBackground(new java.awt.Color(255, 204, 102));
        jtxtBuscarCodigoLib.setForeground(new java.awt.Color(102, 0, 0));
        jtxtBuscarCodigoLib.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CODIGO LIBRO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 12))); // NOI18N
        jPanel2.add(jtxtBuscarCodigoLib, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, 350, 60));

        jbtnBuscarLibros.setBackground(new java.awt.Color(182, 140, 92));
        jbtnBuscarLibros.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtnBuscarLibros.setForeground(new java.awt.Color(102, 0, 0));
        jbtnBuscarLibros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        jbtnBuscarLibros.setText("BUSCAR LIBRO");
        jbtnBuscarLibros.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jbtnBuscarLibros, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 30, 180, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/libro.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 90, 70));

        panelDatosLibros.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 1060, 470));

        jbtnAgregarLibroRegistro.setBackground(new java.awt.Color(182, 140, 92));
        jbtnAgregarLibroRegistro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtnAgregarLibroRegistro.setForeground(new java.awt.Color(102, 0, 0));
        jbtnAgregarLibroRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/registrar.png"))); // NOI18N
        jbtnAgregarLibroRegistro.setText("AGREGAR LIBRO");
        jbtnAgregarLibroRegistro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnAgregarLibroRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAgregarLibroRegistroActionPerformed(evt);
            }
        });
        panelDatosLibros.add(jbtnAgregarLibroRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 190, 170, 60));

        jbtnActualizarLibro.setBackground(new java.awt.Color(182, 140, 92));
        jbtnActualizarLibro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtnActualizarLibro.setForeground(new java.awt.Color(102, 0, 0));
        jbtnActualizarLibro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/actualizado.png"))); // NOI18N
        jbtnActualizarLibro.setText("ACTUALIZAR");
        jbtnActualizarLibro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelDatosLibros.add(jbtnActualizarLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 260, 170, 60));

        jbtnEliminarLibro.setBackground(new java.awt.Color(182, 140, 92));
        jbtnEliminarLibro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtnEliminarLibro.setForeground(new java.awt.Color(102, 0, 0));
        jbtnEliminarLibro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/borrar.png"))); // NOI18N
        jbtnEliminarLibro.setText("ELIMINAR");
        jbtnEliminarLibro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelDatosLibros.add(jbtnEliminarLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 190, 150, 60));

        jtxtCantidad.setBackground(new java.awt.Color(255, 204, 102));
        jtxtCantidad.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jtxtCantidad.setForeground(new java.awt.Color(102, 0, 0));
        jtxtCantidad.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CANTIDAD", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 10))); // NOI18N
        panelDatosLibros.add(jtxtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 130, 60));

        jtxtCodigoLibro.setBackground(new java.awt.Color(255, 204, 102));
        jtxtCodigoLibro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jtxtCodigoLibro.setForeground(new java.awt.Color(102, 0, 0));
        jtxtCodigoLibro.setText("LIB00000");
        jtxtCodigoLibro.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CODIGO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 10))); // NOI18N
        jtxtCodigoLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtCodigoLibroActionPerformed(evt);
            }
        });
        panelDatosLibros.add(jtxtCodigoLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 190, 60));

        jtxtIdiomaLibro.setBackground(new java.awt.Color(255, 204, 102));
        jtxtIdiomaLibro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jtxtIdiomaLibro.setForeground(new java.awt.Color(102, 0, 0));
        jtxtIdiomaLibro.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "IDIOMA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 10))); // NOI18N
        panelDatosLibros.add(jtxtIdiomaLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 260, 60));

        jcboIGV.setBackground(new java.awt.Color(255, 204, 102));
        jcboIGV.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jcboIGV.setForeground(new java.awt.Color(102, 0, 0));
        jcboIGV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione IGV", "18%" }));
        jcboIGV.setBorder(javax.swing.BorderFactory.createTitledBorder("IGV"));
        jcboIGV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcboIGVActionPerformed(evt);
            }
        });
        panelDatosLibros.add(jcboIGV, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 180, 130, 70));

        jtxtPrecio.setBackground(new java.awt.Color(255, 204, 102));
        jtxtPrecio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jtxtPrecio.setForeground(new java.awt.Color(102, 0, 0));
        jtxtPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PRECIO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 10))); // NOI18N
        panelDatosLibros.add(jtxtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, 130, 70));

        jtxtCategoria.setBackground(new java.awt.Color(255, 204, 102));
        jtxtCategoria.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jtxtCategoria.setForeground(new java.awt.Color(102, 0, 0));
        jtxtCategoria.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CATEGORIA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 10))); // NOI18N
        panelDatosLibros.add(jtxtCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 260, 60));

        jbtnReporteLibro.setBackground(new java.awt.Color(182, 140, 92));
        jbtnReporteLibro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtnReporteLibro.setForeground(new java.awt.Color(102, 0, 0));
        jbtnReporteLibro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reportes.png"))); // NOI18N
        jbtnReporteLibro.setText("REPORTE");
        jbtnReporteLibro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelDatosLibros.add(jbtnReporteLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 260, 150, 60));

        getContentPane().add(panelDatosLibros, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1180, 830));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnAgregarLibroRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAgregarLibroRegistroActionPerformed

    }//GEN-LAST:event_jbtnAgregarLibroRegistroActionPerformed

    private void jcboIGVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcboIGVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcboIGVActionPerformed

    private void jtxtCodigoLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtCodigoLibroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtCodigoLibroActionPerformed

    /**
     * @param args the command line arguments
     */
////    public static void main(String args[]) {
////        /* Set the Nimbus look and feel */
////        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
////        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
////         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
////         */
////        try {
////            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
////                if ("Nimbus".equals(info.getName())) {
////                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
////                    break;
////                }
////            }
////        } catch (ClassNotFoundException ex) {
////            java.util.logging.Logger.getLogger(FormAgregarLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
////        } catch (InstantiationException ex) {
////            java.util.logging.Logger.getLogger(FormAgregarLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
////        } catch (IllegalAccessException ex) {
////            java.util.logging.Logger.getLogger(FormAgregarLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
////        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
////            java.util.logging.Logger.getLogger(FormAgregarLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
////        }
////        //</editor-fold>
////        //</editor-fold>
////
////        /* Create and display the form */
////        java.awt.EventQueue.invokeLater(new Runnable() {
////            public void run() {
////                new FormAgregarLibros().setVisible(true);
////            }
////        });
////    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    public javax.swing.JButton jbtnActualizarLibro;
    public javax.swing.JButton jbtnAgregarLibroRegistro;
    public javax.swing.JButton jbtnBuscarLibros;
    public javax.swing.JButton jbtnEliminarLibro;
    public javax.swing.JButton jbtnReporteLibro;
    public javax.swing.JComboBox<String> jcboIGV;
    public javax.swing.JTable jtblaMostrarLibro;
    public javax.swing.JTextArea jtxaSinopsisLibro;
    public javax.swing.JTextField jtxtAutorLibro;
    public javax.swing.JTextField jtxtBuscarCodigoLib;
    public javax.swing.JTextField jtxtCantidad;
    public javax.swing.JTextField jtxtCategoria;
    public javax.swing.JTextField jtxtCodigoLibro;
    public javax.swing.JTextField jtxtIdiomaLibro;
    public javax.swing.JTextField jtxtPrecio;
    public javax.swing.JTextField jtxtTituloLibro;
    public javax.swing.JPanel panelDatosLibros;
    // End of variables declaration//GEN-END:variables
}
