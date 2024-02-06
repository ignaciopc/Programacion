/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5.cuentacorriente;

/**
 *
 * @author ignac
 */
public class cuenta {

    //ATRIBUTOS
    private String cliente;
    private String numeroCuenta;
    private double tipoDeInteres;
    private double saldo;

    //CONSTRUCTORES
    //constructor por defecto
   public cuenta() {
        this.cliente = "";
        this.numeroCuenta = "";
        this.tipoDeInteres = 0;
        this.saldo = 0;
    }

   //Constructor normal
    public cuenta(String cl, String nc, double ti, double s) {
        this.cliente = cl;
        this.numeroCuenta = nc;
        this.tipoDeInteres = ti;
        this.saldo = s;
    }
    
    //constructor copia
    public cuenta(cuenta c){
        this.cliente = c.getCliente();
        this.numeroCuenta = c.getNumeroCliente();
        this.tipoDeInteres = c.getTipoDeInteres();
        this.saldo = c.getSaldo();
    }
    //METODOS GETTER

    public String getCliente() {
        return this.cliente;
    }

    public String getNumeroCliente() {
        return this.numeroCuenta;
    }

    public double getTipoDeInteres() {
        return this.tipoDeInteres;
    }

    public double getSaldo() {
        return this.saldo;
    }

    //METODOS SETTER
    public void setCliente(String cl) {
        this.cliente = cl;
    }

    public void setNumeroCliente(String nc) {
        this.numeroCuenta = nc;
    }

    public void setTipoDeInteres(double ti) {
        this.tipoDeInteres = ti;
    }

    public void setSaldo(double s) {
        this.saldo = s;
    }

    //METODO INGRESAR DINERO(aumenta el saldo) Y REINTEGRAR DINERO (disminuye el saldo)
    public boolean reintegro(double cantidad) {
        if (cantidad < 0) {
            return false;
        } else if (cantidad > this.saldo) {
            return false;
        } else {
            this.saldo -= cantidad;
            return true;
        }
    }

    public boolean ingreso(double cantidad) {
        if (cantidad < 0) {
            return false;
        }

        this.saldo += cantidad;
        return true;
    }

    //METODO DE UNA TRANSFERENCIA (se pasa dinero de una cuenta a otra)
    public boolean transferencia(double cantidad, cuenta destino) {
        if (this.reintegro(cantidad)) 
            return destino.ingreso(cantidad);
        return false;
    }
}
