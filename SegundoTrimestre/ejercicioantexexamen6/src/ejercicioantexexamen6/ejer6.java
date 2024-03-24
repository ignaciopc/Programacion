/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioantexexamen6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author ignac
 */
public class ejer6 {
    public int dev(String p, String f) throws FileNotFoundException, IOException, ec{
        BufferedReader br = new BufferedReader(new FileReader(f));
        String linea=br.readLine();
        String datos[];
      int cont = 0;
        do{
                datos = linea.split(" ");
                for (int i = 0; i < datos.length; i++) {
                    if (datos[i].charAt(1)=='a') {
                       cont++; 
                    }
                }
                linea = br.readLine();
            
        }while(linea!=null);
        br.close();
        return cont;
    }
}
