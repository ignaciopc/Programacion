/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea26colecciones06;

import java.util.ArrayList;

/**
 *
 * @author ignac
 */
public class Tarea26Colecciones06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * Crea un ArrayList de libros de una biblioteca y rellénalo con un
         * número cualquiera de libros inventados (Por ejemplo 10). De cada
         * libro se desea saber: ISBN, título, editorial, nº de páginas y
         * género. Después, recorre el ArrayList y muestra un listado en el que
         * aparezca por cada editorial el número de libros que hay, el máximo
         * número de páginas y el mínimo. Ejemplo de lo que se muestra en
         * pantalla:
         *
         * Editorial RAMA -> 2 libros en total; MAS EXTENSO: 200 páginas; MENOS
         * EXTENSO: 50 páginas Editorial ANAYA -> 5 libros en total; MAS
         * EXTENSO: 250 páginas; MENOS EXTENSO: 150 páginas Editorial PARANINFO
         * -> 3 libros en total; MAS EXTENSO: 2050 páginas; MENOS EXTENSO: 1150
         * páginas
         *
         *
         */

        ArrayList<libro> lib = new ArrayList<libro>();
        libro a = new libro("1", "a", "aa", 150, "j");
        libro s = new libro("2", "f", "ss", 10, "j");
        libro d = new libro("3", "d", "ff", 540, "j");
        libro f = new libro("4", "f", "aa", 12, "j");
        libro g = new libro("5", "a", "ff", 900, "j");

        lib.add(a);
        lib.add(s);
        lib.add(d);
        lib.add(f);
        lib.add(g);

        ArrayList<String> edit = new ArrayList<String>();
        ArrayList<Integer> mpag = new ArrayList<Integer>();
        ArrayList<Integer> minpag = new ArrayList<Integer>();

        for (libro n : lib) {
            if (!edit.contains(n.getEditorial())) {
                edit.add(n.getEditorial());
            }
        }

        for(String o: edit){
            int pm=0;
            int mm=0;
            int cont = 0;
            
            for(libro h : lib){
                if (o.equals(h.getEditorial())) {
                    if (cont ==0) {
                        pm = h.getNpag();
                        mm = h.getNpag();
                        cont++;
                    }else{
                        if (h.getNpag()> pm) {
                            pm = h.getNpag();
                        }else if(h.getNpag()< mm){
                            mm = h.getNpag();
                        }
                    }
                }
            }
            mpag.add(pm);
            minpag.add(mm);
        }

        for (int i = 0; i < edit.size(); i++) {
            System.out.println(edit.get(i) + " Mayor numero de paginas  ->" + mpag.get(i) + " Menor numero de paginas ->" + minpag.get(i));
        }
    }

}
