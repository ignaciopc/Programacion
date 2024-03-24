/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea26colecciones05;

import java.util.ArrayList;

/**
 *
 * @author ignac
 */
public class Tarea26Colecciones05 {

    /**
     * @param args the command line arguments
     */
    public static int Aleatorio(int desde, int hasta) {
        return (int) (Math.random() * (hasta - desde + 1) + desde);
    }

    public class String mano() {
        switch (Aleatorio(1, 3)) {
            case 1:
                return "piedra";
            case 2:
                return "papel";
            case 3:
                return "tijera";
        }
        return "";
    }

    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * Realiza un programa que calcule el ganador de una partida al famoso
         * juego de piedra, papel o tijera. Para ello, crea una clase partida
         * que guarde que ha sacado cada uno de los dos jugadores (jugador1:
         * piedra, papel o tijera y jugador2: piedra, papel o tijera. Dos
         * atributos de tipo String) A continuación, crea un main con un
         * arrayList de rondas. Rellena el arrayList con un número aleatorio de
         * rondas donde cada jugador saca un gesto aleatorio (piedra, papel o
         * tijera) Por último imprime en pantalla todas las jugadas y el ganador
         * de la partida. Ejemplo de lo que se muestra en pantalla:
         *
         * Ronda 1 -> Jugador 1: Piedra Jugador 2: Tijera Ronda 2 -> Jugador
         * 1:Papel Jugador 2: Papel Ronda 3 -> Jugador 1: Papel Jugador 2:
         * Piedra Ronda 4 -> Jugador 1: Tijera Jugador 2: Piedra
         */
        ArrayList<partida> v = new ArrayList<partida>();
        for (int i = 0; i < Aleatorio(0, 10); i++) {
            partida c = new partida("jugador1", "jugador2", mano(), mano());
            v.add(c);
        }
        int cona=0;
        int conb=0;
        for(partida o : v){
            if (o.getTipo1() == "piedra" && o.getTipo2() == "tijera") {
                cona++;
            }
        }
        System.out.println(v);
    }

}
