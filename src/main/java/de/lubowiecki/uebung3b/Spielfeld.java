package de.lubowiecki.uebung3b;

import java.util.Arrays;

// Anzeige des Roboters
public class Spielfeld {

    // Kostanten brauchen spätestens im Konstruktor ihre Werte
    private final int ROWS;
    private final int COLS;

    private char[][] feld;

    public Spielfeld() {
        ROWS = 10;
        COLS = 10;
        feld = new char[ROWS][COLS];
        reset(); // Befüllt das Array mit X
    }

    public Spielfeld(int rows, int cols) {
        ROWS = rows;
        COLS = cols;
        feld = new char[ROWS][COLS];
        reset(); // Befüllt das Array mit X
    }



    public void print() {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS ; j++) {
                System.out.print(feld[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void set(Robot bot) {
        reset();
        // TODO: Exceptions abfangen
        feld[bot.getY()][bot.getX()] = bot.getKennung();
    }

    // ist privat, weil diese Methode nur intern verwendet wird
    private void reset() {
        for (int i = 0; i < ROWS; i++) {
            Arrays.fill(this.feld[i], 'X');
        }
    }
}
