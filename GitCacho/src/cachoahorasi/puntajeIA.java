/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cachoahorasi;

import static cachoahorasi.puntajeT.jButtonSave;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class puntajeIA extends javax.swing.JFrame {

    /**
     * Creates new form puntajeIA
     */
    public puntajeIA() {
        initComponents();
        this.setLocationRelativeTo(null);
        buttonGroup1.add(jRadioButtonBala);
        buttonGroup1.add(jRadioButtonTonto);
        buttonGroup1.add(jRadioButtonTren);
        buttonGroup1.add(jRadioButtonCuadra);
        buttonGroup1.add(jRadioButtonQuina);
        buttonGroup1.add(jRadioButtonSena);
        buttonGroup1.add(jRadioButtonGrnd1);
        buttonGroup1.add(jRadioButtonEsca);
        buttonGroup1.add(jRadioButtonPoker);
        buttonGroup1.add(jRadioButtonFull);
        buttonGroup1.add(jRadioButtonGrnd2);
        //........boton guardar
       jButtonSave.setOpaque(false);
       jButtonSave.setContentAreaFilled(false);
       jButtonSave.setBorderPainted(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jRadioButtonBala = new javax.swing.JRadioButton();
        jRadioButtonTonto = new javax.swing.JRadioButton();
        jRadioButtonTren = new javax.swing.JRadioButton();
        jRadioButtonCuadra = new javax.swing.JRadioButton();
        jRadioButtonQuina = new javax.swing.JRadioButton();
        jRadioButtonSena = new javax.swing.JRadioButton();
        jRadioButtonGrnd1 = new javax.swing.JRadioButton();
        jButtonSave = new javax.swing.JButton();
        jRadioButtonEsca = new javax.swing.JRadioButton();
        jRadioButtonPoker = new javax.swing.JRadioButton();
        jRadioButtonFull = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jRadioButtonGrnd2 = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(300, 550));
        setResizable(false);
        getContentPane().setLayout(null);

        jRadioButtonBala.setText("Puntaje Balas:");
        getContentPane().add(jRadioButtonBala);
        jRadioButtonBala.setBounds(39, 22, 110, 23);

        jRadioButtonTonto.setText("Puntaje Tontos:");
        getContentPane().add(jRadioButtonTonto);
        jRadioButtonTonto.setBounds(39, 63, 110, 23);

        jRadioButtonTren.setText("Puntaje Trenes:");
        getContentPane().add(jRadioButtonTren);
        jRadioButtonTren.setBounds(39, 104, 110, 23);

        jRadioButtonCuadra.setText("Puntaje Cuadras:");
        getContentPane().add(jRadioButtonCuadra);
        jRadioButtonCuadra.setBounds(39, 147, 120, 23);

        jRadioButtonQuina.setText("Puntaje Quinas:");
        getContentPane().add(jRadioButtonQuina);
        jRadioButtonQuina.setBounds(39, 189, 120, 23);

        jRadioButtonSena.setText("Puntaje Senas:");
        getContentPane().add(jRadioButtonSena);
        jRadioButtonSena.setBounds(39, 230, 120, 23);

        jRadioButtonGrnd1.setText("Puntaje Grande:");
        getContentPane().add(jRadioButtonGrnd1);
        jRadioButtonGrnd1.setBounds(39, 402, 110, 23);

        jButtonSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/masImG/icons8-Menú Xbox-64.png"))); // NOI18N
        jButtonSave.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonSave.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/masImG/icons8-Menú Xbox-48.png"))); // NOI18N
        jButtonSave.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSave);
        jButtonSave.setBounds(240, 460, 60, 50);

        jRadioButtonEsca.setText("Puntaje Escalera:");
        getContentPane().add(jRadioButtonEsca);
        jRadioButtonEsca.setBounds(40, 280, 130, 23);

        jRadioButtonPoker.setText("Puntaje Poker:");
        getContentPane().add(jRadioButtonPoker);
        jRadioButtonPoker.setBounds(39, 320, 110, 23);

        jRadioButtonFull.setText("Puntaje Full:");
        getContentPane().add(jRadioButtonFull);
        jRadioButtonFull.setBounds(39, 361, 100, 23);

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(180, 20, 53, 22);

        jLabel2.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(180, 60, 45, 22);

        jLabel3.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(180, 100, 45, 23);

        jLabel4.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(180, 140, 46, 26);

        jLabel5.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(170, 190, 45, 23);

        jLabel6.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(170, 230, 45, 23);

        jLabel7.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(180, 280, 45, 23);

        jLabel8.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(170, 320, 46, 23);

        jLabel9.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(160, 360, 46, 23);

        jLabel10.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        jLabel10.setText("jLabel10");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(180, 400, 52, 22);

        jRadioButtonGrnd2.setText("Puntaje Grande2:");
        getContentPane().add(jRadioButtonGrnd2);
        jRadioButtonGrnd2.setBounds(39, 443, 120, 23);

        jLabel11.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        jLabel11.setText("jLabel11");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(190, 440, 49, 23);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/stena-.jpg"))); // NOI18N
        jLabel12.setText("jLabel12");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(0, 0, 300, 520);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed

        if(juegoIA.turnP <= 22){
            System.out.println("turnoPP:" + juegoIA.turnP);
            if(jRadioButtonBala.isSelected()){     //..............................balas
                //turno jugador 1
                if(juegoIA.turnP %2 == 0){
                    //condicion si esta vacio -> anotar
                    if(juegoIA.jPuntajeBal.getText().isEmpty()){

                        System.out.println(jLabel1.getText());

                        String nombre1;
                        nombre1 = jLabel1.getText();
                        juegoIA.jPuntajeBal.setText(nombre1);

                        dispose();

                    }else{
                        JOptionPane.showMessageDialog(this,"Puntaje ya establecido");
                        juegoIA.turnP--;
                        System.out.println("turnoP:" + juegoIA.turnP);
                    }

                    //turno jugador 2
                }else if(juegoIA.turnP %2 != 0) {
                    //condicion si esta vacio -> anotar
                    if(juegoIA.jPuntaje1.getText().isEmpty()){

                        System.out.println(jLabel1.getText());

                        String nombre1;
                        nombre1 = jLabel1.getText();
                        juegoIA.jPuntaje1.setText(nombre1);

                        dispose();
                    }else{
                        JOptionPane.showMessageDialog(this,"Puntaje ya establecido");
                        juegoIA.turnP--;

                    }
                }
                juegoIA.turnP++;
                System.out.println("turnoP:" + juegoIA.turnP);
            }
            if(jRadioButtonTonto.isSelected()){     //..............................tontos
                //turno jugador 1
                if(juegoIA.turnP % 2 == 0){
                    //condicion si esta vacio -> anotar
                    if(juegoIA.jPuntajeTon.getText().isEmpty()){
                        System.out.println(jLabel2.getText());

                        String nombre2;
                        nombre2 = jLabel2.getText();
                        juegoIA.jPuntajeTon.setText(nombre2);

                        dispose();
                    }else{
                        JOptionPane.showMessageDialog(this,"Puntaje ya establecido");
                        juegoIA.turnP--;
                    }
                    //turno jugador 2
                }else if(juegoIA.turnP %2 != 0) {
                    //condicion si esta vacio -> anotar
                    if(juegoIA.jPuntaje2.getText().isEmpty()){

                        System.out.println(jLabel2.getText());

                        String nombre2;
                        nombre2 = jLabel2.getText();
                        juegoIA.jPuntaje2.setText(nombre2);

                        dispose();
                    }else{
                        JOptionPane.showMessageDialog(this,"Puntaje ya establecido");
                        juegoIA.turnP--;
                    }
                }
                juegoIA.turnP++;
                System.out.println("turnoP:" + juegoIA.turnP);
            }
            if(jRadioButtonTren.isSelected()){     //..............................trenes
                //turno jugador 1
                if(juegoIA.turnP % 2 == 0){
                    //condicion si esta vacio -> anotar
                    if(juegoIA.jPuntaje3.getText().isEmpty()){
                        System.out.println(jLabel3.getText());

                        String nombre3;
                        nombre3 = jLabel3.getText();
                        juegoIA.jPuntaje3.setText(nombre3);

                        dispose();
                    }else{
                        JOptionPane.showMessageDialog(this,"Puntaje ya establecido");
                        juegoIA.turnP--;
                    }
                    //turno jugador 2
                }else if(juegoIA.turnP %2 != 0) {
                    //condicion si esta vacio -> anotar
                    if(juegoIA.jPuntaje3.getText().isEmpty()){
                        System.out.println(jLabel3.getText());

                        String nombre3;
                        nombre3 = jLabel3.getText();
                        juegoIA.jPuntaje3.setText(nombre3);

                        dispose();
                    }else{
                        JOptionPane.showMessageDialog(this,"Puntaje ya establecido");
                        juegoIA.turnP--;
                    }
                }
                juegoIA.turnP++;
                System.out.println("turnoP:" + juegoIA.turnP);
            }
            if(jRadioButtonCuadra.isSelected()){     //..............................cuadras
                //turno jugador 1
                if(juegoIA.turnP % 2 == 0){
                    //condicion si esta vacio -> anotar
                    if(juegoIA.jPuntaje4.getText().isEmpty()){
                        System.out.println(jLabel4.getText());

                        String nombre4;
                        nombre4 = jLabel4.getText();
                        juegoIA.jPuntaje4.setText(nombre4);

                        dispose();
                    }else{
                        JOptionPane.showMessageDialog(this,"Puntaje ya establecido");
                        juegoIA.turnP--;
                    }
                    //turno jugador 2
                }else if(juegoIA.turnP %2 != 0) {
                    //condicion si esta vacio -> anotar
                    if(juegoIA.jPuntaje4.getText().isEmpty()){
                        System.out.println(jLabel4.getText());

                        String nombre4;
                        nombre4 = jLabel4.getText();
                        juegoIA.jPuntaje4.setText(nombre4);

                        dispose();
                    }else{
                        JOptionPane.showMessageDialog(this,"Puntaje ya establecido");
                        juegoIA.turnP--;
                    }
                }
                juegoIA.turnP++;
                System.out.println("turnoP:" + juegoIA.turnP);
            }
            if(jRadioButtonQuina.isSelected()){     //..............................quinas
                //turno jugador 1
                if(juegoIA.turnP % 2 == 0){
                    //condicion si esta vacio -> anotar
                    if(juegoIA.jPuntaje5.getText().isEmpty()){
                        System.out.println(jLabel5.getText());

                        String nombre5;
                        nombre5 = jLabel5.getText();
                        juegoIA.jPuntaje5.setText(nombre5);

                        dispose();
                    }else{
                        JOptionPane.showMessageDialog(this,"Puntaje ya establecido");
                        juegoIA.turnP--;
                    }
                    //turno jugador 2
                }else if(juegoIA.turnP %2 != 0) {
                    //condicion si esta vacio -> anotar
                    if(juegoIA.jPuntaje5.getText().isEmpty()){
                        System.out.println(jLabel5.getText());

                        String nombre5;
                        nombre5 = jLabel5.getText();
                        juegoIA.jPuntaje5.setText(nombre5);

                        dispose();
                    }else{
                        JOptionPane.showMessageDialog(this,"Puntaje ya establecido");
                        juegoIA.turnP--;
                    }
                }
                juegoIA.turnP++;
                System.out.println("turnoP:" + juegoIA.turnP);
            }
            if(jRadioButtonSena.isSelected()){     //..............................senas
                //turno jugador 1
                if(juegoIA.turnP % 2 == 0){
                    //condicion si esta vacio -> anotar
                    if(juegoIA.jPuntaje6.getText().isEmpty()){
                        System.out.println(jLabel6.getText());

                        String nombre6;
                        nombre6 = jLabel6.getText();
                        juegoIA.jPuntaje6.setText(nombre6);

                        dispose();
                    }else{
                        JOptionPane.showMessageDialog(this,"Puntaje ya establecido");
                        juegoIA.turnP--;
                    }
                    //turno jugador 2
                }else if(juegoIA.turnP %2 != 0) {
                    //condicion si esta vacio -> anotar
                    if(juegoIA.jPuntaje6.getText().isEmpty()){
                        System.out.println(jLabel6.getText());

                        String nombre6;
                        nombre6 = jLabel6.getText();
                        juegoIA.jPuntaje6.setText(nombre6);

                        dispose();
                    }else{
                        JOptionPane.showMessageDialog(this,"Puntaje ya establecido");
                        juegoIA.turnP--;
                    }
                }
                juegoIA.turnP++;
                System.out.println("turnoP:" + juegoIA.turnP);
            }

            if(jRadioButtonGrnd1.isSelected()){     //..............................grande1
                //turno jugador 1
                if(juegoIA.turnP % 2 == 0){
                    //condicion si esta vacio -> anotar
                    if(juegoIA.jPuntajeG1.getText().isEmpty()){
                        System.out.println(jLabel10.getText());

                        String nombre10;
                        nombre10 = jLabel10.getText();
                        juegoIA.jPuntajeG1.setText(nombre10);

                        dispose();
                    }else{
                        JOptionPane.showMessageDialog(this,"Puntaje ya establecido");
                        juegoIA.turnP--;
                    }
                    //turno jugador 2
                }else if(juegoIA.turnP %2 != 0) {
                    //condicion si esta vacio -> anotar
                    if(juegoIA.jPuntaje10.getText().isEmpty()){
                        System.out.println(jLabel10.getText());

                        String nombre10;
                        nombre10 = jLabel10.getText();
                        juegoIA.jPuntaje10.setText(nombre10);

                        dispose();
                    }else{
                        JOptionPane.showMessageDialog(this,"Puntaje ya establecido");
                        juegoIA.turnP--;
                    }
                }
                juegoIA.turnP++;
                System.out.println("turnoP:" + juegoIA.turnP);
            }
            //1

            if(jRadioButtonGrnd2.isSelected()){     //..............................grande2
                //turno jugador 1
                if(juegoIA.turnP % 2 == 0){
                    //condicion si esta vacio -> anotar
                    if(juegoIA.jPuntajeG2.getText().isEmpty()){
                        System.out.println(jLabel11.getText());

                        String nombre10;
                        nombre10 = jLabel11.getText();
                        juegoIA.jPuntajeG2.setText(nombre10);

                        dispose();
                    }else{
                        JOptionPane.showMessageDialog(this,"Puntaje ya establecido");
                        juegoIA.turnP--;
                    }
                    //turno jugador 2
                }else if(juegoIA.turnP %2 != 0) {
                    if(juegoIA.jPuntaje11.getText().isEmpty()){
                        System.out.println(jLabel11.getText());

                        String nombre10;
                        nombre10 = jLabel11.getText();
                        juegoIA.jPuntaje11.setText(nombre10);

                        dispose();
                    }else{
                        JOptionPane.showMessageDialog(this,"Puntaje ya establecido");
                        juegoIA.turnP--;
                    }
                }
                juegoIA.turnP++;
                System.out.println("turnoP:" + juegoIA.turnP);
            }

            //2
            if(jRadioButtonEsca.isSelected()){     //...........................escalera
                //turno jugador 1
                if(juegoIA.turnP % 2 == 0){
                    //condicion si esta vacio -> anotar
                    if(juegoIA.jPuntajeEs.getText().isEmpty()){
                        System.out.println(jLabel7.getText());

                        String nombre7;
                        nombre7 = jLabel7.getText();
                        juegoIA.jPuntajeEs.setText(nombre7);

                        dispose();
                    }else{
                        JOptionPane.showMessageDialog(this,"Puntaje ya establecido");
                        juegoIA.turnP--;
                    }
                    //turno jugador 2
                }else if(juegoIA.turnP %2 != 0) {
                    if(juegoIA.jPuntaje7.getText().isEmpty()){
                        System.out.println(jLabel7.getText());

                        String nombre7;
                        nombre7 = jLabel7.getText();
                        juegoIA.jPuntaje7.setText(nombre7);

                        dispose();
                    }else{
                        JOptionPane.showMessageDialog(this,"Puntaje ya establecido");
                        juegoIA.turnP--;
                    }
                }
                juegoIA.turnP++;
                System.out.println("turnoP:" + juegoIA.turnP);
            }
            if(jRadioButtonFull.isSelected()){        //........................full
                //turno jugador 1
                if(juegoIA.turnP % 2 == 0){
                    //condicion si esta vacio -> anotar
                    if(juegoIA.jPuntajeFull.getText().isEmpty()){
                        System.out.println(jLabel9.getText());

                        String nombre9;
                        nombre9 = jLabel9.getText();
                        juegoIA.jPuntajeFull.setText(nombre9);

                        dispose();
                    }else{
                        JOptionPane.showMessageDialog(this,"Puntaje ya establecido");
                        juegoIA.turnP--;
                    }
                    //turno jugador 2
                }else if(juegoIA.turnP %2 != 0) {
                    //condicion si esta vacio -> anotar
                    if(juegoIA.jPuntaje8.getText().isEmpty()){
                        System.out.println(jLabel9.getText());

                        String nombre9;
                        nombre9 = jLabel9.getText();
                        juegoIA.jPuntaje8.setText(nombre9);

                        dispose();
                    }else{
                        JOptionPane.showMessageDialog(this,"Puntaje ya establecido");
                        juegoIA.turnP--;
                    }
                }
                juegoIA.turnP++;
                System.out.println("turnoP:" + juegoIA.turnP);
            }
            if(jRadioButtonPoker.isSelected()){     //..........................poker
                //turno jugador 1
                if(juegoIA.turnP % 2 == 0){
                    //condicion si esta vacio -> anotar
                    if(juegoIA.jPuntajePoker.getText().isEmpty()){
                        System.out.println(jLabel8.getText());

                        String nombre8;
                        nombre8 = jLabel8.getText();
                        juegoIA.jPuntajePoker.setText(nombre8);

                        dispose();
                    }else{
                        JOptionPane.showMessageDialog(this,"Puntaje ya establecido");
                        juegoIA.turnP--;
                    }
                    //turno jugador 2
                }else if(juegoIA.turnP %2 != 0) {
                    //condicion si esta vacio -> anotar
                    if(juegoIA.jPuntaje9.getText().isEmpty()){
                        System.out.println(jLabel8.getText());

                        String nombre8;
                        nombre8 = jLabel8.getText();
                        juegoIA.jPuntaje9.setText(nombre8);

                        dispose();
                    }else{
                        JOptionPane.showMessageDialog(this,"Puntaje ya establecido");
                        juegoIA.turnP--;
                    }
                }
                juegoIA.turnP++;
                System.out.println("turnoP:" + juegoIA.turnP);
            }
        }else{
            JOptionPane.showMessageDialog(this,"Fin del Juego");
        }
        //................controla fin del juego
        if(juegoIA.turno == juegoIA.turnoS){
            JOptionPane.showMessageDialog(this,"Juego Terminado");
            juegoIA.jBjugar1.setEnabled(false);
            juega1vs1.jBjugar2.setEnabled(false);
        }
    }//GEN-LAST:event_jButtonSaveActionPerformed

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
            java.util.logging.Logger.getLogger(puntajeIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(puntajeIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(puntajeIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(puntajeIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new puntajeIA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    public static javax.swing.JButton jButtonSave;
    public static javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel10;
    public static javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    public static javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel jLabel3;
    public static javax.swing.JLabel jLabel4;
    public static javax.swing.JLabel jLabel5;
    public static javax.swing.JLabel jLabel6;
    public static javax.swing.JLabel jLabel7;
    public static javax.swing.JLabel jLabel8;
    public static javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButtonBala;
    private javax.swing.JRadioButton jRadioButtonCuadra;
    private javax.swing.JRadioButton jRadioButtonEsca;
    private javax.swing.JRadioButton jRadioButtonFull;
    private javax.swing.JRadioButton jRadioButtonGrnd1;
    private javax.swing.JRadioButton jRadioButtonGrnd2;
    private javax.swing.JRadioButton jRadioButtonPoker;
    private javax.swing.JRadioButton jRadioButtonQuina;
    private javax.swing.JRadioButton jRadioButtonSena;
    private javax.swing.JRadioButton jRadioButtonTonto;
    private javax.swing.JRadioButton jRadioButtonTren;
    // End of variables declaration//GEN-END:variables
}
