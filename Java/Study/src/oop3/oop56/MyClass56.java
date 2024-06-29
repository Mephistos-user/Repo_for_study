package oop3.oop56;

import oop3.oop54.Cat54;
import oop3.oop54.Dog54;

import java.io.File;

public class MyClass56 {
    public static void main(String[] args) {

        // КАЖДЫЙ класс в Java неявно наследуется от класса Object

        Cat54 cat54 = new Cat54();
        cat54.name = "Barsik";
        cat54.age = 5;

        Dog54 dog54 = new Dog54();

        System.out.println("dog: " + dog54); // вызывается метод toString() класса Object
        String dogStr = dog54.toString();
        System.out.println("Dog.toString: " + dogStr); // вызывается метод toString() класса Object

        // переопределим метод toString() класса Object для класса Cat54 (oop3.oop54.Cat54)

        System.out.println("Cat: " + cat54); // вызывается переопределенный для класса Cat54 метод toString() класса Object
        String catStr = cat54.toString();
        System.out.println("Cat.toString: " + catStr); // вызывается переопределенный для класса Cat54 метод toString() класса Object

        File file = new File("table.csv");
        System.out.println("File: " + file); // вызывается переопределенный для класса File метод toString() класса Object
        System.out.println("File.toString: " + file.toString()); // вызывается переопределенный для класса File метод toString() класса Object

        String info = "I have a file: " + file;
        System.out.println(info);




    }


}
