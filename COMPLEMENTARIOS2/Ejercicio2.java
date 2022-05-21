package COMPLEMENTARIOS2;

import java.util.ArrayList;

public class Ejercicio2 {
    public static void main(String[] args) {

        //Creamos array y agregamos 5 números.
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(5);
        lista.add(7);
        lista.add(12);
        lista.add(19);
        lista.add(31);

        //Copiamos el array original en una nueva variable para no borrar el original
        //y le agregamos un número al principio y otro al final.
        ArrayList lista2 = (ArrayList) lista.clone();
        lista2.add(0, 3);
        lista2.add(50);

        //iteramos el array nuevo e imprimimos cada elemento
        for (int i = 0; i<lista2.size();i++){
            System.out.println(lista2.get(i));
        }

        //imprimimos la cantidad de elementos de cada array
        System.out.println("Tamaño de la lista original: "+lista.size());
        System.out.println("Tamaño de la lista luego de agregar elementos: "+lista2.size());
    }
}
