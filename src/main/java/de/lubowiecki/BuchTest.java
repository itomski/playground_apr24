package de.lubowiecki;

public class BuchTest {

    public static void main(String[] args) {

        // Buch b1 = new Buch(); // Leeres Buch
        Buch b1 = new Buch("123-456-7890", "Peter Parker", "Kochen ohne Fett", 2020, true, 100); // Leeres Buch

        //b1.autor = "Heide Balzert"; // Schreiben
        b1.setAutor("Heide Balzert"); // Schreiben
        //b1.autor = "123";
        //b1.autor = null;
        //System.out.println(b1.autor.toUpperCase()); // Lesen
        System.out.println(b1.getAutor().toUpperCase()); // Lesen

        // b1.erscheinungsJahr = 2000; // ist privat - Schreiben nicht möglich
        //System.out.println(b1.erscheinungsJahr); // ist privat - Lesen nicht möglich
        b1.setErscheinungsJahr(-2000);
        b1.setErscheinungsJahr(2024);
        System.out.println(b1.getErscheinungsJahr());

        Buch b2 = new Buch("Philip K. Dick", "Bladerunner");

        Buch b3 = new Buch();
        b3.setAutor("William Gibson");

        System.out.println();

        System.out.println(getSum(1, 2, 7, 9,22, -19, 28, 200));
        System.out.println(getSum(22, -19, 28, 200));
        System.out.println(getSum());

    }

    // VarArgs - Anazahl der Parameter ist flexibel
    public static int getSum(int... param) {
        int sum = 0;

        for(int i : param) {
            sum += i;
        }

        return sum;
    }
}

class Xyz {

}
