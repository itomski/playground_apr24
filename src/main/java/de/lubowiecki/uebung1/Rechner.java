package de.lubowiecki.uebung1;

public class Rechner {

    // public : steuert die Sichtbarkeit der Methode
    // int: Rückgabetyp
    // add: Name der Methode
    // int a, int b: Parameter der Methode
    // return: Rückgabe eines Wertes an den Aufrufer der Methode
    public double add(double a, double b) { // Instanzmethode
        double erg = a + b;
        return erg;
    }

    // static: Methode kann direkt auf der Klasse ausgeführt werden
    public static double sub(double a, double b) { // Klassenmethode
        //int erg = a - b;
        //return erg;
        return a - b;
    }

    public static double multi(double a, double b) { // Klassenmethode
        return a * b;
    }

    // double:
    public static double div(double a, double b) { // Klassenmethode
        return a / b;
    }
}