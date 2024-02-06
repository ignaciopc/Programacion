/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea2ejercicio4;

/**
 *
 * @author ignac
 */
public class Tarea2Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Variables
        int numcf[] = new int[4];
        int numeros[][] = new int[6][10];
        int max = 0, min = 0;
        //Meto numeros random desde el 0 hasta el 1000
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 10; j++) {
                int num = (int) (Math.random() * 1001);
                numeros[i][j] = num;

            }
        }
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == 0 && j == 0) {
                    max = numeros[i][j];
                    min = numeros[i][j];
                } else {
                    if (numeros[i][j] > max) {
                        max = numeros[i][j];
                        numcf[0] = i;
                        numcf[1] = j;
                    } else if (numeros[i][j] < min) {
                        min = numeros[i][j];
                        numcf[2] = i;
                        numcf[3] = j;
                    }
                }
            }
        }
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(numeros[i][j] + "\t");
            }
            System.out.println("\n ");
        }
        System.out.println("El numero maximo se encuntra en la fila " + (numcf[0] + 1) + " y en la columna " + (numcf[1] + 1));
        System.out.println("El numero minimo se encuntra en la fila " + (numcf[2] + 1) + " y en la columna " + (numcf[3] + 1));
    }

}
