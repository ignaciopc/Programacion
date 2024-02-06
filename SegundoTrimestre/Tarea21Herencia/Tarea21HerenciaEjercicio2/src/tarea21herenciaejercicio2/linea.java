/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea21herenciaejercicio2;

/**
 *
 * @author ignac
 */
public class linea extends punto {
    
    int xl;
    int yl;
    public linea (punto p, punto l){
        super(p.getXp(), p.getYp());
        this.xl=l.getXp();
        this.yl=l.getYp();
    } 

    public int getXl() {
        return xl;
    }

    public void setXl(int xl) {
        this.xl = xl;
    }

    public int getYl() {
        return yl;
    }

    public void setYl(int yl) {
        this.yl = yl;
    }
    
    public double calcularLongitud(){
       return Math.sqrt(Math.pow((xl-getXp()),2 )+Math.pow((yl-getYp()),2 ));
    }
    
    public double calcularPendiente(){
        
        return (yl-getYp())/(xl-getXp());
    }
}
