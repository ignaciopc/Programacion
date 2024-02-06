/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia1;

/**
 *
 * @author ignac
 */
public class Persona {

    private String dni;
    private String nombre;
    private String apellidos;
    private float peso;
    private int edad;

    public Persona(String d, String n, String a, float p, int e) {
        this.dni = d;
        this.nombre = n;
        this.apellidos = a;
        this.peso = p;
        this.edad = e;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
     public String toString(){
        String aux;
        aux = "Datos personales\n";
        aux += "------------------\n";
        aux += "DNI: " + this.dni + "\n";
        aux += "Nombre: " + this.nombre + this.apellidos + "\n";
        aux += "Peso: " + this.peso + "\n";
        aux += "Edad: " + this.edad + "\n";
        return aux;
    }
    
}
////