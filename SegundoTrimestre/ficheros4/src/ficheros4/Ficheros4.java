/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ficheros4;

import java.io.File;

/**
 *
 * @author ignac
 */
public class Ficheros4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File f = new File(".");
        String fichero[] = f.list();
        
        for (String ficheract : fichero) {
            System.out.println(ficheract);
        }
    }
    
}
