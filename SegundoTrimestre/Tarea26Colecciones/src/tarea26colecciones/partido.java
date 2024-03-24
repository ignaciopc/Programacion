/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea26colecciones;

/**
 *
 * @author ignac
 */
 public class partido {
    private String equipoA;
    private String equipoB;
    private int golA;
    private int golB;
    
    public partido(String pA,String pB,int gA,int gB){
        this.equipoA = pA;
        this.equipoB = pB;
        this.golA = gA;
        this.golB = gB;
    }

    public String getEquipoA() {
        return equipoA;
    }

    public void setEquipoA(String equipoA) {
        this.equipoA = equipoA;
    }

    public String getEquipoB() {
        return equipoB;
    }

    public void setEquipoB(String equipoB) {
        this.equipoB = equipoB;
    }

    public int getGolA() {
        return golA;
    }

    public void setGolA(int golA) {
        this.golA = golA;
    }

    public int getGolB() {
        return golB;
    }

    public void setGolB(int golB) {
        this.golB = golB;
    }

   public String toString(){
       return this.equipoA +" "+this.golA+" - "+this.equipoB +" "+this.golB;
   }

 
   
}
