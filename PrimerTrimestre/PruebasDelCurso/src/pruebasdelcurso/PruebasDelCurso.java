/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebasdelcurso;

import java.util.Scanner;

/**
 *
 * @author ignac
 */
public class PruebasDelCurso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero;
        int suma = 0;
        Scanner sc = new Scanner(System.in);

        //PROGRAMA
        System.out.println("Dame un numero y te dire si la suma de sus divisores es igual a ese numero");
        numero = sc.nextInt();

        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                suma = suma + i;          
                }
            
            }
         if (suma == numero) {
                    System.out.println(numero);
        }

    }

}
