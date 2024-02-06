/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversorpesataseuros;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author ignac
 */
public class Conversorpesataseuros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //VARIABLES
            int opcion;
            float moneda;
            Scanner sc = new Scanner(System.in);
            DecimalFormat formatoeuro= new DecimalFormat("#.00");
            DecimalFormat formatopeseta = new DecimalFormat("#.000");

        //PROGRAMA
      
        
        do {
            System.out.println(" Escribe el numero 1 si quieres pasar de pesetas a euros \n Escribe el numero 2 si quieres pasar de euros a pesetas\n Escribe 3 para salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Dime el el numero de pesetas que quieres converit a euros");
                        moneda = sc.nextFloat();
                    System.out.println("El valor en euros de " + moneda + " pesetas es: " +formatoeuro.format(moneda/166.386));
                    break;
                case 2:
                    System.out.println("Dime el el numero de euros que quieres converit a pesetas");
                        moneda = sc.nextFloat();
                    System.out.println("El valor en pestas de " + moneda + " euros es : " + (formatopeseta.format(moneda * 166.386)));
                    break;
                default:
                    System.out.println("No es un una de los numeros que puedes escoger");
            }
            
                
        } while (opcion != 3);
    }

}
