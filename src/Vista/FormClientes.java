package Vista;

import DAO.CRUDCliente;

public class FormClientes extends javax.swing.JInternalFrame {

    public FormClientes() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelDatosCliente = new javax.swing.JPanel();
        jtxtNombreCliente = new javax.swing.JTextField();
        jtxtApellidosCliente = new javax.swing.JTextField();
        jtxtDniCliente = new javax.swing.JTextField();
        jtxtNumCelCliente = new javax.swing.JTextField();
        jtxtCorreoPersonalCliente = new javax.swing.JTextField();
        jbtnRegistrarUsuario = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jbtnBuscarCliente = new javax.swing.JButton();
        jtxtBuscarDniCli = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtblMostrarCliente = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jbtnActualizarCliente = new javax.swing.JButton();
        jbtnEliminarCliente = new javax.swing.JButton();
        jtxtCodigoCliente = new javax.swing.JTextField();
        jtxtGeneroCliente = new javax.swing.JTextField();
        jbtnReportes = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelDatosCliente.setBackground(new java.awt.Color(228, 177, 113));
        panelDatosCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "REGISTRAR NUEVO USUARIO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        panelDatosCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtNombreCliente.setBackground(new java.awt.Color(255, 204, 102));
        jtxtNombreCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jtxtNombreCliente.setForeground(new java.awt.Color(102, 0, 0));
        jtxtNombreCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NOMBRES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 10))); // NOI18N
        panelDatosCliente.add(jtxtNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 260, 70));

        jtxtApellidosCliente.setBackground(new java.awt.Color(255, 204, 102));
        jtxtApellidosCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jtxtApellidosCliente.setForeground(new java.awt.Color(102, 0, 0));
        jtxtApellidosCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "APELLIDOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 10))); // NOI18N
        panelDatosCliente.add(jtxtApellidosCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 240, 70));

        jtxtDniCliente.setBackground(new java.awt.Color(255, 204, 102));
        jtxtDniCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jtxtDniCliente.setForeground(new java.awt.Color(102, 0, 0));
        jtxtDniCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NUMERO DE DNI", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 10))); // NOI18N
        panelDatosCliente.add(jtxtDniCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 260, 70));

        jtxtNumCelCliente.setBackground(new java.awt.Color(255, 204, 102));
        jtxtNumCelCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jtxtNumCelCliente.setForeground(new java.awt.Color(102, 0, 0));
        jtxtNumCelCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NUMERO DE CELULAR", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 10))); // NOI18N
        jtxtNumCelCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtNumCelClienteActionPerformed(evt);
            }
        });
        panelDatosCliente.add(jtxtNumCelCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 240, 80));

        jtxtCorreoPersonalCliente.setBackground(new java.awt.Color(255, 204, 102));
        jtxtCorreoPersonalCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jtxtCorreoPersonalCliente.setForeground(new java.awt.Color(102, 0, 0));
        jtxtCorreoPersonalCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CORREO PERSONAL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 10))); // NOI18N
        panelDatosCliente.add(jtxtCorreoPersonalCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 240, 70));

        jbtnRegistrarUsuario.setBackground(new java.awt.Color(182, 140, 92));
        jbtnRegistrarUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtnRegistrarUsuario.setForeground(new java.awt.Color(102, 51, 0));
        jbtnRegistrarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/registrar.png"))); // NOI18N
        jbtnRegistrarUsuario.setText("REGISTRAR CLIENTE");
        jbtnRegistrarUsuario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnRegistrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegistrarUsuarioActionPerformed(evt);
            }
        });
        panelDatosCliente.add(jbtnRegistrarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 200, 70));

        jPanel2.setBackground(new java.awt.Color(222, 171, 128));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtnBuscarCliente.setBackground(new java.awt.Color(182, 140, 92));
        jbtnBuscarCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtnBuscarCliente.setForeground(new java.awt.Color(102, 51, 0));
        jbtnBuscarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        jbtnBuscarCliente.setText("BUSCAR CLIENTE");
        jbtnBuscarCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBuscarClienteActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnBuscarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, 170, 60));

        jtxtBuscarDniCli.setBackground(new java.awt.Color(255, 204, 102));
        jtxtBuscarDniCli.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jtxtBuscarDniCli.setForeground(new java.awt.Color(102, 0, 0));
        jtxtBuscarDniCli.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DNI CLIENTE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 10))); // NOI18N
        jPanel2.add(jtxtBuscarDniCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 330, 50));

        jtblMostrarCliente.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jtblMostrarCliente);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 690, 430));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/clientes.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 140, 140));

        panelDatosCliente.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, 720, 620));

        jbtnActualizarCliente.setBackground(new java.awt.Color(182, 140, 92));
        jbtnActualizarCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtnActualizarCliente.setForeground(new java.awt.Color(102, 51, 0));
        jbtnActualizarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/actualizado.png"))); // NOI18N
        jbtnActualizarCliente.setText("ACTUALIZAR CLIENTE");
        jbtnActualizarCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnActualizarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnActualizarClienteActionPerformed(evt);
            }
        });
        panelDatosCliente.add(jbtnActualizarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 200, 70));

        jbtnEliminarCliente.setBackground(new java.awt.Color(182, 140, 92));
        jbtnEliminarCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtnEliminarCliente.setForeground(new java.awt.Color(102, 51, 0));
        jbtnEliminarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/borrar.png"))); // NOI18N
        jbtnEliminarCliente.setText("ELIMINAR CLIENTE");
        jbtnEliminarCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelDatosCliente.add(jbtnEliminarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 440, 190, 70));

        jtxtCodigoCliente.setBackground(new java.awt.Color(255, 204, 102));
        jtxtCodigoCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jtxtCodigoCliente.setForeground(new java.awt.Color(102, 0, 0));
        jtxtCodigoCliente.setText("CLI00000");
        jtxtCodigoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CODIGO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 10))); // NOI18N
        panelDatosCliente.add(jtxtCodigoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 240, 70));

        jtxtGeneroCliente.setBackground(new java.awt.Color(255, 204, 102));
        jtxtGeneroCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jtxtGeneroCliente.setForeground(new java.awt.Color(102, 0, 0));
        jtxtGeneroCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "GENERO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 10))); // NOI18N
        panelDatosCliente.add(jtxtGeneroCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 260, 80));

        jbtnReportes.setBackground(new java.awt.Color(182, 140, 92));
        jbtnReportes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtnReportes.setForeground(new java.awt.Color(102, 51, 0));
        jbtnReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reportes.png"))); // NOI18N
        jbtnReportes.setText("REPORTES");
        jbtnReportes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelDatosCliente.add(jbtnReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 530, 190, 70));

        getContentPane().add(panelDatosCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtNumCelClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtNumCelClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtNumCelClienteActionPerformed

    private void jbtnRegistrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegistrarUsuarioActionPerformed
        
    }//GEN-LAST:event_jbtnRegistrarUsuarioActionPerformed

    private void jbtnActualizarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnActualizarClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnActualizarClienteActionPerformed

    private void jbtnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBuscarClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnBuscarClienteActionPerformed

    /**
     * @param args the command line arguments
     */
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
//            java.util.logging.Logger.getLogger(FormClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(FormClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(FormClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(FormClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new FormClientes().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JButton jbtnActualizarCliente;
    public javax.swing.JButton jbtnBuscarCliente;
    public javax.swing.JButton jbtnEliminarCliente;
    public javax.swing.JButton jbtnRegistrarUsuario;
    public javax.swing.JButton jbtnReportes;
    public javax.swing.JTable jtblMostrarCliente;
    public javax.swing.JTextField jtxtApellidosCliente;
    public javax.swing.JTextField jtxtBuscarDniCli;
    public javax.swing.JTextField jtxtCodigoCliente;
    public javax.swing.JTextField jtxtCorreoPersonalCliente;
    public javax.swing.JTextField jtxtDniCliente;
    public javax.swing.JTextField jtxtGeneroCliente;
    public javax.swing.JTextField jtxtNombreCliente;
    public javax.swing.JTextField jtxtNumCelCliente;
    public javax.swing.JPanel panelDatosCliente;
    // End of variables declaration//GEN-END:variables

    
}
