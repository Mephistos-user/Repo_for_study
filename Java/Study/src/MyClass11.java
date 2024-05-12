import java.util.Scanner;

public class MyClass11 {
    public static void main(String[] args) {

        // тернарный оператор

        // максимум из трех чисел с помощью тернарного оператора
        Scanner scanner =new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        int max = (x > y && x > z) ? x : (y > z && y > x) ? y : z;
        System.out.println("Max is " + max);

        String observation = (x > y && x > z) ? "x > y, z" : (y > z && y > x) ? "y > x, z" : "z >= x, y";
        System.out.println(observation);


    }
}
