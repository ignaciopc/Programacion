/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package llamaditas;

import java.text.DecimalFormat;

/**
 *
 * @author ignac
 */
public class movil extends terminal {

    private String tarifa;
    private double tarificados = 0;

    public movil(String n, String t) {
        super(n);
        this.tarifa = t;
        this.tarificados = 0;
    }

    public String getTarifa() {
        return tarifa;
    }

    public void setTarifa(String tarifa) {
        this.tarifa = tarifa;
    }

    public Double getTarificados() {
        return tarificados;
    }

    public void setTarificados(double t) {
        this.tarificados = t;
    }

    public String pagarLlamadas() {
        double d;
            DecimalFormat formateador = new DecimalFormat("00.00");
        if (getTarifa().equals("rata")) {
            d = getSutiempo() / 60f * 6f/100;
            setTarificados(d);
            return formateador.format(getSutiempo() / 60f * 6f/100);
        } else if (getTarifa().equals("mono")) {
            setTarificados(getSutiempo() / 60f * 12f/100);
            return formateador.format(getSutiempo()/ 60f * 12f/100);
        } else if (getTarifa().equals("bisonte")) {
             setTarificados(getSutiempo() / 60f * 6f/100);
            return formateador.format(getSutiempo()/ 60f * 30f/100);
        }
        return "";
    }

    @Override

    public String toString() {
        return super.toString()+" tarifa=" + tarifa + ", tarificados=" + getTarificados();
    }

}
