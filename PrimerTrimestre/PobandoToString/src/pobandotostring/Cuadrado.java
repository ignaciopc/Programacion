/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pobandotostring;

/**
 *
 * @author ignac
 */
public class Cuadrado {

    private int lado;

    private static int numCuadrado;
    
    public static void  metodo1(){
        System.out.println("El objeto no ha sido construido todavia");
    }
    public Cuadrado(int l) {
        this.lado = l;
        this.numCuadrado++;
    }
    
    public int getNumCuadrado(){
        return this.numCuadrado;
    }
    
    public int getLado(){
        return this.lado;
    }
    
    public String toString() {
        int i, espacios;
        String resultado = "";
        for (i = 0; i < this.lado; i++) {
            resultado += "*";
        }
        resultado += "\n";
        for (i = 1; i < this.lado - 1; i++) {
            resultado += "*";
            for (espacios = 1; espacios < this.lado - 1; espacios++) {
                resultado += " ";
            }
            resultado += "*\n";
        }
        for (i = 0; i < this.lado; i++) {
            resultado += "*";
        }
        resultado += "\n";
        return resultado;
    }
}
