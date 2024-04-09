package de.lubowiecki;

import java.util.Random;

public class RandomZahlen {

    public static void main(String[] args) {

        System.out.println((int) (Math.random() * 10));

        Random randGenerator = new Random();
        System.out.println(randGenerator.nextInt(100));
        System.out.println(randGenerator.nextInt(100));
        System.out.println(randGenerator.nextInt(100));
        System.out.println(randGenerator.nextInt(100));

    }
}
