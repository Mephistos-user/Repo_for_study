package oop4.arrayList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class ComparatorComparablePractic {
    public static void main(String[] args) {

        /*
        Отсортировать список случайных чисел по принципу:
        четные в начале по возрастанию, нечетные в конце по убыванию
         */

        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 30; i++) {
            numbers.add(random.nextInt(100));
        }

        numbers.sort(new NumbersComparator());
        System.out.println(numbers);

    }
}

class NumbersComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        boolean o1IsEven = o1 % 2 == 0;
        boolean o2IsEven = o2 % 2 == 0;
        if (o1IsEven && o2IsEven) {
            return o1 - o2;
        } else if (o1IsEven && !o2IsEven) {
            return -1;
        } else if (!o1IsEven && o2IsEven) {
            return 1;
        } else if (!o1IsEven && !o2IsEven) {
            return o2 - o1;
        }
        return 0;
    }
}


