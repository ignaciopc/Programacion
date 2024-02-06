/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comparacionnumeros;

import java.util.Scanner;

/**
 *
 * @author ignac
 */
public class ComparacionNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //variables
        int mayor=0, menor=0;
        int numero;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ve dandome numeros de uno a uno y te dire al final cual es el mayor y cual el menor");
        for (int i = 0; i < 5; i++) {
         numero = sc.nextInt();
            if (i==0) {
                mayor = numero;
                menor = numero;
            }else
            if(numero>mayor) {
             mayor = numero;
            }else{
                menor = numero;
            }
        }
        System.out.println("El mayor es "+mayor+"el menor es "+menor);

        
    }
    
}
