/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;
import java.applet.AudioClip;
/**
 *
 * @author nihil
 */
public class Musica extends javax.swing.JFrame {
    AudioClip song;
 
    /**
     * Creates new form Musica
     */
    public Musica() {
        initComponents();
        song=java.applet.Applet.newAudioClip(getClass().getResource("/Musica/Hotel.wav"));
        song.play();
        song.loop();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton_play = new javax.swing.JButton();
        jButton_pause = new javax.swing.JButton();
        jLabel_musica = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MUSICA");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton_play.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Play.png"))); // NOI18N
        jButton_play.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_play.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_playActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_play, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 57, 71, 64));

        jButton_pause.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Pause.png"))); // NOI18N
        jButton_pause.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_pause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_pauseActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_pause, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 57, 72, 66));

        jLabel_musica.setFont(new java.awt.Font("Calisto MT", 1, 24)); // NOI18N
        jLabel_musica.setText("MUSICA");
        getContentPane().add(jLabel_musica, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 32, -1, -1));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo2.png"))); // NOI18N
        jPanel1.add(jLabel_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 509, 150));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_playActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_playActionPerformed
        // TODO add your handling code here:
        song.play();
    }//GEN-LAST:event_jButton_playActionPerformed

    private void jButton_pauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_pauseActionPerformed
        // TODO add your handling code here:
        song.stop();
    }//GEN-LAST:event_jButton_pauseActionPerformed

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
            java.util.logging.Logger.getLogger(Musica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Musica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Musica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Musica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Musica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_pause;
    private javax.swing.JButton jButton_play;
    private javax.swing.JLabel jLabel_fondo;
    private javax.swing.JLabel jLabel_musica;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
