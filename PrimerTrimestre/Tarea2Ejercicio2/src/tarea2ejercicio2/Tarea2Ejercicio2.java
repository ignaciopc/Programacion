/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea2ejercicio2;

import java.util.Scanner;

/**
 *
 * @author ignac
 */
public class Tarea2Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Varibles
        int numeros[] = new int[15];
        int num;
        Scanner sc = new Scanner(System.in);

        //Meto los valores al array
        for (int i = 0; i < 15; i++) {
            System.out.println("Dame un numero");
            num = sc.nextInt();
            if (i == 14) {
                numeros[0] = num;
            } else {
                numeros[i+1] = num;
            }
        //Recorro el array  y lo escribo
        }
        for (int i = 0; i < 15; i++) {
            System.out.print(numeros[i]+", ");
        }

    }

}
