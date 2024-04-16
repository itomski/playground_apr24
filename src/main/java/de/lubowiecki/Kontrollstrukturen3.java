package de.lubowiecki;

public class Kontrollstrukturen3 {

    public static void main(String[] args) {

        String eingabe = "l";

        // Jede Option darf nur 1x vorhanden sein

        switch(eingabe) { // Wert kann byte, short, int, char, String, ENUM

            case "new":
                System.out.println("neuen Datensatz anlegen");
                break; //optional

            case "list":
            //case "list": // Option ist bereits deklariert
            case "l":
                System.out.println("Alle Datensätze anzeigen");
                break;

            case "exit":
                System.out.println("Programm verlassen.");
                break;

            default: // Muss nicht als letzte Option deklariert sein
                System.out.println("Alle anderen...");
        }

        byte input = 10;

        switch(input) { // eingabe ist byte

            case 10:
                System.out.println("neuen Datensatz anlegen");
                break;

            case 20:
                System.out.println("Alle Datensätze anzeigen");
                break;

            case 40:
                System.out.println("Programm verlassen.");
                break;

            //case 180: // ist zu groß für byte
            case 127: // ok
                System.out.println("...");
                break;

            default: // Muss nicht als letzte Option deklariert sein
                System.out.println("Alle anderen...");
        }

        System.out.println();

        Wochentag t1 = Wochentag.SONNTAG;

        switch(t1) {
            case MONTAG:
            case DIENSTAG:
            case MITTWOCH:
            case DONNERSTAG:
            case FREITAG:
                System.out.println("Innerhalb der Woche");
                break;

            case SAMSTAG:
            case SONNTAG:
                System.out.println("Wochenende");
        }
    }
}
