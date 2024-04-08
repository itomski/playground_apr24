package de.lubowiecki;

// java de.lubowiecki.InstanzTest 10 20 Hallo

public class InstanzTest {

    // args der main-Methode können Werte verarbeiten, die beim Start des Programms übergeben wurden
    // z.B. java de.lubowiecki.InstanzTest 10 20 Hallo
    public static void main(String[] args) {

        // Ausgabe der Argumente aus der args-Variable
        for(String a : args) { // Schleife
            System.out.println(a);
        }

        System.out.println("------------");

        // Intanz = Ein Objekt einer Klasse
        // Kann einen eigenen Zustand haben, unabhängig von anderen Objekten der gleichn Klasse

        Person p1 = new Person("Peter", "Parker", 25); // Instanz der Klasse Person
        Person p2 = new Person("Carol", "Danvers", 28);
        Person p3 = new Person("Tony", "Stark", 46);

        System.out.println(p1.vorname + " " + p1.nachname);
        System.out.println(p3.vorname + " " + p3.nachname);

        System.out.println(p3.toString());
        System.out.println(p3); // Verwendet automatisch die toString-Methode
        System.out.println(p1);
        System.out.println(p2);

        System.out.println(); // Zeilenumbruch

        p1.vorname = "Hans"; // Ändern der Eigenschaft von p1
        System.out.println(p1);
        // Zuvor muss mit new eine Instanz gebaut werden
        System.out.println(p1.getName()); // Ausführung der Instanz-Methode, Objekt wird benötigt

        System.out.println(Greeter.genRandNum()); // Ausführung der Klassen-Methode, Objekt wird NICHT benötigt
    }
}
