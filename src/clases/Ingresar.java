/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import conector.MySqlConn;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author nihil
 */
public class Ingresar extends javax.swing.JFrame {

    MySqlConn conn;

    /**
     * Creates new form Ingresar
     */
    public Ingresar() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public Ingresar(MySqlConn conn) {
        this.conn = conn;
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

        jPanel_principal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField_ingresarUsuario = new javax.swing.JTextField();
        jPasswordField_ingresarUsuario = new javax.swing.JPasswordField();
        jButton_ingresarUsuario = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("INGRESAR");

        jPanel_principal.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jLabel1.setText("Contraseña:");
        jPanel_principal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 96, 36));

        jLabel2.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jLabel2.setText("Usuario:");
        jPanel_principal.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 96, 36));

        jTextField_ingresarUsuario.setFont(new java.awt.Font("Britannic Bold", 0, 13)); // NOI18N
        jPanel_principal.add(jTextField_ingresarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 270, -1));
        jPanel_principal.add(jPasswordField_ingresarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 270, -1));

        jButton_ingresarUsuario.setBackground(new java.awt.Color(204, 0, 0));
        jButton_ingresarUsuario.setFont(new java.awt.Font("Castellar", 1, 14)); // NOI18N
        jButton_ingresarUsuario.setForeground(new java.awt.Color(255, 153, 0));
        jButton_ingresarUsuario.setText("INGRESAR");
        jButton_ingresarUsuario.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(204, 0, 0)));
        jButton_ingresarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_ingresarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ingresarUsuarioActionPerformed(evt);
            }
        });
        jPanel_principal.add(jButton_ingresarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, 147, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logomini.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel_principal.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, 70, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo1.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel_principal.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 460));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_ingresarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ingresarUsuarioActionPerformed
        // TODO add your handling code here:
        String user, pass;
        int n = 0;
        user = this.jTextField_ingresarUsuario.getText().trim();
        pass = String.valueOf(this.jPasswordField_ingresarUsuario.getPassword());
        if (!user.isEmpty()) {

            String query = "SELECT * FROM `usuario` WHERE `nom_usuario`= ' " + user + " ' AND `contraseña`= ' " + pass + " ' ";
            try {
                this.conn.rs.last();
                n = this.conn.rs.getRow();
                this.conn.rs.first();
            } catch (Exception ex) {
                System.out.println("Error 1");
            }
            Menu ventana=new Menu();
            ventana.setVisible(true);
            dispose();
        }else{
              JOptionPane.showMessageDialog(this, "Este campo no puede quedar vacio");
        }
        
    }//GEN-LAST:event_jButton_ingresarUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(Ingresar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ingresar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ingresar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ingresar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ingresar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_ingresarUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel_principal;
    private javax.swing.JPasswordField jPasswordField_ingresarUsuario;
    private javax.swing.JTextField jTextField_ingresarUsuario;
    // End of variables declaration//GEN-END:variables
}
