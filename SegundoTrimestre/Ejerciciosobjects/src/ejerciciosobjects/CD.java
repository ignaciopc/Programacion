/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosobjects;

/**
 *
 * @author ignac
 */
public class CD {
    Cancion canciones[]  = new Cancion[10]; 
    int contadorCanciones=0;
    public CD(){
    Cancion canciones[]  = new Cancion[10]; 
    int contadorCanciones;
    }
    
    //METODOS
    public int numeroCanciones(){
        return this.contadorCanciones;
    }
    public Cancion dameCancion(int n){
        return canciones[n];
    }
    
    public void grabaCancion(int n, Cancion c){            
            canciones[n]= c;
    }
    
    public void agrega(Cancion c){
        canciones[contadorCanciones] = c;
        contadorCanciones++;
    }
    
    public void elimina(int n){
        canciones[n]= null;
        contadorCanciones--;
    }
}
