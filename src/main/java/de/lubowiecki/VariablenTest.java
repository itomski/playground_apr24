package de.lubowiecki;

public class VariablenTest {

    private int zahl = 10; // Instanzvariable
    private static int andereZahl = 100; // Klassenvariable

    public static void main(String[] args) {

        int ganzAndereZahl = 1000; // Lokale Variable

        // Lokale Variable: Nur in der Methode sichtbar, in der sie deklariert ist

        // Klassenvariablen sind in allen Methoden und allen Objekten sichtbar

        // VariablenTest = Komplexer Typ (Name der gewünschten Klasse)
        VariablenTest test1 = new VariablenTest();
        VariablenTest test2 = new VariablenTest();
        //test2 = null; // Referenz zu dem Objekt auf dem Heap wird entfernt

        // Klassenvariable
        // Alle Objekte und die Klasse teilen sich EINE Variable
        System.out.println(test1.andereZahl);
        System.out.println(test2.andereZahl);
        System.out.println(VariablenTest.andereZahl);
        test1.andereZahl = 200; // Ändert den Zustand für alle
        System.out.println(test1.andereZahl);
        System.out.println(test2.andereZahl);
        System.out.println(VariablenTest.andereZahl);

        machWas();

        System.out.println(test1.andereZahl);
        System.out.println(test2.andereZahl);
        System.out.println(VariablenTest.andereZahl);

        System.out.println();

        // Instanzvariablen: Jedes Objekt hat seine eigenen
        // VariablenTest.zahl // Instanzvariablen sind in der Klasse nicht verfügbar
        test1.zahl = 20; // Ändert nur zahl in test1. test2 bliebt unverändert
        System.out.println(test1.zahl);
        System.out.println(test2.zahl);

        // Klassenvariblen teilen sich alle Objekte und die Klasse gemeinsam
        // Instanzvariablen gehören jedem Objekt persönlich - Objektzustand

    }

    private static void machWas() {
        VariablenTest.andereZahl = 300;
    }

}
