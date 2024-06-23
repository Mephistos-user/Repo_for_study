package oop2.oop52;


import oop2.oop51.ExampleDefaultValues;

public class MyClass52 {
    public static void main(String[] args) {

        // stack trace, массив stack trace

        m1();

    }

    public static void m1() {
        System.out.println("1");
        m2(4);
    }
    public static void m2(int m2x) {
        int m2y = 5;
        System.out.println("2");
        m3();
    }
    public static void m3() {
        System.out.println("3");
        m4();
    }
    public static void m4() {
        System.out.println("4");
        m5();
    }
    public static void m5() {
        System.out.println("5");
        ExampleDefaultValues values = new ExampleDefaultValues();
        values.m7();
    }
}
