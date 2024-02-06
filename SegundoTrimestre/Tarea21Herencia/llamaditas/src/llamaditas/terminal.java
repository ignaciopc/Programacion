/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package llamaditas;

/**
 *
 * @author ignac
 */
public class terminal {
   
    private String numero;
    private int tiempollamada;
    private int sutiempo;
    
    public terminal(String n){
        this.numero= n;
        this.tiempollamada =0;
        
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getTiempollamada() {
        return tiempollamada;
    }

    public void setTiempollamada(int tiempollamada) {
        this.tiempollamada = tiempollamada;
    }

    public int getSutiempo() {
        return sutiempo;
    }

    public void setSutiempo(int sutiempo) {
        this.sutiempo = sutiempo;
    }
    
    public void llama(terminal n, int tl){
        this.sutiempo += tl;
        this.setTiempollamada(getTiempollamada()+tl);
        n.setTiempollamada(n.getTiempollamada()+tl);
    }

    @Override
    public String toString() {
        return "Numero " + getNumero()+" - "+getTiempollamada()+"s de conversacion";
    }
    
}
