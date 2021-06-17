/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import clases.Pisos;
import conector.MySqlConn;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author lapiz
 */
public class RegistrarHuesped extends javax.swing.JFrame {

    /**
     * Creates new form RegistrarHuesped
     */
    MySqlConn conn=new MySqlConn();
    DateFormat df = DateFormat.getDateInstance();
    
    public RegistrarHuesped(MySqlConn conn) {
        this.conn = conn;
         initComponents();
        this.setLocationRelativeTo(null);
    }
    public RegistrarHuesped() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        jLabel1Extra.setVisible(false);
        jLabel2Extras.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tipohabiradiobutton = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldNombreH = new javax.swing.JTextField();
        jTextFieldTelefonoH = new javax.swing.JTextField();
        jTextFieldUbicacion = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButtonRegistrarH = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldtiempoHospedaje = new javax.swing.JTextField();
        jRadioButtonsencilla = new javax.swing.JRadioButton();
        jRadioButtondoble = new javax.swing.JRadioButton();
        jRadioButtontriple = new javax.swing.JRadioButton();
        jCalendarFechaRegistro = new com.toedter.calendar.JCalendar();
        jButtonVerHabit = new javax.swing.JButton();
        jComboBoxSencilla = new javax.swing.JComboBox<>();
        jComboBoxDoble = new javax.swing.JComboBox<>();
        jComboBoxTriple = new javax.swing.JComboBox<>();
        jLabel1Extra = new javax.swing.JLabel();
        jLabel2Extras = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("REGISTRAR HUESPED");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jLabel2.setText("Nombre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, -1, -1));

        jLabel3.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jLabel3.setText("Numero de telefono");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        jLabel4.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jLabel4.setText("Nos visita de");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, -1, -1));

        jLabel5.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jLabel5.setText("Fecha de registro");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, -1, -1));

        jLabel6.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jLabel6.setText("Tipo de habitacion");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, 20));

        jTextFieldNombreH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreHActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNombreH, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 260, 30));

        jTextFieldTelefonoH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTelefonoHActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldTelefonoH, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 260, 30));

        jTextFieldUbicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUbicacionActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldUbicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 260, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logomini.png"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 70, -1));

        jButtonRegistrarH.setBackground(new java.awt.Color(204, 0, 0));
        jButtonRegistrarH.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jButtonRegistrarH.setForeground(new java.awt.Color(255, 102, 0));
        jButtonRegistrarH.setText("Registrar");
        jButtonRegistrarH.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(255, 102, 0)));
        jButtonRegistrarH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarHActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRegistrarH, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 100, 40));

        jLabel10.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jLabel10.setText("Tiempo de hospedaje");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 320, -1, 20));

        jLabel11.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jLabel11.setText("No. de personas");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 360, -1, -1));

        jTextFieldtiempoHospedaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldtiempoHospedajeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldtiempoHospedaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 310, 60, 30));

        tipohabiradiobutton.add(jRadioButtonsencilla);
        jRadioButtonsencilla.setText("Sencilla");
        jRadioButtonsencilla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonsencillaActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonsencilla, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 80, 30));

        tipohabiradiobutton.add(jRadioButtondoble);
        jRadioButtondoble.setText("Doble");
        jRadioButtondoble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtondobleActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtondoble, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, 90, 30));

        tipohabiradiobutton.add(jRadioButtontriple);
        jRadioButtontriple.setText("Triple");
        jRadioButtontriple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtontripleActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtontriple, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, 70, 30));
        getContentPane().add(jCalendarFechaRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 60, 460, 230));

        jButtonVerHabit.setText("Ver habitaciones");
        jButtonVerHabit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerHabitActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVerHabit, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, -1, -1));

        jComboBoxSencilla.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " 1", " 2", " 3", " " }));
        jComboBoxSencilla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSencillaActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxSencilla, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 360, 60, 30));

        jComboBoxDoble.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " 1", " 2", " 3", " 4" }));
        jComboBoxDoble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDobleActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxDoble, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 360, 60, 30));

        jComboBoxTriple.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " 1", " 2", " 3", " 4", " 5" }));
        jComboBoxTriple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTripleActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxTriple, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 360, 60, 30));

        jLabel1Extra.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel1Extra.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1Extra.setText("1 persona extra!");
        getContentPane().add(jLabel1Extra, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 380, -1, 20));

        jLabel2Extras.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel2Extras.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2Extras.setText("2 personas extras!");
        getContentPane().add(jLabel2Extras, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 380, -1, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo1.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldTelefonoHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTelefonoHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTelefonoHActionPerformed

    private void jTextFieldNombreHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreHActionPerformed

    private void jButtonRegistrarHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarHActionPerformed
    // TODO add your handling code here:
    String NombreH,NumT,Ubica,tiempoHosp,NumPer = null;
    String seleccionR = null;
    
    NombreH = this.jTextFieldNombreH.getText().trim();
    NumT = this.jTextFieldTelefonoH.getText().trim();
    Ubica = this.jTextFieldUbicacion.getText().trim();
    
    
       if (this.jRadioButtonsencilla.isSelected()){
         seleccionR = this.jRadioButtonsencilla.getText();
         NumPer = (String) this.jComboBoxSencilla.getSelectedItem();
       }
       else if (this.jRadioButtondoble.isSelected()){
         seleccionR = this.jRadioButtondoble.getText();
         NumPer = (String) this.jComboBoxDoble.getSelectedItem();
       }
       else if (this.jRadioButtontriple.isSelected()){
         seleccionR = this.jRadioButtontriple.getText();
         NumPer = (String) this.jComboBoxTriple.getSelectedItem();
        }
        String FechaObtenida = df.format(jCalendarFechaRegistro.getDate());
        tiempoHosp = this.jTextFieldtiempoHospedaje.getText().trim();
       
        
        String part1="INSERT INTO `huesped` (`nombre`, `num_tel`, `origen`, `fecha_reg`, `tiempo_hos`, `no_personas`, `tipo_hab`) VALUES ( " ;
        String part2=" ' "+NombreH+" ', '"+NumT+" ', ' "+Ubica+"  ', ' "+FechaObtenida+"  ', ' "+tiempoHosp+"  ', ' "+NumPer+" ', ' "+seleccionR+" ' ); ";
        String query=part1+part2;
        int j=this.conn.Update(query);
        JOptionPane.showMessageDialog(this, "Huesped Registrado Correctamente "+NombreH);
        dispose();
    
    }//GEN-LAST:event_jButtonRegistrarHActionPerformed

    private void jTextFieldUbicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUbicacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUbicacionActionPerformed

    private void jRadioButtonsencillaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonsencillaActionPerformed
        // TODO add your handling code here:
         jComboBoxDoble.setVisible(false);
         jComboBoxTriple.setVisible(false);
         jComboBoxSencilla.setVisible(true);
    }//GEN-LAST:event_jRadioButtonsencillaActionPerformed

    private void jButtonVerHabitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerHabitActionPerformed
        // TODO add your handling code here:
        Pisos ventana=new Pisos();
        ventana.setVisible(true);
    }//GEN-LAST:event_jButtonVerHabitActionPerformed

    private void jTextFieldtiempoHospedajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldtiempoHospedajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldtiempoHospedajeActionPerformed

    private void jRadioButtondobleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtondobleActionPerformed
        // TODO add your handling code here:
         jComboBoxSencilla.setVisible(false);
         jComboBoxTriple.setVisible(false);
         jComboBoxDoble.setVisible(true);
    }//GEN-LAST:event_jRadioButtondobleActionPerformed

    private void jRadioButtontripleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtontripleActionPerformed
        // TODO add your handling code here:
         jComboBoxDoble.setVisible(false);
         jComboBoxSencilla.setVisible(false);
         jComboBoxTriple.setVisible(true);
    }//GEN-LAST:event_jRadioButtontripleActionPerformed

    private void jComboBoxSencillaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSencillaActionPerformed
        // TODO add your handling code here:
        if (jComboBoxSencilla.getSelectedItem()== " 1"){
             jLabel2Extras.setVisible(false);
             jLabel1Extra.setVisible(false);
         }
        else if (jComboBoxSencilla.getSelectedItem()== " 2"){
             jLabel2Extras.setVisible(false);
             jLabel1Extra.setVisible(true);
         }
         else if (jComboBoxSencilla.getSelectedItem()== " 3"){
             jLabel1Extra.setVisible(false);
             jLabel2Extras.setVisible(true); 
         }
    }//GEN-LAST:event_jComboBoxSencillaActionPerformed

    private void jComboBoxDobleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDobleActionPerformed
        // TODO add your handling code here:
        if (jComboBoxDoble.getSelectedItem()== " 1"){
             jLabel2Extras.setVisible(false);
             jLabel1Extra.setVisible(false);
         }
        else if (jComboBoxDoble.getSelectedItem()== " 2"){
             jLabel2Extras.setVisible(false);
             jLabel1Extra.setVisible(false);
         }
         else if (jComboBoxDoble.getSelectedItem()== " 3"){
             jLabel2Extras.setVisible(false);
             jLabel1Extra.setVisible(true);   
         }
         else if (jComboBoxDoble.getSelectedItem()== " 4"){
             jLabel1Extra.setVisible(false);  
             jLabel2Extras.setVisible(true);
         }
    }//GEN-LAST:event_jComboBoxDobleActionPerformed

    private void jComboBoxTripleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTripleActionPerformed
        // TODO add your handling code here:
              if (jComboBoxTriple.getSelectedItem()== " 1"){
             jLabel2Extras.setVisible(false);
             jLabel1Extra.setVisible(false);
         }
         else if (jComboBoxTriple.getSelectedItem()== " 2"){
             jLabel2Extras.setVisible(false);
             jLabel1Extra.setVisible(false);
         }
         else if (jComboBoxTriple.getSelectedItem()== " 3"){
             jLabel2Extras.setVisible(false);
             jLabel1Extra.setVisible(false);   
         }
         else if (jComboBoxTriple.getSelectedItem()== " 4"){
             jLabel2Extras.setVisible(false);
             jLabel1Extra.setVisible(true);  
         }
         else if (jComboBoxTriple.getSelectedItem()== " 5"){
             jLabel1Extra.setVisible(false); 
             jLabel2Extras.setVisible(true);
         }
    }//GEN-LAST:event_jComboBoxTripleActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrarHuesped.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarHuesped.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarHuesped.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarHuesped.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarHuesped().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRegistrarH;
    private javax.swing.JButton jButtonVerHabit;
    private com.toedter.calendar.JCalendar jCalendarFechaRegistro;
    private javax.swing.JComboBox<String> jComboBoxDoble;
    private javax.swing.JComboBox<String> jComboBoxSencilla;
    private javax.swing.JComboBox<String> jComboBoxTriple;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel1Extra;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel2Extras;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton jRadioButtondoble;
    private javax.swing.JRadioButton jRadioButtonsencilla;
    private javax.swing.JRadioButton jRadioButtontriple;
    private javax.swing.JTextField jTextFieldNombreH;
    private javax.swing.JTextField jTextFieldTelefonoH;
    private javax.swing.JTextField jTextFieldUbicacion;
    private javax.swing.JTextField jTextFieldtiempoHospedaje;
    private javax.swing.ButtonGroup tipohabiradiobutton;
    // End of variables declaration//GEN-END:variables
}
