/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package letradeldni;

import java.util.Scanner;

/**
 *
 * @author ignac
 */
public class LetraDelDni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int dni,numero;
        System.out.println("Dame tu DNI y te dire tu letra");
        dni = sc.nextInt();
        numero = dni%23;
        
        switch(numero){
            case 0:
                System.out.println("Tu letra del DNI es T");
            break;
              case 1:
                System.out.println("Tu letra del DNI es R");
            break;
              case 2:
                System.out.println("Tu letra del DNI es W");
            break;
              case 3:
                System.out.println("Tu letra del DNI es A");
            break;
              case 4:
                System.out.println("Tu letra del DNI es G");
            break;
             case 5:
                System.out.println("Tu letra del DNI es M");
            break;
              case 6:
                System.out.println("Tu letra del DNI es Y");
            break;
              case 7:
                System.out.println("Tu letra del DNI es F");
            break;
              case 8:
                System.out.println("Tu letra del DNI es P");
            break;
              case 9:
                System.out.println("Tu letra del DNI es D");
            break;
            case 10:
                System.out.println("Tu letra del DNI es X");
            break;
              case 11:
                System.out.println("Tu letra del DNI es B");
            break;
              case 12:
                System.out.println("Tu letra del DNI es N");
            break;
              case 13:
                System.out.println("Tu letra del DNI es J");
            break;
              case 14:
                System.out.println("Tu letra del DNI es Z");
            break;
             case 15:
                System.out.println("Tu letra del DNI es S");
            break;
              case 16:
                System.out.println("Tu letra del DNI es Q");
            break;
              case 17:
                System.out.println("Tu letra del DNI es V");
            break;
              case 18:
                System.out.println("Tu letra del DNI es H");
            break;
              case 19:
                System.out.println("Tu letra del DNI es L");
            break;
             case 20:
                System.out.println("Tu letra del DNI es C");
            break;
              case 21:
                System.out.println("Tu letra del DNI es K");
            break;
              case 22:
                System.out.println("Tu letra del DNI es E");
            break;
        } 
    }
    
}
