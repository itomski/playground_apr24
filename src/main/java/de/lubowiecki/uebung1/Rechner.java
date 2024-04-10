package de.lubowiecki.uebung1;

public class Rechner {

    private static String protokoll = "";

    // final = Konstante. Kann nachträglich nicht mehr geändert werden
    private static final String TEMPLATE = "%f %s %f = %f \n"; // 10.0 + 20.0 = 30.0

    // public : steuert die Sichtbarkeit der Methode
    // int: Rückgabetyp
    // add: Name der Methode
    // int a, int b: Parameter der Methode
    // return: Rückgabe eines Wertes an den Aufrufer der Methode
    public double add(double a, double b) { // Instanzmethode

        // Lokale Variblen sind nur bis zum Ende der Methode vorhanden
        double erg = a + b;
        //protokoll += a + " + " + b + " = " + erg + "\n"; // += erweitert den Inhalt
        addToProtokoll(a, b, '+', erg);
        return erg;
    }

    // static: Methode kann direkt auf der Klasse ausgeführt werden
    public static double sub(double a, double b) { // Klassenmethode
        double erg = a - b;
        //protokoll += a + " - " + b + " = " + erg + "\n";
        addToProtokoll(a, b, '-', erg);
        return erg;
        //return a - b;
    }

    public static double multi(double a, double b) { // Klassenmethode
        double erg = a * b;
        //protokoll += a + " * " + b + " = " + erg + "\n";
        addToProtokoll(a, b, '*', erg);
        return erg;
    }

    // double:
    public static double div(double a, double b) { // Klassenmethode
        double erg = a / b;
        //protokoll += a + " / " + b + " = " + erg + "\n";
        addToProtokoll(a, b, '/', erg);
        return erg;
    }

    public static String getProtokoll() {
        return protokoll;
    }

    public static void clearProtokoll() {
        protokoll = ""; // Das Protokoll wird mit "" überschrieben
    }

    private static void addToProtokoll(double a, double b, char op, double erg) {
        // String.format ist wie Syste.out.printf, aber statt etwas auszugeben liefert
        // es einen formatierten String zurück
        protokoll += String.format(TEMPLATE, a, op, b, erg);
    }
}