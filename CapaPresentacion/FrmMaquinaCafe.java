/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaPresentacion;

import javax.swing.JOptionPane;

/**
 *
 * @author geral
 */
public class FrmMaquinaCafe extends javax.swing.JFrame {

    /**
     * Creates new form FrmMaquinaCafe
     */
    public FrmMaquinaCafe() {
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

        txtValor_encontrado = new javax.swing.JTextField();
        btnLeer = new javax.swing.JButton();
        btnEscribir = new javax.swing.JButton();
        btnRecibirMoneda = new javax.swing.JButton();
        btnCancelarOperacion = new javax.swing.JButton();
        btnServirProducto = new javax.swing.JButton();
        btnEntregarVuelta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnLeer.setText("Leer");
        btnLeer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeerActionPerformed(evt);
            }
        });

        btnEscribir.setText("Escribir");
        btnEscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEscribirActionPerformed(evt);
            }
        });

        btnRecibirMoneda.setText("RecibirMoneda()");
        btnRecibirMoneda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecibirMonedaActionPerformed(evt);
            }
        });

        btnCancelarOperacion.setText("CancelarOperacion()");
        btnCancelarOperacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarOperacionActionPerformed(evt);
            }
        });

        btnServirProducto.setText("ServirProducto()");
        btnServirProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnServirProductoActionPerformed(evt);
            }
        });

        btnEntregarVuelta.setText("EntregarVuelta()");
        btnEntregarVuelta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntregarVueltaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnLeer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRecibirMoneda, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                            .addComponent(btnServirProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCancelarOperacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEntregarVuelta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEscribir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(txtValor_encontrado, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(txtValor_encontrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLeer)
                    .addComponent(btnEscribir))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRecibirMoneda)
                    .addComponent(btnCancelarOperacion))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnServirProducto)
                    .addComponent(btnEntregarVuelta))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // Instanciar la clase
    CapaNegocio.MaquinaCafe maquinaCafe = new CapaNegocio.MaquinaCafe();
    
    private void btnLeerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeerActionPerformed
        // Leer el contenido de las cajas de texto
        String valor_encontrado = txtValor_encontrado.getText();
        // Llevar los datos a los atributos del objeto a trav??s de las propiedades
        maquinaCafe.setValor_recolectado(valor_encontrado);
        // Mostrar el mensaje
        JOptionPane.showMessageDialog(rootPane, "Dato registrado en el objeto");
    }//GEN-LAST:event_btnLeerActionPerformed

    private void btnEscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEscribirActionPerformed
        JOptionPane.showMessageDialog(rootPane, "Valor Encontrado: " + maquinaCafe.getValor_recolectado());
    }//GEN-LAST:event_btnEscribirActionPerformed

    private void btnRecibirMonedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecibirMonedaActionPerformed
        JOptionPane.showMessageDialog(rootPane, String.valueOf(maquinaCafe.RecibirMoneda().toString()));
    }//GEN-LAST:event_btnRecibirMonedaActionPerformed

    private void btnCancelarOperacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarOperacionActionPerformed
        JOptionPane.showMessageDialog(rootPane, String.valueOf(maquinaCafe.CancelarOperacion().toString()));
    }//GEN-LAST:event_btnCancelarOperacionActionPerformed

    private void btnServirProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnServirProductoActionPerformed
        JOptionPane.showMessageDialog(rootPane, String.valueOf(maquinaCafe.ServirProducto().toString()));
    }//GEN-LAST:event_btnServirProductoActionPerformed

    private void btnEntregarVueltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntregarVueltaActionPerformed
        JOptionPane.showMessageDialog(rootPane, String.valueOf(maquinaCafe.EntregarVuelta().toString()));
    }//GEN-LAST:event_btnEntregarVueltaActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMaquinaCafe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMaquinaCafe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMaquinaCafe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMaquinaCafe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMaquinaCafe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarOperacion;
    private javax.swing.JButton btnEntregarVuelta;
    private javax.swing.JButton btnEscribir;
    private javax.swing.JButton btnLeer;
    private javax.swing.JButton btnRecibirMoneda;
    private javax.swing.JButton btnServirProducto;
    private javax.swing.JTextField txtValor_encontrado;
    // End of variables declaration//GEN-END:variables
}
