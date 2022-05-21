package COMPLEMENTARIOS2;

import java.util.ArrayList;

public class Ejercicio1 {
    public static void main(String[] args) {

        //crea array y se cargan ciudades
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("Vilelas");
        lista.add("Resistencia");
        lista.add("Machagai");
        
        //imprime el ranking
        System.out.println("Ranking: \n#1 - "+lista.get(0)+
                                    "\n#2 - "+lista.get(1)+
                                    "\n#3 - "+lista.get(2));
    }
}
