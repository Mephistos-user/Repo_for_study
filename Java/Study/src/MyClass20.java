import java.util.Scanner;

public class MyClass20 {
    public static void main(String[] args) {

        // калькулятор с помощью switch...case

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter expression: ");
        int x = scanner.nextInt();
        char operator = scanner.next().charAt(0);
        int y = scanner.nextInt();

        switch (operator) {
            case '+' :
                System.out.println(x + y);
                break;
            case '-' :
                System.out.println(x - y);
                break;
            case '*' :
                System.out.println(x * y);
                break;
            case '/' :
                System.out.println(x / y);
                break;
            case '%' :
                System.out.println(x % y);
                break;
            case '^' :
                System.out.println(Math.pow(x, y));
                break;
            default:
                System.out.println("unknown operator");
                break;
        }
    }
}
