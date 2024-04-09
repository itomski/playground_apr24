package de.lubowiecki;

import de.lubowiecki.other.OtherThing;

import java.time.LocalDate;

public class ImportTest {

    public static void main(String[] args) {

        // liegt in einem anderen Package und muss vor der Verwendung importiert werden
        OtherThing ot = new OtherThing();

        // Klassen sehen in Java nur andere Klassen aus dem gleichen Package
        // Klassen aus anderen Packages müssen vor der Verwendung importiert werden

        LocalDate heute = LocalDate.now();
        System.out.println(heute /*... */);

        /*
        Das ist das
        Haus von Nikigraus!
        */

        int i = 100 + /* das ist ein guter Wert */ 100;

        machWas(10);
    }

    /**
     * Der eingegebene Wert wird zu Quadrat gerechnet
     * @param i
     * @return
     */
    public static int machWas(int i) {
        return i * i;
    }
}
