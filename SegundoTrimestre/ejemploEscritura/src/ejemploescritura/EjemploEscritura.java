/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemploescritura;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author ignac
 */
public class EjemploEscritura {

    /**
     * @param args the command line arguments
     *
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("fruta.txt"));
            bw.write("naranjasa\n");
            bw.write("oglasdaaa");
            bw.close();

            BufferedReader br = new BufferedReader(new FileReader("fruta.txt"));
            String cadena = "";
            String linea = "";

            while (linea != null) {
               
                cadena += linea;

                linea = br.readLine();;
            }
            br.close();
            cadena = cadena.replace('a', '@');
            BufferedWriter bw2 = new BufferedWriter(new FileWriter("fruta.txt"));
            
           bw2.write(cadena);
           bw2.close();
        } catch (IOException ioe) {
            System.out.println("No se ha podido escribir en el fichero");
        }
    }

}
