package OOP_29;

import java.util.Scanner;

public class MyClass29 {
    public static void main(String[] args) {

        // методы
        // больше меньше с разбиением на методы

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите число: ");
//        int x = scanner.nextInt();
//        System.out.println("Введите число: ");
//        int y = scanner.nextInt();
//
//        int max;
//        if (x > y) {
//            max = x;
//        } else {
//            max = y;
//        }
//
//        System.out.println("Наибольшее число: " + max);

        int x = inputNumber();
        int y = inputNumber();
        int max = findMax(x, y);
        printMax(max);
    }

        static int inputNumber() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите число: ");
            int inputNum = scanner.nextInt();
            return inputNum;
        };

        static int findMax ( int x, int y) {
//            int max;
            if (x > y) {
//                max = x;
                return x;
            } else {
//                max = y;
                return y;
            }
//            return max;
        };

        static void printMax(int max){
            System.out.println("Наибольшее число: " + max);

        }


}
