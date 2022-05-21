package COMPLEMENTARIOS1;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.print("Ingrese nro: ");
        Scanner teclado = new Scanner(System.in);
        int a = teclado.nextInt();
        teclado.close();
        int cont = 1;
        for (int j=1; j<=a; j++){
            for (int i=1; i<=cont; i++){
                    System.out.print(i+" ");
                }
            cont++;
            System.out.println("");
            }
        
    }
}
