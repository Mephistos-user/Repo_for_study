import java.util.Scanner;

public class MyClass04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter credit: ");
        int creditSum = scanner.nextInt();
        System.out.print("Please enter percent: ");
        double percent = scanner.nextDouble(); // вводить дробные надо как 5,5 а не 5.5 иначе будет ошибка
        double overdue = (percent / 100) * creditSum;
        System.out.println(creditSum + overdue);

        // типы данных:

        // примитивные

        // целые
        byte byteValue = 100; // 1 bait     -2^7 : 2^7 - 1 (-128:127)
        short shortValue = 12231; // 2 bait     -2^15 : 2^15 - 1
        int intValue = 10; // 4 bait    -2^31 : 2^31 - 1
        long longValue = 214783647001L; // 8 bait   -2^63 : 2^63 - 1
        // вещественные
        float floatValue = 3.14F; // 4 bait     меньше знаков после точки (меньше точность) чем у double
        float floatPI = (float) Math.PI;
        System.out.println(floatPI);
        double doubleValue = 3.14; // 8 bait
        double doublePI = Math.PI;
        System.out.println(doublePI);
        // булевые
        boolean isXgreaterThanY = false; // 1 bait
        boolean isYgreaterThanX = true;
        // символ
        char charValue = 'g'; //

        // не примитивные
        // строка
        String str = "hello";

    }
}
