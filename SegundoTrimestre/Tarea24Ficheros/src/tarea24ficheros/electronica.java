/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea24ficheros;

/**
 *
 * @author ignac
 */
public class electronica extends producto {

    String categoria;
    public electronica(String n,int s ,double pc, double pv,String c){
        super(n, s, pc, pv);
        this.categoria = c;
        setCodigo("EL"+getIncremento());

    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
     public String linea(){
        return super.linea()+";"+this.categoria;
    }
    
    public String toString(){
        return super.toString()+"-> Electronica:"+this.categoria;
    }
}
