/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import javax.swing.JOptionPane;

/**
 *
 * @author nihil
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        jButton_alta = new javax.swing.JButton();
        jButton_salida = new javax.swing.JButton();
        jButton_consultar = new javax.swing.JButton();
        jButton_salir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CENTURION");

        jPanel1.setBackground(new java.awt.Color(255, 247, 155));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton_alta.setBackground(new java.awt.Color(204, 0, 0));
        jButton_alta.setFont(new java.awt.Font("Castellar", 1, 18)); // NOI18N
        jButton_alta.setForeground(new java.awt.Color(255, 153, 0));
        jButton_alta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/REGISTRObotton.png"))); // NOI18N
        jButton_alta.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(255, 102, 0)));
        jButton_alta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_alta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_altaActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_alta, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, -1, 50));

        jButton_salida.setBackground(new java.awt.Color(204, 0, 0));
        jButton_salida.setFont(new java.awt.Font("Castellar", 1, 18)); // NOI18N
        jButton_salida.setForeground(new java.awt.Color(255, 153, 0));
        jButton_salida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/SALIDAbutton.png"))); // NOI18N
        jButton_salida.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(255, 102, 0)));
        jButton_salida.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_salida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_salidaActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_salida, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, -1, 50));

        jButton_consultar.setBackground(new java.awt.Color(204, 0, 0));
        jButton_consultar.setFont(new java.awt.Font("Castellar", 1, 18)); // NOI18N
        jButton_consultar.setForeground(new java.awt.Color(255, 153, 0));
        jButton_consultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CONSULTAbutton.png"))); // NOI18N
        jButton_consultar.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(255, 102, 0)));
        jButton_consultar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_consultarActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_consultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, 162, 50));

        jButton_salir.setBackground(new java.awt.Color(204, 0, 0));
        jButton_salir.setFont(new java.awt.Font("Castellar", 1, 18)); // NOI18N
        jButton_salir.setForeground(new java.awt.Color(255, 153, 0));
        jButton_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/SALIRBUTTON.png"))); // NOI18N
        jButton_salir.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(255, 102, 0)));
        jButton_salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_salirActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, 162, 40));

        jLabel2.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jLabel2.setText("Bienvenido \"USUARIO\"");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 13, 353, 33));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo mini amarillo.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, 90, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo3.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_altaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_altaActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jButton_altaActionPerformed

    private void jButton_salidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_salidaActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_jButton_salidaActionPerformed

    private void jButton_consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_consultarActionPerformed
        // TODO add your handling code here:
        Consultas cons=new Consultas();
        cons.setVisible(true);
        
        
    }//GEN-LAST:event_jButton_consultarActionPerformed

    private void jButton_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_salirActionPerformed
        // TODO add your handling code here:
       int res= JOptionPane.showConfirmDialog(this, "Seguro que desea salir?");
       if(res==0){
          JOptionPane.showMessageDialog(this, "Hasta luego!");
          System.exit(0);
       }
    }//GEN-LAST:event_jButton_salirActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_alta;
    private javax.swing.JButton jButton_consultar;
    private javax.swing.JButton jButton_salida;
    private javax.swing.JButton jButton_salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
