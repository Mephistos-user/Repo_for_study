package oop4.arrayList;

import java.util.ArrayList;
import java.util.Comparator;

public class ComparatorComparableExample {
    public static void main(String[] args) {

        // компаратор - Сomparator - интерфейс, задает способ сортировки
        // компарабельно - Сomparable - интерфейс, сравниваемый с...
        ArrayList<Person> arrayList = new ArrayList<>();

        Person michael = new Person("Michael");
        Person vanya = new Person("Vanya");
        System.out.println(vanya.compareTo(michael));

        arrayList.add(vanya);
        arrayList.add(michael);
        arrayList.sort(new PersonComparator());

        for (Person person : arrayList) {
            System.out.println(person.name);
        }

    }
}

class Person implements Comparable<Person> {
    String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Person o) {
        return name.length() - o.name.length();
    }
}

class PersonComparator implements Comparator<Person> {

    @Override
    public int compare(Person person1, Person person2) {
        return person1.name.length() - person2.name.length(); // сортировка по возрастанию
//        return person2.name.length() - person1.name.length(); // сортировка по убыванию
    }
}
