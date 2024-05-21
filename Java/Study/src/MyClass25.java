import java.util.Scanner;

public class MyClass25 {
    public static void main(String[] args) {

        // посимвольная обработка строк

        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

//        char[] chars = new char[str.length()];
//        for (int i = 0; i < str.length(); i++) {
//            chars[i] = str.charAt(i);
//        }
        // то же самое:
        char[] chars = str.toCharArray();
        int size = chars.length;

//        for (int i = 0; i < size; i++) {
//            System.out.println(chars[i]);
//        }

//        for (int i = size - 1; i >= 0; i--) {
//            System.out.println(chars[i]);
//        }

//        for (int i = 0; i < size - 3; i++) {
//            System.out.print(chars[i]);
//        }
//        System.out.println("***");

//        for (int i = size - 4; i < size; i++) {
//            chars[i] = '*';
//        }
//        for (int i = 0; i < size; i++) {
//            System.out.print(chars[i]);
//        }

        // изменение строки "лесенкой"
//        for (int i = 0; i < size; i++) {
//            if (i % 2 == 0) {
//                chars[i] = Character.toUpperCase(chars[i]); // каждый второй символ в верхнем регистре
//            } else {
//                chars[i] = Character.toLowerCase(chars[i]); // каждый второй символ в нижнем регистре
//            }
//        }
//        for (int i = 0; i < size; i++) {
//            System.out.print(chars[i]);
//        }

        // отделим дробную часть от целой
        // 1207.99
//        int dotIndex = 0;
//        int i = 0;
//        while (i < size && dotIndex == 0) {
//            if (str.charAt(i) == '.') {
//                dotIndex = i;
//            }
//            i++;
//        }
//
//        char[] intPart = new char[dotIndex];
//        char[] factPart = new char[size - dotIndex - 1];
//
//        for (i = 0; i < dotIndex; i++) {
//            intPart[i] = str.charAt(i);
//            System.out.print(intPart[i]);
//        }
//        System.out.println();
//
//        System.out.println(str.charAt(dotIndex));
//
//        for (i = 0; i < size - dotIndex - 1; i++) {
//            factPart[i] = str.charAt(dotIndex + i + 1);
//            System.out.print(factPart[i]);
//        }
//        System.out.println();

        // сохраним первое слово из предложения:
//
//        int firstSpaceIndex = 0;
//        while (str.charAt(firstSpaceIndex) != ' ' && firstSpaceIndex < str.length()) {
//            firstSpaceIndex++;
//        }
//
//        char[] word = new char[firstSpaceIndex];
//
//        for (int i = 0; i < firstSpaceIndex; i++) {
//            word[i] = str.charAt(i);
//            System.out.print(word[i]);
//        }

        // сохраним последнее слово из предложения:

//        int lastSpaceIndex = str.length() - 1;
//        while (str.charAt(lastSpaceIndex) != ' ' && lastSpaceIndex > 0) {
//            lastSpaceIndex--;
//        }
//
//        int sizeLastWord = 0;
//        if (lastSpaceIndex > 0) {
//            sizeLastWord = str.length() - lastSpaceIndex - 1;
//        } else {
//            sizeLastWord = str.length();
//        }
//
//        char[] word = new char[sizeLastWord];
//
//        if (lastSpaceIndex > 0) {
//            for (int i = 0; i < sizeLastWord; i++) {
//                word[i] = str.charAt(i + lastSpaceIndex +1);
//                System.out.print(word[i]);
//            }
//        } else {
//            for (int i = 0; i < sizeLastWord; i++) {
//                word[i] = str.charAt(i + lastSpaceIndex);
//                System.out.print(word[i]);
//            }
//        }

        // разбить текст на предложения (разделитель ". "):
        // test - Dgf adsfsgfda asdgs. Adsfsafd asgdaa. Vdsga ewtrwtrt rwetre.

//        int countText = 0;
//        int indexes = 0;
//        int[] textIndex = new int[str.length()];
//        textIndex[0] = 0;
//        for (int i = 0; i < str.length() - 1; i++) {
//            if ((str.charAt(i) == '.' && str.charAt(i + 1) == ' ') || i == str.length() - 2) {
////                System.out.println("textIndex " + indexes + ": " + textIndex[indexes]);
//                indexes++;
//                textIndex[indexes] = countText + 2;
//            }
//            countText++;
//        }
//        String [] text = new String[countText];
//        for (int i = 0; i < indexes; i++) {
//            text[i] = str.substring(textIndex[i], textIndex[i + 1]);
//            System.out.println(text[i]);
//        }

        // разбить текст на слова (разделитель " ") и проверить что символ является буквой:
        // test - Первое-Слово Второеслово ТретьеСлово

        String[] words = new String[str.length()];
        int countWords = 0;
        int startIndex = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!(((ch >= 'а') && (ch <= 'я')) || ((ch >= 'А') && (ch <= 'Я')) || ch == '-') || i == str.length() - 1) {
                String word = "";
                if (i == str.length() - 1) {
                    word = str.substring(startIndex, i + 1);
//                    words[countWords] = word;
//                    countWords++;
                } else {
                    word = str.substring(startIndex, i);
//                    words[countWords] = word;
//                    countWords++;
//                    startIndex = i + 1;
                }
                words[countWords] = word;
                countWords++;
                startIndex = i + 1;
            }
        }
        for (int i = 0; i < countWords; i++) {
            System.out.println(words[i]);
        }

    }
}
