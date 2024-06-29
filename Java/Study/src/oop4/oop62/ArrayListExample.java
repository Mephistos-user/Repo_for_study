package oop4.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int newNumber = scanner.nextInt();
            numbers.add(newNumber);

//            Collections.sort(numbers); // быстрая сортировка
            numbers.sort(Comparator.comparingInt(a->a));
            System.out.println(numbers);

        }

    }
}
