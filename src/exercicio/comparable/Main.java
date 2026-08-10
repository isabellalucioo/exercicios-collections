package exercicio.comparable;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Titulo titulo1 = new Titulo("Startrek");
        Titulo titulo2 = new Titulo("Norbit");
        Titulo titulo3 = new Titulo("Harry Potter");

        ArrayList<Titulo> listaTitulos = new ArrayList<>();

        listaTitulos.add(titulo2);
        listaTitulos.add(titulo1);
        listaTitulos.add(titulo3);

        System.out.println(listaTitulos);
        listaTitulos.sort(Titulo::compareTo);
        System.out.println(listaTitulos);
    }
}
