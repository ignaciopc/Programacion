/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea2ejercicio1;

/**
 *
 * @author ignac
 */
public class Tarea2Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Variables
        int numero[] = new int[20];
        int cuadrado[] = new int[20];
        int cubo[] = new int[20];
        //Inicializo el array numero con numeros random
        for (int i = 0; i < 20; i++) {
            int num = (int) (Math.random()*101);
            numero[i]= num;
        }
       System.out.println("Numero:\t\tCuadrado:\tCubo:");
       //Recorro el array dando los valores del  array numero al array cuadrado y cubo y los imprimo por pantalla
        for (int i = 0; i < 20; i++) {
         cuadrado[i] = numero[i]*numero[i]; 
         cubo[i] = numero[i]*numero[i]*numero[i];
            System.out.println(numero[i]+"\t\t"+cuadrado[i]+"\t\t"+cubo[i]);
        }
        

    }
    
}
