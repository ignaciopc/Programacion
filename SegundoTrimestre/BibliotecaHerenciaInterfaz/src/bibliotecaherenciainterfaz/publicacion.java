/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecaherenciainterfaz;

/**
 *
 * @author ignac
 */
public class publicacion {
    String ISBN;
    String titulo;
    int anioPublicacion;
    public publicacion(String i, String t, int a){
        this.ISBN=i;
        this.titulo=t;
        this.anioPublicacion=a;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "publicacion{" + "ISBN=" + ISBN + ", titulo=" + titulo + ", anioPublicacion=" + anioPublicacion + '}';
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
    
}
