//Dada una lista que contiene números enteros, se deberá generar otra lista que contendrá el resultado
//de aplicar la operación de potencia a 2.

package ComplementariosLevel3;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 3, 4, 5);
        ArrayList<Integer> numeros2 = new ArrayList<>();
        numeros.stream()
            .forEach(x -> numeros2.add(x*x));
        System.out.println(numeros2);
    }
}
