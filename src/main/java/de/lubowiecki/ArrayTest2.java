package de.lubowiecki;

import java.util.Arrays;

public class ArrayTest2 {

    public static void main(String[] args) {

        String[] namen = {"Peter", "Carol", "Bruce", "Natasha", "Steve", "Tony", "Scott"};
        System.out.println(Arrays.toString(namen));

        namen[0] = "Bob";
        System.out.println(Arrays.toString(namen));

        // ArrayIndexOutOfBoundsException: gewünschter Index liegt außerhalb des Arrays
        // namen[7] = "Anna";

        //namen = {"Steve", "Tony", "Scott"}; // Schreibweise mit {} nur bei Deklaration der Variable möglich
        namen = new String[]{"Steve", "Tony", "Scott"}; // OK
        System.out.println(Arrays.toString(namen));

        printNumbers(new int[]{10, 22, 17, 19, 1});
        printNumbers(new int[]{});
        printNumbers(new int[]{1000, 2000});
        printNumbers(new int[100]);

        int[] arr = new int[4];
        arr[3] = 100;
        arr[2] = 200;

        System.out.println();
        printNumbers(arr);

        System.out.println();

        System.out.println(Arrays.toString(getNumbers(10)));


        int a, b; // a und b sind vom typ int
        int[] c, d; // c und d sind vom typ int-Array
        int e[], f; // e ist vom typ int-Array und f ist vom typ int
        int g = 15, h = 10; // mit Startwert

        // Mehrdimensional
        char[][] chars = {{'a', 'b'},{'e', 'f'}}; // Ein Array von char-Arrays

        for(char[] charr : chars) {
            for(char ch : charr) {
                System.out.println(ch);
            }
        }
    }

    public static void printNumbers(int[] arr) {
        for(int i : arr) {
            System.out.println(i);
        }
    }

    // Rückgabetyp ist ein Array
    public static int[] getNumbers(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = 5;
        }
        return arr;
    }
}
