/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea1ejercicio3;

import java.util.Scanner;

/**
 *
 * @author ignac
 */
public class Tarea1ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //VARIABLES
        Scanner sc = new Scanner(System.in);
        int numero, fi1 = 0, fi2 = 1, fi3 = 0;

        //PROGRAMA
        System.out.println("Dime un numero y te dire los n primeros términos de la serie de Fibonacci");
        numero = sc.nextInt();
        for (int contador = 0; contador < numero; contador++) {
            if (contador == 0) {
                System.out.println("0");
            } else {
                fi3 = fi1 + fi2;
                fi2 = fi1;
                fi1 = fi3;
                System.out.println(fi3);
            }

        }

    }

}
