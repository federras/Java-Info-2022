package COMPLEMENTARIOS2;
import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio3 {
    public static void main(String[] args) {
        ArrayList baraja = new ArrayList<Integer>();

        //cargar elementos
        for (int i=1; i<=13; i++){
            baraja.add(i);
        }
        System.out.println("\nBaraja en orden:\n" + baraja);

        //Reverso método 1 creando otro array
        ArrayList baraja2 = new ArrayList<Integer>();
        for (int i=baraja.size();i>0;i--){
            baraja2.add(i);
        }
        System.out.println("\nBaraja en reverso Metodo 1:\n" + baraja2);

        //Reverso método 2 con método reverse
        Collections.reverse(baraja);
        System.out.println("\nBaraja en reverso Metodo 2:\n" + baraja);

        //Mezclar
        Collections.shuffle(baraja);
        System.out.println("\nBaraja Desordenada:\n" + baraja);

    }
}
