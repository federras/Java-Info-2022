package COMPLEMENTARIOS1;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese Nombre y Apellido: ");
        String nombre = teclado.nextLine();
        System.out.print("Ingrese Edad: ");
        String edad = teclado.nextLine();
        System.out.print("Ingrese Dirección: ");
        String direccion = teclado.nextLine();
        System.out.print("Ciudad: ");
        String ciudad = teclado.nextLine();
        teclado.close();
        System.out.println(ciudad+" - "+direccion+" - "+edad+" - "+nombre);
    }
}
