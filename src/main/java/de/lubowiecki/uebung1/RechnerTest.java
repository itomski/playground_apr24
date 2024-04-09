package de.lubowiecki.uebung1;

public class RechnerTest {

    public static void main(String[] args) {

        // Rechner: Typ des Objekts
        // rechner: Name der Variable
        Rechner rechner = new Rechner();

        // Instanzmethode braucht ein Objekt
        System.out.println("Erg: " + rechner.add(10, 15));

        // Klassenmethode wird direkt auf der Klasse verwendet
        System.out.println("Erg: " + Rechner.sub(10, 15));

        // Methode wird trotzdem auf der Klasse ausgeführt
        //System.out.println("Erg: " + rechner.sub(10, 15));

        System.out.println("Erg: " + Rechner.multi(10, 15));

        System.out.println("Erg: " + Rechner.div(10, 15));

        // Standard in Java
        // Ganzzahlen: int
        // Fließkommazahlen: double

        double d = 10.5;
        // float f = 10.5f;
    }
}
