/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestisimal;

/**
 *
 * @author ignac
 */
public class almacen {

    private static final int maxArticulo = 1;
    private articulo[] estanteria = new articulo[1];
    private int numart;

    public almacen() {
        for (int i = 0; i < maxArticulo; i++) {
            this.estanteria[i] = null;
        }
        this.numart = 0;
    }

    public boolean alta(articulo a) {
        if (numart < maxArticulo) {

            for (int i = 0; i < maxArticulo; i++) {
                if (estanteria[i] == null) {
                    this.estanteria[i] = a;
                    this.numart++;
                    return true;
                }
            }
        }
        return false;
    }

    public boolean baja(String cod) {
        for (int i = 0; i < maxArticulo; i++) {
            if (estanteria[i] != null && estanteria[i].getCodigo().equals(cod)  ) {
                this.estanteria[i] = null;
                this.numart--;
                return true;
            }
        }
        return false;
    }

    public boolean modificacion(String cod, articulo a) {

        for (int i = 0; i < maxArticulo; i++) {
            if (estanteria[i] != null && estanteria[i].getCodigo().equals(cod) ) {
                this.estanteria[i] = a;
                return true;
            }
        }
        return false;
    }

    public void entrada(String cod, int cant) {
        for (int i = 0; i < maxArticulo; i++) {
            if ( estanteria[i] != null && estanteria[i].getCodigo().equals(cod) ) {
                this.estanteria[i].setStock(this.estanteria[i].getStock() + cant);
            }
        }
    }

    public boolean salida(String cod, int cant) {
        for (int i = 0; i < maxArticulo; i++) {
            if (estanteria[i] != null && estanteria[i].getCodigo().equals(cod) && estanteria[i].getStock() >= cant) {
                this.estanteria[i].setStock(this.estanteria[i].getStock() - cant);
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String cadena="";
        for (int i = 0; i < maxArticulo; i++) {
            if (estanteria[i]!=null) {
                cadena += this.estanteria[i]+"\n";
            }
        }
        return cadena;
    }
}
