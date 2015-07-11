/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practicahilos;

import java.util.Random;

/**
 *
 * @author Laboratorios
 */
public class HelloThread extends Thread {
    
    int i;
    
    
    @Override
    public void run(){
        i = 0;
         while (true){

             System.out.println("zzzzz " + Thread.currentThread().getId() + "--" + i++ ) ;
             
             try {
                 
                 Random r = new Random();
                 Thread.sleep(r.nextInt(200));
                 
             } catch (InterruptedException ex) {
                 System.out.println("ERROR !!!!!!!!");
             }
             
             if( i==50 ){
                break;
             }
         }
    
    }
}
