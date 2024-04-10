package de.lubowiecki;

import java.util.Arrays;
import java.util.Random;

public class ArrayTest {

    public static void main(String[] args) {

        // Kann mit primitiven oder komplexen Typen gefüllt werden

        int i = 10;
        int[] iarr = {10,15,22,18,99,0,-5}; // Mit 7 Werten

        System.out.println(iarr);
        System.out.println(iarr[0]); // Alle Arrays beginnen mit dem Index 0
        System.out.println(iarr[4]);

        System.out.println();

        for (int j = 0; j < iarr.length ; j++) {
            System.out.println(iarr[j]);
        }

        System.out.println();

        // in j wird der aktuelle Wert abgelegt
        for(int j : iarr) {
            System.out.println(j);
        }

        System.out.println();

        // Arrays - Klasse mit statischen Hilfsmethoden zum Arbeiten mit Arrays
        System.out.println(Arrays.toString(iarr));


        String[] namen = new String[10]; // Leeres Array mit Größe 10
        namen[1] = "Peter";

        int size = new Random().nextInt(10) + 1;
        namen = new String[size]; // Variable wird mit einem neuen Array belegt

        doSomething();

        // namen = null; // Referenz wird auf null gesetzt d.h. Array kann von GC vom Speicher entfernt werden

        String s = null;
        // System.out.println(s.toUpperCase()); // NullPointerException

    }

    public static void doSomething() {
        int i = 100;
        char c = 'x';
    }
}
