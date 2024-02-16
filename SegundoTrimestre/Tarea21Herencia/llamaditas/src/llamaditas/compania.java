/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package llamaditas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;

/**
 *
 * @author ignac
 */
public class compania {

    movil cliente[] = new movil[100];
    String cadena[] = new String[100];
    int cont;

    public compania(String f) throws FileNotFoundException, IOException {
        for (int i = 0; i < cliente.length; i++) {
            cliente[i] = null;
        }

        int contador = 0;
        String linea = "";
        BufferedReader br = new BufferedReader(new FileReader(f));

        try {
            while (linea != null) {
                if (!linea.equals("")) {
                    cadena = linea.split(";");
                    movil m = new movil(cadena[0], cadena[1]);
                    m.setTiempollamada(Integer.parseInt(cadena[2]));
                    m.setTarificados(Double.parseDouble(cadena[3]));
                    cliente[cont] = m;
                    cont++;
                }
                linea = br.readLine();
            }

        } catch (IOException e) {
            throw e;
        } finally {
       br.close();

        }
    }

    public void aniadirCliente(movil m) throws mismotelefono {
        boolean bandera = false;
        try {
            for (int i = 0; i < cliente.length; i++) {
                if (cliente[i] == m) {
                    throw new mismotelefono();
                } else if (cliente[i] == null && bandera != true) {
                    cliente[i] = m;
                    bandera = true;
                }
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        }

    }

    public void aniadiraltxt(String txt) throws IOException {
        BufferedWriter wr = new BufferedWriter(new FileWriter(txt));

        for (int i = 0; i < cliente.length; i++) {
            if (cliente[i] != null) {
                wr.write(cliente[i].getNumero() + ";");
                wr.write(cliente[i].getTiempollamada() + ";");
                wr.write(cliente[i].getTarifa() + ";");
                wr.write(cliente[i].getTarificados()+"\n");

            }
        }
        wr.close();
    }

    @Override
    public String toString() {
        String cad = "";
        for (int i = 0; i < cliente.length; i++) {
            if (cliente[i] != null) {
                cad += cliente[i] + "\n";
            }
        }
        return cad;
    }

}
