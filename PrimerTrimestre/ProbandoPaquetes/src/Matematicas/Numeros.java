/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matematicas;

/**
 *
 * @author ignac
 */
public class Numeros {
       public static boolean numeroCapicuo(int num) {
        /*
        int resto, contador = 1;
        int capicuo[] = new int[10];
        int cuenta = 0;

        for (int i = 0; i < 10; i++) {
            resto = num % 10;
            capicuo[i] = resto;
            num = num / 10;
            if (num > 0) {
                contador++;
            }
        }
        int comp[] = new int[contador];
        int prub[] = new int[contador];
        for (int i = 0; i < contador; i++) {
            prub[i] = capicuo[i];
            comp[i] = capicuo[i];

        }

        // Darle la vuelta a la array
        for (int i = 0; i < contador / 2; i++) {
            int tmp = comp[i];
            comp[i] = comp[contador - 1 - i];
            comp[contador - 1 - i] = tmp;
        }

        // Comparo las dos arrays
        for (int i = 0; i < contador; i++) {
            if (comp[i] == prub[i]) {
                cuenta++;
            }
            if (cuenta == contador) {
                return true;
            }
        }
        return false;
        */
        return voltea(num)==num;
    }

    public static boolean esPrimo(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int siguientePrimo(int num) {
        boolean verdad = false;
        int numero = 0;
        int contador = 0;

        do {
            for (int i = num; i <= num + contador; i++) {
                if (i > num) {
                    if (esPrimo(i)) {
                        numero = i;
                        verdad = true;
                    }
                }
            }
            contador++;

        } while (!verdad);
        return numero;
    }

    public static int potencia(int base, int potencia) {
        int pot[] = new int[potencia];
        int total = 1;
        for (int i = 0; i < potencia; i++) {
            pot[i] = base;
        }
        for (int i = 0; i < potencia; i++) {
            total *= pot[i];
        }
        return total;
    }

    public static int digitos(int num) {
        int resto, contador = 0;
        int numero[] = new int[100];

        for (int i = 0; i < 100; i++) {
            resto = num % 10;
            numero[i] = resto;
            num = num / 10;
            if (num > 0) {
                num = (int) num;
                contador++;
            }
        }
        return contador + 1;
    }

    public static int voltea(int num) {
        int resto, contador = 1, intento, total = 0, cont = 0;
        intento = digitos(num);
        int numero[] = new int[intento];
        for (int i = 0; i < intento; i++) {
            resto = num % 10;
            numero[i] = resto;
            num = (int)num / 10;
        }
        cont = intento-1;
        for (int i = 0; i < intento; i++) {
            total += numero[i] * potencia(10, cont);
            cont--;
        }
        return total;
    }

    public static int digitoN(int num, int pos) {
        int resto, contador = 1;
        int numero[] = new int[10];

        for (int i = 0; i < 10; i++) {
            resto = num % 10;
            numero[i] = resto;
            num = num / 10;
            if (num > 0) {
                num = (int) num;
                contador++;
            }
        }
        int finall[] = new int[contador];
        for (int i = 0; i < contador; i++) {
            finall[i] = numero[i];
        }
        //Le doy la vuelta al array
        for (int i = 0; i < contador / 2; i++) {
            int tmp = finall[i];
            finall[i] = finall[contador - 1 - i];
            finall[contador - 1 - i] = tmp;
        }

        for (int i = 0; i < contador; i++) {
            if (i == pos) {
                return finall[i];
            }
        }
        return 0;
    }

    public static int posicionDeDigito(int num, int digito) {
        int resto, contador = 1;
        int numero[] = new int[10];
        for (int i = 0; i < 10; i++) {
            resto = num % 10;
            numero[i] = resto;
            num = num / 10;
            if (num > 0) {
                num = (int) num;
                contador++;
            }

        }

        int finall[] = new int[contador];
        for (int i = 0; i < contador; i++) {
            finall[i] = numero[i];
        }

        int nu = contador;
        for (int i = 0; i < contador; i++) {
            if (finall[nu - 1] == digito) {
                return i;
            }
            nu--;
        }
        return -1;
    }

    public static int quitaPorDetras(int num, int digitos) {
        int finall = num;
        for (int i = 0; i < digitos; i++) {
            finall = finall / 10;
        }
        return finall;
    }

    public static int quitaPorDelante(int num, int digitos) {

        return voltea(quitaPorDetras(voltea(num), digitos));
    }

    public static int pegaPorDetras(int num, int pega) {

        int finall = num;
        finall = finall * 10;
        return finall + pega;
    }

    public static int pegaPorDelante(int num, int pega) {

        return voltea(pegaPorDetras(voltea(num), pega));
    }

    public static int trozoDeNumero(int numero, int inic, int fin) {

        return quitaPorDetras(quitaPorDelante(numero, inic), fin);
    }

    public static int juntaNumero(int numero, int pegado) {

        return pegaPorDetras(numero * potencia(10, digitos(pegado) - 1), pegado);
    }

    public static int pasarADecimal(int num) {
        
        int resto;
        int contador = 0;
        int total = 0;
        int[] numero = new int[10];
        for (int i = 0; i < 10; i++) {
            resto = num % 10;
            numero[i] = resto;
            num = num / 10;
            if (num > 0) {
                contador++;
            }
        }

        for (int i = 0; i < 10; i++) {
            if (i == 0) {
                total = 1;
            } else {
                if (numero[i] == 1) {
                    total += potencia(2, i);
                }
            }
        }
        return total;
        
        
    }
}
