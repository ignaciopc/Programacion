/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package biblotecaarray;

/**
 *
 * @author ignac
 */
import Array.Funciones;
public class BiblotecaArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("EJERCICIO 20");
        int [] array = new int [10];
          Funciones.generaArrayInt(array, 23, 10);
        for (int i = 0; i < 10; i++) {
            System.out.print(array[i]+" ");
        }
        
        System.out.println("\n\nEJERCICIO 21");
        int array2[] = new int [10];
        for (int i = 0; i < 10; i++) {
            array2[i]= Funciones.generarNumerosAleatorios(0, 100);
            System.out.print(array2[i]+" ");
        }
        System.out.println("\n"+Funciones.minimoArrayInt(array2));
        
        
        System.out.println("\n\nEJERCICIO 22");
        int array3[] = new int [10];
        for (int i = 0; i < 10; i++) {
            array3[i]= Funciones.generarNumerosAleatorios(0, 100);
            System.out.print(array3[i]+" ");
        }
        System.out.println("\n"+Funciones.maximoArrayInt(array3));
        
        
        
        System.out.println("\n\nEJERCICIO 23");
        int array4[] = new int [10];
        for (int i = 0; i < 10; i++) {
            array4[i]= Funciones.generarNumerosAleatorios(0, 100);
            System.out.print(array4[i]+" ");
        }
        System.out.println("\n"+Funciones.mediaArrayInt(array4));
        
         System.out.println("\n\nEJERCICIO 24");
        int array5[] = new int [10];
        for (int i = 0; i < 10; i++) {
            array5[i]= Funciones.generarNumerosAleatorios(0, 100);
            System.out.print(array5[i]+" ");
        }
        System.out.println("\n"+Funciones.estaEnArrayInt(array5,10));
        
        System.out.println("\n\nEJERCICIO 25");
        int array6[] = new int [10];
        for (int i = 0; i < 10; i++) {
            array6[i]= Funciones.generarNumerosAleatorios(0, 100);
            System.out.print(array6[i]+" ");
        }
        System.out.println("\n"+Funciones.posicionEnArray(array6,10));
        
        System.out.println("\n\nEJERCICIO 26");
         int array7[] = new int [10];
        for (int i = 0; i < 10; i++) {
            array7[i]= Funciones.generarNumerosAleatorios(0, 100);
            System.out.print(array7[i]+" ");
        }
        System.out.println("\n\n");
        Funciones.volteaArray(array7);
        for (int i = 0; i < 10; i++) {
            System.out.print(array7[i]+" ");
        }
    }
    }
    
    
    

