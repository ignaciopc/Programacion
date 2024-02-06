/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cafetera;

/**
 *
 * @author ignac
 */
public class Funciones {
    
    private int cantidadMaxima;
    private int cantidadActual;


    public Funciones(){
        cantidadMaxima = 1000;
        cantidadActual = 0;
    }
    
    public Funciones(int cm){
        this.cantidadActual = cm;
        this.cantidadMaxima = cm;
    }
    
    public Funciones(int cm, int ca){
        if (ca>cm) {
            this.cantidadActual = ca;
            this.cantidadMaxima = ca;
        }else{
         this.cantidadActual = ca;
         this.cantidadMaxima = cm;        
        }
    }

    public int getCantidadMaxima() {
        return cantidadMaxima;
    }

    public void setCantidadMaxima(int cantidadMaxima) {
        this.cantidadMaxima = cantidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    
    public void llenarCafetera(){
        this.cantidadActual = getCantidadMaxima();
    }
    
    public void servirTaza(int st){
        this.cantidadActual -= st; 
    }
    
    public void vaciarCafetera(){
        this.cantidadActual = 0;
    }
    
    public void agregarCafe(int cafe){
        this.cantidadActual += cafe; 
    }
}
