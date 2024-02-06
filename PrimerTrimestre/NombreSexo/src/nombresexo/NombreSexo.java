/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nombresexo;

import java.util.Scanner;

/**
 *
 * @author ignac
 */
public class NombreSexo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dime tu nombre");
        String nombre = sc.nextLine();
        System.out.println("Dime tu sexo");
        String sexo = sc.nextLine();
        
        if (sexo.equals("hombre")) {
            System.out.println("Hola señor "+nombre);
        }else{
            System.out.println("Hola señora "+nombre);
        }
        
      
        
    }
    
}
