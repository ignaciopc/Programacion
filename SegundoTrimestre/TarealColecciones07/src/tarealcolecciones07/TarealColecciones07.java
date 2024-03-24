/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarealcolecciones07;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author ignac
 */
public class TarealColecciones07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * Crea un ArrayList de animales de un zoo y rellénalo con un número
         * cualquiera de animales inventados (Por ejemplo 10). De cada animal se
         * desea saber: código identificativo, raza y peso. Después, usa el
         * método sort para ordenar la lista por peso (independientemente de la
         * raza del animal) Primero los que menos pesan. Por último, realiza
         * listados de animales antes y después de ordenarlos para comprobar que
         * se aplica bien el criterio de ordenación
         */

        ArrayList<animal> a = new ArrayList<animal>();

        animal s = new animal("", "", 12);
        animal d = new animal("", "", 78);
        animal f = new animal("", "", 43);
        animal h = new animal("", "", 5 );
        a.add(s);
        a.add(d);
        a.add(f);
        a.add(h);
        
        System.out.println(a);
        
        System.out.println("");
        
        Collections.sort(a);
        System.out.println(a);

    }

}
