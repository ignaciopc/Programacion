/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea26colecciones2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ignac
 */
public class Tarea26Colecciones2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * Scanner sc = new Scanner(System.in); ArrayList<persona> personitas =
         * new ArrayList<persona>(); persona a = new persona("Ignacio", "p",
         * "c", 20); persona s = new persona("Mauri", "d", "p", 19); persona d =
         * new persona("Vistor", "s", "m", 10); persona f = new persona("Mast",
         * "g", "l", 12); persona g = new persona("lac", "n", "c", 20);
         *
         * personitas.add(a); personitas.add(s); personitas.add(d);
         * personitas.add(f); personitas.add(g);
         *
         * System.out.println("Dime una edad para borrar a las personas menores
         * de esa edad"); int ed = sc.nextInt();
         *
         * personitas.removeIf( k -> k.getEdad() <= ed);
         *
         * System.out.println(personitas);
         */

        /**
         * Guarda en un arrayList un número cualquiera de personas (Por ejemplo
         * 10) Para cada persona se desea saber: Nombre, apellido1, apellido2 y
         * edad. Después, se pedirá por teclado una edad cualquiera que se usará
         * para borrar a todas las personas que hay en el arrayList menores o
         * iguales a esa edad. Usa el método removeIf. Por último, muestra en
         * pantalla el arrayList para comprobar que se han borrado.
         */
        ArrayList<persona> p = new ArrayList<persona>();
        persona a = new persona("a", "", "", 10);
        persona s = new persona("s", "", "", 20);
        persona d = new persona("d", "", "", 30);
        persona f = new persona("f", "", "", 40);
        
        p.add(a);
        p.add(s);
        p.add(d);
        p.add(f);
        
        p.removeIf(o -> o.getEdad()<=30);
        
        System.out.println(p);

    }

}
