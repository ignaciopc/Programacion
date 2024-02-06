/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea.pkg2.pkg1herenciaejercicio1;

/**
 *
 * @author ignac
 */
public class directivo extends Empleado{
    public directivo(String n) {
        super(n);
        
    }

    @Override
    public String toString() {
        return super.toString()+"-> Directivo";
    }
}
