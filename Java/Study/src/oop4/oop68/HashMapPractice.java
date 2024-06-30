package oop4.oop68;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {

    static HashMap<String, ArrayList<Integer>> hashMap = new HashMap<>();

    public static void main(String[] args) {

        // База данных студентов с выводом средней оценки

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String name = scanner.next();
            int grade = scanner.nextInt();
            addGrade(name, grade);
            display();
        }
    }

    static void addGrade(String name, int grade) {
        if (!hashMap.containsKey(name)) {
            hashMap.put(name, new ArrayList<>());
        }
        hashMap.get(name).add(grade);
    }

    static void display() {
        for (Map.Entry<String, ArrayList<Integer>> entry : hashMap.entrySet()) {

            double mean = 0;
            for (int value : entry.getValue()) {
                mean += value;
            }
            mean /= entry.getValue().size();
            System.out.println(entry.getKey() + " = " + mean);
        }
    }
}
