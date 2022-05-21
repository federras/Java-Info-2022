package COMPLEMENTARIOS2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Map;


public class Ejercicio6 {
      
    public static void main(String[] args) {
        //creo los empleados
        Empleado emp1 = new Empleado("Juan Perez",32345678,50,320);
        Empleado emp2 = new Empleado("Lidia Mazieri",23546854,56,310);
        Empleado emp3 = new Empleado("Pepe Argento",25365485,45,325);
        
        //agrego los empleados al HashSet
        Set<Empleado> listaEmpleados = new HashSet<>();
        listaEmpleados.add(emp1);
        listaEmpleados.add(emp2);
        listaEmpleados.add(emp3);

        //defino e inicializo el diccionario y la variable sueldo
        float sueldo = 0;
        Map<Integer, Float> mapaSueldos = new HashMap<>();

        //recorro HashSet y cargo el Map
        for (Empleado emple : listaEmpleados) {
            sueldo = emple.getHorasTrabajadas()*emple.getValorPorHora();
            mapaSueldos.put(emple.getDni(), sueldo);
        }

        //imprimo resultado
        System.out.println(mapaSueldos);
    }
}

