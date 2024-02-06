/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea22excepciones;

/**
 *
 * @author ignac
 */
public class equipo {

    private jugador pe[] = new jugador[11];

    public equipo() {
        for (int i = 0; i < pe.length; i++) {
            pe[i] = null;
        }
    }

    public void aniadirJugador(jugador j) throws mismoJugadorExpecion {
        int contador = 0;
        boolean bandera = false;
        for (int i = 0; i < pe.length; i++) {
            if (pe[i] == j) {
                throw new mismoJugadorExpecion();
            }
        }
        do {

            if (pe[contador] == null) {
                pe[contador] = j;
                bandera = true;
            }
            contador++;
        } while (!bandera);
    }

    public void borrarJugador(jugador j) {
        for (int i = 0; i < pe.length; i++) {
            if (pe[i] == j) {
                pe[i] = null;
            }
        }
    }

    @Override
    public String toString() {
        String cadena = "";
        for (int i = 0; i < pe.length; i++) {
            if (pe[i] != null) {
                cadena += pe[i].getNomApel() + "\n";
            }
        }
        return cadena;
    }

}
