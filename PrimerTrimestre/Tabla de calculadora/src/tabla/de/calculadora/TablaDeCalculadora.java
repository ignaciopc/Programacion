/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tabla.de.calculadora;

import java.util.Scanner;

/**
 *
 * @author ignac
 */
public class TablaDeCalculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //VARIABLE
        Scanner sc = new Scanner(System.in);
        int num;
        //Programa
        System.out.println("Dime el numero del que quieres hacer la tabla de multiplicacion");
        num = sc.nextInt();
        for (int contador = 0; contador <= 10; contador++) {
            System.out.println(contador+"*"+num+"= "+(contador*num));
        }
    }
    
}
