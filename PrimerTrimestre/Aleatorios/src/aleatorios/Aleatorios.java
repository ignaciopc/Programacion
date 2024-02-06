/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aleatorios;

/**
 *
 * @author ignac
 */
public class Aleatorios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int m=10;
        int n=3;
         // System.out.println((int)(Math.random()*10)); // Para tener numeros aleatorios del 0 al 10 quitando el 10. Pero como el math random da
                                                        // solo del 0 al 1 sin inculuirlo pues tienes que correr la coma 1 vez para solo tener 1 numero
                                                        // y si pones int lo trunca y quita los decimales
    
   
        System.out.println((int)((Math.random()*m-n+1))+n);
        
        
    
    }
    
}
