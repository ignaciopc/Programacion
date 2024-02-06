/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author ignac
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //VARIABLES
        Scanner sc = new Scanner(System.in);
        int operacion;
        float num1, num2;
        //PROGRAMA

        do {
            System.out.println(" Dime 0 si quieres sumar \n Dime 1 si quieres restar \n Dime 2 si quieres multiplicar \n Dime 3 si quieres dividir\n Dime 4 para Salir");
                operacion = sc.nextInt();
            System.out.println("Ahora dime el primer  numero con el que quieres hacer la operacion");
                num1 = sc.nextFloat();
            System.out.println("Ahora dime el segundo numero");
                num2 = sc.nextFloat();
            switch (operacion) {
                case 0:

                    System.out.println("La suma de " + num1 + " " + num2 + "= " + (num1 + num2));
                    break;
                case 1:

                    System.out.println("La resta de " + num1 + " " + num2 + "= " + (num1 - num2));
                    break;
                case 2:

                    System.out.println("La multiplicacion de " + num1 + " " + num2 + "= " + (num1 * num2));
                    break;
                case 3:

                    if (num2 == 0) {
                        System.out.println("No se puede hacer una division entre 0");
                    } else {
                        System.out.println("La division de " + num1 + " " + num2 + "= " + (num1 / num2));
                    }
                    break;

                default:
                    System.out.println("No es ningun numero de operacion");
            }
        } while (operacion !=4);
    }
}
