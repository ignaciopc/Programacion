/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea4programacionorientadaaobjetos;

/**
 *
 * @author ignac
 */
public class carta {

    //Atributos de la clase carte
    private  int numeroCarta;
    private char palo;
    private boolean robada;

    //Metodo statico para comprobar si la carta que me dan existe   
    public static boolean compruebaCarta(int n, char p) {
        if (n < 0 && n > 12 || p != 'O' || p != 'C' || p != 'E' || p != 'B') {
            return false;
        }
        return true;
    }

    //Constructor normal de la clase carta
    public carta(int n, char p) {
       
            this.numeroCarta = n;
            this.palo = p;
            this.robada = false; 
        
    }

    //Getter y Setter del atributo numero carta
    public int getNumeroCarta() {
        return numeroCarta;
    }

    public void setNumeroCarta(int numeroCarta) {
        this.numeroCarta = numeroCarta;
    }

    //Getter y Setter del atributo numero carta
    public char getPalo() {
        return palo;
    }

    public void setPalo(char palo) {
        this.palo = palo;
    }

    //Getter y Setter del atributo robada
    public boolean isRobada() {
        return robada;
    }

    public void setRobada(boolean robada) {
        this.robada = robada;
    }

    //Metodo boolean que devuelve true si la carta que meten como parametro es la misma que la que mia
    public boolean esIgual(carta c) {
        if (this.numeroCarta == c.getNumeroCarta() && this.palo == c.getPalo()) {
            return true;
        }

        return false;
    }

    // Metodo toString para escribir por pantalla la carta
    public String toString() {
        String cadena = "";
        for (int i = 0; i <= 7; i++) {
            switch (i) {
                case 1:
                    cadena += "+-------+\n";
                    break;
                case 2:
                    cadena += "| " + this.numeroCarta + "     |\n";
                    break;
                case 3:
                    cadena += "|       |\n";
                    break;
                case 4:
                    cadena += "|   " + this.palo + "   |\n";
                    break;
                case 5:
                    cadena += "|       |\n";
                    break;
                case 6:
                    cadena += "|     " + this.numeroCarta + " |\n";
                    break;
                case 7:
                    cadena += "+-------+";
                    break;
            }

        }
        return cadena;
    }
}
