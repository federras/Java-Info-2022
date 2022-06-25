/* Se posee una Lista con objetos de clase Alumno con los atributos: apellido, nombre y fechaDeNacimiento (con tipos: String,
String y LocalDate). Se desea generar un Map<String, Integer> donde la clave de Map será el apellido concatenado con el
nombre (con separador de espacio en blanco) y el value la edad del alumno.

    * La lista de entrada debe estar cargada con varios alumnos (al menos 5) para subir el ejemplo y demostrar su
    funcionamiento.

    * En ejemplo se muestra solo con 1 Alumno a modo de abreviar

    * En el ejemplo también se usa LocalDate.now().minusYears(30), en el ejercicio a presentar se deberá usar otra
    tecnica de construcción para la fecha (no usar .now(). Pueden ver métodos .parse(), etc) */

package ComplementariosLevel3;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ejercicio5 {
    public static void main(String[] args) {
        List<Alumno> alumnos = List.of( new Alumno("Simpson", "Homero", LocalDate.parse("1956-05-12")),
                                        new Alumno("Simpson", "Bart", LocalDate.parse("1981-12-13")),
                                        new Alumno("Simpson", "Lisa", LocalDate.parse("1983-06-18")),
                                        new Alumno("America", "Capitan", LocalDate.parse("1918-07-04")),
                                        new Alumno("Argento", "Pepe", LocalDate.parse("1959-08-06"))
                                        );
        Map<String, Integer> mapaAlumno = new HashMap<>();
        alumnos.stream()
            .forEach(a -> mapaAlumno.put(a.getApellido() + " " + a.getNombre(), a.obtenerEdad()));
        System.out.println(mapaAlumno);
    }
    
}

