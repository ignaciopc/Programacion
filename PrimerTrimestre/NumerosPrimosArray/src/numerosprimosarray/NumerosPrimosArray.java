/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numerosprimosarray;

import java.time.Duration;

/**
 *
 * @author ignac
 */
public class NumerosPrimosArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] numeros = new int[100];
        int contador = 1;
        int saltos;
        // Inicializo los valores del array del 1 al 100
        for (int i = 0; i < 100; i++) {
            numeros[i] = contador++;
        }
        // Aplico el algoritmo de Eratóstenes
        for (int k = 1; k < 100; k++) {
            if (numeros[k] != 0) {
                saltos=numeros[k];
                for (int j = numeros[k]; j <100; j+=saltos) {
                    if (j != numeros[k]) {
                        numeros[j-1] = 0;
                    }
                }
            }
        }
        // Muestro en pantalla los numeros primos
        for (int i = 0; i < 100; i++) {
            if (numeros[i] != 0) {
                System.out.println(numeros[i]);
            }
        }


    }

}
