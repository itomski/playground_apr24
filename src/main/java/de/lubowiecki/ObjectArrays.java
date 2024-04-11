package de.lubowiecki;

import java.time.LocalDateTime;

public class ObjectArrays {

    public static void main(String[] args) {

        int[] zahlen = new int[5];
        zahlen[0] = 10;

        String[] namen = new String[5];
        namen[0] = "Peter";

        System.out.println();

        Buch[] buecher = new Buch[10];
        buecher[0] = new Buch("Peter Parker", "Backen ohne Mehl");
        buecher[1] = new Buch("Peter Parker", "Kochen ohne Fett");
        buecher[8] = new Buch("Bruce Banner", "Das Leben in Grün");

        buecher[1] = null;

        // Buch b = aktuelle Buch
        // buecher = Array

        for(Buch b : buecher) {
            if(b != null) {
                System.out.println(b.getTitel());
            }
        }

        //Aktueller Zeitpunkt
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);


    }
}
