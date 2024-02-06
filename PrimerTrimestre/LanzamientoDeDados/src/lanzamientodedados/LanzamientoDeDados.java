/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lanzamientodedados;

/**
 *
 * @author ignac
 */
public class LanzamientoDeDados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int m = 6;
        int n = 1;
        int num1, palo;
        String nombres = "";
        String cartas = "";

        for (int i = 0; i < 3; i++) {

            num1 = (int) ((Math.random() * 12 - 1 + 1)) + 1;
            palo = (int) ((Math.random() * 4 - 1 + 1)) + 1;

            switch (palo) {
                case 1:
                    nombres = "oro";
                    break;
                case 2:
                    nombres = "copas";
                    break;
                case 3:
                    nombres = "espadas";
                    break;
                case 4:
                    nombres = "bastos";
                    break;
            }
            switch (num1) {
                case 1:
                    cartas = "as";
                    break;
                case 10:
                    cartas = "sota";
                    break;
                case 11:
                    cartas = "caballo";
                    break;
                case 12:
                    cartas = "rey";
                    break;
                
            }
            System.out.println(nombres+"   "+cartas);
        }

    }

}
