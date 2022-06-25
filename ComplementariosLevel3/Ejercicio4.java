//Se dispone de una lista de Integer, de la cual queremos obtener otra lista aplicando
//la operación de factorial pero no se desean valores repetidos.

package ComplementariosLevel3;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ejercicio4 {
    public static void main(String[] args) {
        List<Integer> palabras = List.of(1, 2, 4, 4, 4);
        Set<Integer> nuevaLista = new HashSet<>();
        palabras.stream()
            .forEach(x -> nuevaLista.add(factorial(x)));
        System.out.println(nuevaLista);
    }

    public static int factorial(int nro){
        if (nro==1){
            return 1;
        } else {
            return nro * factorial(nro-1);
        }
    }
}
    
