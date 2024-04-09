package de.lubowiecki;

import java.util.Scanner;

public class KomplexeDatentypen {

    public static void main(String[] args) {

        // Komplexe Datentypen werden durch Objekte realisiert
        String text = "Hallo Welt";
        System.out.println(text.toLowerCase());
        // Komplexe Datentypen haben Methoden
        // Komplexe Datentypen basieren auf einer Klasse

        System.out.print("Eingabe: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.println(input);

    }
}
