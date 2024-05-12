import java.util.Scanner;

public class MyClass09 {
    public static void main(String[] args) {

        // есть ли в введенной строке символы:

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

//        if (str.contains(".")) {
//            System.out.println("There is a symbol");
//        } else  if (str.contains("'")) {
//            System.out.println("There is a symbol");
//        } else  if (str.contains(",")) {
//            System.out.println("There is a symbol");
//        } else  if (str.contains("!")) {
//            System.out.println("There is a symbol");
//        } else  if (str.contains("?")) {
//            System.out.println("There is a symbol");
//        } else {
//            System.out.println("There is not a symbol");
//        }

        // тоже самое:
        boolean x = str.contains(".") || str.contains("'") || str.contains(",") || str.contains("!") || str.contains("?");
        if (x) {
            System.out.println("There is a symbol");
        } else {
            System.out.println("There is not a symbol");
        }

    }
}
