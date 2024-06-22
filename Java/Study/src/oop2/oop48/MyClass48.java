package oop2.oop48;

import exceptions.WrongWordsCountException;

import java.util.Scanner;

public class MyClass48 {
    public static void main(String[] args) {

        // проброска исключения

//        Scanner scanner = new Scanner(System.in);
//        int x = scanner.nextInt();
//        int y = scanner.nextInt();
//
//        if (y == 0) {
//            RuntimeException exception = new RuntimeException("Не верные входные данные. Нельзя делить на 0!");
//             throw exception;
////            System.out.println(exception);
//        }
//        System.out.println(x/y);

        try {
            twoWords();
        } catch (WrongWordsCountException ourError) {
//            if (ourError.words > 2) {
//                System.out.println("too many words");
//            } else {
//                System.out.println("too few words");
//            }
//            throw new RuntimeException("RE");

            System.out.println(ourError.getMessage());
            throw ourError;
        } finally { // "в конечном счете" - этот блок выполнится в любом слючае, даже если будет поймано исключение в блоке catch
            System.out.println("this is finally block");
        }

        // этот код выполнится только в случае, если в catch не было конструкции throw и она не сработала
        System.out.println("is done");


    }
    static void twoWords() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два слова");
        String line = scanner.nextLine();
        String[] words = line.split(" ");

        if (words.length != 2) {
            throw new WrongWordsCountException(words.length);
        }

        System.out.println(words[1] + " " + words[0]);
        int lettersCount = words[0].length() + words[1].length();
        System.out.println("sum of letters: " + lettersCount);
    }
}
