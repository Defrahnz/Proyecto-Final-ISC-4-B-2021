/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import conector.MySqlConn;
import java.math.BigInteger;
import javax.swing.JOptionPane;

/**
 *
 * @author nihil
 */
public class Registrar extends javax.swing.JFrame {
    MySqlConn conn=new MySqlConn();
    /**
     * Creates new form Registrar
     */
    
    public Registrar(MySqlConn conn) {
        this.conn = conn;
         initComponents();
        this.setLocationRelativeTo(null);
    }

    public Registrar() {
        initComponents();
        this.setLocationRelativeTo(null);
        dispose();
    }
    public String MD5(String md5){
        try{
            java.security.MessageDigest md=java.security.MessageDigest.getInstance("MD5");
            byte [] array =md.digest(md5.getBytes());
            BigInteger num=new BigInteger(1,array);
            String encString=num.toString(16);
            while(encString.length()>32){
                encString="0"+encString;
            }
            return encString;
        }catch (java.security.NoSuchAlgorithmException e){
            System.out.println("Error al encriptar");
        }
        return null;
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField_nom = new javax.swing.JTextField();
        jTextField_username = new javax.swing.JTextField();
        jPasswordField_pass = new javax.swing.JPasswordField();
        jPasswordField_confPass = new javax.swing.JPasswordField();
        jButton_registrarUsuario = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("REGISTRO");

        jPanel_principal.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_principal.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Registro", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Eras Bold ITC", 0, 14))); // NOI18N
        jPanel_principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Felix Titling", 1, 13)); // NOI18N
        jLabel1.setText("Nombre:");
        jPanel_principal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, -1, -1));
        jPanel_principal.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Felix Titling", 1, 13)); // NOI18N
        jLabel3.setText("Nombre de Usuario:");
        jPanel_principal.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, -1, -1));

        jLabel4.setFont(new java.awt.Font("Felix Titling", 1, 13)); // NOI18N
        jLabel4.setText("Contraseña:");
        jPanel_principal.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, -1, -1));

        jLabel5.setFont(new java.awt.Font("Felix Titling", 1, 13)); // NOI18N
        jLabel5.setText("Confirmar Contraseña:");
        jPanel_principal.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, -1, -1));

        jTextField_nom.setBackground(new java.awt.Color(204, 204, 204));
        jTextField_nom.setFont(new java.awt.Font("Microsoft Himalaya", 0, 24)); // NOI18N
        jPanel_principal.add(jTextField_nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, 218, -1));

        jTextField_username.setBackground(new java.awt.Color(204, 204, 204));
        jTextField_username.setFont(new java.awt.Font("Microsoft Himalaya", 0, 24)); // NOI18N
        jPanel_principal.add(jTextField_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, 218, -1));

        jPasswordField_pass.setBackground(new java.awt.Color(204, 204, 204));
        jPasswordField_pass.setFont(new java.awt.Font("Microsoft Himalaya", 0, 24)); // NOI18N
        jPanel_principal.add(jPasswordField_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, 218, -1));

        jPasswordField_confPass.setBackground(new java.awt.Color(204, 204, 204));
        jPasswordField_confPass.setFont(new java.awt.Font("Microsoft Himalaya", 0, 24)); // NOI18N
        jPanel_principal.add(jPasswordField_confPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, 218, -1));

        jButton_registrarUsuario.setBackground(new java.awt.Color(204, 0, 0));
        jButton_registrarUsuario.setFont(new java.awt.Font("Castellar", 1, 14)); // NOI18N
        jButton_registrarUsuario.setForeground(new java.awt.Color(255, 153, 0));
        jButton_registrarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/registrar1.png"))); // NOI18N
        jButton_registrarUsuario.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 153, 0)));
        jButton_registrarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_registrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_registrarUsuarioActionPerformed(evt);
            }
        });
        jPanel_principal.add(jButton_registrarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, -1, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo mini amarillo.png"))); // NOI18N
        jLabel7.setText("jLabel7");
        jPanel_principal.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, 90, 120));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo2.png"))); // NOI18N
        jLabel6.setText("jLabel6");
        jPanel_principal.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 460));

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

    private void jButton_registrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_registrarUsuarioActionPerformed
        // TODO add your handling code here:
        String user,pass,nom;
        nom=this.jTextField_nom.getText().trim();
        user=this.jTextField_username.getText().trim();
        pass=String.valueOf(this.jPasswordField_pass.getPassword());
        
        String part1="INSERT INTO `usuario` (`nom_usuario`, `nombre`, `contraseña`) VALUES ( " ;
        String part2=" ' "+user+" ', ' "+nom+"  ', ' "+MD5(pass)+" ' ); ";
        String query=part1+part2;
        int j=this.conn.Update(query);
        JOptionPane.showMessageDialog(this, "Usuario agregado correctamente. Bienvenido "+user);
        dispose();
       
        
    }//GEN-LAST:event_jButton_registrarUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_registrarUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel_principal;
    private javax.swing.JPasswordField jPasswordField_confPass;
    private javax.swing.JPasswordField jPasswordField_pass;
    private javax.swing.JTextField jTextField_nom;
    private javax.swing.JTextField jTextField_username;
    // End of variables declaration//GEN-END:variables
}
