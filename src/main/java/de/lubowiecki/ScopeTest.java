package de.lubowiecki;

public class ScopeTest {

    public static void main(String[] args) {

        doSomething();
        int i = 20;

    }

    static void doSomething() {
        Object o = new Object();
        String s = "Hallo";
        int i = 10;
    }

    static String sagHallo(boolean bayer) {
        if(bayer) {
            return "Servus!"; // Methode wird verlassen
        }
        return "Moin";

        // System.out.println("Bla bla"); // Nicht mehr erreichbar
    }

}
