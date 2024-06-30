package oop4.oop67;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {

        // TreeSet -как HashSet, но с Comparable сортировкой

//        String text = getText();
//        List<String> words = Arrays.asList(text.split(" "));

//        TreeSet<String> treeSet = new TreeSet<>(words);

        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(1);
        treeSet.add(10);
        treeSet.add(3);
        treeSet.add(7);
        treeSet.add(2);
        treeSet.add(8);
        treeSet.add(13);
        treeSet.add(5);
        treeSet.add(9);
        System.out.println(treeSet);

        System.out.println(treeSet.tailSet(4)); // возвращает часть массива после указанного значения и выше
        System.out.println(treeSet.headSet(4)); // возвращает часть массива до указанного значения и ниже
        System.out.println(treeSet.floor(5)); // возвращает ближайшее значение меньше или равное указанному (включительно)
        System.out.println(treeSet.ceiling(5)); // возвращает ближайшее значение большее или равное указанному (включительно)
        System.out.println(treeSet.lower(5)); // возвращает ближайшее значение меньше (строго) указанного (не включительно)
        System.out.println(treeSet.higher(5)); // возвращает ближайшее значение большее (строго) указанного (не включительно)

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
