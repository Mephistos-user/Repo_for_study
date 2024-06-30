package oop4.oop66;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashsetExample {
    public static void main(String[] args) {

        // HashSet - хранит только уникальные значения (как и set)

        // похож на ArrayList (методы схожи), только с уникальными значениями

        // добавление с сортировкой (или случайный порядок)
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(5);
        hashSet.add(4);
        hashSet.add(7);
        hashSet.add(3);
        hashSet.add(1); // этот элемент не добавится в HashSet
        hashSet.add(2);
        System.out.println(hashSet); // [1, 2, 3, 4, 5, 7]

        // связанный HashSet - добавление по очереди в конец сета
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(1);
        linkedHashSet.add(5);
        linkedHashSet.add(4);
        linkedHashSet.add(7);
        linkedHashSet.add(3);
        linkedHashSet.add(1); // этот элемент не добавится в HashSet
        linkedHashSet.add(2);
        System.out.println(linkedHashSet); // [1, 5, 4, 7, 3, 2]



    }
}
