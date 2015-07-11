/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practicahilos;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Laboratorios
 */
public class PracticaHilos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        HelloRunnable hr    = new HelloRunnable();
        /*
        
        Thread t1           = new Thread(hr);
        Thread t2           = new Thread(hr);
       
        
        t1.start();
        t2.start();
        */
        
        
        Thread[] tA = new Thread[10];
        for (int a = 0; a < tA.length; a++ ){
            //tA[a] = new Thread(hr);
            tA[a]  = new Thread(new HelloThread());
        }
        
        tA[0].setPriority(Thread.MAX_PRIORITY);
        tA[1].setPriority(Thread.MIN_PRIORITY);
        for (int a = 0; a < tA.length; a++ ){ 
            tA[a].start();
            
            try {
                //tA[a].sleep(1000);
                tA[a].join(100);
            } catch (InterruptedException ex) {
                System.out.println("ERROR !!!!!!!!!!!");
            }
            
            
            
        }
        
        
        
        
        
        
        System.out.println("hilo principal termina ::::::::::::::::::::::::::::");
        
        
    }
}
