package Vista;
public class FormTrabajadores extends javax.swing.JInternalFrame {

    public FormTrabajadores() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelDatosTrab = new javax.swing.JPanel();
        jtxtNombreTrabajador = new javax.swing.JTextField();
        jtxtApellidosTrabajador = new javax.swing.JTextField();
        jtxtDNITrabajador = new javax.swing.JTextField();
        jbtnRegistrarTrabajador = new javax.swing.JButton();
        jcboCargoTrabajador = new javax.swing.JComboBox<>();
        jtxtCelularTtabajador = new javax.swing.JTextField();
        jtxtCorreoTrabajador = new javax.swing.JTextField();
        jbtnActualizarTrabajador = new javax.swing.JButton();
        jbtnEliminarTrabajador = new javax.swing.JButton();
        jtxtCodigoTrabajador = new javax.swing.JTextField();
        jtxtSueldo = new javax.swing.JTextField();
        jbtnReporteTrabajador = new javax.swing.JButton();
        jtxtContraseña = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblTablaTrabajador = new javax.swing.JTable();
        jbtnBuscarTrab = new javax.swing.JButton();
        jtxtDniBuscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelDatosTrab.setBackground(new java.awt.Color(228, 177, 113));
        panelDatosTrab.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "AGREGAR TRABAJADOR", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        panelDatosTrab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtNombreTrabajador.setBackground(new java.awt.Color(255, 204, 102));
        jtxtNombreTrabajador.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jtxtNombreTrabajador.setForeground(new java.awt.Color(102, 0, 0));
        jtxtNombreTrabajador.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NOMBRES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 10))); // NOI18N
        panelDatosTrab.add(jtxtNombreTrabajador, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 210, 60));

        jtxtApellidosTrabajador.setBackground(new java.awt.Color(255, 204, 102));
        jtxtApellidosTrabajador.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jtxtApellidosTrabajador.setForeground(new java.awt.Color(102, 0, 0));
        jtxtApellidosTrabajador.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "APELLIDOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 10))); // NOI18N
        panelDatosTrab.add(jtxtApellidosTrabajador, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 220, 60));

        jtxtDNITrabajador.setBackground(new java.awt.Color(255, 204, 102));
        jtxtDNITrabajador.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jtxtDNITrabajador.setForeground(new java.awt.Color(102, 0, 0));
        jtxtDNITrabajador.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DNI", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 10))); // NOI18N
        jtxtDNITrabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtDNITrabajadorActionPerformed(evt);
            }
        });
        panelDatosTrab.add(jtxtDNITrabajador, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 210, 60));

        jbtnRegistrarTrabajador.setBackground(new java.awt.Color(182, 140, 92));
        jbtnRegistrarTrabajador.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtnRegistrarTrabajador.setForeground(new java.awt.Color(102, 51, 0));
        jbtnRegistrarTrabajador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/registrar.png"))); // NOI18N
        jbtnRegistrarTrabajador.setText("REGISTRAR");
        jbtnRegistrarTrabajador.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnRegistrarTrabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegistrarTrabajadorActionPerformed(evt);
            }
        });
        panelDatosTrab.add(jbtnRegistrarTrabajador, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 130, 170, 60));

        jcboCargoTrabajador.setBackground(new java.awt.Color(255, 204, 102));
        jcboCargoTrabajador.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jcboCargoTrabajador.setForeground(new java.awt.Color(102, 0, 0));
        jcboCargoTrabajador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SISTEMAS", "ADMINISTRADOR", "LOGISTICA", "CONTABILIDAD" }));
        jcboCargoTrabajador.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CARGO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 10), new java.awt.Color(0, 0, 0))); // NOI18N
        jcboCargoTrabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcboCargoTrabajadorActionPerformed(evt);
            }
        });
        panelDatosTrab.add(jcboCargoTrabajador, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, 280, 70));

        jtxtCelularTtabajador.setBackground(new java.awt.Color(255, 204, 102));
        jtxtCelularTtabajador.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jtxtCelularTtabajador.setForeground(new java.awt.Color(102, 0, 0));
        jtxtCelularTtabajador.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nª CELULAR", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 10))); // NOI18N
        jtxtCelularTtabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtCelularTtabajadorActionPerformed(evt);
            }
        });
        panelDatosTrab.add(jtxtCelularTtabajador, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 220, 60));

        jtxtCorreoTrabajador.setBackground(new java.awt.Color(255, 204, 102));
        jtxtCorreoTrabajador.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jtxtCorreoTrabajador.setForeground(new java.awt.Color(102, 0, 0));
        jtxtCorreoTrabajador.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CORREO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 10))); // NOI18N
        jtxtCorreoTrabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtCorreoTrabajadorActionPerformed(evt);
            }
        });
        panelDatosTrab.add(jtxtCorreoTrabajador, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 40, 420, 70));

        jbtnActualizarTrabajador.setBackground(new java.awt.Color(182, 140, 92));
        jbtnActualizarTrabajador.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtnActualizarTrabajador.setForeground(new java.awt.Color(102, 51, 0));
        jbtnActualizarTrabajador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/actualizado.png"))); // NOI18N
        jbtnActualizarTrabajador.setText("ACTUALIZAR");
        jbtnActualizarTrabajador.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnActualizarTrabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnActualizarTrabajadorActionPerformed(evt);
            }
        });
        panelDatosTrab.add(jbtnActualizarTrabajador, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 130, 170, 60));

        jbtnEliminarTrabajador.setBackground(new java.awt.Color(182, 140, 92));
        jbtnEliminarTrabajador.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtnEliminarTrabajador.setForeground(new java.awt.Color(102, 51, 0));
        jbtnEliminarTrabajador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/borrar.png"))); // NOI18N
        jbtnEliminarTrabajador.setText("ELIMINAR");
        jbtnEliminarTrabajador.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnEliminarTrabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEliminarTrabajadorActionPerformed(evt);
            }
        });
        panelDatosTrab.add(jbtnEliminarTrabajador, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 200, 170, 60));

        jtxtCodigoTrabajador.setBackground(new java.awt.Color(255, 204, 102));
        jtxtCodigoTrabajador.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jtxtCodigoTrabajador.setForeground(new java.awt.Color(102, 0, 0));
        jtxtCodigoTrabajador.setText("TRB000");
        jtxtCodigoTrabajador.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CODIGO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 10), new java.awt.Color(102, 0, 0))); // NOI18N
        panelDatosTrab.add(jtxtCodigoTrabajador, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 190, 70));

        jtxtSueldo.setBackground(new java.awt.Color(255, 204, 102));
        jtxtSueldo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jtxtSueldo.setForeground(new java.awt.Color(102, 0, 0));
        jtxtSueldo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SUELDO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 10))); // NOI18N
        panelDatosTrab.add(jtxtSueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 140, 70));

        jbtnReporteTrabajador.setBackground(new java.awt.Color(182, 140, 92));
        jbtnReporteTrabajador.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtnReporteTrabajador.setForeground(new java.awt.Color(102, 51, 0));
        jbtnReporteTrabajador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reportes.png"))); // NOI18N
        jbtnReporteTrabajador.setText("REPORTE");
        jbtnReporteTrabajador.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnReporteTrabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnReporteTrabajadorActionPerformed(evt);
            }
        });
        panelDatosTrab.add(jbtnReporteTrabajador, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 200, 170, 60));

        jtxtContraseña.setBackground(new java.awt.Color(255, 204, 102));
        jtxtContraseña.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jtxtContraseña.setForeground(new java.awt.Color(102, 0, 0));
        jtxtContraseña.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CONTRASEÑA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 10))); // NOI18N
        panelDatosTrab.add(jtxtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, 220, 60));

        getContentPane().add(panelDatosTrab, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 270));

        jPanel2.setBackground(new java.awt.Color(222, 171, 128));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TABLA DE REGISTROS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtblTablaTrabajador.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtblTablaTrabajador);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 940, 310));

        jTabbedPane1.addTab("TABLA DE REGISTROS", jPanel3);

        jPanel2.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 1000, 390));

        jbtnBuscarTrab.setBackground(new java.awt.Color(182, 140, 92));
        jbtnBuscarTrab.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtnBuscarTrab.setForeground(new java.awt.Color(102, 51, 0));
        jbtnBuscarTrab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        jbtnBuscarTrab.setText("BUSCAR");
        jbtnBuscarTrab.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jbtnBuscarTrab, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 60, 190, 60));

        jtxtDniBuscar.setBackground(new java.awt.Color(255, 204, 102));
        jtxtDniBuscar.setForeground(new java.awt.Color(102, 0, 0));
        jtxtDniBuscar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DNI TRABAJADOR", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 10))); // NOI18N
        jPanel2.add(jtxtDniBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 350, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/trabajar.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 10, 150, 140));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 1150, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnRegistrarTrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegistrarTrabajadorActionPerformed
;
    }//GEN-LAST:event_jbtnRegistrarTrabajadorActionPerformed

    private void jbtnActualizarTrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnActualizarTrabajadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnActualizarTrabajadorActionPerformed

    private void jtxtDNITrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtDNITrabajadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtDNITrabajadorActionPerformed

    private void jcboCargoTrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcboCargoTrabajadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcboCargoTrabajadorActionPerformed

    private void jbtnEliminarTrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEliminarTrabajadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnEliminarTrabajadorActionPerformed

    private void jtxtCorreoTrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtCorreoTrabajadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtCorreoTrabajadorActionPerformed

    private void jbtnReporteTrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnReporteTrabajadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnReporteTrabajadorActionPerformed

    private void jtxtCelularTtabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtCelularTtabajadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtCelularTtabajadorActionPerformed

    /**
     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(FormTrabajadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(FormTrabajadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(FormTrabajadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(FormTrabajadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new FormTrabajadores().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    public javax.swing.JButton jbtnActualizarTrabajador;
    public javax.swing.JButton jbtnBuscarTrab;
    public javax.swing.JButton jbtnEliminarTrabajador;
    public javax.swing.JButton jbtnRegistrarTrabajador;
    public javax.swing.JButton jbtnReporteTrabajador;
    public javax.swing.JComboBox<String> jcboCargoTrabajador;
    public javax.swing.JTable jtblTablaTrabajador;
    public javax.swing.JTextField jtxtApellidosTrabajador;
    public javax.swing.JTextField jtxtCelularTtabajador;
    public javax.swing.JTextField jtxtCodigoTrabajador;
    public javax.swing.JTextField jtxtContraseña;
    public javax.swing.JTextField jtxtCorreoTrabajador;
    public javax.swing.JTextField jtxtDNITrabajador;
    public javax.swing.JTextField jtxtDniBuscar;
    public javax.swing.JTextField jtxtNombreTrabajador;
    public javax.swing.JTextField jtxtSueldo;
    public javax.swing.JPanel panelDatosTrab;
    // End of variables declaration//GEN-END:variables
}
