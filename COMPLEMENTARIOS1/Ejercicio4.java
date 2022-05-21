package COMPLEMENTARIOS1;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese un número para calcular su factorial: ");
        int a = teclado.nextInt();
        teclado.close();
        System.out.println("El factorial de "+a+" es: "+factorial(a));
    }
    
    public static int factorial(int nro){
        if (nro==1){
            return 1;
        } else {
            return nro * factorial(nro-1);
        }
    }
}
