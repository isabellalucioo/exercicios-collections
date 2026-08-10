package exercicio.listas.lista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> listaLinked = new LinkedList<>();
        listaLinked.add(30);
        listaLinked.add(50);
        listaLinked.add(10);

        Collections.sort(listaLinked);

        System.out.println("Lista Linked ordenada:");
        for (Integer n : listaLinked){
            System.out.println(n);
        }

        List<Integer> listaArray = new ArrayList<>();
        listaArray.add(3);
        listaArray.add(1);
        listaArray.add(0);
        listaArray.add(4);

        Collections.sort(listaArray);

        System.out.println("Lista Array ordenada:");
        for (Integer n : listaArray){
            System.out.println(n);
        }



    }
}
