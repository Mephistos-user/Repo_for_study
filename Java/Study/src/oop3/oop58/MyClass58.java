package oop3.oop58;

import oop2.oop51.Cat27;
import oop3.oop54.Cat54;

import java.util.Scanner;

public class MyClass58 {
    public static void main(String[] args) {

        // равенства и equals

//        String x = "одна строка";
//        String y = "одна строка";
//
//        System.out.println(x == y); // false потому что String - объект ?????? true
//
//        System.out.println(x.equals(y)); // true
//
//        // переопределим метод equals для объекта Cat27
//
//        Cat27 cat1 = new Cat27("Barsic", 5);
//        Cat27 cat2 = new Cat27("Barsic", 5);
//
//        System.out.println(cat1 == cat2); // false т.к сравниваются объекты (ссылки) а не значения в них
//        System.out.println(cat1.equals(cat2)); // false

        Bird bird1 = new Bird("Popugai", 3);
        Bird bird2 = new Bird("Vorobei", 3);
        Bird bird3 = bird1;
        Bird bird1Copy = new Bird("Popugai", 3);

        // сравниваются ссылки а не значения в объекте:
        System.out.println(bird1 == bird2); // false
        System.out.println(bird1 == bird3); // true
        System.out.println(bird1 == bird1Copy); // false


    }
}
