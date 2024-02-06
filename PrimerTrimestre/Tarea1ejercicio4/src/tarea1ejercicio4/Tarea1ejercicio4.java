/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea1ejercicio4;

/**
 *
 * @author ignac
 */
public class Tarea1ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //VARIABLE
        int numero = 2;
        int contador = 0;
        int suma = 0;
        String div = new String(" ");
        //PROGRAMA

        do {
            for (int i = 1; i < numero; i++) {
                if (numero % i == 0) {
                    suma += i;
                    div +=i+" ";
                }
            }
            if (suma == numero) {
                System.out.print("\nEl numero perfecto es: "+numero+" y sus divisores son: ");
                System.out.println(div);
                contador++;
            }
            suma = 0;
            numero++;
            div = "";
        } while (contador != 3);
    }
}
