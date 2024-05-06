public class _01First {
    public static void main(String[] args) {
//        String
        int x = 5;
        String odditivity = "";
        String str = "Я буду программистом";
        String str2 = str.toUpperCase();
        System.out.println(str2);
        System.out.println(str2.toLowerCase());
        System.out.println("длинна строки " + str.length());
        System.out.println(str.replace("о", "О"));
        if (str.contains("Я")) { // содержит ли строка символ
            System.out.println("Я - последняя буква алфавита");
        }
        System.out.println(str.charAt(3)); // какой символ в строке по индексу 3

        // перевернуть слово
        String str3 = "Программисты";
        int y = str3.length() - 1;
        while (y >= 0) {
            System.out.print(str3.charAt(y));
            y--;
        }


        System.out.println();
        if (x < 10) {
            System.out.println("x are small");
            if (x < 3) {
                System.out.println("x are really small");
                if (x < 2) {
                    System.out.println("x are really really small");
                }
            }
        }

        System.out.println();
        if (x % 2 == 0) {
            odditivity = "четный";
        } else {
            odditivity = "нечетный";
        }
        System.out.println(x + " " + odditivity);

        System.out.println();
        while (x < 20) {
            x = x + 1;
            System.out.printf("%d ", x);
        }
        System.out.println("\nthis is the end");
    }
}
