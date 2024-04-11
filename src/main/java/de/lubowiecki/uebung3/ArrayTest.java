package de.lubowiecki.uebung3;

import java.util.Random;

public class ArrayTest {

    private static final int ROWS = 10;
    private static final int CELLS = 10;

    // Array wird mit dem Standardwert von int gefüllt (0)
    private static int[][] board = new int[ROWS][CELLS];// {{0,0,0,...}, {0,0,0,...}, ...}

    private static Random randGenerator = new Random();

    public static void main(String[] args) {

        printBoard();

        addPilz(50);

        System.out.println();
        printBoard();

    }

    public static void printBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void addPilz(int anzahl) {
        for (int i = 0; i < anzahl; i++) {
            addPilz();
        }
    }

    public static void addPilz() {
        int x = randGenerator.nextInt(ROWS);
        int y = randGenerator.nextInt(CELLS);

        if(board[x][y] == 1) { // An gewünschter Position ist schon ein Pilz
            // Dann eine andere Position suchen
            addPilz();
        }
        else {
            // Ansonsten Pilz setzten
            board[x][y] = 1;
        }
    }
}
