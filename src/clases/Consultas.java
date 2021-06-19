/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author nihil
 */
public class Consultas extends javax.swing.JFrame {

    /**
     * Creates new form Consultas
     */
    public Consultas() {
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

        jPanel_panel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton_galeria = new javax.swing.JButton();
        jButton_ingresos = new javax.swing.JButton();
        jButton_vacantes = new javax.swing.JButton();
        jButton_regresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Consultas");

        jPanel_panel1.setToolTipText("Consultas");
        jPanel_panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo mini amarillo.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel_panel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 90, -1));

        jButton_galeria.setBackground(new java.awt.Color(204, 0, 0));
        jButton_galeria.setFont(new java.awt.Font("Castellar", 1, 24)); // NOI18N
        jButton_galeria.setForeground(new java.awt.Color(255, 153, 0));
        jButton_galeria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/GALERIAbutton.png"))); // NOI18N
        jButton_galeria.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(255, 153, 0)));
        jButton_galeria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_galeria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_galeriaMouseClicked(evt);
            }
        });
        jButton_galeria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_galeriaActionPerformed(evt);
            }
        });
        jPanel_panel1.add(jButton_galeria, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 236, 60));

        jButton_ingresos.setBackground(new java.awt.Color(204, 0, 0));
        jButton_ingresos.setFont(new java.awt.Font("Castellar", 1, 24)); // NOI18N
        jButton_ingresos.setForeground(new java.awt.Color(255, 153, 0));
        jButton_ingresos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/INGRESOSbutton.png"))); // NOI18N
        jButton_ingresos.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(255, 153, 0)));
        jButton_ingresos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_ingresos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ingresosActionPerformed(evt);
            }
        });
        jPanel_panel1.add(jButton_ingresos, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 236, 60));

        jButton_vacantes.setBackground(new java.awt.Color(204, 0, 0));
        jButton_vacantes.setFont(new java.awt.Font("Castellar", 1, 24)); // NOI18N
        jButton_vacantes.setForeground(new java.awt.Color(255, 153, 0));
        jButton_vacantes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/VACANTESbutton.png"))); // NOI18N
        jButton_vacantes.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(255, 153, 0)));
        jButton_vacantes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_vacantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_vacantesActionPerformed(evt);
            }
        });
        jPanel_panel1.add(jButton_vacantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 236, 60));

        jButton_regresar.setBackground(new java.awt.Color(204, 0, 0));
        jButton_regresar.setFont(new java.awt.Font("Castellar", 1, 24)); // NOI18N
        jButton_regresar.setForeground(new java.awt.Color(255, 153, 0));
        jButton_regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/REGRESARbuttonG.png"))); // NOI18N
        jButton_regresar.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(255, 153, 0)));
        jButton_regresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_regresarActionPerformed(evt);
            }
        });
        jPanel_panel1.add(jButton_regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 160, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo1.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel_panel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_galeriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_galeriaActionPerformed
        // TODO add your handling code here:
        Galeria gal=new Galeria();
        gal.setVisible(true);
        dispose();
        //  this.setVisible(false);
        // this.dispose();
    }//GEN-LAST:event_jButton_galeriaActionPerformed

    private void jButton_ingresosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ingresosActionPerformed
        // TODO add your handling code here:
        
        //  this.setVisible(false);
        // this.dispose();
    }//GEN-LAST:event_jButton_ingresosActionPerformed

    private void jButton_vacantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_vacantesActionPerformed
        // TODO add your handling code here:
        Vacantes ventana=new Vacantes();
        ventana.setVisible(true);
        //  this.setVisible(false);
         this.dispose();
    }//GEN-LAST:event_jButton_vacantesActionPerformed

    private void jButton_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_regresarActionPerformed
        // TODO add your handling code here:
        Menu ventana=new Menu();
        ventana.setVisible(true);
        //  this.setVisible(false);
        // this.dispose();
    }//GEN-LAST:event_jButton_regresarActionPerformed

    private void jButton_galeriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_galeriaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_galeriaMouseClicked

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
            java.util.logging.Logger.getLogger(Consultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consultas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_galeria;
    private javax.swing.JButton jButton_ingresos;
    private javax.swing.JButton jButton_regresar;
    private javax.swing.JButton jButton_vacantes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel_panel1;
    // End of variables declaration//GEN-END:variables
}
