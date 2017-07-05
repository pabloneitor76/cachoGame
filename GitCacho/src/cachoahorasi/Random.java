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
public class Random {
     public int random(int n){
       int x = (int) (Math.random()*n+1);
       return x;
   }
}
