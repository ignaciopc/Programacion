/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prub;

/**
 *
 * @author ignac
 */
public class Prub {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String cadena="";
        int n = 5;
   for (int j = 0; j < n; j++) {
                 cadena += "+-------+\t";
            }
            cadena+="\n";
            for (int j = 0; j < n; j++) {
                    cadena += "| " + 5 + "     |\t";
            }
            
            cadena+="\n";
            for (int j = 0; j < n; j++) {
                    cadena += "|       |\t";
            }
            
            cadena+="\n";
            
            for (int j = 0; j < n; j++) {
              cadena += "|   O   |\t";
            }
            cadena+="\n";
            
            for (int j = 0; j < n; j++) {
              cadena += "|       |\t";
            }
            cadena+="\n";
            
            for (int j = 0; j < n; j++) {
               cadena += "|     " +5 + " |\t";
            }
            cadena+="\n";
            
            for (int j = 0; j < n; j++) {
                    cadena += "+-------+\t";
            }
            System.out.println(cadena);
    }
}
