package de.lubowiecki;

public class OperatorTest {

    public static void main(String[] args) {

        int sum = 1 + 2 * 3;
        sum = (1 + 2) * 3;

        int a = 2;
        sum = 1 + a++ + 4;
        // sum: 7
        // a: 3

        int b = 3;

        if(a == 3 && b == 4) { // Logisches AND
            System.out.println("WAHR1");
        }

        if(a == 3 || b == 4) { // Logisches ODER
            System.out.println("WAHR2");
        }

        System.out.println();

        if(a == 3 & b == 4) { // Bit AND
            System.out.println("WAHR1");
        }

        if(a == 3 | b == 4) { // Bit ODER
            System.out.println("WAHR2");
        }

        System.out.println();

        int c = 10;
        // 00001010
        int d = 7;
        // 00000111

        System.out.println(c & d);
        // 00001010
        // 00000111
        // 00000010 = 2

        //System.out.println(c && d); // && kann nur mit boolean arbeiten
        System.out.println(c | d);
        // 00001010
        // 00000111
        // 00001111 = 15


        //System.out.println(c || d); // || kann nur mit boolean arbeiten
        System.out.println(c ^ d); // XOR
        // 00001010
        // 00000111
        // 00001101 = 13

        int x = 10;
        byte y = 20;
        int sum2 = x + y;
    }

}
