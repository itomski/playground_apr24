package de.lubowiecki;

public class DatentypTest2 {

    public static void main(String[] args) {

        int i = 10;
        byte b = (byte) i; // Cast ist notwendig
        i = b; // ohne Cast möglich

        byte b2 = 100;
        //byte bSum = b + b2; // mind. int
        b += 10; // b = (byte)(b + 10);
        b++; // b = (byte)(b + 1);

        //1++; // 1 = 1 + 1; // nur mit Variablen möglich

        int j;
        j = 100;
        // int if = 100; // if ist ein Schlüsselwort

        Object o = new Object();

        // int i = 200; // Redeklaration - in Java nicht erlaubt
        i = 200; // Neuer Wert wird zugewisen

        {
            double x = 20.5;
            //byte x = 20; // Variable x ist reserviert
        }
        byte x = 20; // Hier ist x out-of-scope

        for (int k = 0; k < 10; k++) { // scope von k ist auf diese Schleife eingeschränkt
        }

        int k = 0;
        for (; k < 10; k++) {
        }
    }



}
