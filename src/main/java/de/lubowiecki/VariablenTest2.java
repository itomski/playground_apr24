package de.lubowiecki;

public class VariablenTest2 {

    public static void main(String[] args) {

        // new Thing("...")
        Thing t1 = new Thing("Tasse, rot");
        System.out.println(Thing.getCounter()); // statische Methoide wird direkt auf der Klasse ausgeführt
        //System.out.println(Thing.getName()); // Isntanzmethoden sind über die Klasse nicht erreichbar
        System.out.println(t1.getName()); // Sie müssen auf dem Objekt/Instanz ausgeführt werden

        Thing t2 = new Thing("Tasse, blau");
        System.out.println(Thing.getCounter());
        System.out.println(t2.getName());

        Thing t3 = new Thing("Tasse, schwarz");
        System.out.println(Thing.getCounter());
        Thing t4 = new Thing("Tasse, gelb");
        System.out.println(Thing.getCounter());
        Thing t5 = new Thing();
        System.out.println(Thing.getCounter());

        System.out.println(t1); // print auf Objekten führt automatisch die toString-Methode aus
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
        System.out.println(t5);

    }
}

class Thing {

    private static int counter; // Standardwert 0
    private int id;

    private String name; // Instanzvariabe: Jedes Objekt hat eine eigene
    // Für String ist standardwert null

    // Ist kein Konstruktor deklariert, stellt Java einen leeren default Konstruktor bereit
    public Thing() {
        id = ++counter;
    }

    /*
    public Thing() { // Error: Ein anderer Konstruktor mit gleicher Parameterliste ist bereits vorhanden
    }
    */

    // Der Konstruktor ist eine Methode, die ein Objekt konstruiert
    public Thing(String name) {
        // Aufruf: Thing variablenName = new Thing("Buch, Kochen ohne Fett")
        // this.name = Instanzvariable
        // name = Lokale Variable
        // this = dieses Objekt / die aktuell verwendete Instanz
        this.name = name;
        //this.id = ++this.counter;
        id = ++counter; // Da hier keine andere Variable id oder couter heißt kann auf das this verzichtet werden
    }

    @Override
    public String toString() { // Beschreibt, wie das Objekt in String konvertiert wird
        return "Thing{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public static int getCounter() {
        return counter;
    }
}
