package COMPLEMENTARIOS1;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese dos números para obtener la potencia: ");
        int a = teclado.nextInt();
        int b = teclado.nextInt();
        teclado.close();
        int acum=a;
        for (int i=1;i<b;i++){
            acum=acum*a;
        }
        System.out.println("Resultado: "+acum);
    }
}