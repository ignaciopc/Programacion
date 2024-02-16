/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea24ficheros;

/**
 *
 * @author ignac
 */
public class textil extends producto{
    /**
     * Para los productos de textil hay que saber la talla y el color. El método
     * toString se sobrecarga para que genere el siguiente resultado: [TE001]
     * Nombre del producto (Stock: 100), Precio: 1.25€ | PVP: 2.50€ -> Textil:
     * Talla XL, Color verde
     */
    
    //ATRIBUTOS
    private String talla;
    private String color;
    
    //CONSTRUCTOR
    public textil(String n,int s ,double pc, double pv,String tll, String col){
        super(n, s, pc, pv);
        this.talla = tll;
        this.color = col;
        setCodigo("TE"+getIncremento());
    }

    // GETTER Y SETTER
    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

     public String linea(){
        return super.linea()+";"+this.talla+";"+this.color;
    }
    //TO STRING
    public String toString(){
        return super.toString()+"-> Textil: Talla "+this.talla+", Color "+this.color;
    }
}
