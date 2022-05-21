package COMPLEMENTARIOS1;
import java.util.Scanner;


public class Ejercicio7 {
    public static void main(String[] args) {
        System.out.println("Ingrese string para convertir en mayúscula");
        Scanner teclado = new Scanner(System.in);
        String palabra = teclado.nextLine();
        teclado.close();
   
        for (int i=0;i<palabra.length();i++){
            char c = convertirMay(palabra.charAt(i));
            System.out.print(c);
        }
    }

    public static char convertirMay(char c){
        if ((c>='a') && (c<='z')){
            c = (char) (c-32);
            }
        return c;
    }
}
