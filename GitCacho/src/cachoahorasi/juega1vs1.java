/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cachoahorasi;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.applet.AudioClip;

/**
 *
 * @author Pabloneitor
 */
public class juega1vs1 extends javax.swing.JFrame {

    static int turnP;//controla par o impar en turnojugador
    static int turnoS = 22;//controla el turno actual
    static int turno = 0;//turno actual inicio
    /**
     * Creates new form juega1vs1
     */
    public juega1vs1() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        
        
        /*
        ImageIcon fondo1 = new ImageIcon(getClass().getResource("Imagenes/cart.png"));
        ImageIcon fondo2 = new ImageIcon(fondo1.getImage().getScaledInstance(jLabel4.getWidth(),jLabel4.getHeight(), Image.SCALE_DEFAULT));
        jLabel4.setIcon(fondo2);
        this.repaint();
        */
         jBjugar1.setEnabled(true);
         jBjugar2.setEnabled(false);
        
         //........boton jugar 1
        jBjugar1.setOpaque(false);
        jBjugar1.setContentAreaFilled(false);
        jBjugar1.setBorderPainted(false);
        //........boton jugar 2
        jBjugar2.setOpaque(false);
        jBjugar2.setContentAreaFilled(false);
        jBjugar2.setBorderPainted(false);
        //........boton resultado
        jBresultado.setOpaque(false);
        jBresultado.setContentAreaFilled(false);
        jBresultado.setBorderPainted(false);
        //........boton salir
        jBexit.setOpaque(false);
        jBexit.setContentAreaFilled(false);
        jBexit.setBorderPainted(false);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPuntaje1 = new javax.swing.JLabel();
        jPuntajeEs = new javax.swing.JLabel();
        jPuntaje4 = new javax.swing.JLabel();
        jPuntaje2 = new javax.swing.JLabel();
        jPuntajePoker = new javax.swing.JLabel();
        jPuntaje5 = new javax.swing.JLabel();
        jPuntaje3 = new javax.swing.JLabel();
        jPuntajeFull = new javax.swing.JLabel();
        jPuntaje6 = new javax.swing.JLabel();
        jPuntajeG1 = new javax.swing.JLabel();
        jPuntajeG2 = new javax.swing.JLabel();
        jBjugar1 = new javax.swing.JButton();
        jBresultado = new javax.swing.JButton();
        jPuntaje11 = new javax.swing.JLabel();
        jPuntajeES2 = new javax.swing.JLabel();
        jPuntaje44 = new javax.swing.JLabel();
        jPuntaje22 = new javax.swing.JLabel();
        jPuntajePoker2 = new javax.swing.JLabel();
        jPuntaje55 = new javax.swing.JLabel();
        jPuntaje33 = new javax.swing.JLabel();
        jPuntajeFull2 = new javax.swing.JLabel();
        jPuntaje66 = new javax.swing.JLabel();
        jPuntajeG12 = new javax.swing.JLabel();
        jPuntajeG22 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jBjugar2 = new javax.swing.JButton();
        jBexit = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(620, 440));
        getContentPane().setLayout(null);
        getContentPane().add(jPuntaje1);
        jPuntaje1.setBounds(74, 180, 30, 14);

        jPuntajeEs.setText("0");
        getContentPane().add(jPuntajeEs);
        jPuntajeEs.setBounds(110, 180, 38, 14);

        jPuntaje4.setText("0");
        getContentPane().add(jPuntaje4);
        jPuntaje4.setBounds(150, 180, 40, 14);
        getContentPane().add(jPuntaje2);
        jPuntaje2.setBounds(72, 220, 30, 15);

        jPuntajePoker.setText("0");
        getContentPane().add(jPuntajePoker);
        jPuntajePoker.setBounds(110, 250, 38, 15);

        jPuntaje5.setText("0");
        getContentPane().add(jPuntaje5);
        jPuntaje5.setBounds(150, 220, 40, 14);

        jPuntaje3.setText("0");
        getContentPane().add(jPuntaje3);
        jPuntaje3.setBounds(72, 250, 30, 16);

        jPuntajeFull.setText("0");
        getContentPane().add(jPuntajeFull);
        jPuntajeFull.setBounds(110, 220, 38, 16);

        jPuntaje6.setText("0");
        getContentPane().add(jPuntaje6);
        jPuntaje6.setBounds(150, 250, 40, 16);

        jPuntajeG1.setText("0");
        getContentPane().add(jPuntajeG1);
        jPuntajeG1.setBounds(80, 290, 40, 14);

        jPuntajeG2.setText("0");
        getContentPane().add(jPuntajeG2);
        jPuntajeG2.setBounds(130, 290, 40, 14);

        jBjugar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-1 en círculo -50.png"))); // NOI18N
        jBjugar1.setText("Juega1");
        jBjugar1.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-Tiempo-50.png"))); // NOI18N
        jBjugar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBjugar1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-1 en círculo  Filled-50.png"))); // NOI18N
        jBjugar1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBjugar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBjugar1MouseClicked(evt);
            }
        });
        jBjugar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBjugar1ActionPerformed(evt);
            }
        });
        getContentPane().add(jBjugar1);
        jBjugar1.setBounds(90, 80, 84, 70);

        jBresultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-Leaderboard-50.png"))); // NOI18N
        jBresultado.setText("Resultado");
        jBresultado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBresultado.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-Spinner marco 3-26.png"))); // NOI18N
        jBresultado.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-Tabla de posiciones Filled-50.png"))); // NOI18N
        jBresultado.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBresultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBresultadoActionPerformed(evt);
            }
        });
        getContentPane().add(jBresultado);
        jBresultado.setBounds(30, 319, 100, 70);
        getContentPane().add(jPuntaje11);
        jPuntaje11.setBounds(384, 181, 40, 15);

        jPuntajeES2.setText("0");
        getContentPane().add(jPuntajeES2);
        jPuntajeES2.setBounds(451, 182, 40, 14);

        jPuntaje44.setText("0");
        getContentPane().add(jPuntaje44);
        jPuntaje44.setBounds(509, 181, 40, 15);
        getContentPane().add(jPuntaje22);
        jPuntaje22.setBounds(384, 214, 40, 15);

        jPuntajePoker2.setText("0");
        getContentPane().add(jPuntajePoker2);
        jPuntajePoker2.setBounds(451, 252, 40, 15);

        jPuntaje55.setText("0");
        getContentPane().add(jPuntaje55);
        jPuntaje55.setBounds(509, 214, 40, 15);

        jPuntaje33.setText("0");
        getContentPane().add(jPuntaje33);
        jPuntaje33.setBounds(384, 252, 40, 17);

        jPuntajeFull2.setText("0");
        getContentPane().add(jPuntajeFull2);
        jPuntajeFull2.setBounds(451, 214, 40, 17);

        jPuntaje66.setText("0");
        getContentPane().add(jPuntaje66);
        jPuntaje66.setBounds(509, 252, 40, 17);

        jPuntajeG12.setText("0");
        getContentPane().add(jPuntajeG12);
        jPuntajeG12.setBounds(432, 281, 40, 14);

        jPuntajeG22.setText("0");
        getContentPane().add(jPuntajeG22);
        jPuntajeG22.setBounds(484, 281, 40, 14);

        jLabel1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        jLabel1.setText("jugador_1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(70, 40, 156, 25);

        jLabel2.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        jLabel2.setText("jugador_2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(380, 40, 135, 25);

        jBjugar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-2 en círculo -50 (1).png"))); // NOI18N
        jBjugar2.setText("Juega2");
        jBjugar2.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-Tiempo-50.png"))); // NOI18N
        jBjugar2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBjugar2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-2 en círculo  Filled-50.png"))); // NOI18N
        jBjugar2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBjugar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBjugar2ActionPerformed(evt);
            }
        });
        getContentPane().add(jBjugar2);
        jBjugar2.setBounds(410, 80, 84, 70);

        jBexit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-Retroceso-50.png"))); // NOI18N
        jBexit.setText("Salir");
        jBexit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBexit.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-Spinner marco 3-26.png"))); // NOI18N
        jBexit.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-Retroceso Filled-50.png"))); // NOI18N
        jBexit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBexitActionPerformed(evt);
            }
        });
        getContentPane().add(jBexit);
        jBexit.setBounds(500, 320, 80, 70);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/imagesAPSXWOCO.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jLabel3.setToolTipText("");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 20, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBjugar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBjugar1ActionPerformed
        
            DadosGen juega1 = new DadosGen();
            juega1.setVisible(true);
            turno++;
            System.out.println("turnoNro: " + turno);
            jBjugar1.setEnabled(false);
            jBjugar2.setEnabled(true);
  
    }//GEN-LAST:event_jBjugar1ActionPerformed

    private void jBresultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBresultadoActionPerformed
        if(turno == 22){
            int p1 = 0;
            int p2 = 0;

            int num1 = Integer.parseInt( jPuntaje1.getText());
            int num2 = Integer.parseInt( jPuntaje2.getText());
            int num3 = Integer.parseInt( jPuntaje3.getText());
            int num4 = Integer.parseInt( jPuntaje4.getText());
            int num5 = Integer.parseInt( jPuntaje5.getText());
            int num6 = Integer.parseInt( jPuntaje6.getText());
            int numG1 = Integer.parseInt( jPuntajeG1.getText());
            int numG2 = Integer.parseInt( jPuntajeG2.getText());
            int numEs = Integer.parseInt( jPuntajeEs.getText());
            int numFull = Integer.parseInt( jPuntajeFull.getText());
            int numPok = Integer.parseInt( jPuntajePoker.getText());

            int num11 = Integer.parseInt( jPuntaje11.getText());
            int num22 = Integer.parseInt( jPuntaje22.getText());
            int num33 = Integer.parseInt( jPuntaje33.getText());
            int num44 = Integer.parseInt( jPuntaje44.getText());
            int num55 = Integer.parseInt( jPuntaje55.getText());
            int num66 = Integer.parseInt( jPuntaje66.getText());
            int numG12 = Integer.parseInt( jPuntajeG12.getText());
            int numG22 = Integer.parseInt( jPuntajeG22.getText());
            int numEs2 = Integer.parseInt( jPuntajeES2.getText());
            int numFull2 = Integer.parseInt( jPuntajeFull2.getText());
            int numPok2 = Integer.parseInt( jPuntajePoker2.getText());

            p1 = num1 + num2 + num3 + num4 + num5 + num6 + numG1 +numG2 + numEs + numFull + numPok;
            p2 = num11 + num22 + num33 + num44 + num55 + num66 + numG12 + numG22 + numEs2 + numFull2 + numPok2;

            System.out.println(p1);
            System.out.println(p2);

            if(p1>p2){
                JOptionPane.showMessageDialog(this,
                    "Puntaje Jugador 1:" + p1 + 
                    "\nPuntaje Jugador 2:" + p2+
                    "\n\nJugador 1 Gano");
            }else if(p2>p1){
                JOptionPane.showMessageDialog(this,
                    "Puntaje Jugador 1:" + p1 + 
                    "\nPuntaje Jugador 2:" + p2+
                    "\n\nJugador 2 Gano");
            }else if(p1== p2){
                JOptionPane.showMessageDialog(this,
                    "Puntaje Jugador 1:" + p1 + 
                    "\nPuntaje Jugador 2:" + p2+
                    "\n\nEmpate");
            }
        }else{
            JOptionPane.showMessageDialog(this,
                    "Debe terminar los turnos");
        }
        
    }//GEN-LAST:event_jBresultadoActionPerformed

    private void jBjugar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBjugar2ActionPerformed
         
            DadosGen juega1 = new DadosGen();
            juega1.setVisible(true);
            turno++;
            System.out.println("turnoNro: " + turno);
            jBjugar2.setEnabled(false);
            jBjugar1.setEnabled(true);

    }//GEN-LAST:event_jBjugar2ActionPerformed
    
    private void jBexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBexitActionPerformed
        MainUser game = new MainUser();
        game.setVisible(true);
        dispose();
    }//GEN-LAST:event_jBexitActionPerformed

    private void jBjugar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBjugar1MouseClicked
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonido/boton_11.wav"));
        sonido.play();
    }//GEN-LAST:event_jBjugar1MouseClicked
    
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
            java.util.logging.Logger.getLogger(juega1vs1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(juega1vs1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(juega1vs1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(juega1vs1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new juega1vs1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBexit;
    public static javax.swing.JButton jBjugar1;
    public static javax.swing.JButton jBjugar2;
    private javax.swing.JButton jBresultado;
    public static javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public static javax.swing.JLabel jPuntaje1;
    public static javax.swing.JLabel jPuntaje11;
    public static javax.swing.JLabel jPuntaje2;
    public static javax.swing.JLabel jPuntaje22;
    public static javax.swing.JLabel jPuntaje3;
    public static javax.swing.JLabel jPuntaje33;
    public static javax.swing.JLabel jPuntaje4;
    public static javax.swing.JLabel jPuntaje44;
    public static javax.swing.JLabel jPuntaje5;
    public static javax.swing.JLabel jPuntaje55;
    public static javax.swing.JLabel jPuntaje6;
    public static javax.swing.JLabel jPuntaje66;
    public static javax.swing.JLabel jPuntajeES2;
    public static javax.swing.JLabel jPuntajeEs;
    public static javax.swing.JLabel jPuntajeFull;
    public static javax.swing.JLabel jPuntajeFull2;
    public static javax.swing.JLabel jPuntajeG1;
    public static javax.swing.JLabel jPuntajeG12;
    public static javax.swing.JLabel jPuntajeG2;
    public static javax.swing.JLabel jPuntajeG22;
    public static javax.swing.JLabel jPuntajePoker;
    public static javax.swing.JLabel jPuntajePoker2;
    // End of variables declaration//GEN-END:variables
}
