/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cachoahorasi;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/**
 *
 * @author DELL
 */
public class puntajeT3 extends javax.swing.JFrame {

    /**
     * Creates new form puntajeT3
     */
    public puntajeT3() {
        initComponents();
        //iconoDADO
        try{
            setIconImage(new ImageIcon(getClass().getResource("/masImG/Dice-32.png")).getImage());
        }catch(Exception ex){
        
        }
        //
        setTitle("CACHO-JUEGO");
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
        //........boton primer guardar
       jButtonSave.setOpaque(false);
       jButtonSave.setContentAreaFilled(false);
       jButtonSave.setBorderPainted(false);
        //
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
        jLabel10 = new javax.swing.JLabel();
        jRadioButtonFull = new javax.swing.JRadioButton();
        jRadioButtonGrnd2 = new javax.swing.JRadioButton();
        jRadioButtonBala = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jRadioButtonTonto = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jRadioButtonTren = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jRadioButtonCuadra = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jRadioButtonQuina = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jRadioButtonSena = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jRadioButtonGrnd1 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jButtonSave = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jRadioButtonEsca = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jRadioButtonPoker = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(310, 560));
        getContentPane().setLayout(null);

        jLabel10.setText("jLabel10");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(190, 400, 40, 22);

        jRadioButtonFull.setText("Puntaje Full:");
        getContentPane().add(jRadioButtonFull);
        jRadioButtonFull.setBounds(39, 361, 100, 23);

        jRadioButtonGrnd2.setText("Puntaje Grande2:");
        getContentPane().add(jRadioButtonGrnd2);
        jRadioButtonGrnd2.setBounds(39, 432, 120, 23);

        jRadioButtonBala.setText("Puntaje Balas:");
        getContentPane().add(jRadioButtonBala);
        jRadioButtonBala.setBounds(39, 22, 100, 23);

        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(170, 20, 53, 22);

        jLabel11.setText("jLabel11");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(190, 430, 40, 23);

        jRadioButtonTonto.setText("Puntaje Tontos:");
        getContentPane().add(jRadioButtonTonto);
        jRadioButtonTonto.setBounds(39, 63, 110, 23);

        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(170, 60, 34, 22);

        jRadioButtonTren.setText("Puntaje Trenes:");
        getContentPane().add(jRadioButtonTren);
        jRadioButtonTren.setBounds(39, 104, 110, 23);

        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(180, 100, 34, 23);

        jRadioButtonCuadra.setText("Puntaje Cuadras:");
        getContentPane().add(jRadioButtonCuadra);
        jRadioButtonCuadra.setBounds(39, 147, 120, 23);

        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(180, 150, 34, 26);

        jRadioButtonQuina.setText("Puntaje Quinas:");
        getContentPane().add(jRadioButtonQuina);
        jRadioButtonQuina.setBounds(39, 189, 110, 23);

        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(180, 190, 34, 23);

        jRadioButtonSena.setText("Puntaje Senas:");
        getContentPane().add(jRadioButtonSena);
        jRadioButtonSena.setBounds(39, 230, 110, 23);

        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(170, 230, 34, 23);

        jRadioButtonGrnd1.setText("Puntaje Grande:");
        getContentPane().add(jRadioButtonGrnd1);
        jRadioButtonGrnd1.setBounds(39, 396, 120, 23);

        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(190, 270, 34, 23);

        jButtonSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/masImG/icons8-Menú Xbox-64.png"))); // NOI18N
        jButtonSave.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonSave.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSave);
        jButtonSave.setBounds(240, 460, 60, 50);

        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(180, 320, 34, 23);

        jRadioButtonEsca.setText("Puntaje Escalera:");
        getContentPane().add(jRadioButtonEsca);
        jRadioButtonEsca.setBounds(39, 275, 120, 23);

        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(170, 360, 34, 23);

        jRadioButtonPoker.setText("Puntaje Poker:");
        getContentPane().add(jRadioButtonPoker);
        jRadioButtonPoker.setBounds(39, 320, 110, 23);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/stena-.jpg"))); // NOI18N
        jLabel12.setText("jLabel12");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(0, 0, 300, 520);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed

        if(JuegoD3.turnP <= 33){
            System.out.println("turnoPP:" + JuegoD3.turnP);
            if(jRadioButtonBala.isSelected()){     //..............................balas
                //turno jugador 1
                if(JuegoD3.turnP == 0){
                    //condicion si esta vacio -> anotar
                    if(JuegoD3.jPuntaje1.getText().isEmpty()){

                        System.out.println(jLabel1.getText());

                        String nombre1;
                        nombre1 = jLabel1.getText();
                        JuegoD3.jPuntaje1.setText(nombre1);

                        dispose();
                    }else{
                        JOptionPane.showMessageDialog(this,"Puntaje ya establecido");
                        JuegoD3.turnP--;
                    }

                    //turno jugador 2
                }else if(JuegoD3.turnP == 1) {
                    //condicion si esta vacio -> anotar
                    if(JuegoD3.jPuntaje11.getText().isEmpty()){

                        System.out.println(jLabel1.getText());

                        String nombre1;
                        nombre1 = jLabel1.getText();
                        JuegoD3.jPuntaje11.setText(nombre1);

                        dispose();
                    }else{
                        JOptionPane.showMessageDialog(this,"Puntaje ya establecido");
                        JuegoD3.turnP--;
                    }
                
                    //turno jugador 3
                }else if(JuegoD3.turnP == 2) {
                    //condicion si esta vacio -> anotar
                    if(JuegoD3.jPuntaje111.getText().isEmpty()){

                        System.out.println(jLabel1.getText());

                        String nombre1;
                        nombre1 = jLabel1.getText();
                        JuegoD3.jPuntaje111.setText(nombre1);

                        dispose();
                    }else{
                        JOptionPane.showMessageDialog(this,"Puntaje ya establecido");
                        JuegoD3.turnP--;
                    }
                }
                //
                if(JuegoD3.turnP == 2){
                    JuegoD3.turnP = -1;
                }
                JuegoD3.turnP++;
                System.out.println("turnoP:" + JuegoD3.turnP);
            }
            if(jRadioButtonTonto.isSelected()){     //..............................tontos
                //turno jugador 1
                if(JuegoD3.turnP == 0 /* JuegoD3.turnP == JuegoD3.turno+2*/){
                    //condicion si esta vacio -> anotar
                    if(JuegoD3.jPuntaje2.getText().isEmpty()){
                        System.out.println(jLabel2.getText());

                        String nombre2;
                        nombre2 = jLabel2.getText();
                        JuegoD3.jPuntaje2.setText(nombre2);

                        dispose();
                    }else{
                        JOptionPane.showMessageDialog(this,"Puntaje ya establecido");
                        JuegoD3.turnP--;
                    }
                    //turno jugador 2
                }else if(JuegoD3.turnP == 1 /* JuegoD3.turnP == JuegoD3.turno+2*/) {
                    //condicion si esta vacio -> anotar
                    if(JuegoD3.jPuntaje22.getText().isEmpty()){

                        System.out.println(jLabel2.getText());

                        String nombre2;
                        nombre2 = jLabel2.getText();
                        JuegoD3.jPuntaje22.setText(nombre2);

                        dispose();
                    }else{
                        JOptionPane.showMessageDialog(this,"Puntaje ya establecido");
                        JuegoD3.turnP--;
                    }
                    //turno jugador 3
                }else if(JuegoD3.turnP == 2 /*|| JuegoD3.turnP == JuegoD3.turno+2*/) {
                    //condicion si esta vacio -> anotar
                    if(JuegoD3.jPuntaje222.getText().isEmpty()){

                        System.out.println(jLabel2.getText());

                        String nombre2;
                        nombre2 = jLabel2.getText();
                        JuegoD3.jPuntaje222.setText(nombre2);

                        dispose();
                    }else{
                        JOptionPane.showMessageDialog(this,"Puntaje ya establecido");
                        JuegoD3.turnP--;
                    }
                }
                //
                if(JuegoD3.turnP == 2){
                    JuegoD3.turnP = -1;
                }
                JuegoD3.turnP++;
                System.out.println("turnoP:" + JuegoD3.turnP);
            }
            if(jRadioButtonTren.isSelected()){     //..............................trenes
                //turno jugador 1
                if(JuegoD3.turnP == 0 /*|| JuegoD3.turnP == JuegoD3.turno+3*/){
                    //condicion si esta vacio -> anotar
                    if(JuegoD3.jPuntaje3.getText().isEmpty()){
                        System.out.println(jLabel3.getText());

                        String nombre3;
                        nombre3 = jLabel3.getText();
                        JuegoD3.jPuntaje3.setText(nombre3);

                        dispose();
                    }else{
                        JOptionPane.showMessageDialog(this,"Puntaje ya establecido");
                        JuegoD3.turnP--;
                    }
                    //turno jugador 2
                }else if(JuegoD3.turnP == 1 /*|| JuegoD3.turnP == JuegoD3.turno+3*/) {
                    //condicion si esta vacio -> anotar
                    if(JuegoD3.jPuntaje33.getText().isEmpty()){
                        System.out.println(jLabel3.getText());

                        String nombre3;
                        nombre3 = jLabel3.getText();
                        JuegoD3.jPuntaje33.setText(nombre3);

                        dispose();
                    }else{
                        JOptionPane.showMessageDialog(this,"Puntaje ya establecido");
                        JuegoD3.turnP--;
                    }
                    //turno jugador 3
                }else if(JuegoD3.turnP == 2 /*|| JuegoD3.turnP == JuegoD3.turno+3*/) {
                    //condicion si esta vacio -> anotar
                    if(JuegoD3.jPuntaje333.getText().isEmpty()){
                        System.out.println(jLabel3.getText());

                        String nombre3;
                        nombre3 = jLabel3.getText();
                        JuegoD3.jPuntaje333.setText(nombre3);

                        dispose();
                    }else{
                        JOptionPane.showMessageDialog(this,"Puntaje ya establecido");
                        JuegoD3.turnP--;
                    }
                    
                }
                //
                if(JuegoD3.turnP == 2){
                    JuegoD3.turnP = -1;
                }
                JuegoD3.turnP++;
                System.out.println("turnoP:" + JuegoD3.turnP);
            }
            if(jRadioButtonCuadra.isSelected()){     //..............................cuadras
                //turno jugador 1
                if(JuegoD3.turnP == 0 ){
                    //condicion si esta vacio -> anotar
                    if(JuegoD3.jPuntaje4.getText().isEmpty()){
                        System.out.println(jLabel4.getText());

                        String nombre4;
                        nombre4 = jLabel4.getText();
                        JuegoD3.jPuntaje4.setText(nombre4);

                        dispose();
                    }else{
                        JOptionPane.showMessageDialog(this,"Puntaje ya establecido");
                        JuegoD3.turnP--;
                    }
                    //turno jugador 2
                }else if(JuegoD3.turnP == 1) {
                    //condicion si esta vacio -> anotar
                    if(JuegoD3.jPuntaje44.getText().isEmpty()){
                        System.out.println(jLabel4.getText());

                        String nombre4;
                        nombre4 = jLabel4.getText();
                        JuegoD3.jPuntaje44.setText(nombre4);

                        dispose();
                    }else{
                        JOptionPane.showMessageDialog(this,"Puntaje ya establecido");
                        JuegoD3.turnP--;
                    }
                    //turno jugador 3
                }else if(JuegoD3.turnP == 2) {
                    //condicion si esta vacio -> anotar
                    if(JuegoD3.jPuntaje444.getText().isEmpty()){
                        System.out.println(jLabel4.getText());

                        String nombre4;
                        nombre4 = jLabel4.getText();
                        JuegoD3.jPuntaje444.setText(nombre4);

                        dispose();
                    }else{
                        JOptionPane.showMessageDialog(this,"Puntaje ya establecido");
                        JuegoD3.turnP--;
                    }
                }
                //
                if(JuegoD3.turnP == 2){
                    JuegoD3.turnP = -1;
                }
                JuegoD3.turnP++;
                System.out.println("turnoP:" + JuegoD3.turnP);
            }
            if(jRadioButtonQuina.isSelected()){     //..............................quinas
                //turno jugador 1
                if(JuegoD3.turnP == 0){
                    //condicion si esta vacio -> anotar
                    if(JuegoD3.jPuntaje5.getText().isEmpty()){
                        System.out.println(jLabel5.getText());

                        String nombre5;
                        nombre5 = jLabel5.getText();
                        JuegoD3.jPuntaje5.setText(nombre5);

                        dispose();
                    }else{
                        JOptionPane.showMessageDialog(this,"Puntaje ya establecido");
                        JuegoD3.turnP--;
                    }
                    //turno jugador 2
                }else if(JuegoD3.turnP == 1) {
                    //condicion si esta vacio -> anotar
                    if(JuegoD3.jPuntaje55.getText().isEmpty()){
                        System.out.println(jLabel5.getText());

                        String nombre5;
                        nombre5 = jLabel5.getText();
                        JuegoD3.jPuntaje55.setText(nombre5);

                        dispose();
                    }else{
                        JOptionPane.showMessageDialog(this,"Puntaje ya establecido");
                        JuegoD3.turnP--;
                    }
                    //turno jugador 3
                }else if(JuegoD3.turnP == 2) {
                    //condicion si esta vacio -> anotar
                    if(JuegoD3.jPuntaje555.getText().isEmpty()){
                        System.out.println(jLabel5.getText());

                        String nombre5;
                        nombre5 = jLabel5.getText();
                        JuegoD3.jPuntaje555.setText(nombre5);

                        dispose();
                    }else{
                        JOptionPane.showMessageDialog(this,"Puntaje ya establecido");
                        JuegoD3.turnP--;
                    }
                }
                //
                if(JuegoD3.turnP == 2){
                    JuegoD3.turnP = -1;
                }
                JuegoD3.turnP++;
                System.out.println("turnoP:" + JuegoD3.turnP);
            }
            if(jRadioButtonSena.isSelected()){     //..............................senas
                //turno jugador 1
                if(JuegoD3.turnP == 0){
                    //condicion si esta vacio -> anotar
                    if(JuegoD3.jPuntaje6.getText().isEmpty()){
                        System.out.println(jLabel6.getText());

                        String nombre6;
                        nombre6 = jLabel6.getText();
                        JuegoD3.jPuntaje6.setText(nombre6);

                        dispose();
                    }else{
                        JOptionPane.showMessageDialog(this,"Puntaje ya establecido");
                        JuegoD3.turnP--;
                    }
                    //turno jugador 2
                }else if(JuegoD3.turnP == 1) {
                    //condicion si esta vacio -> anotar
                    if(JuegoD3.jPuntaje66.getText().isEmpty()){
                        System.out.println(jLabel6.getText());

                        String nombre6;
                        nombre6 = jLabel6.getText();
                        JuegoD3.jPuntaje66.setText(nombre6);

                        dispose();
                    }else{
                        JOptionPane.showMessageDialog(this,"Puntaje ya establecido");
                        JuegoD3.turnP--;
                    }
                    //turno jugador 3
                }else if(JuegoD3.turnP == 2) {
                    //condicion si esta vacio -> anotar
                    if(JuegoD3.jPuntaje666.getText().isEmpty()){
                        System.out.println(jLabel6.getText());

                        String nombre6;
                        nombre6 = jLabel6.getText();
                        JuegoD3.jPuntaje666.setText(nombre6);

                        dispose();
                    }else{
                        JOptionPane.showMessageDialog(this,"Puntaje ya establecido");
                        JuegoD3.turnP--;
                    }
                }
                //
                if(JuegoD3.turnP == 2){
                    JuegoD3.turnP = -1;
                }
                JuegoD3.turnP++;
                System.out.println("turnoP:" + JuegoD3.turnP);
            }

            if(jRadioButtonGrnd1.isSelected()){     //..............................grande1
                //turno jugador 1
                if(JuegoD3.turnP == 0){
                    //condicion si esta vacio -> anotar
                    if(JuegoD3.jPuntajeG1.getText().isEmpty()){
                        System.out.println(jLabel10.getText());

                        String nombre10;
                        nombre10 = jLabel10.getText();
                        JuegoD3.jPuntajeG1.setText(nombre10);

                        dispose();
                    }else{
                        JOptionPane.showMessageDialog(this,"Puntaje ya establecido");
                        JuegoD3.turnP--;
                    }
                    //turno jugador 2
                }else if(JuegoD3.turnP == 1) {
                    //condicion si esta vacio -> anotar
                    if(JuegoD3.jPuntajeG12.getText().isEmpty()){
                        System.out.println(jLabel10.getText());

                        String nombre10;
                        nombre10 = jLabel10.getText();
                        JuegoD3.jPuntajeG12.setText(nombre10);

                        dispose();
                    }else{
                        JOptionPane.showMessageDialog(this,"Puntaje ya establecido");
                        JuegoD3.turnP--;
                    }
                    //turno jugador 3
                }else if(JuegoD3.turnP == 2) {
                    //condicion si esta vacio -> anotar
                    if(JuegoD3.jPuntajeG13.getText().isEmpty()){
                        System.out.println(jLabel10.getText());

                        String nombre10;
                        nombre10 = jLabel10.getText();
                        JuegoD3.jPuntajeG13.setText(nombre10);

                        dispose();
                    }else{
                        JOptionPane.showMessageDialog(this,"Puntaje ya establecido");
                        JuegoD3.turnP--;
                    }
                }
                //
                if(JuegoD3.turnP == 2){
                    JuegoD3.turnP = -1;
                }
                JuegoD3.turnP++;
                System.out.println("turnoP:" + JuegoD3.turnP);
            }
            //1

            if(jRadioButtonGrnd2.isSelected()){     //..............................grande2
                //turno jugador 1
                if(JuegoD3.turnP == 0){
                    //condicion si esta vacio -> anotar
                    if(JuegoD3.jPuntajeG2.getText().isEmpty()){
                        System.out.println(jLabel11.getText());

                        String nombre10;
                        nombre10 = jLabel11.getText();
                        JuegoD3.jPuntajeG2.setText(nombre10);

                        dispose();
                    }else{
                        JOptionPane.showMessageDialog(this,"Puntaje ya establecido");
                        JuegoD3.turnP--;
                    }
                    //turno jugador 2
                }else if(JuegoD3.turnP == 1) {
                    if(JuegoD3.jPuntajeG22.getText().isEmpty()){
                        System.out.println(jLabel11.getText());

                        String nombre10;
                        nombre10 = jLabel11.getText();
                        JuegoD3.jPuntajeG22.setText(nombre10);

                        dispose();
                    }else{
                        JOptionPane.showMessageDialog(this,"Puntaje ya establecido");
                        JuegoD3.turnP--;
                    }
                    //turno jugador 3
                }else if(JuegoD3.turnP == 2) {
                    if(JuegoD3.jPuntajeG23.getText().isEmpty()){
                        System.out.println(jLabel11.getText());

                        String nombre10;
                        nombre10 = jLabel11.getText();
                        JuegoD3.jPuntajeG23.setText(nombre10);

                        dispose();
                    }else{
                        JOptionPane.showMessageDialog(this,"Puntaje ya establecido");
                        JuegoD3.turnP--;
                    }
                }
                //
                if(JuegoD3.turnP == 2){
                    JuegoD3.turnP = -1;
                }
                JuegoD3.turnP++;
                System.out.println("turnoP:" + JuegoD3.turnP);
            }

            //2
            if(jRadioButtonEsca.isSelected()){     //...........................escalera
                //turno jugador 1
                if(JuegoD3.turnP == 0){
                    //condicion si esta vacio -> anotar
                    if(JuegoD3.jPuntajeEs.getText().isEmpty()){
                        System.out.println(jLabel7.getText());

                        String nombre7;
                        nombre7 = jLabel7.getText();
                        JuegoD3.jPuntajeEs.setText(nombre7);

                        dispose();
                    }else{
                        JOptionPane.showMessageDialog(this,"Puntaje ya establecido");
                        JuegoD3.turnP--;
                    }
                    //turno jugador 2
                }else if(JuegoD3.turnP == 1 ) {
                    if(JuegoD3.jPuntajeES2.getText().isEmpty()){
                        System.out.println(jLabel7.getText());

                        String nombre7;
                        nombre7 = jLabel7.getText();
                        JuegoD3.jPuntajeES2.setText(nombre7);

                        dispose();
                    }else{
                        JOptionPane.showMessageDialog(this,"Puntaje ya establecido");
                        JuegoD3.turnP--;
                    }
                    //turno jugador 3
                }else if(JuegoD3.turnP == 2 ) {
                    if(JuegoD3.jPuntajeES3.getText().isEmpty()){
                        System.out.println(jLabel7.getText());

                        String nombre7;
                        nombre7 = jLabel7.getText();
                        JuegoD3.jPuntajeES3.setText(nombre7);

                        dispose();
                    }else{
                        JOptionPane.showMessageDialog(this,"Puntaje ya establecido");
                        JuegoD3.turnP--;
                    }
                }
                //
                if(JuegoD3.turnP == 2){
                    JuegoD3.turnP = -1;
                }
                JuegoD3.turnP++;
                System.out.println("turnoP:" + JuegoD3.turnP);
            }
            if(jRadioButtonFull.isSelected()){        //........................full
                //turno jugador 1
                if(JuegoD3.turnP == 0){
                    //condicion si esta vacio -> anotar
                    if(JuegoD3.jPuntajeFull.getText().isEmpty()){
                        System.out.println(jLabel9.getText());

                        String nombre9;
                        nombre9 = jLabel9.getText();
                        JuegoD3.jPuntajeFull.setText(nombre9);

                        dispose();
                    }else{
                        JOptionPane.showMessageDialog(this,"Puntaje ya establecido");
                        JuegoD3.turnP--;
                    }
                    //turno jugador 2
                }else if(JuegoD3.turnP == 1) {
                    //condicion si esta vacio -> anotar
                    if(JuegoD3.jPuntajeFull2.getText().isEmpty()){
                        System.out.println(jLabel9.getText());

                        String nombre9;
                        nombre9 = jLabel9.getText();
                        JuegoD3.jPuntajeFull2.setText(nombre9);

                        dispose();
                    }else{
                        JOptionPane.showMessageDialog(this,"Puntaje ya establecido");
                        JuegoD3.turnP--;
                    }
                    //turno jugador 3
                }else if(JuegoD3.turnP == 2) {
                    //condicion si esta vacio -> anotar
                    if(JuegoD3.jPuntajeFull3.getText().isEmpty()){
                        System.out.println(jLabel9.getText());

                        String nombre9;
                        nombre9 = jLabel9.getText();
                        JuegoD3.jPuntajeFull3.setText(nombre9);

                        dispose();
                    }else{
                        JOptionPane.showMessageDialog(this,"Puntaje ya establecido");
                        JuegoD3.turnP--;
                    }
                }
                //
                if(JuegoD3.turnP == 2){
                    JuegoD3.turnP = -1;
                }
                JuegoD3.turnP++;
                System.out.println("turnoP:" + JuegoD3.turnP);
            }
            if(jRadioButtonPoker.isSelected()){     //..........................poker
                //turno jugador 1
                if(JuegoD3.turnP == 0 ){
                    //condicion si esta vacio -> anotar
                    if(JuegoD3.jPuntajePoker.getText().isEmpty()){
                        System.out.println(jLabel8.getText());

                        String nombre8;
                        nombre8 = jLabel8.getText();
                        JuegoD3.jPuntajePoker.setText(nombre8);

                        dispose();
                    }else{
                        JOptionPane.showMessageDialog(this,"Puntaje ya establecido");
                        JuegoD3.turnP--;
                    }
                    //turno jugador 2
                }else if(JuegoD3.turnP == 1) {
                    //condicion si esta vacio -> anotar
                    if(JuegoD3.jPuntajePoker2.getText().isEmpty()){
                        System.out.println(jLabel8.getText());

                        String nombre8;
                        nombre8 = jLabel8.getText();
                        JuegoD3.jPuntajePoker2.setText(nombre8);

                        dispose();
                    }else{
                        JOptionPane.showMessageDialog(this,"Puntaje ya establecido");
                        JuegoD3.turnP--;
                    }
                    //turno jugador 3
                }else if(JuegoD3.turnP == 2) {
                    //condicion si esta vacio -> anotar
                    if(JuegoD3.jPuntajePoker3.getText().isEmpty()){
                        System.out.println(jLabel8.getText());

                        String nombre8;
                        nombre8 = jLabel8.getText();
                        JuegoD3.jPuntajePoker3.setText(nombre8);

                        dispose();
                    }else{
                        JOptionPane.showMessageDialog(this,"Puntaje ya establecido");
                        JuegoD3.turnP--;
                    }
                }
                //
                if(JuegoD3.turnP == 2){
                    JuegoD3.turnP = -1;
                }
                JuegoD3.turnP++;
                System.out.println("turnoP:" + JuegoD3.turnP);
            }
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
            java.util.logging.Logger.getLogger(puntajeT3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(puntajeT3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(puntajeT3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(puntajeT3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new puntajeT3().setVisible(true);
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
