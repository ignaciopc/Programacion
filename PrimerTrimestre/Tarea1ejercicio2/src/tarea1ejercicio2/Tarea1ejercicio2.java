/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea1ejercicio2;

import java.util.Scanner;

/**
 *
 * @author ignac
 */
public class Tarea1ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //VARIABLE
        Scanner sc = new Scanner(System.in);
        int horas;
        int extras;
        //PROGRAMA 
        
        System.out.println("Dame el numero de horass que trabajas y te dire tu salario");
        horas = sc.nextInt();        
        if (horas<=40) {
            if (horas<0) {
                System.out.println("No puedes trabajar horas negativas");
            }else{
                System.out.println(horas+"h a 12€ = "+(horas*12)+"€");
                System.out.println("TOTAL nomina :"+(horas*12)+"€");
            }
        }else{
            extras = horas-40;
            System.out.println(" 40h a 12€ = "+(40*12)+"€");
            System.out.println(extras+"h a 16€ ="+(extras*16)+"€");
            System.out.println("Total nomina :"+((40*12)+(extras*16)));
        }
        
    }
    
}
