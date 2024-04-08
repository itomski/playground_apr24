package de.lubowiecki;

public class Main {

    // Einstieg in das Programm
    public static void main(String[] args) {

        // int = Datentyp
        // i = Name der Variable
        // 10 = Wert, der der Variable zugewiesen wird
        int i = 10; // Variable

        // Strings (Zeichenketten) werden in " " gesetzt
        // Ein Zeichen (char) wird in einfache 'c' geschrieben

        System.out.println("Hello world!"); // Ausgabe auf der Konsole
        System.out.println("Wert von i: " + i);

        Greeter.greet1(); // Aufruf der Methode einer anderen Klasse ohne Parameter

        Greeter.greet2("Bruce"); // Aufruf einer Methode mit einem Parameter
        Greeter.greet2("Carol");
        Greeter.greet2("Natasha");
        Greeter.greet2("Tony");

        // sagHallo(); // Aufruf einer Funktion

        // Greeter.greet3("Peter", 22, 25); // Kompilerfehler - Keine passende Methode grfunden
        Greeter.greet3("Peter", 22);

        int erg = Greeter.add(10, 25);
        System.out.println("Die Summe von a und b ist " + erg);

        // Variable wird neu zugewiesen
        erg = Greeter.div(10, 0); // Laufzeitproblem, division durch 0 nicht erlaubt

        System.out.println("Erg: " + erg);

    } // Ende der main-Methode = Ende des Programms
}

// Methoden sind Funktionen, die in einer Klasse gruppiert/definiert werden
// Reine Funktionen gibt es in Java NICHT

/* Funktion
function sagHallo() {
    System.out.println("Hallo");
}
*/