/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio5.cuentacorriente;

/**
 *
 * @author ignac
 */
public class CCuentaCorriente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        
        //INSTANCIA DE LA CLASE 
        cuenta cuenta1 = new cuenta("Ignacio Palomar Chacon", "7878787", 6.5, 1000);
        cuenta cuenta2 = new cuenta("Marcelo Diaz Perez", "23", 6.5, 1500);
        cuenta cuenta3 = new cuenta();

        if (cuenta1.transferencia(200, cuenta2)) {
            System.out.println("La cuenta 1 tiene " + cuenta1.getSaldo() + " y la cuenta 2 tiene " + cuenta2.getSaldo());
        } else {
            System.out.println("no");
        }

        System.out.println(cuenta1.getCliente());
        cuenta1.setCliente("Lola Flores");
        System.out.println(cuenta1.getCliente());

        if (cuenta1.reintegro(100)) {
            System.out.println(cuenta1.getSaldo());
        } else {
            System.out.println("No se ha podido hacer el reintegro con esa cantidad");
        }
        if (cuenta1.ingreso(400)) {
            System.out.println("Te hemos echo el ingreso tontito y tienes " + cuenta1.getSaldo());
        } else {
            System.out.println("Te quedas pobre");
        }
    }

}
