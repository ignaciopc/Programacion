/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioexamenarray01;

import java.util.ArrayList;

/**
 *
 * @author ignac
 */
public class EjercicioExamenArray01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * Guarda en un arraylist el resultado de los partidos de la liga. Para
         * ello crea una clase partido que almacene el nombre de los dos equipos
         * que han jugado y el resultado final. Crea un main donde añadas al
         * arraylist algunos partidos y después se muestre el nombre del equipo
         * y el número de goles marcados del equipo que más goles ha marcado en
         * la liga.
         */

        ArrayList<partido> liga = new ArrayList<partido>();
        partido g = new partido("a", "b", 10, 14);
        partido h = new partido("c", "p", 10, 14);
        partido j = new partido("v", "m", 10, 14);
        partido k = new partido("a", "z", 10, 14);

        ArrayList<String> fina = new ArrayList<String>();

        liga.add(g);
        liga.add(h);
        liga.add(j);
        liga.add(k);

        System.out.println(liga);

        for (partido o : liga) {
            if (!fina.contains(o.getEquipo1())) {
                fina.add(o.getEquipo1());
            }
            if (!fina.contains(o.getEquipo2())) {
                fina.add(o.getEquipo2());
            }
        }

        int cont = 0;
        for (String yu : fina) {
            int e1 = 0;

        }
        fina.add(cont, "" + cont);

        System.out.println(fina);
    }

}
