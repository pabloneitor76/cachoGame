/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cachoahorasi;

import javax.swing.ImageIcon;

/**
 *
 * @author DELL
 */
public class Editar4 extends javax.swing.JFrame {

    /**
     * Creates new form Editar4
     */
    public Editar4() {
        initComponents();
        //iconoDADO
        try{
            setIconImage(new ImageIcon(getClass().getResource("/masImG/Dice-32.png")).getImage());
        }catch(Exception ex){
        
        }
        //
        setTitle("CACHO-JUEGO");
        this.setLocationRelativeTo(null);
        
        //........boton jugar
       jButtonGuardar.setOpaque(false);
       jButtonGuardar.setContentAreaFilled(false);
       jButtonGuardar.setBorderPainted(false);
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButtonGuardar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelNom = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(270, 440));
        getContentPane().setLayout(null);

        jTextField1.setText("Jugador_1");
        getContentPane().add(jTextField1);
        jTextField1.setBounds(40, 70, 120, 30);

        jTextField3.setText("Jugador_3");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3);
        jTextField3.setBounds(40, 210, 120, 30);

        jButtonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-Guardar-50.png"))); // NOI18N
        jButtonGuardar.setText("Guardar");
        jButtonGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonGuardar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-Spinner marco 3-26.png"))); // NOI18N
        jButtonGuardar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-Guardar Filled-50.png"))); // NOI18N
        jButtonGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonGuardar);
        jButtonGuardar.setBounds(90, 330, 80, 70);

        jLabel1.setFont(new java.awt.Font("Gill Sans Ultra Bold", 2, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nombre Jugador 1:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 50, 140, 14);

        jLabel2.setFont(new java.awt.Font("Gill Sans Ultra Bold", 2, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre Jugador 3:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 190, 140, 14);

        jLabelNom.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 14)); // NOI18N
        jLabelNom.setForeground(new java.awt.Color(0, 0, 0));
        jLabelNom.setText("Ingrese Nombre de Jugadores");
        getContentPane().add(jLabelNom);
        jLabelNom.setBounds(20, 10, 190, 30);

        jTextField2.setText("Jugador_2");
        getContentPane().add(jTextField2);
        jTextField2.setBounds(40, 140, 120, 30);

        jLabel4.setFont(new java.awt.Font("Gill Sans Ultra Bold", 2, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Nombre Jugador 2:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 120, 140, 14);

        jTextField4.setText("Jugador_4");
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4);
        jTextField4.setBounds(40, 280, 120, 30);

        jLabel5.setFont(new java.awt.Font("Gill Sans Ultra Bold", 2, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Nombre Jugador 4:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 260, 140, 14);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/masImG/fondo-de-los-rectán.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jLabel3.setPreferredSize(new java.awt.Dimension(270, 440));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 260, 410);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed

        String nombre;
        nombre = jTextField1.getText();
        JuegoD4.jLabel1.setText(nombre);

        String nombre2;
        nombre2 = jTextField2.getText();
        JuegoD4.jLabel2.setText(nombre2);
        dispose();

        String nombre3;
        nombre3 = jTextField3.getText();
        JuegoD4.jLabel3.setText(nombre3);
        dispose();
        
        String nombre4;
        nombre3 = jTextField4.getText();
        JuegoD4.jLabel8.setText(nombre3);
        dispose();

    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

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
            java.util.logging.Logger.getLogger(Editar4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Editar4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Editar4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Editar4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Editar4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelNom;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
