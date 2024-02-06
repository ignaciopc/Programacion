/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecaherenciainterfaz;

/**
 *
 * @author ignac
 */
public class libro extends publicacion implements Prestable{
    
    boolean prestado;
    
    public libro(String i, String t, int a){
        super(i, t, a);
        this.prestado=false;
        
    }

    public String diPrestado(){
        if (isPrestado()) {
            return "(prestado)";
        }else{
            return "(no esta prestado)";
        }
    }
    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    @Override
    public  void  presta() {
        setPrestado(true);
    }

    @Override
    public void  devuelve() {
        setPrestado(false);
    }

    @Override
    public String toString() {
        
        String a= super.toString();
        return a+diPrestado() ;
    }

    @Override
    public  boolean estaPrestado() {
        return isPrestado();
    }
    
}
