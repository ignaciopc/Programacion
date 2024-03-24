/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg92colecciones02;

import java.util.ArrayList;

/**
 *
 * @author ignac
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static int Aleatorio(int desde, int hasta) {
        return (int) (Math.random() * (hasta - desde + 1) + desde);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> b = new ArrayList<Integer>();

        int buc = Aleatorio(10, 20);
        for (int i = 0; i < buc; i++) {
            b.add(Aleatorio(0, 100));
        }
        int suma = 0;
        int max = b.get(0);
        int min = b.get(0);
        
        for (Integer t : b) {
            //2
            //3
            //5
            //
            //suma += 2;
            suma += t;

            if (max < t) {
                max = t;
            } else if (min > t) {
                min = t;
            }

        }
        System.out.println(b);
        System.out.println("La suma es " + suma);
        System.out.println("El maximo es " + max);
        System.out.println("El minimo es " + min);
        System.out.println("La media es "+suma/buc);

    }

}
