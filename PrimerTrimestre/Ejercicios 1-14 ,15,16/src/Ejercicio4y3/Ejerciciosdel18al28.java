/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4y3;

import ejercicios.pkg1.pkg14.pkg15.pkg16.Ejercicios1141516;
/**
 *
 * @author ignac
 */
public class Ejerciciosdel18al28 {
    
    public static int pasarDeDecimalABinario(int decimal){
        int binario=0;
        int dec = decimal,cociente;
        int resto = dec%2;
        do{
            
            binario = Ejercicios1141516.pegaPorDetras(binario, resto);
            resto = dec%2;
            dec = dec/2 ;
        }while(dec>=2);
        binario = Ejercicios1141516.pegaPorDetras(binario, dec);
        return Ejercicios1141516.voltea(binario);
    }
    
}
