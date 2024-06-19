package oop.OOP_34;

import java.util.Scanner;

public class MyClass34 {
    public static void main(String[] args) {

        // break, continue
        Scanner scanner = new Scanner(System.in);

        // вывести только первое число из массива большее 10
//        int[] arr = new int[5];
//
//        System.out.println("Enter array of 5 element: ");
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = scanner.nextInt();
//        }
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > 10) {
//                System.out.println(arr[i]);
//                break; // в этом случае только первое число большее 10
//            }
//        }

        // вывести только первое слово из строки
//        System.out.println("Enter line: ");
//        String line = scanner.nextLine();
//
//        System.out.println("Result: ");
//        for (int i = 0; i < line.length(); i++) {
//            if (line.charAt(i) == ' ') {
//                break; // в этом случае только первое слово выведется
//            }
//            System.out.print(line.charAt(i));
//        }

        // посчитать все заглавные буквы в тексте и заменить на маленькие
        String line = scanner.nextLine();
        StringBuilder builder = new StringBuilder(line);
        int count = 0;

        for (int i = 0; i < builder.length(); i++) {
            char ch = builder.charAt(i);

            if (Character.isLowerCase(ch)) {
                continue;
            }

            char small = Character.toLowerCase(ch);
            builder.deleteCharAt(i);
            builder.insert(i, small);
            count++;
        }
        System.out.println("There is " + count + " not-lowercase symbol");
        System.out.println(builder.toString());

    }
}
