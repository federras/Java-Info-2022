package COMPLEMENTARIOS1;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese primer nro: ");
        int a = teclado.nextInt();
        System.out.print("Ingrese segundo nro: ");
        int b = teclado.nextInt();
        teclado.close();
        System.out.println(a+" + "+b+" = "+(a+b));
        System.out.println(a+" - "+b+" = "+(a-b));
        System.out.println(a+" * "+b+" = "+(a*b));
        System.out.println(a+" / "+b+" = "+(a/b));
        System.out.println(a+" % "+b+" = "+(a%b));
    }
    
}
