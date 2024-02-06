/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio261ejercicio6;

import Ejercicio2.Bicicleta;
import Ejercicio2.coche;
import Ejercicio5.Pizza;
import Ejercicio6.tiempo;
import java.util.Scanner;

/**
 *
 * @author ignac
 */
public class Ejercicio261Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //EJERCICIO 5
        /**
         * Pizza p1 = new Pizza("margarita", "mediana"); Pizza p2 = new
         * Pizza("funghi", "familiar"); p2.servir(); Pizza p3 = new
         * Pizza("cuatro quesos", "mediana"); System.out.println(p1);
         * System.out.println(p2); System.out.println(p3); p2.servir();
         * System.out.println("pedidas: " + Pizza.getTotalDePizzapedido());
         * System.out.println("servidas: " + Pizza.getTotalDePizzaServido());
         */
        //EJERCICIO 6
        
        tiempo t = new tiempo(1,30,50);
        tiempo r = new tiempo(1,20,40);
        t.suma(r);
        // 50 + 40 = 90; -> /60 1.5 
        System.out.println(t);
        float tr;
        tr = 45/30;
        System.out.println(tr);
    }
}
