/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funciones;

/**
 *
 * @author ignac
 */
public class AñoBsitioMes {

    public static boolean esBisiesto(int anio) {
        if (anio % 4 == 0) {
            if (anio % 100 == 0) {
                if (anio % 400 != 0) {
                    return false;
                } else {
                    return true;
                }
            }
            return true;
        }
        return false;

    }

    public static int numDiasMes(int anio, int mes) {
        if (mes <= 7) {
            if (mes % 2 != 0) {
                return 31;
            } else {
                if (mes == 2) {
                    if (esBisiesto(anio)) {
                        return 29;
                    } else {
                        return 28;
                    }
                }
                return 30;
            }
        } else {
            if (mes % 2 == 0) {
                return 31;
            } else {
                return 30;
            }
        }
    }

    public static boolean fechaCorrecta(int dia, int mes, int anio) {
        if ((dia > 31) || (dia < 1) || mes > 12 || mes < 1 || anio < 0) {
            return false;
        } else {
            if (numDiasMes(anio, mes) >= dia) {
                return true;
            } else {
                return false;
            }
        }
    }

    

    public static int numDiasA(int anio) {
        if (esBisiesto(anio)) {
            return 366;
        } else {
            return 365;
        }
    }

    public static int numDiasTranscurridos(int dia, int mes, int anio) {
        int total = 0;
        for (int i = 1; i <= mes; i++) {
            if (i == mes) {
                total += dia;
            } else {
                total += numDiasMes(anio, i);
             }
        }
        return total;
    }

    public static int numDíasRestantes(int dia, int mes, int anio) {
        int total = 0;
        for (int i = mes; i < 13; i++) {
            if (i == mes) {
                total = numDiasMes(anio, mes) - dia;
            } else {
                total += numDiasMes(anio, i);
            }
        }
        return total;
    }

}
