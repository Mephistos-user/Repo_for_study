import java.util.Scanner;

public class MyClass05 {
    public static void main(String[] args) {
        char c = 'a';
        System.out.println(c);
        System.out.println((int) c); // получить код символа

        // получить код символа
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter char: ");
        c = scanner.next().charAt(0); // сохраняет первый символ из введенной строки
        int charCode = c;
        System.out.println(charCode);

        // таблица символов:
        int charCode2 = 0;
        char value = '-';
        while (charCode2 < 200) {
            value = (char) charCode2;
            System.out.println("Char of code: " + charCode2 + " = " + "\'" + value + "\'");
            charCode2++;
        }

        // проверить является ли введенный символ числом
        System.out.print("Please enter char: ");
        c = scanner.next().charAt(0);
        int charCode3 = c;
        if (charCode >= 48 && charCode3 <=57) {
            System.out.println("Simbol " + c + " is a digit");
        } else {
            System.out.println("Simbol " + c + " is not a digit");
        }
    }
}
