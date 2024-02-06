/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadorafunc;

import java.util.Scanner;

/**
 *
 * @author ignac
 */
public class CalculadoraFunc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion;
        int resultado;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("CALCULADORA");
            System.out.println("1/ Sumar");
            System.out.println("2/ Restar");
            System.out.println("3/ Salir");
            System.out.println("¿Que quieres hacer?");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1: //Sumar
                    System.out.println("Dame los dos numeros para sumarlos");
                    int numero1 = sc.nextInt();
                    int numero2 = sc.nextInt();
                    resultado = SumaDeNumeros(numero1,numero2);
                    System.out.println(numero1+" +"+numero2+"= "+resultado);
                    break;
                case 2: //Restar
                    System.out.println("Dame los dos numeros para sumarlos");
                    int resta1 = sc.nextInt();
                    int resta2 = sc.nextInt();
                    resultado = RestaDeNumeros(resta1,resta2);
                    System.out.println(resta1+" +"+resta2+"= "+resultado);
                    break;
                case 3: // Salir
                    
                    break;
                default:
                    System.out.println("Escribe la opcion correcta");
            }

        } while (opcion != 3);

    }

    //FUNCIONES
    //Funcion que suma dos numeros
    public static int SumaDeNumeros(int num1, int num2) {
        return  num1 + num2;
    }
    //Funcion que resta dos numeros
    public static int RestaDeNumeros(int num1, int num2) {  
        return  num1 - num2;
    }
}
