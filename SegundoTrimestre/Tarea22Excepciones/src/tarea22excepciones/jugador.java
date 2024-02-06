/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea22excepciones;

/**
 *
 * @author ignac
 */
public class jugador {

    private int partido[] = new int[38];
    private int dorsal;
    private String nomApel = "";

    public jugador(String na, int dor) throws dorsalNegativoExcepcion{

        if (dor < 0) {
            throw new dorsalNegativoExcepcion();
        }
        this.dorsal = dor;
        this.nomApel = na;

        for (int i = 0; i < partido.length; i++) {
            partido[i] = -1;
        }
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getNomApel() {
        return nomApel;
    }

    public void setNomApel(String nomApel) {
        this.nomApel = nomApel;
    }


    public void aniadirgolesporPartido(int p, int g) throws golesNegativosExcepcion {
        if (g < 0) {
            throw new golesNegativosExcepcion();
        }
        partido[p] += g + 1;

    }

    public int obtenerGoles(int p) {
        return partido[p];
    }

    @Override
    public String toString() {
        String cadena = "";
        for (int i = 0; i < partido.length; i++) {
            if (partido[i] != -1) {
                cadena += i + "   -   " + partido[i] + "\n";
            }
        }
        return "Dorsal -> " + dorsal + "\nNombre y Apellido -> " + nomApel + "\nPartido ---> Goles\n" + cadena;
    }

}
