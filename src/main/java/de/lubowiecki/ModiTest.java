package de.lubowiecki;

import java.util.Arrays;
import java.util.function.IntSupplier;
import java.util.stream.IntStream;

public class ModiTest {

    public final int A = 100; // Instanz Konstante
    public static final int B = 100; // Klassen Konstante

    public static void main(String[] args) {

        Object o = new Object();
        System.out.println(o.hashCode());

        // Compile-Time Konstante
        final int a = 100; // Lokale Konstante
        // a = 200; // ist final. Kann nicht mehr geändert werden
        System.out.println(a);

        // Runtime Konstante
        final int b;
        b = 200;
        System.out.println(b);

        //while(a == 100) {
        //}

        while(b == 100) {
        }

        System.out.println("Ende");

        int[] zahlen = new int[10]; // mit Standardwert befüllt

        // Utility-Klassen haben nur statische Methoden
        // Das was bearbeitet werden soll, wird als Parameter an die Methode übergeben
        System.out.println(Arrays.toString(zahlen));
        Arrays.fill(zahlen, 10); // Setzt einen Wert an jede Prosition des Arrays

        System.out.println(zahlen);
        System.out.println(Arrays.toString(zahlen));

        // Arrays arrUtil = new Arrays(); // hat einen privaten Konstruktor

        System.out.println();

        int[] zahlen2 = {2,7,99,18,-5,1,99};
        System.out.println(Arrays.toString(zahlen2));

        Arrays.sort(zahlen2);
        System.out.println(Arrays.toString(zahlen2));

        // binarySearch geht davon aus, dass die Sammlung sortiert ist
        System.out.println(Arrays.binarySearch(zahlen2, 18));
        //{1,15,19,22,7,38,1000,-5}
        //{-5,1,7,15,22,19,38,1000}

        // Lambda
        IntSupplier rand = () -> (int)(Math.random() * 10) + 1;

        int[] zufall = IntStream.generate(rand)
                .limit(100)
                .toArray();

        System.out.println(Arrays.toString(zufall));
    }
}
