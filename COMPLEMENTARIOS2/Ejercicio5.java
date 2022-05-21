/*Dados 2 ArrayList que contienen horas-trabajadas (array1) y
valor-por-hora(array2) del resumen de carga de horas semanal de un
empleado. Se debe generar otra lista que contenga los totales y luego
imprimir el total final a cobrar.*/

package COMPLEMENTARIOS2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        List<Integer> horas = new ArrayList<>();
        List<Integer> precio = new ArrayList<>();
        List<Integer> totales = new ArrayList<>();

        //creamos array con los días de la semana
        List<String> dias = Arrays.asList("Lunes", "Martes", "Miercoles", "Jueves", "Viernes");
        int indice =0;
        int totalFinal=0;

        //cargamos arrays horas y precio por teclado, y vamos calculando totales
        for (String dia : dias) {
            System.out.print("\nHoras trabajadas día "+dia+": ");
            horas.add(teclado.nextInt());
            System.out.print("Precio de hora día "+dia+": ");
            precio.add(teclado.nextInt());
            totales.add(precio.get(indice)*horas.get(indice));
            totalFinal=totalFinal+totales.get(indice);
            indice++;        
        }
        teclado.close();

        //se imprime en pantalla
        System.out.println("\nTotales a cobrar por día: "+totales);
        System.out.println("Total a cobrar por la semana: "+totalFinal);
    }
}
