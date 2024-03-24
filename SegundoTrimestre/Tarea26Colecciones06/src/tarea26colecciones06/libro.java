/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea26colecciones06;

/**
 *
 * @author ignac
 */
public class libro {
    /**
     * Crea un ArrayList de libros de una biblioteca y rellénalo con un número
     * cualquiera de libros inventados (Por ejemplo 10). De cada libro se desea
     * saber: ISBN, título, editorial, nº de páginas y género. Después, recorre
     * el ArrayList y muestra un listado en el que aparezca por cada editorial
     * el número de libros que hay, el máximo número de páginas y el mínimo.
     * Ejemplo de lo que se muestra en pantalla:
     *
     * Editorial RAMA -> 2 libros en total; MAS EXTENSO: 200 páginas; MENOS
     * EXTENSO: 50 páginas Editorial ANAYA -> 5 libros en total; MAS EXTENSO:
     * 250 páginas; MENOS EXTENSO: 150 páginas Editorial PARANINFO -> 3 libros
     * en total; MAS EXTENSO: 2050 páginas; MENOS EXTENSO: 1150 páginas
     *
     *
     */
   private String ISBN;
   private String titulo;
   private String editorial;
   private int npag;
   private String genero;
   
   public libro(String i , String t, String e, int n, String g){
       this.ISBN = i;
       this.titulo = t;
       this.editorial = e;
       this.npag = n;
       this.genero = g;
   }
   
   public String getISN(){
       return this.ISBN;
   }
   public void isISBN(String i){
       this.ISBN = i;
   }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getNpag() {
        return npag;
    }

    public void setNpag(int npag) {
        this.npag = npag;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "\nlibro{" + "ISBN=" + ISBN + ", titulo=" + titulo + ", editorial=" + editorial + ", npag=" + npag + ", genero=" + genero + "}\n";
    }
    
}
