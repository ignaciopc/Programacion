/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea26colecciones.pkg04;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author ignac
 */
public class Tarea26Colecciones04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * Crea un ArrayList de productos de una tienda de chuches y rellénalo
         * con un número cualquiera de productos (Por ejemplo 10) Para cada
         * producto se desea conocer: Nombre, precio, stock y categoría
         * (alimentación o juguetes) Después, ordena el arrayList usando en
         * método sort según el siguiente criterio: todos los productos de una
         * misma categoría juntos ordenados por stock ascendentemente (de menor
         * a mayor) En el caso de mismo stock, primero el más caro.
         *
         *
         *
         */
        ArrayList<producto> p = new ArrayList<producto>();
        producto a = new producto("hola", 15, 100, "a");
        
        producto s = new producto("hola", 15, 100, "s");
        
        producto d = new producto("hola", 15, 100, "f");

        producto f = new producto("hola", 15, 150, "a");

        producto g = new producto("hola", 19, 100, "a");
        
        producto h = new producto("hola", 15, 24, "a");

        p.add(a);
        p.add(s);
        p.add(d);
        p.add(f);
        p.add(g);
        p.add(h);
        
        Collections.sort(p);
        
        System.out.println(p);

    }

}
