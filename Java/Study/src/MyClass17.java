public class MyClass17 {
    public static void main(String[] args) {

        // вывод в консоль "елочки" из точек

        System.out.print("                    .");
        for (int i = 0; i < 20; i++) {
            for (int x = 0; x < 20 - i; x++) {
                System.out.print(" ");
            }
            for (int y = 0; y < i * 2; y++) {
                System.out.print(".");
            }
            System.out.println();
        }
        System.out.println("Done");
    }
}
