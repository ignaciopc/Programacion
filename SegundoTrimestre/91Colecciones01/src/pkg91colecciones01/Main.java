/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg91colecciones01;

import java.util.ArrayList;

/**
 *
 * @author ignac
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> a = new ArrayList<String>();
        a.add("Ignacio");
        a.add("Mauri");
        a.add("Vistor");
        a.add("Marta");
        a.add("Angel");

        for (String b : a) {
            System.out.println(b);
        }
    }

}
