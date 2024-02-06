/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numerospares;

import java.util.Scanner;

/**
 *
 * @author ignac
 */
public class NumerosPares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero y te dire los pares hasta ese numero incluido");
        int numero = sc.nextInt();
        for (int i = 2; i <= numero; i = i + 2) {
            System.out.println(i);
        }
    }

}
