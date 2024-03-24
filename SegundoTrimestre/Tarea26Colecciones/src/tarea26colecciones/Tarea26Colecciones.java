/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea26colecciones;

import java.util.ArrayList;

/**
 *
 * @author ignac
 */
public class Tarea26Colecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * partido p = new partido("be", "Re", 10, 55); partido t = new
         * partido("Re", "be", 12, 10); partido g = new partido("Bo", "he", 10,
         * 10);
         *
         * ArrayList<partido> liga = new ArrayList<partido>(); liga.add(p);
         * liga.add(t); liga.add(g); int contA = 0; int contB = 0; int golMax =
         * 0; String goleadorMax = "";
         *
         * for (partido r : liga) { contA++; for (partido q : liga) { contB++;
         * if (contA < contB) {
         *
         * if (r.getEquipoA().equals(q.getEquipoA())) {
         * r.setGolA(r.getGolA() + q.getGolA());
         * } else if (r.getEquipoA().equals(q.getEquipoB())) {
         * r.setGolA(r.getGolA() + q.getGolB());
         * }
         *
         * if (r.getEquipoB().equals(q.getEquipoA())) {
         * r.setGolB(r.getGolB() + q.getGolA());
         * } else if (r.getEquipoB().equals(q.getEquipoB())) {
         * r.setGolB(r.getGolB() + q.getGolB());
         * }
         * }
         *
         * }
         * contB = 0;
         * System.out.println(r);
         *
         * }
         * int cont = 0;
         * for (partido j : liga) {
         * if (cont == 0) {
         * if (j.getGolA() > j.getGolB()) { goleadorMax = j.getEquipoA() + " con
         * " + j.getGolA() + " goles"; golMax = j.getGolA(); cont++; } else {
         * goleadorMax = j.getEquipoB() + " con " + j.getGolB() + " goles";
         * golMax = j.getGolB(); cont++; } } else { if (j.getGolA() > golMax) {
         * goleadorMax = j.getEquipoA() + " con " + j.getGolA() + " goles";
         * golMax = j.getGolA();
         *
         * } else if (j.getGolB() > golMax) { goleadorMax = j.getEquipoB() + "
         * con " + j.getGolB() + " goles"; golMax = j.getGolB();
         *
         * }
         * }
         *
         * }
         *
         * System.out.println("El mayor goleador es " + goleadorMax);
         */

        /**
         * Guarda en un arraylist el resultado de los partidos de la liga. Para
         * ello crea una clase partido que almacene el nombre de los dos equipos
         * que han jugado y el resultado final. Crea un main donde añadas al
         * arraylist algunos partidos y después se muestre el nombre del equipo
         * y el número de goles marcados del equipo que más goles ha marcado en
         * la liga.
         */
        
        ArrayList<partido> liga = new ArrayList<partido>();
        partido a = new partido("aa", "bb", 100, 60);
        partido s = new partido("vv", "bb", 79, 60);
        partido d = new partido("aa", "nn", 50, 60);
        partido f = new partido("jj", "bb", 43, 1);
        
        ArrayList<String> fi = new ArrayList<String>();
        ArrayList<Integer> go = new ArrayList<Integer>();
        liga.add(a);
        liga.add(s);
        liga.add(d);
        liga.add(f);
        
        for(partido o : liga){
            if (!fi.contains(o.getEquipoA())) {
                fi.add(o.getEquipoA());
            }
            if(!fi.contains(o.getEquipoB())){
                fi.add(o.getEquipoB());
            }
        }
        

        for(String ha : fi){
            int gola= 0;
            for(partido n : liga){
                if (ha.equals(n.getEquipoA())) {
                    gola += n.getGolA();
                }
                if(ha.equals(n.getEquipoB())){
                    gola+= n.getGolB();
                }
                
            }
            go.add(gola);
            
        }
        int pos = 0;
        int golmax = 0;
        for (int i = 0; i < fi.size(); i++) {
            if (go.get(i)>golmax) {
                golmax = go.get(i);
                pos = i;
            }
        }
        
        System.out.println("El equipo con mas goles es :"+fi.get(pos)+" Con "+go.get(pos));
    }

    
}
