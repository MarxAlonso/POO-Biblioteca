package Vista;

import java.awt.Dimension;
import javax.swing.JTextField;


public class FormFechasGraficas extends javax.swing.JInternalFrame {
    
    public static String fecha_inicio = "", fecha_fin = "";
    public FormFechasGraficas() {
        initComponents();
        this.setSize(new Dimension(450, 300));
        this.setTitle("Historial de Ventas");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jDatefechainicio = new com.toedter.calendar.JDateChooser();
        jDatefechafin = new com.toedter.calendar.JDateChooser();
        jPanel1 = new javax.swing.JPanel();
        jbtnImprimirGrafica = new javax.swing.JButton();

        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Seleccione fechas para graficar");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Fecha inicio:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 100, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Fecha Fin:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 100, -1));

        jDatefechainicio.setDateFormatString("yyyy-MM-dd");
        jDatefechainicio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(jDatefechainicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 140, -1));

        jDatefechafin.setDateFormatString("yyyy-MM-dd");
        jDatefechafin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(jDatefechafin, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 140, -1));

        jPanel1.setBackground(new java.awt.Color(242, 205, 136));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtnImprimirGrafica.setBackground(new java.awt.Color(235, 173, 72));
        jbtnImprimirGrafica.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtnImprimirGrafica.setForeground(new java.awt.Color(102, 51, 0));
        jbtnImprimirGrafica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/historial1.png"))); // NOI18N
        jbtnImprimirGrafica.setText("Graficar Ventas");
        jbtnImprimirGrafica.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnImprimirGrafica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnImprimirGraficaActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnImprimirGrafica, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 230, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnImprimirGraficaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnImprimirGraficaActionPerformed

        fecha_inicio = ((JTextField) jDatefechainicio.getDateEditor().getUiComponent()).getText();
        fecha_fin = ((JTextField) jDatefechafin.getDateEditor().getUiComponent()).getText();

        FormGraficaVentas interGraficaVentas = new FormGraficaVentas();
        

    }//GEN-LAST:event_jbtnImprimirGraficaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static com.toedter.calendar.JDateChooser jDatefechafin;
    public static com.toedter.calendar.JDateChooser jDatefechainicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JButton jbtnImprimirGrafica;
    // End of variables declaration//GEN-END:variables


}
