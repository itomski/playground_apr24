package de.lubowiecki.uebung3b;

import java.util.Scanner;

// Steuerung
public class App {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Spielfeld spielfeld = new Spielfeld(15, 15);

        Robot robot = new Robot("R2-D2", '#', 5, 5);

        app: while(true) {

            System.out.print("Eingabe: ");
            String eingabe = scanner.next().trim().toLowerCase();

            // Verlässt das Programm, wenn exit eingegeben wurde
            if(eingabe.equals("exit")) {
                break app;
            }

            // Zerlegt die Eingabe in einzelne Zeichen
            String[] schritte = eingabe.split("");

            for(String schritt : schritte) {

                switch(schritt) {

                    case ">": // Vorwärts
                        robot.vorwaerts();
                        break;

                    case "<": // Rückwärts
                        robot.rueckwaerts();
                        break;

                    case "l": // Nach links drehen
                        robot.linksDrehen();
                        break;

                    case "r": // Nach rechts drehen
                        robot.rechtsDrehen();
                        break;

                    default: // Andere Zeichen
                        System.out.println("Ungültig");
                }
            }

            spielfeld.set(robot);
            spielfeld.print();
            //System.out.println(robot);
        }

        System.out.println("Programm wurde beendet");
    }

}
