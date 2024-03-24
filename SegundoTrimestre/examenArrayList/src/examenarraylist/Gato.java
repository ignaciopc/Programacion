/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenarraylist;

/**
 *
 * @author ignac
 */
public class Gato implements Comparable<Gato> {

    private String nombre;
    private String color;
    private String raza;
    int cosa;

    public Gato(String nombre, String color, String raza, int v) {
        this.nombre = nombre;
        this.color = color;
        this.raza = raza;
        this.cosa = v;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public String toString() {
        return "\nNombre: " + this.nombre + "\nColor: " + this.color + "\nRaza: " + this.raza+"\nNumero "+this.cosa;
    }

    public String getColor() {
        return color;
    }

    public int getC() {
        return cosa;
    }

    public int compareTo(Gato gas) {
        return Integer.compare( gas.getC(),this.cosa);
    }

}
