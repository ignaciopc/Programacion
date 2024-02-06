/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package circuloejercicio53;

/**
 *
 * @author ignac
 */
public class Circulo {

    private final double pi = 3.1415;
    private double radio;

    // Constructor normal
    public Circulo(double ra) {
        this.radio = ra;
    }
    //Constructor copia 
    public Circulo(Circulo r){
        this.radio = r.getRadio();
    }
    //GETTER
    public double getRadio(){
        return this.radio;
    }
    //SETTER
    public void setRadio(double ra){
        this.radio = ra;
    }
    
    //AREA DEL CIRCULO 
    
    public double areaDelCirculo(){
        return pi*(getRadio()*getRadio());
    }
    
    // LONGITUD DEL CIRULO
    
    public double longitudDelCirculo(){
        return 2*pi*getRadio();
    }
}
