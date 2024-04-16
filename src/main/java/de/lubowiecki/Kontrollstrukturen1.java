package de.lubowiecki;

public class Kontrollstrukturen1 {

    public static void main(String[] args) {

        int i = 10;

        if(i > 0) { // wenn
            // dann
            // true
            System.out.println("Jup. Ist > 0");
        }
        else {
            // sonst
            // false
            System.out.println("Nö. Ist NICHT >= 0");
        }

        // Wenn Klammern fehlen, wird nur die nächste Anweisung als Teil von if betrachtet
        if(i == 10) System.out.println("Jup. Ist 10");


        // Es wird nur ein Zweig ausgeführt
        if(i == 10) {
            System.out.println(10);
        }
        else if (i >= 10) {
            System.out.println(">=10");
        }
        else if (i == 50) {
            System.out.println(50);
        }
        else {
            System.out.println("sonstiges");
        }


        String name = null;

        if(i > 10) {
            name = "Peter";
        }
        else {
            name = "Unbekannt";
        }

        System.out.println(name);

        i = 20;

        // Kurzschreibweise für if-else
        System.out.println("Der Name ist " + ((i > 10) ? "Peter" : "Unbekannt"));
    }
}
