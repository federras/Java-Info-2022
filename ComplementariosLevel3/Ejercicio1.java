package ComplementariosLevel3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio1 {
    public static void main(String[] args) {
        
        //Se crea y se carga el Array
        List<String> palabras = new ArrayList<>();
        palabras.add("Hola");
        palabras.add(null);
        palabras.add("Informatorio");
        palabras.add("");

        //Se crea nuevo array filtrado y se imprime resultado
        List<String> palabrasConFiltro = palabras.stream()
            .filter(x -> x != null)
            .filter(x -> !x.isEmpty())
            .collect(Collectors.toList());
        System.out.println(palabrasConFiltro);
    }
}
