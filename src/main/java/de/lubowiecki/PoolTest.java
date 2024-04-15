package de.lubowiecki;

public class PoolTest {

    public static void main(String[] args) {

        Integer b1 = 10; // Autoboxing
        Integer b2 = 10;

        System.out.println(b1 == b2); // Ist es das gleiche Objekt?

        b1 = 20;
        b2 = 20;

        System.out.println(b1 == b2);

        // Byte-Pool
        // Alle Zahlenwerte im Umfang von byte (-128 bis 127) liegen bereits im Pool

        b1 = 130;
        b2 = 130;

        System.out.println(b1 == b2);


    }
}
