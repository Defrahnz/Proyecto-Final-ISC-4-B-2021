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
        jButton_galeria = new javax.swing.JButton();
        jButton_ingresos = new javax.swing.JButton();
        jButton_vacantes = new javax.swing.JButton();
        jButton_regresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Consultas");

        jPanel_panel1.setToolTipText("Consultas");

        jButton_galeria.setBackground(new java.awt.Color(204, 0, 0));
        jButton_galeria.setFont(new java.awt.Font("Castellar", 1, 24)); // NOI18N
        jButton_galeria.setForeground(new java.awt.Color(255, 153, 0));
        jButton_galeria.setText("GALERIA");
        jButton_galeria.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(255, 153, 0)));
        jButton_galeria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_galeria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_galeriaActionPerformed(evt);
            }
        });

        jButton_ingresos.setBackground(new java.awt.Color(204, 0, 0));
        jButton_ingresos.setFont(new java.awt.Font("Castellar", 1, 24)); // NOI18N
        jButton_ingresos.setForeground(new java.awt.Color(255, 153, 0));
        jButton_ingresos.setText("INGRESos");
        jButton_ingresos.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(255, 153, 0)));
        jButton_ingresos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_ingresos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ingresosActionPerformed(evt);
            }
        });

        jButton_vacantes.setBackground(new java.awt.Color(204, 0, 0));
        jButton_vacantes.setFont(new java.awt.Font("Castellar", 1, 24)); // NOI18N
        jButton_vacantes.setForeground(new java.awt.Color(255, 153, 0));
        jButton_vacantes.setText("vACANTES");
        jButton_vacantes.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(255, 153, 0)));
        jButton_vacantes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_vacantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_vacantesActionPerformed(evt);
            }
        });

        jButton_regresar.setBackground(new java.awt.Color(204, 0, 0));
        jButton_regresar.setFont(new java.awt.Font("Castellar", 1, 24)); // NOI18N
        jButton_regresar.setForeground(new java.awt.Color(255, 153, 0));
        jButton_regresar.setText("REGRESAR");
        jButton_regresar.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(255, 153, 0)));
        jButton_regresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_regresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_panel1Layout = new javax.swing.GroupLayout(jPanel_panel1);
        jPanel_panel1.setLayout(jPanel_panel1Layout);
        jPanel_panel1Layout.setHorizontalGroup(
            jPanel_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_panel1Layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addGroup(jPanel_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton_regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_vacantes, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_ingresos, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_galeria, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(278, Short.MAX_VALUE))
        );
        jPanel_panel1Layout.setVerticalGroup(
            jPanel_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_panel1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jButton_galeria, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_ingresos, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_vacantes, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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
        
        //  this.setVisible(false);
        // this.dispose();
    }//GEN-LAST:event_jButton_galeriaActionPerformed

    private void jButton_ingresosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ingresosActionPerformed
        // TODO add your handling code here:
        Ingresar ventana=new Ingresar();
        ventana.setVisible(true);
        //  this.setVisible(false);
        // this.dispose();
    }//GEN-LAST:event_jButton_ingresosActionPerformed

    private void jButton_vacantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_vacantesActionPerformed
        // TODO add your handling code here:
        Vacantes ventana=new Vacantes();
        ventana.setVisible(true);
        //  this.setVisible(false);
        // this.dispose();
    }//GEN-LAST:event_jButton_vacantesActionPerformed

    private void jButton_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_regresarActionPerformed
        // TODO add your handling code here:
        Menu ventana=new Menu();
        ventana.setVisible(true);
        //  this.setVisible(false);
        // this.dispose();
    }//GEN-LAST:event_jButton_regresarActionPerformed

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
    private javax.swing.JPanel jPanel_panel1;
    // End of variables declaration//GEN-END:variables
}
