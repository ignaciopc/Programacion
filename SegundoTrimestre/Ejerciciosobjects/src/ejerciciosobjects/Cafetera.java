/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosobjects;

/**
 *
 * @author ignac
 */
public class Cafetera {
    //VARIABLES
    private int capacidadMaxCaf;
    private int cantidadActual;
    
    //CONSTRUCTOR POR DEFECTO
    public Cafetera(){
        this.capacidadMaxCaf=1000;
        this.cantidadActual=0;
    }
    //CONSTRUCTOR CON LA CAPACIDAD ACTUAL IGUAL QUE LA MAXIMA
     public Cafetera(int cmc){
         this.capacidadMaxCaf=cmc;
         this.cantidadActual = cmc;
     }
     // Constructor con la capacidad maxima y la cantidad actual. Si lacantidad actual es mayor que la capacidad maxima de la cafetera,la ajustara al maximo. 
     public Cafetera(int cmc, int ca){
         if (cmc>ca) {
             this.capacidadMaxCaf=cmc;
             this.cantidadActual=ca;
         }else{
             this.capacidadMaxCaf=cmc;
             this.cantidadActual=cmc;
         }
     }
     //GETTER Y SETTER

    public int getCapacidadMaxCaf() {
        return capacidadMaxCaf;
    }

    public void setCapacidadMaxCaf(int capacidadMaxCaf) {
        this.capacidadMaxCaf = capacidadMaxCaf;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
     
    //METODO PARA LLENAR LA CAFETERA
    public void llenarCafetera(){
        this.cantidadActual = this.capacidadMaxCaf;
    }
    
   //METODO PARA SERVIR UNA TAZA
    public void servirTaza(int a){
        if (a>this.cantidadActual) {
            this.cantidadActual=0;
        }else{
            this.cantidadActual -= a;
        }
    }
    //METODO PARA VACIAR LA CAFETERA
    public void vaciarCafetera(){
        this.cantidadActual=0;
    }
    
    //METODO PARA AGREGAR CAFE
    
    public void agregarCafe(int a){
        this.cantidadActual+=a;
    }

    @Override
    public String toString() {
        return "Cafetera{" + "capacidadMaxCaf=" + capacidadMaxCaf + ", cantidadActual=" + cantidadActual + '}';
    }
    
}
