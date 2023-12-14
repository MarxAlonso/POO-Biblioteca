package Vista;
public class FormGestionarVentas extends javax.swing.JInternalFrame {


    public FormGestionarVentas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblVentasRegistradas = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jtxtTotalPagar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtxtfecha = new javax.swing.JTextField();
        jcboCliente = new javax.swing.JComboBox<>();
        jcboEstado = new javax.swing.JComboBox<>();
        jbtnActualizar = new javax.swing.JButton();
        jbtnTotalRecaudado = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jbtnReporteVenta = new javax.swing.JButton();

        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(182, 140, 92));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtblVentasRegistradas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtblVentasRegistradas);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 740, 360));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 760, 380));

        jPanel4.setBackground(new java.awt.Color(242, 205, 136));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ADMINISTRAR VENTAS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(182, 140, 92));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 51, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Total Pagar:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 90, -1));

        jtxtTotalPagar.setBackground(new java.awt.Color(255, 204, 102));
        jtxtTotalPagar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtxtTotalPagar.setForeground(new java.awt.Color(204, 102, 0));
        jtxtTotalPagar.setCaretColor(new java.awt.Color(153, 51, 0));
        jtxtTotalPagar.setDisabledTextColor(new java.awt.Color(153, 51, 0));
        jtxtTotalPagar.setEnabled(false);
        jPanel3.add(jtxtTotalPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 190, 50));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 51, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Fecha:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 90, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 51, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Cliente:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, 90, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 51, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Estado:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 90, -1));

        jtxtfecha.setBackground(new java.awt.Color(255, 204, 102));
        jtxtfecha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtxtfecha.setForeground(new java.awt.Color(204, 102, 0));
        jtxtfecha.setCaretColor(new java.awt.Color(204, 102, 0));
        jtxtfecha.setDisabledTextColor(new java.awt.Color(204, 102, 0));
        jtxtfecha.setEnabled(false);
        jtxtfecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtfechaActionPerformed(evt);
            }
        });
        jPanel3.add(jtxtfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 190, 50));

        jcboCliente.setBackground(new java.awt.Color(255, 204, 102));
        jcboCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcboCliente.setForeground(new java.awt.Color(204, 102, 0));
        jcboCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione cliente:", "Item 2", "Item 3", "Item 4" }));
        jPanel3.add(jcboCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 220, 50));

        jcboEstado.setBackground(new java.awt.Color(255, 204, 102));
        jcboEstado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcboEstado.setForeground(new java.awt.Color(204, 102, 0));
        jcboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vendido", "En Proceso" }));
        jPanel3.add(jcboEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, 220, 50));

        jPanel4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 760, 140));

        jbtnActualizar.setBackground(new java.awt.Color(51, 204, 0));
        jbtnActualizar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnActualizar.setForeground(new java.awt.Color(0, 0, 0));
        jbtnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/actualizado.png"))); // NOI18N
        jbtnActualizar.setText("Actualizar");
        jbtnActualizar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnActualizarActionPerformed(evt);
            }
        });
        jPanel4.add(jbtnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 200, 140, 60));

        jbtnTotalRecaudado.setBackground(new java.awt.Color(255, 204, 0));
        jbtnTotalRecaudado.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtnTotalRecaudado.setForeground(new java.awt.Color(0, 0, 0));
        jbtnTotalRecaudado.setText("TOTAL RECAUDADO");
        jbtnTotalRecaudado.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.add(jbtnTotalRecaudado, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 370, 140, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/beneficio-financiero.png"))); // NOI18N
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 30, 150, 140));

        jbtnReporteVenta.setBackground(new java.awt.Color(255, 153, 0));
        jbtnReporteVenta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnReporteVenta.setForeground(new java.awt.Color(0, 0, 0));
        jbtnReporteVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reportes.png"))); // NOI18N
        jbtnReporteVenta.setText("Reporte");
        jbtnReporteVenta.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnReporteVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnReporteVentaActionPerformed(evt);
            }
        });
        jPanel4.add(jbtnReporteVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 290, 140, 60));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnActualizarActionPerformed

    }//GEN-LAST:event_jbtnActualizarActionPerformed

    private void jbtnReporteVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnReporteVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnReporteVentaActionPerformed

    private void jtxtfechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtfechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtfechaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    public static javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JButton jbtnActualizar;
    public javax.swing.JButton jbtnReporteVenta;
    public javax.swing.JButton jbtnTotalRecaudado;
    public javax.swing.JComboBox<String> jcboCliente;
    public javax.swing.JComboBox<String> jcboEstado;
    public javax.swing.JTable jtblVentasRegistradas;
    public javax.swing.JTextField jtxtTotalPagar;
    public javax.swing.JTextField jtxtfecha;
    // End of variables declaration//GEN-END:variables

 

}
