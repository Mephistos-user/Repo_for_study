package OOP_32;

import java.util.Scanner;

public class MyClass32 {
    public static void main(String[] args) {

        // StringBuilder

        // 1.
//        StringBuilder builder = new StringBuilder();

//        builder.append("В лесу родилась елочка\n");
//        builder.append("В лесу она росла\n");
//        builder.append("Зимой и летом стройная\n");
//        builder.append("Зеленая была");
//
//        builder.insert(0, "Песня: \n");
//        builder.insert(29, ", ");
//
//        builder.delete(23, 29);
//        builder.deleteCharAt(30);


        // 2.
//        Scanner scanner = new Scanner(System.in);
//        String input = scanner.nextLine();
//        StringBuilder builder = new StringBuilder(input);
//
//        for (int i = 0; i < builder.length(); i++) {
//            char ch = builder.charAt(i);
//            builder.deleteCharAt(i);
//            if (i % 2 == 0) {
//                char upperCaseChar = Character.toUpperCase(ch);
//                builder.insert(i , upperCaseChar);
//            } else {
//                char lowerCaseChar = Character.toLowerCase(ch);
//                builder.insert(i , lowerCaseChar);
//            }
//        }

        // 3.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 5 world: ");
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < 5; i++) {
            String word = scanner.next();
            builder.insert(0, word);
            builder.insert(0, " ");
        }

        String str = builder.toString();
        System.out.println(str);

    }
}
