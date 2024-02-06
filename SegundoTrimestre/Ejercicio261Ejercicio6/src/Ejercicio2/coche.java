/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author ignac
 */
public class coche extends Vehiculo{
    
    public coche(int klc) {
        super(klc);
    }
     public int andarCoche(int r){
         setKilometrosRecorridos(getKilometrosRecorridos()+r);
        return getKilometrosRecorridos()+r ;
    }
}
