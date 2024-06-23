package oop2.oop51;

import java.util.Scanner;

public class ExampleDefaultValues {

    // null

    public int x; // по умолчанию 0
//    x = null; // так нельзя
    public boolean bool; // по умолчанию false
    public double dbl; // по умолчанию 0.0
    public Cat27 cat27; // null - значение по умолчанию для объектов
    // Если мы попытаемся вызвать метод или обратится к полю у null - будет брошено исключение -
    // - NullPointerException
    public Scanner scanner; // null

    public static void m7() {
        System.out.println("7");
        int x = 3;

        // массив stack trace, можно сохранить порядок вызова в массив:
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : stackTraceElements) {

            System.out.println(element);
        }
        System.out.println("plus one line");
        throw new RuntimeException("Не надо дальше, пожалуйста!");
    }
}
