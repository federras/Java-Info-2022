/*Crear una función que dado 2 argumentos (int, siendo el primero menor al
segundo), nos devuelva un array de Strings. Con la secuencia de números
enteros de principio a final. Pero si el número es multiplo de 2 colocara el valor
“Fizz”, si es múltiplo de 3 “Buzz” y si es a la vez múltiplo de ambos colocara
“FizzBuzz”.
Observacion: Los 2 argumentos indican con que valor se arranca a calcular y el
segundo con qué valor debe frenar (no se incluye en el cálculo)
Ejemplo: (1, 5) ----> calculará valores de 1, 2, 3, 4*/

package COMPLEMENTARIOS2;

import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese primer entero: ");
        int a = teclado.nextInt();
        System.out.println("Ingrese segundo entero: ");
        int b = teclado.nextInt();
        teclado.close();
        System.out.println(fizzBuzzFunction(a,b));
    }

    public static ArrayList fizzBuzzFunction(int a, int b) {
        ArrayList<String> lista = new ArrayList<>();
        for (int i=a; i<b; i++){
            if (i%2==0 && i%3==0){
                lista.add("FizzBuzz");
            } else {
                if (i%2==0){
                    lista.add("Fizz");
                    } else {
                        if (i%3==0){
                            lista.add("Buzz");
                        } else {
                            lista.add(String.valueOf(i));
                        }
                }
            }
        }
        return lista;
    }
}