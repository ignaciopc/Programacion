/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trasponerfrase;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author ignac
 */
public class TrasponerFrase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {

            BufferedReader br = new BufferedReader(new FileReader("traspuesto.txt"));
            BufferedWriter bw1 = new BufferedWriter(new FileWriter("terminado.txt"));

            String linea = "";
            String total = "";
            while (linea != null) {
                total = linea;
                for (int i = total.length(); i >= 0; i--) {
                    if (i - 1 >= 0) {
                        bw1.write(total.charAt(i - 1));
                    }
                }
                bw1.write("\n");
                linea = br.readLine();
            }

            bw1.close();
            br.close();
        } catch (IOException e) {
            System.out.println("No puedo leer el fichero");
        }
    }

}
