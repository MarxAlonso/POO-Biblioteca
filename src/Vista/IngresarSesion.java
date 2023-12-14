package Vista;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

public class IngresarSesion extends javax.swing.JFrame {
 
    public IngresarSesion() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtxtcorreoelectronico = new javax.swing.JTextField();
        jbtnIniciarSesion = new javax.swing.JButton();
        jtxtcontraseña = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(222, 171, 128));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CUENTA BIBLIOTECA", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user2.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/password.png"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));

        jtxtcorreoelectronico.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtxtcorreoelectronico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtcorreoelectronicoActionPerformed(evt);
            }
        });
        jtxtcorreoelectronico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtcorreoelectronicoKeyPressed(evt);
            }
        });
        jPanel2.add(jtxtcorreoelectronico, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 290, 40));

        jbtnIniciarSesion.setBackground(new java.awt.Color(248, 227, 162));
        jbtnIniciarSesion.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnIniciarSesion.setForeground(new java.awt.Color(0, 0, 0));
        jbtnIniciarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iniciar-sesion.png"))); // NOI18N
        jbtnIniciarSesion.setText("Iniciar Sesión");
        jbtnIniciarSesion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnIniciarSesionActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 470, 220, 100));

        jtxtcontraseña.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtxtcontraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtcontraseñaActionPerformed(evt);
            }
        });
        jtxtcontraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtcontraseñaKeyPressed(evt);
            }
        });
        jPanel2.add(jtxtcontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, 290, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cuenta.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 0, 440, 720));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Biblioteca.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnIniciarSesionActionPerformed
        
    }//GEN-LAST:event_jbtnIniciarSesionActionPerformed

    private void jtxtcorreoelectronicoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtcorreoelectronicoKeyPressed
        
    }//GEN-LAST:event_jtxtcorreoelectronicoKeyPressed

    private void jtxtcorreoelectronicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtcorreoelectronicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtcorreoelectronicoActionPerformed

    private void jtxtcontraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtcontraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtcontraseñaActionPerformed

    private void jtxtcontraseñaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtcontraseñaKeyPressed
        
    }//GEN-LAST:event_jtxtcontraseñaKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(IngresarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IngresarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IngresarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IngresarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IngresarSesion().setVisible(true);
            }
        });
    }
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/bibliotecaLogo.png"));
        return retValue;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JButton jbtnIniciarSesion;
    public javax.swing.JPasswordField jtxtcontraseña;
    public javax.swing.JTextField jtxtcorreoelectronico;
    // End of variables declaration//GEN-END:variables

}
