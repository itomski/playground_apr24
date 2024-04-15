package de.lubowiecki;

public class ArrayTest4 {

    public static void main(String[] args) {

        // Eingabe
        String input = "lllroooou";

        // trim: entfernt leerzeichen an beiden Enden
        // split zerlegt den String in Einzelzeichen
        String[] steps = input.trim().toLowerCase().split("");

        for(String step : steps) {
            System.out.println(step);
        }


    }

}
