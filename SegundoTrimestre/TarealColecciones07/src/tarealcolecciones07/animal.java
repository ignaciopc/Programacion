/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarealcolecciones07;

/**
 *
 * @author ignac
 */
public class animal implements Comparable<animal>{
    private String ident;
    private String raza;
    private int peso;
    
    public animal(String i, String r, int p){
        this.ident = i;
        this.raza = r;
        this.peso = p;
    }

    public String getIdent() {
        return ident;
    }

    public void setIdent(String ident) {
        this.ident = ident;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "animal{" + "ident=" + ident + ", raza=" + raza + ", peso=" + peso + '}';
    }

    @Override
    public int compareTo(animal o) {  
        if (this.peso < o.getPeso()) {
            return -1;
        }else{
            return 1;
        }
    }
    
}
