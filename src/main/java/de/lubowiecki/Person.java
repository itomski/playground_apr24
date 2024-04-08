package de.lubowiecki;

public class Person {

    String vorname;

    String nachname;

    int alter;

    public Person(String vorname, String nachname, int alter) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.alter = alter;
    }

    public String getName() { // Instanzmethode - gehört dem Objekt (NICHT static!)
        return vorname + " " + nachname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                ", alter=" + alter +
                '}';
    }
}
