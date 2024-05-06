import java.util.Scanner;

public class MyClass06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // четное/нечетное

//        System.out.print("Please enter number: ");
//        int x = scanner.nextInt();
//        if (x % 2 == 0) {
//            System.out.println("number is even");
//        } else {
//            System.out.println("number is odd");
//        }

        // калькулятор

//        System.out.println("Please enter math expression: ");
//        double a = scanner.nextDouble();
//        char operator = scanner.next().charAt(0);
//        double b = scanner.nextDouble();
//
//        System.out.println("=");
//        if (operator == '+') {
//            System.out.println(a + b);
//        }
//        if (operator == '-') {
//            System.out.println(a - b);
//        }
//        if (operator == '*') {
//            System.out.println(a * b);
//        }
//        if (operator == '/') {
//            System.out.println(a / b);
//        }
//        if (operator == '^') {
//            System.out.println(Math.pow(a, b));
//        }

        // модуль числа

//        System.out.println(Math.abs(10 -30));
//        System.out.print("Сколько Вашему лучшему другу лет? ");
//        int age1 = scanner.nextInt();
//        System.out.print("Сколько лет Вам? ");
//        int age2 = scanner.nextInt();
//        int difference = Math.abs(age1 - age2);
//        System.out.println("Разница в возрасте: " + difference);
//        int ageMax = Math.max(age1, age2);
//        System.out.println("Старшему из вас: " + ageMax);
//        int ageMin = Math.min(age1, age2);
//        System.out.println("Младшему из вас: " + ageMin);

        // отбросить дробную часть (без округления)

//        System.out.println(Math.floor(3.94));

        // random

//        System.out.println(Math.random()); // [0 : 1)
//        System.out.println(Math.random() * 6); // [0 : 6)
//        System.out.println(Math.random() * 6 + 101); // [101 : 107)

        // [0 : 100)
//        double random = Math.random();
//        double randomBig = random * 100;
//        int randomBigFloor = (int) Math.floor(randomBig);
//        System.out.println(randomBigFloor);

        // вывести случайную букву

//        double random = Math.random();
//        double randomBig = random * (1103-1072) + 1072;
//        int randomBigFloor = (int) Math.floor(randomBig);
//        System.out.println(randomBigFloor);
//        char letter = (char) randomBigFloor;
//        System.out.println(letter);

        // вывести случайные буквы
        int x = 0;
        while (x < 3) {
            double random = Math.random();
            double randomBig = random * (1103 - 1072) + 1072;
            int randomBigFloor = (int) Math.floor(randomBig);
//            System.out.println(randomBigFloor);
            char letter = (char) randomBigFloor;
            System.out.print(letter);


            char o1 = 'а';
            char o2 = 'я';
            char o3 = 'о';
            char o4 = 'е';
            char o5 = 'ю';
            char o6 = 'у';
            char o7 = 'э';
//            char o8 = 'ё';
            char o9 = 'и';
//            char o10 = 'ы';
            double random1 = Math.random();
            double randomBig1 = random1 * 10 + 1;
            int randomBigFloor1 = (int) Math.floor(randomBig1);
            if (randomBigFloor1 == 2) System.out.print(o2);
            if (randomBigFloor1 == 1) System.out.print(o1);
            if (randomBigFloor1 == 3) System.out.print(o3);
            if (randomBigFloor1 == 4) System.out.print(o4);
            if (randomBigFloor1 == 5) System.out.print(o5);
            if (randomBigFloor1 == 6) System.out.print(o6);
            if (randomBigFloor1 == 7) System.out.print(o7);
//            if (randomBigFloor1 == 8) System.out.print(o8);
            if (randomBigFloor1 == 9) System.out.print(o9);
//            if (randomBigFloor1 == 10) System.out.print(o10);

            x++;
        }

        // русский алфавит 1072 - 1103

//        int letterCode = 1072;
//        while (letterCode <= 1103) {
//            char letter = (char) letterCode;
//            System.out.printf("letterCode %d is %s\n", letterCode, letter);
//            letterCode++;
//        }


    }
}
