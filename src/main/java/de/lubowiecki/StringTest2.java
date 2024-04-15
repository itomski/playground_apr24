package de.lubowiecki;

public class StringTest2 {

    public static void main(String[] args) {

        String s1 = "Hallo String"; // Pool
        String s2 = new String("Hallo String"); // Nicht im Pool
        String s3 = "Hallo String"; // Neue Referenz auf das Objekt im Pool

        System.out.println(s1 == s2); // Zeigen beide Referenzen auf das gleiche Objekt?
        System.out.println(s1.equals(s2));// Haben beide Objekte den gleichen Inhalt

        System.out.println();

        System.out.println(s1 == "Hallo String"); // Beide Referenzen zeigen auf das gleiche Objekt im Pool
        System.out.println(s1.equals(s3));

        // Wertevergleich mit == gilt nur für primitive Datentypen

        System.out.println();

        s1 = s2;
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        System.out.println();

        // Strings sind Immutable

        s1 = s1.concat("..."); // Neues Objekt wird produziert
        System.out.println(s1);

        s1 = "..." + s1; // Neues Objekt wird produziert

        s1 = "0"; // 01

        for(int i = 0; i < 10; i++) {
            s1 += i;
        }

    }

}
