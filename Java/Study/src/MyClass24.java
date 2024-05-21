import java.util.Scanner;

public class MyClass24 {
    public static void main(String[] args) {

        // модификатор final

        // аналог const - неизменяемые переменные
        // переменные не меняются, значения в массивах изменять можно (т.к. работают по ссылке), но нельзя изменить сам массив
        // код работет быстрее, т.к. в памяти хранятся ближе (в том числе в кэше)

        System.out.println("Enter array size: ");
        Scanner scanner = new Scanner(System.in);
        final int size = scanner.nextInt();
        int[] arr = new int[size];
        int[] b = new int[]{1, 2, 3, 4, 5};

        for (int i = 0; i < size; i++) {
            System.out.println("arr[i]: ");
            arr[i] = scanner.nextInt();
        }

        arr = b; // данные не копируются, просто теперь arr ссылается на ту же ячейку в оперативной памяти как и b,
                // если изменить значения в массиве arr, то и в массиве b тоже значения изменятся

        arr[2] = 30;
        arr[4] = 50;

        for (int i = 0; i < size; i++) {
            System.out.print("b: " + b[i] + " ");
            System.out.print("arr: " + arr[i] + "\n");
        }


        int max = arr[0];

        for (int i = 1; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Max is " + max);

    }
}
