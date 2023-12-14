package Vista;
public class FormRegistrarVenta extends javax.swing.JInternalFrame {
    public FormRegistrarVenta() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jbtnRegistrarVentas = new javax.swing.JButton();
        jbtnBuscarCliente = new javax.swing.JButton();
        jbtnAñadirLibro = new javax.swing.JButton();
        jcboLibro = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jcboCliente = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jtxtSubTotal = new javax.swing.JTextField();
        jtxtDescuento = new javax.swing.JTextField();
        jtxtIgv = new javax.swing.JTextField();
        jtxtTotalPagar = new javax.swing.JTextField();
        jtxtEfectivo = new javax.swing.JTextField();
        jtxtCambio = new javax.swing.JTextField();
        jbtnCalcularCambio = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblFacturacion = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jtxtCantidad = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtxtClienteBuscar = new javax.swing.JTextField();

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Producto:");

        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 0));
        jLabel1.setText("Registrar Venta");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, -1, -1));

        jPanel3.setBackground(new java.awt.Color(242, 205, 136));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtnRegistrarVentas.setBackground(new java.awt.Color(241, 176, 94));
        jbtnRegistrarVentas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnRegistrarVentas.setForeground(new java.awt.Color(102, 51, 0));
        jbtnRegistrarVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/impresora.png"))); // NOI18N
        jbtnRegistrarVentas.setText("Registrar Venta");
        jbtnRegistrarVentas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnRegistrarVentas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnRegistrarVentas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtnRegistrarVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegistrarVentasActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnRegistrarVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 440, 170, 100));

        jbtnBuscarCliente.setBackground(new java.awt.Color(182, 140, 92));
        jbtnBuscarCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnBuscarCliente.setForeground(new java.awt.Color(102, 51, 0));
        jbtnBuscarCliente.setText("Buscar");
        jbtnBuscarCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBuscarClienteActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnBuscarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 40, 90, 40));

        jbtnAñadirLibro.setBackground(new java.awt.Color(182, 140, 92));
        jbtnAñadirLibro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnAñadirLibro.setForeground(new java.awt.Color(102, 51, 0));
        jbtnAñadirLibro.setText("Añadir Libro");
        jbtnAñadirLibro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnAñadirLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAñadirLibroActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnAñadirLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 90, 160, 40));

        jcboLibro.setBackground(new java.awt.Color(255, 204, 102));
        jcboLibro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jcboLibro.setForeground(new java.awt.Color(102, 0, 0));
        jcboLibro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione libro:", "Item 2", "Item 3", "Item 4" }));
        jPanel3.add(jcboLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 210, 40));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/punto-de-venta.png"))); // NOI18N
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 30, 140, 110));

        jcboCliente.setBackground(new java.awt.Color(255, 204, 102));
        jcboCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jcboCliente.setForeground(new java.awt.Color(102, 0, 0));
        jcboCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione cliente:", "Item 2", "Item 3", "Item 4" }));
        jPanel3.add(jcboCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 210, 40));

        jPanel2.setBackground(new java.awt.Color(182, 140, 92));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 51, 0));
        jLabel5.setText("Subtotal:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 51, 0));
        jLabel6.setText("Descuento:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 51, 0));
        jLabel7.setText("IGV:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 51, 0));
        jLabel8.setText("Total a pagar:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 51, 0));
        jLabel9.setText("Efectivo:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 51, 0));
        jLabel10.setText("Cambio:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        jtxtSubTotal.setBackground(new java.awt.Color(255, 204, 102));
        jtxtSubTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtxtSubTotal.setForeground(new java.awt.Color(204, 102, 0));
        jtxtSubTotal.setDisabledTextColor(new java.awt.Color(204, 102, 0));
        jtxtSubTotal.setEnabled(false);
        jtxtSubTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtSubTotalActionPerformed(evt);
            }
        });
        jPanel2.add(jtxtSubTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 120, -1));

        jtxtDescuento.setBackground(new java.awt.Color(255, 204, 102));
        jtxtDescuento.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtxtDescuento.setForeground(new java.awt.Color(204, 102, 0));
        jtxtDescuento.setDisabledTextColor(new java.awt.Color(204, 102, 0));
        jtxtDescuento.setEnabled(false);
        jPanel2.add(jtxtDescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 120, -1));

        jtxtIgv.setBackground(new java.awt.Color(255, 204, 102));
        jtxtIgv.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtxtIgv.setForeground(new java.awt.Color(204, 102, 0));
        jtxtIgv.setDisabledTextColor(new java.awt.Color(204, 102, 0));
        jtxtIgv.setEnabled(false);
        jPanel2.add(jtxtIgv, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 120, -1));

        jtxtTotalPagar.setBackground(new java.awt.Color(255, 204, 102));
        jtxtTotalPagar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtxtTotalPagar.setForeground(new java.awt.Color(204, 102, 0));
        jtxtTotalPagar.setDisabledTextColor(new java.awt.Color(204, 102, 0));
        jtxtTotalPagar.setEnabled(false);
        jPanel2.add(jtxtTotalPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 120, -1));

        jtxtEfectivo.setBackground(new java.awt.Color(255, 204, 102));
        jtxtEfectivo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtxtEfectivo.setForeground(new java.awt.Color(204, 102, 0));
        jPanel2.add(jtxtEfectivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 120, -1));

        jtxtCambio.setBackground(new java.awt.Color(255, 204, 102));
        jtxtCambio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtxtCambio.setForeground(new java.awt.Color(204, 102, 0));
        jtxtCambio.setCaretColor(new java.awt.Color(204, 102, 0));
        jtxtCambio.setDisabledTextColor(new java.awt.Color(204, 102, 0));
        jtxtCambio.setEnabled(false);
        jPanel2.add(jtxtCambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 120, -1));

        jbtnCalcularCambio.setBackground(new java.awt.Color(229, 195, 89));
        jbtnCalcularCambio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnCalcularCambio.setForeground(new java.awt.Color(102, 0, 0));
        jbtnCalcularCambio.setText("Calcular Cambio");
        jbtnCalcularCambio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnCalcularCambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCalcularCambioActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnCalcularCambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 130, 50));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 380, 380, 220));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtblFacturacion.setModel(new javax.swing.table.DefaultTableModel(
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
        jtblFacturacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtblFacturacionMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtblFacturacion);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 830, 190));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 850, 210));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Cantidad:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 80, -1));

        jtxtCantidad.setBackground(new java.awt.Color(255, 204, 102));
        jtxtCantidad.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtxtCantidad.setForeground(new java.awt.Color(102, 0, 0));
        jPanel3.add(jtxtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 60, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Cliente:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 80, -1));

        jtxtClienteBuscar.setBackground(new java.awt.Color(255, 204, 102));
        jtxtClienteBuscar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtxtClienteBuscar.setForeground(new java.awt.Color(102, 0, 0));
        jPanel3.add(jtxtClienteBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, 150, 40));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBuscarClienteActionPerformed

    }//GEN-LAST:event_jbtnBuscarClienteActionPerformed

    private void jbtnAñadirLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAñadirLibroActionPerformed

    }//GEN-LAST:event_jbtnAñadirLibroActionPerformed

    private void jbtnCalcularCambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCalcularCambioActionPerformed

    }//GEN-LAST:event_jbtnCalcularCambioActionPerformed
    private void jtblFacturacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtblFacturacionMouseClicked

    }//GEN-LAST:event_jtblFacturacionMouseClicked

    private void jbtnRegistrarVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegistrarVentasActionPerformed

        
    }//GEN-LAST:event_jbtnRegistrarVentasActionPerformed

    private void jtxtSubTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtSubTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtSubTotalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public static javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JButton jbtnAñadirLibro;
    public javax.swing.JButton jbtnBuscarCliente;
    public javax.swing.JButton jbtnCalcularCambio;
    public javax.swing.JButton jbtnRegistrarVentas;
    public javax.swing.JComboBox<String> jcboCliente;
    public javax.swing.JComboBox<String> jcboLibro;
    public javax.swing.JTable jtblFacturacion;
    public javax.swing.JTextField jtxtCambio;
    public javax.swing.JTextField jtxtCantidad;
    public javax.swing.JTextField jtxtClienteBuscar;
    public javax.swing.JTextField jtxtDescuento;
    public volatile javax.swing.JTextField jtxtEfectivo;
    public javax.swing.JTextField jtxtIgv;
    public javax.swing.JTextField jtxtSubTotal;
    public javax.swing.JTextField jtxtTotalPagar;
    // End of variables declaration//GEN-END:variables


}
