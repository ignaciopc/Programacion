/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia1;

/**
 *
 * @author ignac
 */
public class Policia extends Persona{
    private String cargo;
    private int numPlaca;
    public Policia(String d, String n, String a, float p, int e, String c, int np) {
        super(d, n, a, p, e);
        this.cargo = c;
        this.numPlaca = np;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getNumPlaca() {
        return numPlaca;
    }

    public void setNumPlaca(int numPlaca) {
        this.numPlaca = numPlaca;
    }

    @Override
    public String toString() {
        return super.toString()+"Policia cargo=" + cargo + " \nnumPlaca=" + numPlaca;
    }
    

}
