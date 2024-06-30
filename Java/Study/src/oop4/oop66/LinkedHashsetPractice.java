package oop4.oop66;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class LinkedHashsetPractice {
    public static void main(String[] args) {

        // посчитать количество уникальных слов в текстовом файле:

//        System.out.println(getText());
        String text = getText();
        List<String> words = Arrays.asList(text.split(" "));

        HashSet<String> hashSet = new HashSet<>(words);

        System.out.println(words.size());
        System.out.println(hashSet.size());

    }

    static String getText() {
        String text = "";
        try (FileReader reader = new FileReader("./text_files/book.txt")) {
            int c;
            while ((c = reader.read()) != -1) {
                text += (char) c;
            }
            // заменяем знаки препинания и символы на пробелы
            text = text.replaceAll("[-.,;:!?()\\[\\]]|[ ]", " "); // используем регулярное выражение [-.,;:!?()\\[\\]]|[ ]
        } catch (IOException e) {
            e.printStackTrace();
        }
        return text;
    }
}
