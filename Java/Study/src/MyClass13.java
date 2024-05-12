import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class MyClass13 {
    public static void main(String[] args) throws IOException {

        // ввод/ввывод
//        Scanner scanner = new Scanner(System.in);

        // поток ввода
//        InputStream x = System.in;
//        char c = (char) x.read();
//        System.out.println(c);

        // поток вывода
//        PrintStream z = System.out;
//        z.println("Hello");

        // поток ошибок
//        PrintStream err =System.err;
//        err.println("Oups!!!");


//        char x = (char) System.in.read();
//        char operator = (char) System.in.read();
//        char y = (char) System.in.read();
//
//        int xValue = x - 48;
//        int yValue = y - 48;
//
//        System.out.println("=");
//        if (operator == '+') {
//            System.out.println(xValue + yValue);
//        }

        // разница между scanner.nextLine() и scanner.next()
//        Scanner scanner = new Scanner(System.in);
//
//        String str1 = scanner.nextLine(); // считывает ввод до enter
//        String str2 = scanner.next(); // считивыет ввод до пробела
//
//        System.out.println("str1 = " + str1);
//        System.out.println("str2 = " + str2);

        // поток чтения из файла
//        InputStream stream = new FileInputStream("testFile13.txt");
//        Scanner scanner = new Scanner(stream);
//
//        String str1 = scanner.nextLine(); // считывает ввод до enter
//        String str2 = scanner.next(); // считывает ввод до пробела
//
//        System.out.println("str1 = " + str1);
//        System.out.println("str2 = " + str2);

        // поток записи в файл
        InputStream stream = new FileInputStream("testFile13.txt");
        Scanner scanner = new Scanner(stream);

        int x = scanner.nextInt();
        char op = scanner.next().charAt(0);
        int y = scanner.nextInt();
        PrintStream writer = new PrintStream("testFile13_2.txt");

        if (op == '*') {
            writer.println("result");
            writer.println("is...");
            writer.println(x * y);
        }
        writer.close();
        System.out.println("Write is succes");
    }
}
