import java.util.Scanner;

public class MyClass10 {
    public static void main(String[] args) {

        // булев калькулятор

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter boolean expression: ");

        String expr = scanner.nextLine();
        char operand1 = expr.charAt(0);
        char operand2 = expr.charAt(2);
        char operator = expr.charAt(1);


        boolean boolFlag1 = false;

        if (operand1 == '1') {
            boolFlag1 = true;
        } else {
            boolFlag1 = false;
        }

        boolean boolFlag2 = false;

        if (operand2 == '1') {
            boolFlag2 = true;
        } else {
            boolFlag2 = false;
        }

        if (operator == '&') {
            System.out.println(boolFlag1 && boolFlag2);
        } else if (operator == '|') {
            System.out.println(boolFlag1 || boolFlag2);
        } else {
            System.out.println("Unknow operator");
        }



    }
}
