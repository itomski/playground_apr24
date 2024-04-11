package de.lubowiecki;

public class ArrayTest3 {

    public static void main(String[] args) {

        long start = System.currentTimeMillis(); // Aktueller Zeitpunkt im Millisekunden

        int[] arr = new int[1_000_000_000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 10) + 1;
        }

        long ende = System.currentTimeMillis();

        System.out.println(ende - start + "ms");

    }
}
