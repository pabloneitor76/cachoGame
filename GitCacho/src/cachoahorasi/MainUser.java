/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cachoahorasi;

//import dados2.juego1vs1;
import java.applet.AudioClip;
import java.awt.Image;
import javax.swing.ImageIcon;
/**
 *
 * @author DELL
 */
public class MainUser extends javax.swing.JFrame {

    /**
     * Creates new form LogginUser
     */
    public MainUser() {
        initComponents();
       this.setLocationRelativeTo(null);
       /*ImageIcon fondo1 = new ImageIcon(getClass().getResource("/Pictures/fondo2.png"));
       ImageIcon fondo2 = new ImageIcon(fondo1.getImage().getScaledInstance(jLabel1.getWidth(),jLabel1.getHeight(), Image.SCALE_DEFAULT));
       jLabel1.setIcon(fondo2);*/
       this.repaint();
       
       //........boton jugar
       jButton1.setOpaque(false);
       jButton1.setContentAreaFilled(false);
       jButton1.setBorderPainted(false);
       //........boton 1vs1
       jButton2G.setOpaque(false);
       jButton2G.setContentAreaFilled(false);
       jButton2G.setBorderPainted(false);
       //........boton 3G
       jButton3G.setOpaque(false);
       jButton3G.setContentAreaFilled(false);
       jButton3G.setBorderPainted(false);
       //........boton IA
       jButtonIA.setOpaque(false);
       jButtonIA.setContentAreaFilled(false);
       jButtonIA.setBorderPainted(false);
       //........boton TG
       jButtonTG.setOpaque(false);
       jButtonTG.setContentAreaFilled(false);
       jButtonTG.setBorderPainted(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2G = new javax.swing.JButton();
        jButton3G = new javax.swing.JButton();
        jButtonIA = new javax.swing.JButton();
        jButtonTG = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(610, 440));
        getContentPane().setLayout(null);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-Retroceso-50.png"))); // NOI18N
        jButton1.setText("Volver");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-Spinner marco 3-26.png"))); // NOI18N
        jButton1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-Retroceso Filled-50.png"))); // NOI18N
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(250, 320, 77, 70);

        jButton2G.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-Grupo de usuarios hombre hombre-50.png"))); // NOI18N
        jButton2G.setText("1vs1");
        jButton2G.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2G.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-Spinner marco 3-26.png"))); // NOI18N
        jButton2G.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-Grupo de usuarios hombre hombre Filled-50.png"))); // NOI18N
        jButton2G.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2G.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2GMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2GMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton2GMousePressed(evt);
            }
        });
        jButton2G.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2GActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2G);
        jButton2G.setBounds(220, 80, 90, 80);

        jButton3G.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-Antecedentes conferencia seleccionada-50.png"))); // NOI18N
        jButton3G.setText("3game");
        jButton3G.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3G.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-Spinner marco 3-26.png"))); // NOI18N
        jButton3G.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-Antecedentes conferencia seleccionada Filled-50.png"))); // NOI18N
        jButton3G.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3G.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3GMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton3GMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton3GMousePressed(evt);
            }
        });
        getContentPane().add(jButton3G);
        jButton3G.setBounds(70, 200, 90, 80);

        jButtonIA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-En PC-50.png"))); // NOI18N
        jButtonIA.setText("1vsPC");
        jButtonIA.setToolTipText("");
        jButtonIA.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonIA.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-Spinner marco 3-26.png"))); // NOI18N
        jButtonIA.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-En PC Filled-50.png"))); // NOI18N
        jButtonIA.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonIA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonIAMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonIAMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonIAMousePressed(evt);
            }
        });
        jButtonIA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIAActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonIA);
        jButtonIA.setBounds(70, 80, 90, 80);

        jButtonTG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-Grupo de usuarios hombre hombre-50.png"))); // NOI18N
        jButtonTG.setText("free4All");
        jButtonTG.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonTG.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-Spinner marco 3-26.png"))); // NOI18N
        jButtonTG.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-Grupo de usuarios hombre hombre Filled-50.png"))); // NOI18N
        jButtonTG.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonTG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonTGMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonTGMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonTGMousePressed(evt);
            }
        });
        getContentPane().add(jButtonTG);
        jButtonTG.setBounds(220, 200, 90, 80);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/dados-blancos-en-la-tabla-verde-dispositivos-de-juego-copie-el-espacio-para-el-texto-juego-del-concepto-de-azar-80535926.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 600, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //juego 1vs1
    private void jButton2GActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2GActionPerformed
        juega1vs1 game11 = new juega1vs1();
        game11.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2GActionPerformed
    //boton volver
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        inicio volver = new inicio();
        volver.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    //boton IA
    private void jButtonIAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonIAActionPerformed
    //sonido boton IA
    private void jButtonIAMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonIAMouseEntered
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonido/selected.wav"));
        sonido.play();
    }//GEN-LAST:event_jButtonIAMouseEntered

    private void jButtonIAMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonIAMouseExited
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonido/selected.wav"));
        sonido.play();
    }//GEN-LAST:event_jButtonIAMouseExited

    private void jButtonIAMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonIAMousePressed
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonido/clicked.wav"));
        sonido.play();
    }//GEN-LAST:event_jButtonIAMousePressed
    //sonido boton 1vs1
    private void jButton2GMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2GMouseEntered
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonido/selected.wav"));
        sonido.play();
    }//GEN-LAST:event_jButton2GMouseEntered

    private void jButton2GMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2GMouseExited
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonido/selected.wav"));
        sonido.play();
    }//GEN-LAST:event_jButton2GMouseExited

    private void jButton2GMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2GMousePressed
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonido/clicked.wav"));
        sonido.play();
    }//GEN-LAST:event_jButton2GMousePressed
    //sonido boton juego3
    private void jButton3GMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3GMouseEntered
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonido/selected.wav"));
        sonido.play();
    }//GEN-LAST:event_jButton3GMouseEntered

    private void jButton3GMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3GMouseExited
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonido/selected.wav"));
        sonido.play();
    }//GEN-LAST:event_jButton3GMouseExited

    private void jButton3GMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3GMousePressed
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonido/clicked.wav"));
        sonido.play();
    }//GEN-LAST:event_jButton3GMousePressed
    //sonido boton juego4
    private void jButtonTGMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonTGMouseEntered
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonido/selected.wav"));
        sonido.play();
    }//GEN-LAST:event_jButtonTGMouseEntered

    private void jButtonTGMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonTGMouseExited
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonido/selected.wav"));
        sonido.play();
    }//GEN-LAST:event_jButtonTGMouseExited

    private void jButtonTGMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonTGMousePressed
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonido/clicked.wav"));
        sonido.play();
    }//GEN-LAST:event_jButtonTGMousePressed
    //sonido boton volver
    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonido/selected.wav"));
        sonido.play();
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonido/selected.wav"));
        sonido.play();
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonido/clicked.wav"));
        sonido.play();
    }//GEN-LAST:event_jButton1MousePressed

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
            java.util.logging.Logger.getLogger(MainUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2G;
    private javax.swing.JButton jButton3G;
    private javax.swing.JButton jButtonIA;
    private javax.swing.JButton jButtonTG;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
