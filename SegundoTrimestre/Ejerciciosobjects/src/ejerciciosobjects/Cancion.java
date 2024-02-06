/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosobjects;

/**
 *
 * @author ignac
 */
public class Cancion {
    private String titulo;
    private String autor;
    
    //Constructor
    
    public Cancion(String ti, String aut){
        this.autor = aut;
        this.titulo= ti;
    }
    
    public Cancion(){
        this.autor="";
        this.titulo="";
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
}
