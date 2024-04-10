package de.lubowiecki.uebung2;

import java.util.Random;

public class DiceCup {

    // Generator für Zufallszahlen
    private Random rand = new Random(); // Instanzvariable

    // Anzahl Augen
    private int size = 6;

    // Führt einen Würfelwurf mit einem passen Würfel aus
    public int roll() {
        return rand.nextInt(size) + 1;
    }

    // Gibt die Würfelart zurück
    public int getSize() {
        return size;
    }

    // Verändert nachträglich die Würfelart
    public void setSize(int size) {
        // && und
        // || oder
        if(size == 6 || size == 10 || size == 20 || size == 100) { // Nur bei 6,10,20,100 ändern
            this.size = size;
        }
    }
}
