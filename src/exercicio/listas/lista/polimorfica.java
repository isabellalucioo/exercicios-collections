package exercicio.listas.lista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class polimorfica {
    public static void main(String[] args) {
        List<String> listaPolimorfica;


        listaPolimorfica = new ArrayList<>();
        listaPolimorfica.add("Africa");
        listaPolimorfica.add("Pangeia");

        System.out.println("Lista Polimorfica Array ordenada:");
        Collections.sort(listaPolimorfica);
        for (String n : listaPolimorfica) {
            System.out.println(n);
        }

        listaPolimorfica = new LinkedList<>();
        listaPolimorfica.add("Asia");
        listaPolimorfica.add("Mato Grosso");
        listaPolimorfica.add("Europa");

        System.out.println("Lista Polimorfica Linked ordenada:");
        Collections.sort(listaPolimorfica);
        for (String b : listaPolimorfica) {
            System.out.println(b);
        }
    }
}