/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio6;

/**
 *
 * @author ignac
 */
public class tiempo {

    private int hora;
    private int minuto;
    private int segundo;

    public tiempo(int hor, int min, int sec) {
        this.hora = hor;
        this.minuto = min;
        this.segundo = sec;

    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    public void suma(tiempo sumar) {
        double er;
        //Hago la suma de segundos
        setMinuto(getMinuto() + ((getSegundo() + sumar.getSegundo()) / 60));
        er = (getSegundo() + sumar.getSegundo()) / 60 ;
        int pe = (int)er;
                setSegundo(pe);
    }

    @Override
    public String toString() {
        return "tiempo{" + "hora=" + hora + ", minuto=" + minuto + ", segundo=" + segundo + '}';
    }

}
