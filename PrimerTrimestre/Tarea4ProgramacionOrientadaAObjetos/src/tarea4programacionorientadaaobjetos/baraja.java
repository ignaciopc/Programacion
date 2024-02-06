/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea4programacionorientadaaobjetos;

import java.util.Random;
import tarea4programacionorientadaaobjetos.carta;

/**
 *
 * @author ignac
 */
public class baraja {
    //Atributos de la clase baraja

    private carta mazo[] = new carta[48];
    private int numCartas = 48;

    //Constructor del mazo
    public baraja() {

        for (int i = 0; i < 12; i++) {

            mazo[i] = new carta(i + 1, 'O');
            mazo[i + 12] = new carta(i + 1, 'C');
            mazo[i + 24] = new carta(i + 1, 'E');
            mazo[i + 36] = new carta(i + 1, 'B');
        }
    }

    //Metodo para hacer que la carta que me dan la pongo la primera y las demas por debajo
    public baraja(carta c) {
        carta copia[] = new carta[48];
        for (int i = 0; i < 12; i++) {
            copia[i] = new carta(i + 1, 'O');
            copia[i + 12] = new carta(i + 1, 'C');
            copia[i + 24] = new carta(i + 1, 'E');
            copia[i + 36] = new carta(i + 1, 'B');
        }

        mazo[0] = c;

        for (int i = 1; i < 48; i++) {
            if (copia[i] != c) {
                mazo[i] = copia[i];
            }
        }
    }

    //Metodo para barajar aleatoriamente
    public void barajar() {

        for (int i = 0; i < 48; i++) {
            Random random = new Random();
            int numRandom = random.nextInt(48);

            carta c;
            c = mazo[numRandom];
            mazo[numRandom] = mazo[i];
            mazo[i] = c;
        }
    }

    public void cortar(int n) {
        carta copia[] = new carta[48];
        int contador = 0;

        for (int i = 0; i < 48; i++) {
            copia[i] = mazo[i];
        }

        for (int i = n; i < 48; i++) {
            mazo[contador] = copia[i];
            contador++;
        }
        for (int i = 0; i < n; i++) {
            mazo[contador] = copia[i];
            contador++;
        }
    }

    public carta robar() {

        for (int i = 0; i < 48; i++) {
            if (i != 47) {
                if (mazo[i].isRobada() == false) {
                    mazo[i].setRobada(true);
                    this.numCartas--;
                    return mazo[i];
                }
            } else {
                if (mazo[i].isRobada() == false) {
                    this.numCartas--;
                    return mazo[i];
                } else {
                    return null;
                }
            }

        }
        return null;
    }

    public carta eligeCarta() {
        Random random = new Random();
        int numRandom = random.nextInt(48);
        if (numCartas == 0) {
            return null;
        }
        if (!mazo[numRandom].isRobada()) {
            return mazo[numRandom];
        } else {
            for (int i = 0; i < 48; i++) {
                if (mazo[numRandom + i].isRobada() == false) {
                    return mazo[numRandom + i];
                }
            }
        }
        return null;

    }

    public void elige3Cartas(carta[] tres) {
        Random random = new Random();
        if (numCartas == 0 || numCartas < 3) {
            for (int i = 0; i < 3; i++) {
                tres[i] = null;
            }
        }

        for (int i = 0; i < 3; i++) {
            int numRandom = random.nextInt(48);
            if (!mazo[numRandom].isRobada()) {
                tres[i] = mazo[numRandom];
                mazo[numRandom].setRobada(true);

            } else {
                for (int j = 0; j < 48; j++) {
                    if (mazo[numRandom + j].isRobada() == false) {
                        tres[i] = mazo[numRandom + j];
                        mazo[numRandom + j].setRobada(true);

                    }
                }
            }

        }
    }

    public String mostrar(int n) {
        String cadena = "";
        int contador = 0;

        for (int i = 0; i <= 48 / n; i++) {

            for (int j = 0; j < n; j++) {
                if (j + contador < 48) {
                    if (!mazo[j + contador].isRobada()) {
                        cadena += "+-------+\t";
                    } else {
                        cadena += "\t\t";
                    }

                }
            }
            cadena += "\n";
            for (int j = 0; j < n; j++) {

                if (j + contador < 48) {
                    if (!mazo[j + contador].isRobada()) {

                        cadena += "| " + mazo[j + contador].getNumeroCarta() + "     |\t";
                    } else {
                        cadena += "\t\t";
                    }
                }
            }

            cadena += "\n";
            for (int j = 0; j < n; j++) {
                if (j + contador < 48) {

                    if (!mazo[j + contador].isRobada()) {

                        cadena += "|       |\t";
                    } else {
                        cadena += "\t\t";
                    }
                }
            }

            cadena += "\n";

            for (int j = 0; j < n; j++) {
                if (j + contador < 48) {
                    if (!mazo[j + contador].isRobada()) {
                        cadena += "|   " + mazo[j + contador].getPalo() + "   |\t";
                    } else {
                        cadena += "\t\t";
                    }
                }
            }
            cadena += "\n";

            for (int j = 0; j < n; j++) {
                if (j + contador < 48) {
                    if (!mazo[j + contador].isRobada()) {
                        cadena += "|       |\t";
                    } else {
                        cadena += "\t\t";
                    }
                }
            }
            cadena += "\n";

            for (int j = 0; j < n; j++) {
                if (j + contador < 48) {
                    if (!mazo[j + contador].isRobada()) {
                        cadena += "|     " + mazo[j + contador].getNumeroCarta() + " |\t";
                    } else {
                        cadena += "\t\t";
                    }
                }
            }
            cadena += "\n";

            for (int j = 0; j < n; j++) {
                if (j + contador < 48) {
                    if (!mazo[j + contador].isRobada()) {
                        cadena += "+-------+\t";
                    } else {
                        cadena += "\t\t";
                    }
                }
            }
            cadena += "\n";
            contador += n;
        }

        return cadena;
    }

    //Metodos getter y setter
    public carta[] getMazo() {
        return mazo;
    }

    public void setMazo(carta[] mazo) {
        this.mazo = mazo;
    }

    public int getNumCartas() {
        return numCartas;
    }

    public void setNumCartas(int numCartas) {
        this.numCartas = numCartas;
    }

    public String toString() {
        String cadena = "";
        for (int i = 0; i < 48; i++) {
            if (!mazo[i].isRobada()) {
                cadena += mazo[i] + "\n";
            }
        }
        return cadena;
    }

}
