/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea2ejercicio3;

/**
 *
 * @author ignac
 */
public class Tarea2Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Variables
        int numeros[][] = new int[4][5];
        int colum[] = new int[5];
        int sumafila[] = new int[4];
        int SumaTotal = 0;
        //Meto numeros random a la array
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                int num = (int) (Math.random() * (999 - 100 + 1)) + 100;
                numeros[i][j] = num;
            }
        }
        //Guardor en en la variable sumafila las sumas de las filas en la posicion i
        //Y en la variable colum guardo todos los varoles de las filas y cuando j vale igual se le suma al que ya estaba en la posicion
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                sumafila[i] += numeros[i][j];
                colum[j] += numeros[i][j];
            }
        }
        // Escribo el array y cunado acaba pongo la suma de cada fila
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(numeros[i][j] + "\t");
            }
            System.out.print(sumafila[i]);
            System.out.println("\n");
        }
        // Pongo debajo la suma de cada columna, calculo la sumatotal y luego lo pongo al lado
        for (int i = 0; i < 5; i++) {
            System.out.print(colum[i] + "\t");
            SumaTotal += colum[i];
        }
        System.out.println(SumaTotal);
    }

}
