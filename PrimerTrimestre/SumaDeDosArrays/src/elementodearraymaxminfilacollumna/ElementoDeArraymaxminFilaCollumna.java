/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package elementodearraymaxminfilacollumna;

/**
 *
 * @author ignac
 */
public class ElementoDeArraymaxminFilaCollumna {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int array1[][] = new int[4][4];
        int array2[][] = new int[4][4];
        int arraySum[][] = new int[4][4];

        //Programa
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                array1[i][j] = (int) (Math.random() * 10);
                array2[i][j] = (int) (Math.random() * 10);
                arraySum[i][j] = array1[i][j] + array2[i][j];
            }

        }
        //Escribo la primera array
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(array1[i][j] + " ");
            }
            System.out.print("\n");
        }
        System.out.print("   + \n");
        
        //Escribo el segundo array

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(array2[i][j] + " ");
            }
            System.out.print("\n");
        }
        
        
        //Escribo la smuma
        System.out.println("\n");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(array1[i][j]+array2[i][j]+" ");
            }
            System.out.print("\n");
        }
    }

}
