/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cachoahorasi;

/**
 *
 * @author DELL
 */
public class iaNormal {
    Random r = new Random();
    TresEnRaya t = new TresEnRaya();
    boolean aux = false;
    int[] jPuntaje1 = t.getTresRaya();
    boolean[] noCam = new boolean[11];
    public void ia(){
        boolean aux = false;
        int pos = r.random(11);
        int cant = 0;
        while(aux == false){
            if(jPuntaje1[pos-1] != 0 || noCam[pos-1] == true){
                pos = r.random(11);
            }else{
                aux = true;
                noCam[pos-1] = true;
            }
        }
        pos--;
        if(pos > 5 && pos <= 10){
            t.posEspe(pos,3); 
        }else{
            cant = r.random(5);
            t.insertar(pos,cant*(pos+1));
        }
        aux = verificarTurnos(noCam);
        if(aux == true){
            System.out.println("Array lleno");
        }
    }
    public boolean verificarTurnos(boolean[] noCam){
        boolean res = true;
        for(int i = 0;i < noCam.length;i++){
            if(noCam[i] == false){
                res = false;
            }
        }
        return res;
    }
}
