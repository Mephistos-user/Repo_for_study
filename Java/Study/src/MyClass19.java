public class MyClass19 {
    public static void main(String[] args) {

        // целые делители числа
        for (int n = 2; n < 100; n++) {
            System.out.print("For n = " + n + ": ");
            int x = 1;

            do {
                if (n % x == 0) {
                    System.out.print(x + " ");
                }
                x++;
            } while (x < n);
            System.out.println();
        }
    }
}
