package de.lubowiecki;

public class OverloadingTest {

    public static void main(String[] args) {

        doSomething(10); // int
        //doSomething((byte) 10); // byte
        short s = 10;
        //doSomething(s); // short

        // 1. Passende Methode, wenn nicht verfügbar
        // 2. primitive Widening, wenn nicht verfügbar
        // 3. Autoboxing zum passenden Wrappertyp
        // 4. komplex Widening
        // Error

    }

    /*
    static void doSomething(int v) {
        System.out.println("int");
    }
    */

    static void doSomething(byte v) {
        System.out.println("byte");
    }

    static void doSomething(short v) {
        System.out.println("short");
    }

    /*
    static void doSomething(long v) {
        System.out.println("long");
    }
    */

    /*
    static void doSomething(float v) {
        System.out.println("float");
    }
    */

    /*
    static void doSomething(double v) {
        System.out.println("double");
    }
    */

    /*
    static void doSomething(Integer v) {
        System.out.println("Integer");
    }
    */

    static void doSomething(Long v) {
        System.out.println("Long");
    }

    static void doSomething(Number v) {
        System.out.println("Number");
    }

    static void doSomething(Object v) {
        System.out.println("Object");
    }
}
