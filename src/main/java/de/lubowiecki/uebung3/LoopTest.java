package de.lubowiecki.uebung3;

//import java.util.Scanner;
import java.util.*; // Importiert alle Klassen aus util

public class LoopTest {

    private static Scanner scanner = new Scanner(System.in);
    //private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {

        // int i = 0 : Wird am Anfang der Schleife ausgeführt
        // i < 10 : Wird jedes mal ausgeführt
        // i++ : Werterhöhung wird nach des Ausführung des Bodys gemacht
        for (int i = 0; i < 10; i++) {
            // Body
            System.out.print(i + ", ");
        }

        System.out.println();

        boolean run = true;

        while(run) {

            //System.out.println("run");

            for (int i = 0; i < 10; i++) {
                // Body
                System.out.print(i + ", ");
            }

            System.out.println("one more time? ");

            if(scanner.next().equalsIgnoreCase("no")) {
                run = false;
            }
        }

        System.out.println("Programm wird beendet.");
    }
}
