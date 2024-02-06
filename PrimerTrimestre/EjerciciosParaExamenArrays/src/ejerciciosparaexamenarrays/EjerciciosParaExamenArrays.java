/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosparaexamenarrays;

/**
 *
 * @author ignac
 */
public class EjerciciosParaExamenArrays {

    /**
     * @param args the command line arguments
     */
    
     public static int generarNumerosAleatorios(int desde, int hasta) {
        return (int) (Math.random() * (hasta - desde + 1) + desde);

    }
    public static void main(String[] args) {
        // TODO code application logic here
        /**
        //Ejercicio 10 3.1
        
        int numeros[] = new int [20];
        int finall[] = new int [20];

        int contador=0;
        for (int i = 0; i < 20; i++) {
            numeros[i] = generarNumerosAleatorios(0, 100);
        }
        
        for (int i = 0; i < 20; i++) {
            if (numeros[i]%2==0) {
                finall[contador]=numeros[i];
                contador++;
            }
        }
        for (int i = 0; i < 20; i++) {
            if (numeros[i]%2!=0) {
                finall[contador]= numeros[i];
                contador++;
            }
        }
        System.out.println("Ejercicio 10 3.1 genero 20 numeros aleatorios y primero pongo los pares y luego los impares\n");
        for (int i = 0; i < 20; i++) {
            System.out.print(finall[i]+" ");
        }
        
        
        System.out.println("Ejercicio 8 3.4 genero un tablero de ajedrez y un alfil se pone en una posicion y tengo que decir a que posiciones puede ir\n");
        
        int tableroAjedrez[][] = new int [8][8];
        int alfil = 1, posx=0,posy=0,contadorRestax=0,contadorSumay=0;
        tableroAjedrez[4][3] = alfil;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (tableroAjedrez[i][j]==1) {
                    posx=i;
                    posy=j;
                    contadorRestax = i;
                    contadorSumay = i;
                }
            }
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                int contadorDerechax = posx, contadorDerechay = posy, contadorIzquierdax=posx, contadorIzquierday= posy;
                tableroAjedrez[posx][posy] = 2;
                tableroAjedrez[contadorRestax][contadorSumay] = 2;
                tableroAjedrez[contadorDerechax][contadorDerechay] = 2;
                tableroAjedrez[contadorIzquierdax][contadorIzquierday]=2;
                contadorIzquierdax--;
                contadorIzquierday--;
                contadorDerechax++;
                contadorDerechay++;
                contadorRestax--;
                contadorSumay++;
                posx++;
                posy--;
            }
        }
        
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(tableroAjedrez[i][j]);
            }
            System.out.println("\n");
        }
        **/
        int numero = 3;
        do{
            int contador =0;
            System.out.println(contador);
            contador++;
        }while(numero ==3);
    }
    
}
