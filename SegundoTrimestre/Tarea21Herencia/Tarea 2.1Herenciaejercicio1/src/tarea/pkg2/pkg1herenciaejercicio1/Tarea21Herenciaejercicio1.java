/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea.pkg2.pkg1herenciaejercicio1;

/**
 *
 * @author ignac
 */
public class Tarea21Herenciaejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empleado E1 = new Empleado("Rafa");
        directivo D1 = new directivo("Mario");
        operario OP1 = new operario("Alfonso");
        oficial OF1 = new oficial("Luis");
        tecnico T1 = new tecnico("Pablo");
        System.out.println(E1.toString());
        System.out.println(D1.toString());
        System.out.println(OP1.toString());
        System.out.println(OF1.toString());
        System.out.println(T1.toString());
    }

}
