/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylist1;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author ignac
 */
public class ArrayList1 {

    /**
     * @param args the command line arguments
     */
 
    public static void main(String[] args) {
        // TODO code application logic here

        ArrayList<Gato> g = new ArrayList<Gato>();
        g.add(new Gato("Garfield", "naranja", "mestizo"));
        g.add(new Gato("Pepe", "gris", "angora"));
        g.add(new Gato("Mauri", "blanco", "manx"));
        g.add(new Gato("Ulises", "marrón", "persa"));
        g.add(new Gato("Adán", "negro", "angora"));
        Collections.sort(g);
        System.out.println("\nDatos de los gatos ordenados por nombre:");
        for (Gato gatoAux : g) {
            System.out.println(gatoAux + "\n");
        }

    }

}
