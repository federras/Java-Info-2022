package COMPLEMENTARIOS1;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        
        System.out.println("Cuál es tu nombre?");
        Scanner teclado = new Scanner(System.in);
        String a = teclado.nextLine();
        teclado.close();
        System.out.println("HOLA "+ a);
    }
}
