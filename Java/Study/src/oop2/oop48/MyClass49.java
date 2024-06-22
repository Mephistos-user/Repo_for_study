package oop2.oop48;

import java.util.Scanner;

public class MyClass49 {
    public static void main(String[] args) {

        // try catch

        Scanner scanner = new Scanner(System.in);

        System.out.println("Begin");

        try {
            System.out.println("Введите цифру: ");
            char ch = scanner.next().charAt(0);
            if (!Character.isDigit(ch)) {
                throw new RuntimeException("This is not a digit!");
            }
            int num = (int)ch - 48;
            System.out.println("В квадрате будет: " + num * num);

        } catch (RuntimeException e) {
            System.out.println("There is some error!!!");
            System.out.println(e.getMessage()); // отобразит в консоли текст ошибки из строки 16
//            e.printStackTrace(); // отображает трассировку стека ошибки в консоли (отдельный поток)
        }
        System.out.println("its done");
    }
}
