/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pasoParametros;

/**
 *
 * @author ignac
 */
public class intercambio {
    public static void swap1(int a, int b){
        int tmp= a;
        a=b;
        b=tmp;
    }
    
    public static void swap2(int [] array){
        int tmp =array[0];
        
        array[0] = array[1];
        array[1]= tmp;
    }
    
}
