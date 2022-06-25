package ComplementariosLevel3;

import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio3 {
    public static void main(String[] args) {
        List<String> palabras = List.of("Batman", "Aquaman", "Flash", "Batgirl", "Wonder Woman", "brainiac");
        List<String> palabrasFiltradas = palabras.stream()
            .filter(str -> (str.charAt(0) == 'b') || (str.charAt(0) == 'B'))
            .collect(Collectors.toList());
        System.out.println(palabrasFiltradas.size());
    }   
}

