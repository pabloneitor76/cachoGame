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
public class TresEnRaya {
     Random r = new Random();
    int[] jPuntaje1 = new int[11];
    int c = 0;
    public int[] getTresRaya(){
        return jPuntaje1;
    }
    public boolean posVacia(int pos){
        boolean res = false;
        if(jPuntaje1[pos] == 0)
            res = true;
        return res;
    }
    public void insertar(int pos,int dato){
        if(posVacia(pos))
            jPuntaje1[pos] = dato;
        else
            System.out.println("posicion ya usada elija otra opcion");
    }
    public void posEspe(int pos,int n){
        int aux = r.random(3);
        if(n == aux){
            if(pos == 6){
                insertar(pos,20);
            }else{
                if(pos == 7){
                    insertar(pos,30);
                }else{
                    if(pos == 8){
                        insertar(pos,40);
                    }else{
                        insertar(pos,50);
                    }
                }
            }
        }    
    }
}
