package oop51;

import oop.OOP_26.Cat27;

import java.util.Scanner;

public class ExampleDefaultValues {
    public int x; // по умолчанию 0
//    x = null; // так нельзя
    public boolean bool; // по умолчанию false
    public double dbl; // по умолчанию 0.0
    public Cat27 cat27; // null - значение по умолчанию для объектов
    // Если мы попытаемся вызвать метод или обратится к полю у null - будет брошено исключение -
    // - NullPointerException
    public Scanner scanner; // null
}
