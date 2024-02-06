/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;

/**
 *
 * @author ignac
 */
public class Funciones {

    public static int generarNumerosAleatorios(int desde, int hasta) {
        return (int) (Math.random() * (hasta - desde + 1) + desde);

    }

    public static void generaArrayInt(int array[], int max, int min) {

        for (int i = 0; i < array.length; i++) {

            int random = generarNumerosAleatorios(min, max);
            array[i] = random;
        }

    }

    public static int minimoArrayInt(int array[]) {
        int minimo = array[0];
        for (int i = 1; i < array.length; i++) {
            if (minimo > array[i]) {
                minimo = array[i];

            }

        }
        return minimo;

    }

    public static int maximoArrayInt(int array[]) {
        int maximo = array[0];
        for (int i = 1; i < array.length; i++) {
            if (maximo < array[i]) {
                maximo = array[i];

            }

        }
        return maximo;
    }

    public static int mediaArrayInt(int array[]) {
        int media = 0;
        for (int i = 0; i < array.length; i++) {
            media += array[i];
        }
        return media / array.length;
    }

    public static boolean estaEnArrayInt(int array[], int num) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                return true;
            }
        }
        return false;
    }

    public static int posicionEnArray(int array[], int num) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                return i;
            }
        }
        return -1;
    }

    public static void volteaArray(int array[]) {

        for (int i = 0; i < array.length / 2; i++) {
            int tmp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = tmp;
        }
    }

    public static void rotaDerechaArrayInt(int array[], int pos) {
        for (int i = 0; i < array.length; i++) {
            int tmp2;
            int tmp = array[i];
            tmp2 = array[i + pos];
            array[i + pos] = tmp;
            
        }
    }
}
