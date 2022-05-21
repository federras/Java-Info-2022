package COMPLEMENTARIOS1;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese String: ");
        String frase = teclado.nextLine();
        System.out.print("Ingrese caracter: ");
        char c = teclado.next().charAt(0);
        teclado.close();
        int cont = 0;
        for (char i : frase.toCharArray()) {
            if (Character.toLowerCase(i)==Character.toLowerCase(c)){
                cont++;
            }
        }
        System.out.println("Cantidad de letras "+c+": "+cont);
    }
}
