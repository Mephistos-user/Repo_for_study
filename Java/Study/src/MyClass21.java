import java.util.Scanner;

public class MyClass21 {
    public static void main(String[] args) {

        // массивы

        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Size arr: " + arr.length);

        System.out.println("Enter length arrDouble: ");
        int size = scanner.nextInt();
        double[] arrDouble = new double[size];
        int N = arrDouble.length;

        for (int i = 0; i < 10; i++) {
            arr[i] = i*i*i+10;
        }
        for (int i = 9; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        for (int currentIndex = 0; currentIndex < N; currentIndex++) {
            arrDouble[currentIndex] = Math.pow(currentIndex, -currentIndex);
        }
        for (int i = N - 1; i >= 0; i--) {
            System.out.println(arrDouble[i] + " ");
        }

    }
}
