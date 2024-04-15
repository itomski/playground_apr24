package de.lubowiecki;

public class StringBuilderTest {

    public static void main(String[] args) {

        // Veränderbare Zeichenkette

        int zahl = 5;

        StringBuilder sb1 = new StringBuilder();
        sb1.append("Hallo");
        sb1.append(" ");
        //sb1.append("Welt" + zahl); // Erzeugt einen neuen String vor der Zuweisung
        sb1.append("Welt");
        sb1.append(zahl);
        System.out.println(sb1); // toString wird verwendet

        // StringBuilder ist kein String
        //String str = sb1;
        String str = sb1.toString(); // toString() konvertiert StringBuilder in String

        sb1.append(1).append(2).append(100);

    }

}
