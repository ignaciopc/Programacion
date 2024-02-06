/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;

/**
 *
 * @author ignac
 */
public class Pizza {

    private String tamanio;
    private String tipo;
    private String estado;
    private static int totalDePizzapedido;
    private static int totalDePizzaServido;

    public Pizza(String t, String ti) {
        this.tamanio = t;
        this.tipo = ti;
        this.estado = "pedida";
        totalDePizzapedido++;
    }

    //Getter y setter
    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {

        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public static int getTotalDePizzapedido() {
        return totalDePizzapedido;
    }

    public void setTotalDePizzapedido(int totalDePizzapedido) {
        this.totalDePizzapedido = totalDePizzapedido;
    }

    public static int getTotalDePizzaServido() {
        return totalDePizzaServido;
    }

    public void setTotalDePizzaServido(int totalDePizzaServido) {
        this.totalDePizzaServido = totalDePizzaServido;
    }

    //Metdodo para comprobar
    public static boolean comprobarPizza(String t, String ti) {
        if (t.equalsIgnoreCase("mediana") || t.equalsIgnoreCase("GRANDE")) {
            if (ti.equalsIgnoreCase("Margarita") || ti.equalsIgnoreCase("Cuatro queso") || ti.equalsIgnoreCase("funghi")) {
                return true;
            }
        }
        return false;
    }

    //Metodo para servir
    public void servir() {
        if (!getEstado().equalsIgnoreCase("servida")) {
            totalDePizzaServido++;
            setEstado("servida");

        }
    }

    @Override
    public String toString() {
        return "Pizza{" + "tamanio=" + tamanio + ", tipo=" + tipo + ", estado=" + getEstado() + '}';
    }

}
