/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package tarea24ficheros;

/**
 *
 * @author ignac
 */
public interface almacenamiento {

    public void add(producto p);

    public void delete(String codProducto);

    public void salvar(String fichero);

    public String toString();

}
