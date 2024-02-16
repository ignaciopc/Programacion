/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea24ficheros;

/**
 *
 * @author ignac
 */
public class ferreteria extends producto {
    /**
     * En el almacén puede haber distintos tipos de productos. Para los
     * productos de ferretería se necesita saber el peso del producto y las
     * dimensiones (alto y ancho) El método toString se sobrecarga para que
     * genere el siguiente resultado: [FE001] Nombre del producto (Stock: 100),
     * Precio: 1.25€ | PVP: 2.50€ -> Ferretería: Peso 5.30kg, alto 1.23m, ancho
     * 0.51m
     */
    
    //ATRIBUTOS
    private double peso;
    private double alto;
    private double ancho;

    //CONSTRUCTOR
    public ferreteria(String n,int s ,double pc, double pv,double pes, double alt, double anch ){
        super(n, s, pc, pv);
        this.peso = pes;
        this.alto = alt;
        this.ancho = anch;
        super.setCodigo("FR"+getIncremento());
    }
    
    //GETTER Y SETTER

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }
    
    
    //TO STRING

    public String linea(){
        return super.linea()+";"+this.peso+";"+this.alto+";"+this.ancho;
    }
    @Override
    public String toString() {
        
        return super.toString()+"Ferreteria ->:Peso "+this.peso+"kg, alto"+this.alto+"m, ancho"+this.ancho;
    }
    
   
}
