/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pobandotostring;

/**
 *
 * @author ignac
 */
public class Persona {
    
    private int dni;
    private char NumDni;
    private String nombre;
    
    public static boolean compruebaDNI(int ND , char le){
        char[] letras ={'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','R','E'};
 
        return letras[ND%23]==le;
    }
    public Persona(int d,char nd, String n){
        this.dni = d;
        this.NumDni = nd;
        this.nombre = n;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
    
    public char getNumDni(){
        return NumDni;
    }
     public void setNumDni(char nd) {
        this.NumDni = nd;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
     
    
    
}
