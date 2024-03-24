/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea24ficheros;

import java.io.IOException;

/**
 *
 * @author ignac
 */
public class Tarea24Ficheros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        /**
         * producto r = new ferreteria( "tornillo", 100, 54, 60, 180, 120, 43);
         * producto t = new ferreteria( "tornillo", 100, 54, 60, 180, 120, 43);
         * producto te = new textil("Gucci", 120, 15, 150, "M", "azul");
         * producto el = new electronica("Nevera", 13, 100, 150,
         * "Electrodomestico");
         */
        try{           
        producto p = new ferreteria("tuerca", 43, 9.31, 54.7, 123, 0.54, 1.4);
        almacenamiento al = new almacen("productosFich.txt");
        producto t = new electronica("batidora", 300, 5.5, 7.8, "coco");
        al.add(p);
        al.add(t);
        al.delete("FR1");
        al.salvar("productosFich.txt");
        System.out.println(al);  
        }catch(IOException e){
            
        }
    }

}
