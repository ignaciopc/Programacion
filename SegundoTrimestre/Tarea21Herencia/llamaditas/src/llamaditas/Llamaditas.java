/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package llamaditas;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author ignac
 */
public class Llamaditas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * movil m1 = new movil("678 11 22 33", "rata"); movil m2 = new
         * movil("644 74 44 69", "mono"); movil m3 = new movil("622 32 89 09",
         * "bisonte"); System.out.println(m1); System.out.println(m2);
         * m1.llama(m2, 320); m1.llama(m3, 200); m2.llama(m3, 550);
         * System.out.println(m1); System.out.println(m2);
         * System.out.println(m3);
         *
         *
         */
        try {
            compania vodafone = new compania("./src/llamaditas/numerosDeTelefono.txt");
              compania orange = new compania("./src/llamaditas/numerosDeTelefono.txt");

            movil m2 = new movil("123", "129");
            movil m0 = new movil("124", "129");
            movil m1 = new movil("127", "129");

            orange.aniadirCliente(m2);
            orange.aniadirCliente(m0);
            orange.aniadirCliente(m1);
             System.out.println(orange);
             orange.aniadiraltxt("./src/llamaditas/numerosDeTelefono.txt");

        } catch (IOException e) {
            
        }catch( ArrayIndexOutOfBoundsException r){
            System.out.println("YA ESTA LLENA");
        }catch(mismotelefono y){
        }

    }
    
}
