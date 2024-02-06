/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multiplos;

import java.util.Scanner;

/**
 *
 * @author ignac
 */
public class Multiplos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //VARIABLES
        int numero;
        Scanner sc = new Scanner(System.in);
        
        //PROGRAMA
        System.out.println("Dame un numero y te dire los divisores");
        numero = sc.nextInt();
                
        for (int i=1;i <=numero; i++) {
            if (numero%i==0) {
                System.out.println(i);
            }
        }
    }
    
}
