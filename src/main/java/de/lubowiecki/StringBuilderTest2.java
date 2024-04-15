package de.lubowiecki;

public class StringBuilderTest2 {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder(); // Internes Array: 16
        //StringBuilder sb = new StringBuilder("Hi"); // Internes Array: 2 + 16
        // StringBuilder sb = new StringBuilder(100); // Internes Array: 100

        sb.append("Hi");
        System.out.println(sb.length()); // Anzahl Zeichen
        System.out.println(sb.capacity()); // Größe des interenen Arrays

        System.out.println();
        sb.append("Das ist das Haus von Nikigraus"); // Internes Array muss vergrößert werden
        // Neue capacity = Alte capacity * 2 + 2

        System.out.println(sb.length());
        System.out.println(sb.capacity());


    }
}
