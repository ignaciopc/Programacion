/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author ignac
 */
public class Bicicleta extends Vehiculo {
    
    public Bicicleta(int k){
        super(k);
    }
    public int andarBici(int r){
         setKilometrosRecorridos(getKilometrosRecorridos()+r);
        return getKilometrosRecorridos()+r ;
    }
}
