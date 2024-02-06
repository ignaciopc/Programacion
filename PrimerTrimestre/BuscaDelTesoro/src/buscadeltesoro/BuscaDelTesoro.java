/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buscadeltesoro;

import java.util.Scanner;

/**
 *
 * @author ignac
 */
public class BuscaDelTesoro {

    /**
     * @param args the command line arguments
     */
    public static void rellanaL(char[][] t) {
        //Relleno la array de L
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 10; j++) {
                t[i][j] = 'L';
            }
        }
    }

    public static int generarNumerosAleatorios(int desde, int hasta) {
        return (int) (Math.random() * (hasta - desde + 1) + desde);

    }

    // Colocar bomba y tesoro
    public static void colocaBT(char[][] ta) {
        int posBombax = generarNumerosAleatorios(0, 5);
        int posBombay = generarNumerosAleatorios(0, 5);
        int posTesorox, posTesoroy;

        ta[posBombax][posBombay] = '*';
        do {
            posTesorox = generarNumerosAleatorios(0, 9);
            posTesoroy = generarNumerosAleatorios(0, 9);

        } while (posBombax == posTesorox && posBombay == posTesoroy);
        ta[posTesorox][posTesoroy] = 'T';
    }

    public static int buscaTesoroX(char[][] t) {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 10; j++) {
                if (t[i][j] == 'T') {
                    return i;
                }
            }
        }
        return 0;

    }
    //Funcion para buscar donde esta la posicion de t

    public static int buscaTesoroY(char[][] t) {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 10; j++) {
                if (t[i][j] == 'T') {
                    return j;
                }
            }
        }
        return 0;

    }

    //Funcion para mostrar el tablero
    public static void mostrarTablero(char[][] t, boolean ocultar) {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 10; j++) {
                if (ocultar == false) {
                    System.out.print(t[i][j] + " ");
                } else {
                    if (t[i][j] == 'T' || t[i][j] == '*') {
                        System.out.print("L" + " ");
                    } else {
                        System.out.print(t[i][j] + " ");
                    }
                }
            }
            System.out.println("\n");
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        //Variables
        char[][] mapa = new char[6][10];
        boolean termina = false;
        Scanner sc = new Scanner(System.in);
        int posx, posy;
        int contador = 3;

        //Llamo al procedimiento que rellana el array de L
        rellanaL(mapa);
        //Pongo la bomba posBombay el tesoro
        colocaBT(mapa);

        do {

            //Pido por pantalla donde va a ir la bomba posBombay compruebo si acierta
            System.out.println("Dame la posicion de la X a a la que quieres disparar");
            posx = sc.nextInt();
            System.out.println("Dame la posicion de la Y a a la que quieres disparar");
            posy = sc.nextInt();
            //Compruebo si en la posicion X e Y que me han dado esta el tesoro para saber si ha ganado
            //o para saber si ha caido en la bomba posBombay ha perdido
            //y para saber donde ha disparado el posBombay mostrarlo por pantalla
            if (mapa[buscaTesoroX(mapa)][posy] == 'T') {
                System.out.println("HAS GANADO, HAS ENCONTRADO EL TESORO");
                termina = true;
            } else if (mapa[posx][posy] == '*') {
                System.out.println("HAS PERDIDO, LE HAS DADO A LA BOMBA");
                termina = true;
            } else {
                mostrarTablero(mapa, true);
                //Aqui escribo por pantalla las ayudas para saber donde esta la bomba         
                if (posx > buscaTesoroX(mapa) && posy > buscaTesoroY(mapa)) {
                    System.out.println("El tesoro esta en una fila de arriba y en una de las columnas de la izquierda");
                } else if (posx > buscaTesoroX(mapa) && posy < buscaTesoroY(mapa)) {
                    System.out.println("El tesoro esta en una fila de arriba y en una de las columnas de la derecha");
                } else if (posx < buscaTesoroX(mapa) && posy > buscaTesoroY(mapa)) {
                    System.out.println("El tesoro esta en una fila de abajo y en una de las columnas de la izquierda");
                } else if (posx < buscaTesoroX(mapa) && posy < buscaTesoroY(mapa)) {
                    System.out.println("El tesoro esta en una fila de abajo y en una de las columnas de la derecha");
                } else if (posx == buscaTesoroX(mapa) && posy > buscaTesoroY(mapa)) {
                    System.out.println("El tesoro esta en la misma fila y en una de las columnas de la izquierda");
                } else if (posx == buscaTesoroX(mapa) && posy < buscaTesoroY(mapa)) {
                    System.out.println("El tesoro esta en la misma fila y en una de las columnas de la derecha");
                } else if (posx < buscaTesoroX(mapa) && posy == buscaTesoroY(mapa)) {
                    System.out.println("El tesoro esta en una fila de arriba y la misma columna");
                } else if (posx > buscaTesoroX(mapa) && posy == buscaTesoroY(mapa)) {
                    System.out.println("El tesoro esta en una fila de abajo y la misma columna");
                }
            }
            contador--;
            if (contador == 0) {
                mostrarTablero(mapa, false);
                termina = true;
            }

        } while (termina != true);
    }

}
