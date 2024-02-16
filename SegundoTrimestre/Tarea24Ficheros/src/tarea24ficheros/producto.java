/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea24ficheros;

/**
 *
 * @author ignac
 */
public class producto {

    /**
     * La clase producto representa cualquier producto genérico que se puede
     * almacenar en el almacén. Todos los productos tienen un código, nombre,
     * stock, precio de compra y precio de venta. También se necesitarán los
     * siguientes métodos en producto: Un constructor que reciba todos los datos
     * como parámetro menos el código de producto que será generado de forma
     * automática (AUTO_INCREMENT) Ver apartado 5 getters y setters toString que
     * imprima los datos del producto en este formato: [PR001] Nombre del
     * producto (Stock: 100), Precio: 1.25€ | PVP: 2.50€
     */
    
    //ATRIBUTOS
    private String codigo;
    private String nombre;
    private int stock;
    private double preciocompra;
    private double precioventa;
    private static int incremento=0; 
    
    //CONSTRUCTOR
    public producto( String n,int s ,double pc, double pv ) {
        this.nombre = n;
        this.codigo = "PR"+incremento;
        this.stock = s;
        this.preciocompra = pc;
        this.precioventa = pv;
        incremento++;
    }
    
    //GETTER Y SETTER

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPreciocompra() {
        return preciocompra;
    }

    public void setPreciocompra(float preciocompra) {
        this.preciocompra = preciocompra;
    }

    public double getPrecioventa() {
        return precioventa;
    }

    public void setPrecioventa(float precioventa) {
        this.precioventa = precioventa;
    }

    public static int getIncremento() {
        return incremento;
    }

    public static void setIncremento(int incremento) {
        producto.incremento = incremento;
    }
    
    public String linea(){
        return getCodigo()+";"+ this.nombre+";"+ this.stock+";"+this.preciocompra+";"+this.precioventa;
    }
    public String toString(){
        return "["+getCodigo()+"] " + this.nombre+" (Stock: "+this.stock+"),"+"Precio: "+this.preciocompra+"| PVP: "+this.precioventa;
    }
    

}
