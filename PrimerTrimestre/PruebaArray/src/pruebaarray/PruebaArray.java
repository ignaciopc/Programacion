/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebaarray;

import java.util.Scanner;

/**
 *
 * @author ignac
 */
public class PruebaArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //VARIABLE
        Scanner sc = new Scanner(System.in);
        int dni;
        int numdni;
        char [] letras ={
            'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'
        };
        
        System.out.println("Dime tu DNI sin la letra y te dire la letra");
        dni = sc.nextInt();
        numdni= dni%23;
        System.out.println("Tu letra del dni es: "+letras[numdni]);
        
    }
    
    
}
