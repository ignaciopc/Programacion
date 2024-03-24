/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea26colecciones3;

/**
 *
 * @author ignac
 */
public class coche {
    
    private String marca;
    private String modelo;
    private int velocidadMax;
    private int peso;
    
    public coche(String m, String mo, int vm, int p){
        this.marca = m;
        this.modelo = mo;
        this.velocidadMax = vm;
        this.peso = p;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(int velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    
    public String toString(){
        return getMarca()+""+getModelo()+" "+getVelocidadMax()+" "+getPeso();
    }
    
}
