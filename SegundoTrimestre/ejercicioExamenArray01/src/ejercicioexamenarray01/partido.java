/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioexamenarray01;

/**
 *
 * @author ignac
 */
public class partido {
    private String equipo1;
    private String equipo2;
    private int golEquipo1;
    private int golEquipo2;
    
    public partido(String e1, String e2, int g1, int g2){
        this.equipo1 = e1;
        this.equipo2 = e2;
        this.golEquipo1 = g1;
        this.golEquipo2 = g2;
    }

    public String getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(String equipo1) {
        this.equipo1 = equipo1;
    }

    public String getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(String equipo2) {
        this.equipo2 = equipo2;
    }

    public int getGolEquipo1() {
        return golEquipo1;
    }

    public void setGolEquipo1(int golEquipo1) {
        this.golEquipo1 = golEquipo1;
    }

    public int getGolEquipo2() {
        return golEquipo2;
    }

    public void setGolEquipo2(int golEquipo2) {
        this.golEquipo2 = golEquipo2;
    }
    
    
    public String toString(){
        return "Equipo 1 "+this.equipo1 + " - "+this.golEquipo1 + " Equipo 2 "+this.equipo2+ " - "+this.golEquipo2+"\n";
    }
    
    
}
