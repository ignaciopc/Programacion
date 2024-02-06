/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pobandotostring;

/**
 *
 * @author ignac
 */
public class PobandoToString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cuadrado c1 = new Cuadrado(5);
        Cuadrado c2 = new Cuadrado(10);
        Cuadrado c3 = new Cuadrado(4);
      
        System.out.println(c1.getLado());
        System.out.println(c1.getNumCuadrado()+"\n");
        System.out.println(c2.getLado());
        System.out.println(c2.getNumCuadrado()+"\n");
        System.out.println(c3.getLado());
        System.out.println(c3.getNumCuadrado()+"\n");
        
        Cuadrado c4 = null;
        //Como es un metodo statico puede ponerse antes de inicializarlo
        c4.metodo1();
        
         c4 = new Cuadrado(6);
        System.out.println(c4.getLado());
        System.out.println(c4.getNumCuadrado()+"\n");
        //Lo de abajo es el metodo toString
        System.out.println(c1);
        
        
        
        Persona p1 = null;
        int dni = 77556394;
        char letraDni = 'A';
        if (p1.compruebaDNI(dni, letraDni)) {
            p1 = new Persona(dni, letraDni, "Ignacio");
            
        }else{
            System.out.println("ADIOS");
        }
        System.out.println(p1.getDni()+p1.getNombre());
    }
    
}
    