/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosobjects;

import java.util.Scanner;

/**
 *
 * @author ignac
 */
public class Ejerciciosobjects {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Cafetera yow = new Cafetera();
        System.out.println(yow);
       yow.agregarCafe(1000);
       
        System.out.println(yow);
        yow.servirTaza(2000);
        System.out.println(yow);
        yow.llenarCafetera();
        System.out.println(yow);
        yow.vaciarCafetera();
        System.out.println(yow);

    }
    
}
