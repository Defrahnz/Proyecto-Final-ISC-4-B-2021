/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import conector.MySqlConn;
import java.awt.Color;
import java.awt.Font;
import static java.awt.Font.PLAIN;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author nihil
 */
public class Inicio extends javax.swing.JFrame {
    MySqlConn conn=new MySqlConn();
    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public Inicio(MySqlConn objconn) {
        this.conn=objconn;
          initComponents();
        this.setLocationRelativeTo(null);
    }
    @Override
    public void paint (Graphics g){
    
      super.paint(g);
       
      Graphics2D g2d = (Graphics2D) g;
      
      //Rectangulo con bordes curculares
      g2d.setColor(Color.RED);
      g2d.drawRoundRect(70, 50, 350, 50, 10, 10);
      //Circulo
      g2d.setColor(Color.RED);
      g2d.drawOval(430, 50, 50, 50);
      //Escrito
      g2d.setColor(Color.ORANGE);
      g2d.setFont(new Font ("ARIAL",PLAIN,20));
      g2d.drawString("Tu seguridad es nuestra prioridad", 80,80);
      g2d.drawString("HC", 442,80);
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_principal = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton_registrar = new javax.swing.JButton();
        jButton_ingresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HOTEL \"CENTURION\" DELUXE");

        jPanel_principal.setBackground(new java.awt.Color(255, 247, 155));
        jPanel_principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Castellar", 1, 14)); // NOI18N
        jLabel3.setText("Tu seguridad es nuestra prioridad");
        jPanel_principal.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, -1, 30));

        jButton_registrar.setBackground(new java.awt.Color(204, 0, 0));
        jButton_registrar.setFont(new java.awt.Font("Castellar", 1, 24)); // NOI18N
        jButton_registrar.setForeground(new java.awt.Color(255, 153, 0));
        jButton_registrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/REGISTRARbutton.png"))); // NOI18N
        jButton_registrar.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(255, 153, 0)));
        jButton_registrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_registrarActionPerformed(evt);
            }
        });
        jPanel_principal.add(jButton_registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, 236, 66));

        jButton_ingresar.setBackground(new java.awt.Color(204, 0, 0));
        jButton_ingresar.setFont(new java.awt.Font("Castellar", 1, 24)); // NOI18N
        jButton_ingresar.setForeground(new java.awt.Color(255, 153, 0));
        jButton_ingresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/INGRESARbutton.png"))); // NOI18N
        jButton_ingresar.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(255, 153, 0)));
        jButton_ingresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ingresarActionPerformed(evt);
            }
        });
        jPanel_principal.add(jButton_ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 236, 66));

        jLabel1.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 12)); // NOI18N
        jLabel1.setText("¿Nuevo Usuario?...");
        jPanel_principal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, 156, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel_principal.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 210, 270));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo1.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(255, 153, 0)));
        jPanel_principal.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 470));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ingresarActionPerformed
        // TODO add your handling code here:
        Ingresar ventana=new Ingresar();
        ventana.setVisible(true);
     //  this.setVisible(false);
       dispose();
    }//GEN-LAST:event_jButton_ingresarActionPerformed

    private void jButton_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_registrarActionPerformed
        // TODO add your handling code here:
        Registrar ventan=new Registrar();
        ventan.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton_registrarActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_ingresar;
    private javax.swing.JButton jButton_registrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel_principal;
    // End of variables declaration//GEN-END:variables
}
