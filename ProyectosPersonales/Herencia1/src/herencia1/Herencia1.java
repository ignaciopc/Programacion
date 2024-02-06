/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herencia1;

/**
 *
 * @author ignac
 */
public class Herencia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona ignacio = new Persona("2", "ignacio", "palomar", 1, 2);
        System.out.println(ignacio);
        
        Policia coco = new Policia("2", "ignacio", "palomar", 1, 2 ,"teniente", 123);
        System.out.println(coco);
    }
    
}
