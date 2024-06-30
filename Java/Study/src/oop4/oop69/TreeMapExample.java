package oop4.oop69;

import java.util.HashMap;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {

        // TreeMap - отсортированный HashMap

//        TreeMap<String, Integer> student = new TreeMap<>();
//        student.put("John", 4); // добавить или перезаписать ключ-значение
//        student.put("Petya", 3);
//        student.put("Michael", 5);
//        System.out.println(student);

//        TreeMap<Integer, Person> student = new TreeMap<>();
//        student.put(4, new Person("John"));
//        student.put(3, new Person("Petya"));
//        student.put(5, new Person("Michael"));
//        System.out.println(student);

        TreeMap<Person, Integer> student = new TreeMap<>();
        student.put(new Person("John"), 4);
        student.put(new Person("Petya"), 3);
        student.put(new Person("Michael"), 5);
        System.out.println(student);

    }
}

class Person implements Comparable<Person> {
    String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }


    @Override
    public int compareTo(Person person) {
        return name.compareTo(person.name);
    }
}
