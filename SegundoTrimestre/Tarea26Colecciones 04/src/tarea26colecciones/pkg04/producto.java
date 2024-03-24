/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea26colecciones.pkg04;

/**
 *
 * @author ignac
 */
public class producto implements Comparable<producto> {

    // Nombre, precio, stock y categoría
    private String nombre;
    private int precio;
    private int sotck;
    private String categoria;

    public producto(String n, int p, int s, String c) {
        this.nombre = n;
        this.precio = p;
        this.sotck = s;
        this.categoria = c;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void isNombre(String n) {
        this.nombre = n;
    }

    public int getPrecio() {
        return this.precio;
    }

    public void isPrecio(int p) {
        this.precio = p;
    }

    public int getStock() {
        return this.sotck;
    }

    public void isStock(int s) {
        this.sotck = s;
    }

    public String getCategoria() {
        return this.categoria;
    }

    public void isCategoria(String c) {
        this.categoria = c;
    }

    public String toString() {
        return "\n"+this.nombre + " " + this.categoria + " " + this.precio + " " + this.sotck+"\n";
    }

    /**
     * Crea un ArrayList de productos de una tienda de chuches y rellénalo con
     * un número cualquiera de productos (Por ejemplo 10) Para cada producto se
     * desea conocer: Nombre, precio, stock y categoría (alimentación o
     * juguetes) Después, ordena el arrayList usando en método sort según el
     * siguiente criterio: todos los productos de una misma categoría juntos
     * ordenados por stock ascendentemente (de menor a mayor) En el caso de
     * mismo stock, primero el más caro.
     */
    @Override
    public int compareTo(producto o) {

        if (this.categoria.equals(o.getCategoria())) {
            if (this.sotck == o.getStock()) {
                 if (this.precio > o.getPrecio()) {
                    return -1;
                }else{
                    return 1;
                }
            }else{
                if (this.sotck > o.getStock()) {
                    return 1;
                }else{
                    return -1;
                }
            }
        }else{
            return (this.categoria).compareTo(o.getCategoria());
        }
    }

   

}
