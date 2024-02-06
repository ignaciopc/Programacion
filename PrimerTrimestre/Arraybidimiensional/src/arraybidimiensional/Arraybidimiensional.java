/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraybidimiensional;

/**
 *
 * @author ignac
 */
public class Arraybidimiensional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int array1 [][] = new int [3][4];
        
        //inicializacion
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <4; j++) {
                array1[i][j] = 2-i;
            }
        }
        
        // mostrar por pantalla
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(array1[i][j] + " ");
            }
            System.out.println("\n");
        }
    }

}
