/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea22excepciones;

/**
 *
 * @author ignac
 */
public class Tarea22Excepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws golesNegativosExcepcion {
        // TODO code application logic here
        try {
            jugador p = new jugador("14", 1);
            jugador r = new jugador("15", 1);
            jugador t = new jugador("16", 3);
            jugador y = new jugador("17", 4);
            p.aniadirgolesporPartido(1, 10);
            p.aniadirgolesporPartido(2, 11);
            p.aniadirgolesporPartido(3, 6);
            equipo e = new equipo();
            e.aniadirJugador(p);
            e.aniadirJugador(r);            
            e.aniadirJugador(t);
            e.aniadirJugador(y);



            System.out.println(p);
        } catch (dorsalNegativoExcepcion e) {
            System.out.println("Te has equivocado prueba de nuevo con el dorsal");
        } catch (golesNegativosExcepcion r) {
            System.out.println("Te has equivocado prueba de nuevo con los goles");
        }catch(mismoJugadorExpecion t){
            System.out.println("Esta el mismo jugador");
        }

    }

}
