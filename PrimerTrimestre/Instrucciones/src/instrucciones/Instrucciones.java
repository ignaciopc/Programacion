/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package instrucciones;

import java.util.Scanner;

/**
 *
 * @author ignac
 */
public class Instrucciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        // ALTERNATIVAS
        //SIMPLES   
        /*
        if(){
            Bloque de instruciones
        }
        */
        int a = 0;
        int b = 5;
        if (a==0) {
            System.out.println("si");
        }
        if (b>0) {
            System.out.println("no");
        }
        
        //DOBLE
        if (a>0) {
            System.out.println("Es positivo");
        }else{
            System.out.println("Es negativo");
        }
        
        //MULTIPLE
        
        System.out.println("Dame tu numero");
        int valor = sc.nextInt();
        switch(valor){
            case 1:
                System.out.println("El valor es uno");
            break;
            case 2:
                System.out.println("El numero es dos");
            break;
            default:
                System.out.println("El numero no es ni 1 ni 2");
        }
     
    }
    
}
