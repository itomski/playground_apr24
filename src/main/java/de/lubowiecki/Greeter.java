package de.lubowiecki;

// Namenskonventionen
// Klassen: PascalCase
// Methoden und Variablen: camelCase
// Konstanten (Variablen, die nachträglich nicht geändert werden können): SCREAMING_SNAKE_CASE

// PascalCase
// Beginnt mit Großbuchstaben
// Jedes neue Wort beginnt wieder mit Großbuchstaben

// camelCase
// Beginnt mit Kleinbuchstaben
// Jedes neue Wort beginnt wieder mit Großbuchstaben

// snake_case
// Wird in Java nicht verwendet

// SCREAMING_SNAKE_CASE
// Alle Buchstaben sind groß
// Wörter werden mit _ getrennt

// Packages gruppieren den SourceCode
// enthalten nur kleinbuchstaben und .

// de.lubowiecki.Greeter
// de.lubowiecki.sub.Greeter


import java.util.Random;

public class Greeter { // Klasse

// Kann nicht ausgeführt werden, da keine main-Methode vorhanden

    public static void greet1() { // Methode
        System.out.println("Das ist das Haus von Nikigraus!");
        System.out.printf("Das ist das Haus von %s \n", "Peter");
    }

    // String = Zeichenkette
    public static void greet2(String name) { // Methode mit Parameter
        System.out.printf("Das ist das Haus von %s \n", name);
    }

    // Methodenparameter sind Pflichtparameter
    // void = Die Methode liefert keine Werte zurück. Sie erledingt einfach ihre Aufgabe
    public static void greet3(String name, int age) { // Methode mit zwei Parametern
        System.out.printf("Das ist %s \n", name); // %s für String
        System.out.printf("%d Jahre alt \n", age); // %d für Ganzzahlen

        // printf(Vorlage, Werte)
        // printf("Hallo %s", "Peter") // Hallo Peter
        // printf("Das ist %s %s", "Peter", "Pan") // Das ist Peter Pan
        // printf("Das ist %s %s", "Peter", "Parker") // Das ist Peter Parker

    }

    public static int add(int a, int b) { // Methode gibt eine Ganzzahl zurück
        // System.out.println(a + b);
        return a + b; // Gibt den Wert aus der Methode an den Aufrufer zurück
    }

    public static int div(int a, int b) {
        return a / b;
    }

    // Klasse ist der Bauplan für Objekte
    // Mansche Informationen stehen bereits im Bauplan und können dort geändert werden
    // Mansche Informationen stehen erst zur Verfügung wenn ein konkretes Haus gabeut ist

    public static int genRandNum() { // Klassenmethode - Kann direkt auf der Klasse ausgeführt werden
        Random randGenerator = new Random(); // braucht ein import
        //java.util.Random randGenerator = new java.util.Random(); // ohne import verwendbar
        return randGenerator.nextInt(100);
    }
}
