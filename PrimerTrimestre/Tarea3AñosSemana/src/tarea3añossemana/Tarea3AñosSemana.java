/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea3añossemana;

import Funciones.AñoBsitioMes;
import java.util.Scanner;

/**
 *
 * @author ignac
 */
public class Tarea3AñosSemana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println(AñoBsitioMes.esBisiesto(100));
        System.out.println(AñoBsitioMes.numDiasMes(2022, 4));
        System.out.println(AñoBsitioMes.fechaCorrecta(29, 2, 2024));
        System.out.println(AñoBsitioMes.numDíasRestantes(15, 4, 2023));
        System.out.println(AñoBsitioMes.numDiasTranscurridos(14, 1, 2023));
        int anio, anio2, dia, dia2, mes, mes2;
        do {
            System.out.println("PROGRAMA DIFERENCIA DE FECHAS");
            System.out.println("La primera fecha tiene que ser mayor que la primera");
            System.out.println("Dame un dia, 1 mes, y 1 año");
            dia = sc.nextInt();
            mes = sc.nextInt();
            anio = sc.nextInt();
            System.out.println("Dame otro dia, mes y año");
            dia2 = sc.nextInt();
            mes2 = sc.nextInt();
            anio2 = sc.nextInt();
        } while (anio > anio2);

        if (anio != anio2) {
            int totalAnio = anio2 - anio;
            int total = 0;

            for (int i = 1; i < totalAnio; i++) {
                if (AñoBsitioMes.esBisiesto(anio + i)) {
                    total += 366;
                } else {
                    total += 365;
                }
            }
            System.out.println("El total es " + (total + (AñoBsitioMes.numDíasRestantes(dia, mes, anio)) + AñoBsitioMes.numDiasTranscurridos(dia2, mes2, anio2)));
        } else {
            if (mes> mes2) {
                System.out.println("Hay una diferencia de " + (AñoBsitioMes.numDiasTranscurridos(dia, mes, anio)-AñoBsitioMes.numDiasTranscurridos(dia2, mes2, anio2)));
            } else {
                System.out.println("Hay una diferencia de " + (AñoBsitioMes.numDiasTranscurridos(dia2, mes2, anio2) - AñoBsitioMes.numDiasTranscurridos(dia, mes, anio)));
            }
        }
    }

}
