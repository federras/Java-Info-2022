package COMPLEMENTARIOS1;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese dos números para obtener producto por sumas sucesivas: ");
        int a = teclado.nextInt();
        int b = teclado.nextInt();
        teclado.close();
        int acum=0;
        for (int i=1;i<=b;i++){
            acum=acum+a;
        }
        System.out.println("Resultado: "+acum);
    }
}
