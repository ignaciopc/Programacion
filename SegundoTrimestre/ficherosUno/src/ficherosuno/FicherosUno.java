/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ficherosuno;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author ignac
 */
public class FicherosUno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        int contador = 0;
        /**
         * try {
         *
         * BufferedReader br = new BufferedReader(new
         * FileReader("./src/ficherosuno/holaquetalestas.txt")); String linea =
         * ""; while (linea != null) { for (int i = 0; i < linea.length(); i++)
         * { if (linea.charAt(i) == 'a' || linea.charAt(i) == 'e' ||
         * linea.charAt(i) == 'e' || linea.charAt(i) == 'o' || linea.charAt(i)
         * == 'u') { contador++; } } linea = br.readLine();
         *
         * }
         * br.close(); System.out.println(contador); } catch
         * (FileNotFoundException fnfe) { // qué hacer si no se encuentra el
         * fichero System.out.println("No se encuentra el fichero malaga.txt");
         * } catch (IOException ioe) { // qué hacer si hay un error en la
         * lectura del fichero System.out.println("No se puede leer el fichero
         * malaga.txt"); }
         *
         */

        /**
         * if (linea.indexOf(pl) >= 0) { contador++; l = linea.substring(3); if
         * (l.equals(pl)) { contador++; } }
         */
        //REALiza un programa en java q lea de un fichero de texto y te diga cuantas veces aparece una palabra en indicada por el usuario dentro del fichero. La palabara a buscar, debera
        //ser introducida por teclado. Ademas, la busqueda no sera sensible a mayuscula. Ejemplo : Hola == HOLA
        BufferedReader br = new BufferedReader(new FileReader("./src/ficherosuno/holaquetalestas.txt"));
        String linea = "";
        String cadena[] = new String[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime que palabra quieres buscar");
        String pl = sc.nextLine();
        String l = "";
        linea = br.readLine();
        int n = pl.length();
        
        while (linea != null) {
            cadena = linea.split(" ");

            for (int i = 0; i < cadena.length; i++) {
                if (cadena[i].toUpperCase().indexOf(pl.toUpperCase()) >= 0) {
                    contador++;
                    l = cadena[i].toUpperCase().substring(cadena[i].indexOf(pl)+n);
                    if (l.indexOf(pl.toUpperCase()) >= 0) {
                        contador++;
                    }
                    l ="";

                }

            }

            linea = br.readLine();
        }
        br.close();
        System.out.println(contador);

    }

}
