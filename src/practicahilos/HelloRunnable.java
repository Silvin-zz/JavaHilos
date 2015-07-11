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
public class HelloRunnable implements Runnable {

    int i;
    @Override
    public void run() {
         i = 0;
         while (true){
             try {
                 System.out.println("Hilo: " + Thread.currentThread().getId() + "--" + i++ ) ;
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
