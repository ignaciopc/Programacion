/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea1ejercicio1;

import java.util.Scanner;

/**
 *
 * @author ignac
 */
public class Tarea1ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //VARIABLES
        Scanner sc = new Scanner(System.in);
        int numero;
        
        //PROGRAMA
        
        System.out.println("Dame un numero y te dire:\n"
                + "Si es multiplo de 2 o de 3.\n"
                + "Si es multiplo de 2 y de 3 simultaneamente.\n"
                + "Si es multiplo de 2 pero no de 3.\n"
                + "Si no es multiplo de 2 ni de 3.");
        numero = sc.nextInt();

      if ((numero % 2 == 0) || (numero % 3 == 0)) {
            System.out.println(numero + " es multiplo de 2 o de 3");
            if ((numero % 2 == 0) && !(numero % 3 == 0)) {
                System.out.println(numero + " es multiplo de 2 pero no de 3");
            }else if((numero % 2 == 0) && (numero % 3 == 0)){
                System.out.println(numero+" es multiplo de 2 y 3 simultaneamente");
            }
        } else if (!(numero % 2 == 0) && !(numero % 3 == 0)) {
            System.out.println(numero + " no es multiplo de 2 ni de 3");
        }
    }
}
