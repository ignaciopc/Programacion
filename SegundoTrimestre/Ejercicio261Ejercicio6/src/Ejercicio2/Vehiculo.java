/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author ignac
 */
public class Vehiculo {
    private int vehiculosCreados = 0;
    private int kilometrosTotales;
    private int kilometrosRecorridos;

    
    public Vehiculo(int kl){
        this.vehiculosCreados = vehiculosCreados+1;
        this.kilometrosTotales += kl;
        this.kilometrosRecorridos = kl;
        
    }
    public int getVehiculosCreados() {
        return vehiculosCreados;
    }

    public void setVehiculosCreados(int vehiculosCreados) {
        this.vehiculosCreados = vehiculosCreados;
    }

    public int getKilometrosTotales() {
        return kilometrosTotales;
    }

    public void setKilometrosTotales(int kilometrosTotales) {
        this.kilometrosTotales = kilometrosTotales;
    }

    public int getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }

    public void setKilometrosRecorridos(int kilometrosRecorridos) {
        this.kilometrosRecorridos = kilometrosRecorridos;
    }

}
