/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comparacionnumerosarray;

import java.util.Scanner;

/**
 *
 * @author ignac
 */
public class ComparacionNumerosArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //VARIABLES
        Scanner sc = new Scanner(System.in);
        double[]numeros = new double[10];
        double max=0;
        double min=0;
        //PROGRAMAS
        System.out.println("Dame 10 numeros");
        for (int i = 0; i < 10; i++) {
            numeros[i] = sc.nextDouble();
        }
       
        for (int j = 0; j < 10; j++) {
            if (j==0) {
              max= min = numeros[j];
              
            }
            if (numeros[j]>max) {
                max=numeros[j];
            }else if (numeros[j]<min) {
                min=numeros[j];
            }
        }
        System.out.println("El numero maximo es: "+max+"El numero minumo es:"+min);
    }
    
}
