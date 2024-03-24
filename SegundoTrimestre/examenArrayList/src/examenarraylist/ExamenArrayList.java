/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenarraylist;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author ignac
 */
public class ExamenArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Ejercicio 01
        System.out.println("EJERCICIO 01 \n -----------");
        ArrayList<String> alumnos = new ArrayList<String>();

        alumnos.add("Ignacio");
        alumnos.add("Mauri");
        for (String a : alumnos) {
            System.out.println(a);
        }

        //Ejercicio 02
        ArrayList<Integer> numAle = new ArrayList<Integer>();
        double aleatorio = Math.random();
        int aln = (int) Math.random() * 100;
        int numMax = 0;
        int numMin = 0;
        int media = 0;
        aleatorio = (int) (aleatorio * 100);
        System.out.println(aleatorio);
        for (int i = 0; i < aleatorio; i++) {
            numAle.add(aln);
            if (i == 0) {
                numMax = aln;
                numMin = aln;
                media = aln;
            } else {
                if (aln > numMax) {
                    numMax = aln;
                } else if (aln < numMin) {
                    numMin = aln;
                }
                media += aln;

            }

        }
        System.out.println("El numero maximo es :" + numMax + "\n El numero minimo es :" + numMin + "\n La media es " + media / aleatorio);

        //Ejercicio 03
        System.out.println("Ejercicio 03\n------------");
        ArrayList<Integer> num = new ArrayList<Integer>();
        int valorDado = (int) Math.floor(Math.random() * 10 + 1);

        System.out.println(valorDado);
        for (int j = 0; j < 10; j++) {
            int v = (int) Math.floor(Math.random() * 10 + 1);

            num.add(v);
            System.out.println(v);
        }
        Collections.sort(num);
        System.out.println(num);

        //Ejercicio 04
        System.out.println("Ejercicio 04\n------------");

        System.out.println(alumnos);
        alumnos.add("Alvaro");
        alumnos.add("Coco");
        alumnos.add("Zuela");
        Collections.sort(alumnos);
        System.out.println(alumnos);

        //Ejercicio gatos
        
        System.out.println("\n\n\n");
        ArrayList<Gato> g = new ArrayList<Gato>();
        g.add(new Gato("BBBBBBBBB", "naranja", "mestizo",1));
        g.add(new Gato("AAAAAAAA", "gris", "angora",100));
        g.add(new Gato("ZZZZZZZZZZ", "blanco", "manx",10));
        g.add(new Gato("IIIIIIIIIII", "marrón", "persa",60));
        g.add(new Gato("LLLLLLLLLLLL", "negro", "angora",76));
        
        System.out.println(g);
        
        Collections.sort(g); 
        System.out.println("\n");
        System.out.println(g);
    }

}
