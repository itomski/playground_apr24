package de.lubowiecki.uebung2b;

public class ParkhausTest {

    public static void main(String[] args) {

        /*
        ParkVorgang v1 = new ParkVorgang("HH:AB123");
        System.out.println(v1);

        try {
            Thread.sleep(10000); // Prozess wird für 10 Sek. pausiert
        } catch (InterruptedException e) {
            System.out.println("Problem");
        }

        v1.beenden();
        System.out.println(v1);

        System.out.println(v1.parkDauerInMinuten());
        */

        Parkhaus parkhaus1 = new Parkhaus(20);
        int nr1 = parkhaus1.einparken("HH:AB345");
        int nr2 = parkhaus1.einparken("HH:CZ445");

        System.out.println(nr1 + ", " + nr2);

        System.out.println(parkhaus1);

        System.out.println();

        //parkhaus1.ausparken(nr2);
        parkhaus1.ausparken("HH:AB345");

        System.out.println(parkhaus1);

    }

}
