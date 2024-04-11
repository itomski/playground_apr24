package de.lubowiecki;

public class W6RollerTest {

    public static void main(String[] args) {

        W6Roller roller = new W6Roller(100); // default Konstruktor
        // Alle Klassen in Java erben von der Klasse Object

        System.out.println(roller.roll());
        System.out.println(roller.roll());
        System.out.println(roller.roll());
        System.out.println(roller.roll());
        System.out.println(roller.roll());
        System.out.println(roller.roll());


    }
}
