/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea4programacionorientadaaobjetos;

import java.util.Random;

/**
 *
 * @author ignac
 */
public class Tarea4ProgramacionOrientadaAObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        baraja b = new baraja();
        b.robar();
        b.barajar();
        b.eligeCarta();
        System.out.println(b.mostrar(5));
        

      
    }

}
