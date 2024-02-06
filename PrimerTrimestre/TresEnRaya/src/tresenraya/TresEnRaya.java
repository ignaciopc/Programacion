/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tresenraya;

/**
 *
 * @author ignac
 */
public class TresEnRaya {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char[][] tablero = new char[3][3];
        int contador = 2;
        char fila1 = 'j', fila2 = 'k', columna1 = 'l', columna2 = 'k', diagona1 = 'p', diagonal2 = 'o', diagonal3 = 'p', diagonal4 = 'o', diagonal5 = 'p';
        //Inicializo el tablero aleatoriamente

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                //  aleatorio = (int) (Math.random() * 2);
                //  if (aleatorio == 0) {
                //      tablero[i][j] = 'O';
                //  } else { 
                //      tablero[i][j] = 'X';
                //  }
                //Lo de abajo es lo mismo que lo de arriba
                tablero[i][j] = (int) (Math.random() * 2) == 0 ? '0' : 'X';
            }
        }

        //Compruebo donde hay 3 en raya
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 0) {
                    fila1 = tablero[i][j];
                    columna1 = tablero[j][i];
                    if (j == i) {
                        diagona1 = tablero[i][j];

                    }
                } else if (j == 1) {
                    fila2 = tablero[i][j];
                    columna2 = tablero[j][i];
                    if (j == i) {
                        diagonal2 = tablero[i][j];
                    }
                } else {
                    if (j == i) {
                        diagonal3 = tablero[i][j];
                    }
                    if (fila1 == fila2 && fila1 == tablero[i][j]) {
                        System.out.println("hay tres en raya de fila");
                    }
                    if (columna1 == columna2 && columna1 == tablero[j][i]) {
                        System.out.println("hay tres en raya de columna");
                    }
                }
            }
            if (diagona1 == diagonal2 && diagona1 == diagonal3) {
                System.out.println("hay tres en raya de diagonal");
            }
            if (i == 0) {
                diagonal4 = tablero[i][contador];
                contador--;
            } else if (i == 1) {
                diagonal5 = tablero[i][contador];
                contador--;
            } else {
                if (diagonal4 == diagonal5 && diagonal4 == tablero[i][contador]) {
                    System.out.println("hay tres en raya de diagonal");
                }
            }
        }
        //Muestro por pantalla
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println("\n");
        }
    }

}
