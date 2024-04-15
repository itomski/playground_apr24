package de.lubowiecki;

import java.util.Scanner;

public class UiTest {

    private Scanner scanner = new Scanner(System.in);

    private static final String KEYS = "\n*************************************" +
                                        "\n h = help" +
                                        "\n q = exit" +
                                        "\n*************************************";

    public static void main(String[] args) {
        new UiTest().start();
    }

    private void start() {

        System.out.println("Start");

        System.out.println(KEYS);

        app: while(true) {

            System.out.print("Eingabe: ");

            switch(scanner.next().trim().toLowerCase()) {

                case "h":
                    System.out.println(KEYS);
                    break;

                case "q":
                    break app; // bricht die while-Schgleife ab

                default:
                    System.out.println("Falsche Eingabe");

            }
        }

        System.out.println("Ende");
    }
}
