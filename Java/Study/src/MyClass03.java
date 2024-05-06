import java.util.Scanner;

public class MyClass03 {
    public static void main(String[] args) {

        // большее среди трех чисел

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter x: ");
        int x = scanner.nextInt();
        System.out.print("Please enter y: ");
        int y = scanner.nextInt();
        System.out.print("Please enter z: ");
        int z = scanner.nextInt();
        int max;
        char var;

        if (x >= y) {
            if (z > x) {
                max = z;
                var = 'z';
            } else {
                max = x;
                var = 'x';
            }
        } else {
            if (z > y) {
                max = z;
                var = 'z';
            } else {
                max = y;
                var = 'y';
            }
        }
        System.out.println("Biggest value: " + var + " = "+ max);
    }
}