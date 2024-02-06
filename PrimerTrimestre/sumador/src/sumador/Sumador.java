/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumador;

import java.util.Scanner;

/**
 *
 * @author ignac
 */
public class Sumador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        //Variables
        int num1,num2;
        
        //Zona de inicio del programa
        System.out.println("Dime 2 números para sumarlos");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        
        System.out.println("La suma de "+num1+" + "+num2+" es "+(num1+num2) );
    }
    
}
