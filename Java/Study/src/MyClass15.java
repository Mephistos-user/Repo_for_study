import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MyClass15 {
    public static void main(String[] args) throws IOException {

        // циклы while

        // создание 9 файлов с помощью цикла
//        int x = 1;
//        while (x < 10) {
//            File file = new File("files/" + x);
//            file.createNewFile();
//            x++;
//        }

        // вывод четных нечетных чисел
//        int x = 1;
//        while (x < 10) {
//            if (x % 2 == 0) {
//                System.out.println(x + " четное");
//            }
//            else {
//                System.out.println(x + " нечетное");
//            }
//            x++;
//        }

        // ввести нужное число
//        int x = 0;
//        Scanner scanner = new Scanner(System.in);
//        while (x != 777) {
//            System.out.println(x + " это не 777");
//            System.out.println("Введите x: ");
//            x = scanner.nextInt();
//        }
//        System.out.println("Вы ввели 777");

        // ввести нужное слово
//        String str = "";
//        Scanner scanner = new Scanner(System.in);
//        while (!str.equals("Хватит")) {
//            System.out.println("Еще не хватит");
//            System.out.println("Введите строку ");
//            str = scanner.nextLine();
//        }
//        System.out.println("Ладно, достаточно");

        // сумма всех чисел от 1 до 100
//        int x = 1;
//        int sum = 0;
//        while (x <= 100) {
//            sum = sum + x;
//            x++;
//        }
//        System.out.println(sum);

        // факториал 5
        int x = 1;
        int factorial = 1;
        while (x <= 5) {
            factorial = factorial * x;
            x++;
        }
        System.out.println(factorial);
    }
}
