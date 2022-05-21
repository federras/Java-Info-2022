package COMPLEMENTARIOS2;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {
    public static void main(String[] args) {
        ArrayList lista = new ArrayList<String>();
        //cargar elementos
        lista.add("Pepe");
        lista.add("Jaime");
        lista.add("Paco");
        lista.add("Pibes");
        lista.add("Hugo");
        lista.add("Antonio");
        lista.add("Carol");
        lista.add("Jime");
        lista.add("Naty");
        lista.add("Sophie");
        lista.add("Ruth");
        lista.add("Jason");
               
        //dividir en sublistas
        List sublista1, sublista2, sublista3 = new ArrayList<String>();
        sublista1 = lista.subList(0, 4);
        sublista2 = lista.subList(4, 8);
        sublista3 = lista.subList(8, 12);
        //imprimir en pantalla resultado
        System.out.println("Primer Curso: "+sublista1);
        System.out.println("Segundo Curso: "+sublista2);
        System.out.println("Tercer Curso: "+sublista3);
    }
}
