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
        jLabel4 = new javax.swing.JLabel();
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
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jBjugar2 = new javax.swing.JButton();
        jBexit = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(620, 440));
        getContentPane().setLayout(null);

        jPuntaje1.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        jPuntaje1.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(jPuntaje1);
        jPuntaje1.setBounds(80, 190, 30, 14);

        jPuntajeEs.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        jPuntajeEs.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(jPuntajeEs);
        jPuntajeEs.setBounds(110, 190, 38, 14);

        jPuntaje4.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        jPuntaje4.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(jPuntaje4);
        jPuntaje4.setBounds(140, 190, 40, 14);

        jPuntaje2.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        jPuntaje2.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(jPuntaje2);
        jPuntaje2.setBounds(80, 220, 30, 15);

        jPuntajePoker.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        jPuntajePoker.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(jPuntajePoker);
        jPuntajePoker.setBounds(110, 250, 38, 15);

        jPuntaje5.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        jPuntaje5.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(jPuntaje5);
        jPuntaje5.setBounds(140, 220, 40, 14);

        jPuntaje3.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        jPuntaje3.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(jPuntaje3);
        jPuntaje3.setBounds(80, 250, 30, 16);

        jPuntajeFull.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        jPuntajeFull.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(jPuntajeFull);
        jPuntajeFull.setBounds(110, 220, 38, 16);

        jPuntaje6.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        jPuntaje6.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(jPuntaje6);
        jPuntaje6.setBounds(140, 250, 40, 16);

        jPuntajeG1.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        jPuntajeG1.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(jPuntajeG1);
        jPuntajeG1.setBounds(80, 280, 40, 14);

        jPuntajeG2.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        jPuntajeG2.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(jPuntajeG2);
        jPuntajeG2.setBounds(130, 280, 40, 14);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/papel-arrugado_2947545as.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(70, 170, 100, 130);

        jBjugar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-1 en círculo -50.png"))); // NOI18N
        jBjugar1.setText("Juega1");
        jBjugar1.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-Tiempo-50.png"))); // NOI18N
        jBjugar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBjugar1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-1 en círculo  Filled-50.png"))); // NOI18N
        jBjugar1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBjugar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBjugar1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBjugar1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jBjugar1MousePressed(evt);
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
        jBresultado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBresultadoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBresultadoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jBresultadoMousePressed(evt);
            }
        });
        jBresultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBresultadoActionPerformed(evt);
            }
        });
        getContentPane().add(jBresultado);
        jBresultado.setBounds(30, 319, 100, 70);

        jPuntaje11.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        jPuntaje11.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(jPuntaje11);
        jPuntaje11.setBounds(420, 190, 40, 15);

        jPuntajeES2.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        jPuntajeES2.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(jPuntajeES2);
        jPuntajeES2.setBounds(450, 190, 40, 14);

        jPuntaje44.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        jPuntaje44.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(jPuntaje44);
        jPuntaje44.setBounds(480, 190, 40, 15);

        jPuntaje22.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        jPuntaje22.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(jPuntaje22);
        jPuntaje22.setBounds(420, 220, 40, 15);

        jPuntajePoker2.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        jPuntajePoker2.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(jPuntajePoker2);
        jPuntajePoker2.setBounds(450, 250, 40, 15);

        jPuntaje55.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        jPuntaje55.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(jPuntaje55);
        jPuntaje55.setBounds(480, 220, 40, 15);

        jPuntaje33.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        jPuntaje33.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(jPuntaje33);
        jPuntaje33.setBounds(420, 250, 40, 17);

        jPuntajeFull2.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        jPuntajeFull2.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(jPuntajeFull2);
        jPuntajeFull2.setBounds(450, 220, 40, 17);

        jPuntaje66.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        jPuntaje66.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(jPuntaje66);
        jPuntaje66.setBounds(480, 250, 40, 17);

        jPuntajeG12.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        jPuntajeG12.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(jPuntajeG12);
        jPuntajeG12.setBounds(420, 280, 40, 14);

        jPuntajeG22.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        jPuntajeG22.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(jPuntajeG22);
        jPuntajeG22.setBounds(460, 280, 40, 14);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/papel-arrugado_2947545as.jpg"))); // NOI18N
        jLabel5.setText("jLabel4");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(410, 170, 100, 130);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
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
        jBjugar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBjugar2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBjugar2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jBjugar2MousePressed(evt);
            }
        });
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
        jBexit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBexitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBexitMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jBexitMousePressed(evt);
            }
        });
        jBexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBexitActionPerformed(evt);
            }
        });
        getContentPane().add(jBexit);
        jBexit.setBounds(500, 320, 80, 70);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/dice-26772_960_720-iloveimg-resized.png"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(240, 70, 120, 240);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoretro.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jLabel3.setToolTipText("");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 600, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBjugar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBjugar1ActionPerformed
        
            DadosGen juega1 = new DadosGen();
            juega1.setVisible(true);
            turno++;
            System.out.println("turnoNro: " + turno);
            jBjugar1.setEnabled(false);
            jBjugar2.setEnabled(true);
            System.out.print("banedera"+turno);
  
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
            System.out.print("banedera"+turno);
            if(turno == 22 ){
                jBjugar2.setEnabled(false);
                jBjugar1.setEnabled(false);
            }
    }//GEN-LAST:event_jBjugar2ActionPerformed
    
    private void jBexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBexitActionPerformed
        MainUser game = new MainUser();
        game.setVisible(true);
        dispose();
    }//GEN-LAST:event_jBexitActionPerformed
    //sonido boton jugador1
    private void jBjugar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBjugar1MouseEntered
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonido/selected.wav"));
        sonido.play();
    }//GEN-LAST:event_jBjugar1MouseEntered

    private void jBjugar1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBjugar1MouseExited
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonido/selected.wav"));
        sonido.play();
    }//GEN-LAST:event_jBjugar1MouseExited

    private void jBjugar1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBjugar1MousePressed
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonido/clicked.wav"));
        sonido.play();
    }//GEN-LAST:event_jBjugar1MousePressed
    //sonido boton jugador2
    private void jBjugar2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBjugar2MouseEntered
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonido/selected.wav"));
        sonido.play();
    }//GEN-LAST:event_jBjugar2MouseEntered

    private void jBjugar2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBjugar2MouseExited
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonido/selected.wav"));
        sonido.play();
    }//GEN-LAST:event_jBjugar2MouseExited
    
    private void jBjugar2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBjugar2MousePressed
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonido/clicked.wav"));
        sonido.play();
    }//GEN-LAST:event_jBjugar2MousePressed
    //sonido boton resultado
    private void jBresultadoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBresultadoMouseEntered
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonido/selected.wav"));
        sonido.play();
    }//GEN-LAST:event_jBresultadoMouseEntered

    private void jBresultadoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBresultadoMouseExited
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonido/selected.wav"));
        sonido.play();
    }//GEN-LAST:event_jBresultadoMouseExited

    private void jBresultadoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBresultadoMousePressed
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonido/clicked.wav"));
        sonido.play();
    }//GEN-LAST:event_jBresultadoMousePressed
    //sonido boton salir
    private void jBexitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBexitMouseEntered
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonido/selected.wav"));
        sonido.play();
    }//GEN-LAST:event_jBexitMouseEntered

    private void jBexitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBexitMouseExited
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonido/selected.wav"));
        sonido.play();
    }//GEN-LAST:event_jBexitMouseExited

    private void jBexitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBexitMousePressed
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonido/clicked.wav"));
        sonido.play();
    }//GEN-LAST:event_jBexitMousePressed
    
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
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
