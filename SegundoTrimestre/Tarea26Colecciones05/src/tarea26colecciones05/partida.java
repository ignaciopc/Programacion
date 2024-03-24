/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea26colecciones05;

/**
 *
 * @author ignac
 */
public class partida {
    /**
     *  Para ello, crea una clase partida
         * que guarde que ha sacado cada uno de los dos jugadores (jugador1:
         * piedra, papel o tijera y jugador2: piedra, papel o tijera
     */
    private String jugador1;
    private String jugador2;
    private String tipo1;
    private String tipo2;
    
    public partida(String j1, String j2, String t1, String t2){
        this.jugador1 = j1;
        this.jugador2 = j2;
        this.tipo1 = t1;
        this.tipo2 = t2;
    }

    @Override
    public String toString() {
        return "\npartida{" + "jugador1=" + jugador1 + ", jugador2=" + jugador2 + ", tipo1=" + tipo1 + ", tipo2=" + tipo2 + "}\n";
    }

    public String getJugador1() {
        return jugador1;
    }

    public void setJugador1(String jugador1) {
        this.jugador1 = jugador1;
    }

    public String getJugador2() {
        return jugador2;
    }

    public void setJugador2(String jugador2) {
        this.jugador2 = jugador2;
    }

    public String getTipo1() {
        return tipo1;
    }

    public void setTipo1(String tipo1) {
        this.tipo1 = tipo1;
    }

    public String getTipo2() {
        return tipo2;
    }

    public void setTipo2(String tipo2) {
        this.tipo2 = tipo2;
    }
    
    
}
