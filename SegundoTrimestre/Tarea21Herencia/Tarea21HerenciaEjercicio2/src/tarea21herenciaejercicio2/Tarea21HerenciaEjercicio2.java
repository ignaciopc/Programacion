/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea21herenciaejercicio2;

/**
 *
 * @author ignac
 */
public class Tarea21HerenciaEjercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        punto p = new punto(20, 10);
        punto l = new punto(5,40);
        
        linea r = new linea(p, l);
        System.out.println(r.calcularPendiente());
    }
    
}
