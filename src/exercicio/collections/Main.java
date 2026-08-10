package exercicio.collections;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> listaNumeros = new ArrayList<>();

        listaNumeros.add(40);
        listaNumeros.add(15);
        listaNumeros.add(23);
        listaNumeros.add(37);
        listaNumeros.add(10);

        System.out.println(listaNumeros);

        Collections.sort(listaNumeros);

        System.out.println("Lista após ordenação crescente");
        System.out.println(listaNumeros);

        Collections.sort(listaNumeros, Collections.reverseOrder());
        System.out.println("Lista após ordenação decrescente");
        System.out.println(listaNumeros);
    }
}
