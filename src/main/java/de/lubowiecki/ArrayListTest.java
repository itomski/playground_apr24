package de.lubowiecki;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListTest {

    public static void main(String[] args) {

        //ArrayList<String> namen = new ArrayList<>(); // Leere Liste
        List<String> namen = new ArrayList<>(); // List ist der Interface-Typ
        namen.add("Bruce"); // Hinzufügen an nächster freier Stelle
        namen.add("Carol");
        namen.add("Peter");
        namen.add("Scott");
        //namen.add(null);
        namen.add("Natasha");

        System.out.println(namen); // ArrayList hat eine ordentliche toString-Methode

        for (int i = 0; i < namen.size(); i++) { // size = Anzahl Elemente in der Liste
            System.out.println(namen.get(i)); // get: liefert das Element an gewünschter Position
        }

        System.out.println();

        for(String name : namen) {
            System.out.println(name);
        }

        System.out.println();
        namen.remove("Scott"); // Entfernt Element
        //namen.remove(0); // Entfernt Element an gewünschter Position
        System.out.println(namen);

        System.out.println();
        namen.add(3, "Tony"); // Hinzufügen an gewünschter Position
        System.out.println(namen);

        // Listen sind nicht sortiert aber geordnet

        // Collections ist eine Utility-Klasse zum Bearbeiten von Sammlungen
        Collections.sort(namen);
        System.out.println(namen);
    }
}
