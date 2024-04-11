package de.lubowiecki;

import java.util.Random;

public class W6Roller {

    private Random rand = new Random(); // Außerhalb dieser Klasse nicht sichtbar!

    private final int SIZE; // final = Konstante

    public W6Roller(int size) {
        this.SIZE = size; // Baut das Objekt und setzt den Startzustand
        // Konstante ist nach der Zuweisung nicht mehr änedrebar
    }

    public int roll() {
        // Methoden der gleichen Klasse können das eigene private Inventar benutzen
        return rand.nextInt(SIZE) + 1;
    }
}
