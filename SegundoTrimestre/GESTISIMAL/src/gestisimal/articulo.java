/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestisimal;

/**
 *
 * @author ignac
 */
public class articulo {
    
    private String codigo;
    private String descripcion;
    private float precioCompra;
    private float precioVenta;
    private int stock;
    
    public articulo(String c, String d, float pc, float pv, int s){
        this.codigo = c;
        this.descripcion = d;
        this.precioCompra = pc;
        this.precioVenta = pv;
        this.stock = s;
    }
    
    //Getter y Setter

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(float precioCompra) {
        this.precioCompra = precioCompra;
    }

    public float getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(float precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "articulo{" + "codigo = " + codigo + ", descripcion = " + descripcion + ", precioCompra = " + precioCompra + ", precioVenta = " + precioVenta + ", stock = " + stock + '}';
    }
    
    
    
    
}
