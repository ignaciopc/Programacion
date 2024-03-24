/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea26colecciones3;

import java.util.ArrayList;

/**
 *
 * @author ignac
 */
public class Tarea26Colecciones3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ArrayList<coche> cochera = new ArrayList<coche>();

        ArrayList<String> marca = new ArrayList<String>();
        ArrayList<String> pesoMaximo = new ArrayList<String>();
        ArrayList<String> pesoMinimo = new ArrayList<String>();
        ArrayList<String> velocidad = new ArrayList<String>();

        coche a = new coche("Citroen", "c4", 1200, 1000);
        coche s = new coche("Opel", "corsa", 400, 1500);
        coche d = new coche("Hawei", "p30", 6500, 400);
        coche f = new coche("Linuz", " ubuntu", 90, 970);
        coche g = new coche("Tesla", " mac", 145, 86);
        coche h = new coche("Lexus", " coco", 500, 39);
        coche j = new coche("Tesla", "for", 13, 23);
        coche Y = new coche("Citroen", "C5", 500, 4500);

        cochera.add(a);
        cochera.add(s);
        cochera.add(d);
        cochera.add(f);
        cochera.add(g);
        cochera.add(h);
        cochera.add(j);
        cochera.add(Y);

        for (coche u : cochera) {

            if (!marca.contains(u.getMarca())) {
                marca.add(u.getMarca());
            }
        }

        for (String fu : marca) {
            int cont = 0;
            int pesmin = 0;
            int pesmax = 0;
            int vel = 0;
            for (coche u : cochera) {

                if (u.getMarca().equals(fu)) {
                    if (cont == 0) {
                        pesmax = u.getPeso();
                        pesmin = u.getPeso();
                        vel = u.getVelocidadMax();
                        cont++;
                    } else {
                        if (u.getPeso() > pesmax) {
                            pesmax = u.getPeso();
                        }
                        if (u.getPeso() < pesmin) {
                            pesmin = u.getPeso();
                        }
                        vel += u.getVelocidadMax();
                    }

                }

            }
            pesoMaximo.add("" + pesmax);
            pesoMinimo.add("" + pesmin);

        }
        System.out.println(marca);
        System.out.println(pesoMaximo);
        System.out.println(pesoMinimo);
    }

}
