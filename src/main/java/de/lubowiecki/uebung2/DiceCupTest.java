package de.lubowiecki.uebung2;

import java.util.Scanner;

public class DiceCupTest {

    private Scanner scanner = new Scanner(System.in); // Instanzeingenschaft / Instanzvariable

    private DiceCup cup = new DiceCup();

    public static void main(String[] args) {
        //DiceCupTest test = new DiceCupTest();
        //test.start();
        new DiceCupTest().start();
    }

    private void start() {

        boolean exit = false;

        while(!exit) { // Endlosschliefe

            System.out.print("Seiten: ");
            //int seiten = scanner.nextInt();
            //cup.setSize(seiten);
            cup.setSize(scanner.nextInt());

            System.out.print("Anzahl Würfel: ");
            int wuerfeln = scanner.nextInt();

            for (int i = 0; i < wuerfeln; i++) {
                System.out.print(cup.roll() + ", ");
            }

            System.out.print("Weiter? ");
            String weiter = scanner.next(); // String

            //if(!weiter.equalsIgnoreCase("j")) {
            if(!weiter.toLowerCase().equals("j")) {
                exit = true;
            }
        }
    }
}
