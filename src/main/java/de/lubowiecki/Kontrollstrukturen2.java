package de.lubowiecki;

import java.util.ArrayList;
import java.util.List;

public class Kontrollstrukturen2 {

    public static void main(String[] args) {

        // i ist nur in der Schleife sichtbar
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        /*
        for (;;) { // Endlosschleife
            System.out.println("Tach auch!");
        }
        */

        int i = 0;
        for (; i < 10;) {
            System.out.println(i++);
        }
        // i ist immer noch verfügbar

        System.out.println("Ende");

        int[] zahlen = {2,4,6,8,10,12,14,18};
        for(int z : zahlen)
            System.out.println(z);

        ArrayList<String> werte = new ArrayList<>();
        werte.add("Hamburg");
        werte.add("München");
        werte.add("Berlin");
        werte.add("Bremen");

        // Laufvariable MUSS innerhalb des Schleifen-Kopfs deklariert werden
        for(String s : werte)
            System.out.println(s);

        // primitive Werte werden IMMER als Kopie weitergegeben
        // komplexe Datentypen/Objekte werden als Referenzen weitergegeben

        int j = 10;
        int k = j; // k bekommt eine Kopie des Wertes
        j = 20; // Änderung hat keine Auswirkung auf k

        List<Integer> zahlen2 = new ArrayList<>();
        // Beide Variablen zeigen auf das gleiche Objekt auf dem Heap
        List<Integer> zahlen3 = zahlen2;
        // Änderungen über zahlen2 haben auswirkungen auf Objekt hinter zahlen3 und umgekehrt
        zahlen2.add(1);
        zahlen2.add(5);
        zahlen2.add(22);
        System.out.println(zahlen3);

        System.out.println();

        j = 0;

        // Kopfgesteuert
        while(j < 10) {
            System.out.println(++j);
        }

        j = 0;

        do {
           // wird mit Sicherheit mind. 1x ausgeführt
        } while(j < 10); // Fußgesteuert

    }
}
