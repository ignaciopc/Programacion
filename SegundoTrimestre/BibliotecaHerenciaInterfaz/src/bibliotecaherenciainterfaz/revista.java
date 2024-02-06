/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecaherenciainterfaz;

/**
 *
 * @author ignac
 */
public class revista extends publicacion{
    
    int numero;
    public revista(String i, String t, int a, int n){
        super(i, t, a);
        this.numero=n;
        
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return super.toString()+ "numero=" + numero + '}';
    }
    
}
