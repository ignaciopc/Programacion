/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestisimal;

import java.util.Scanner;

/**
 *
 * @author ignac
 */
public class GESTISIMAL {

    /**
     * @param args the command line arguments
     */
    public static void menu(){
        System.out.println("Dime que quieres hacer: \n 1. Listado \n 2. Alta \n 3. Baja \n 4. Modificacion \n 5. Entrada de mercancia \n 6. Salida de mercancia \n 7. Salir");
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        //VARIABLES
        int num;
        String codigo = "", descripcion = "", cot = "";
        float precioCompra = 0, precioVenta = 0;
        int Stock = 0;
        //OBJETOS
        almacen pepe = new almacen();
        Scanner sc = new Scanner(System.in);

        do {
            menu();
            num = sc.nextInt();
            switch (num) {
                
                case 1:
                    System.out.println(pepe);
                    break;
                case 2:
                    cot = sc.nextLine();
                    System.out.print("Dime el codigo\n");
                    cot = sc.nextLine();
                    System.out.println("Dime la descripcion");
                    descripcion = sc.nextLine();
                    System.out.println("Dime el precio de compra");
                    precioCompra = sc.nextInt();
                    System.out.println("Dime el precio de venta");
                    precioVenta = sc.nextInt();
                    System.out.println("Dime el stock que hay ");
                    Stock = sc.nextInt(); 

                    articulo art = new articulo(cot, descripcion, precioCompra, precioVenta, Stock);
                    if (pepe.alta(art)) {
                        pepe.alta(art);
                    } else {
                        System.out.println("No se queda mas espacio");
                    }
                    break;
                case 3:
                    System.out.println("Dime el codigo del articulo que quieres dar de baja");
                    codigo = sc.next();
                    pepe.baja(codigo);
                    break;
                case 4:
                    System.out.println("Dime el codigo del articulo que quieres actualizar");
                    String co = sc.next();
                    System.out.println("Ahora dame los datos del articulo que quieres meter.\nDime el codigo");
                    codigo = sc.next();
                    System.out.println("Dime la descripcion");
                    descripcion = sc.next();
                    System.out.println("Dime el precio de compra");
                    precioCompra = sc.nextInt();
                    System.out.println("Dime el precio de venta");
                    precioVenta = sc.nextInt();
                    System.out.println("Dime el stock que hay ");
                    Stock = sc.nextInt();

                    articulo art1 = new articulo(codigo, descripcion, precioCompra, precioVenta, Stock);
                    pepe.modificacion(co, art1);
                    break;
                case 5:
                    System.out.println("Dime el codigo del articulo al que quieres añadir mercancia");
                    codigo = sc.next();

                    System.out.println("Dime la entrada de mercancia que quieres meter");
                    int entradaMercancia = sc.nextInt();
                    pepe.entrada(codigo, entradaMercancia);
                    break;
                case 6:
                    System.out.println("Dime el codigo del articulo al que quieres añadir mercancia");
                    codigo = sc.next();
                    System.out.println("Dime la entrada de mercancia que quieres meter");
                    int salidaMercancia = sc.nextInt();
                    if (pepe.salida(codigo, salidaMercancia)) {
                        pepe.salida(codigo, salidaMercancia);

                    }else{
                        System.out.println("No puedes sacar mas de lo que tienes");
                    }
                    break;
                case 7:
                    num = 7;
                    break;
                default:
                    System.out.println("Escoge entre 1-7");
            }
        } while (num != 7);
    }

}
