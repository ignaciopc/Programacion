/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea24ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ignac
 */
public class almacen implements almacenamiento {

    producto todo[] = new producto[100];
    String prod[];

    public almacen(String f) throws FileNotFoundException, IOException {
        producto p;
        int contador = 0;
        BufferedReader br = new BufferedReader(new FileReader(f));
        String linea = "";

        try {
            while (linea != null) {
                if (!linea.equals("")) {
                    prod = linea.split(";");
                    if (prod[0].substring(0, 2).equals("FE")) {
                        p = new ferreteria(prod[1], Integer.parseInt(prod[2]), Double.parseDouble(prod[3]), Double.parseDouble(prod[4]), Double.parseDouble(prod[5]), Double.parseDouble(prod[6]), Double.parseDouble(prod[7]));
                        todo[contador] = p;
                        contador++;
                        linea = br.readLine();
                    } else if (prod[0].substring(0, 2).equals("TE")) {
                        p = new textil(prod[1], Integer.parseInt(prod[2]), Double.parseDouble(prod[3]), Double.parseDouble(prod[4]), prod[5], prod[6]);
                        todo[contador] = p;
                        contador++;
                        linea = br.readLine();
                    } else if (prod[0].substring(0, 2).equals("EL")) {
                        p = new electronica(prod[1], Integer.parseInt(prod[2]), Double.parseDouble(prod[3]), Double.parseDouble(prod[4]), prod[5]);
                        todo[contador] = p;
                        contador++;
                        linea = br.readLine();
                    } else {
                        linea = br.readLine();

                    }
                } else {
                    linea = br.readLine();

                }
            }
        }  finally {
            br.close();

        }

    }

    @Override
    public void add(producto p) {
        boolean bandera = false;
        int cont = 0;
        do {
            if (todo[cont] == null) {
                todo[cont] = p;
                bandera = true;
            }
            cont++;

        } while (bandera != true);
    }

    @Override
    public void delete(String codProducto) {
        for (int i = 0; i < todo.length; i++) {
            if (todo[i] != null) {
                if (todo[i].getCodigo().equals(codProducto)) {
                    todo[i] = null;
                }
            }
        }
    }

    @Override
    public void salvar(String fichero) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(fichero));

            for (int i = 0; i < todo.length; i++) {
                if (todo[i] != null) {
                    bw.write(todo[i].linea() + "\n");

                }
            }
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(almacen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String toString() {
        String cadena = "";
        for (int i = 0; i < todo.length; i++) {
            if (todo[i] != null) {
                cadena += todo[i];
                cadena += "\n";
            }
        }
        return cadena;
    }
}
