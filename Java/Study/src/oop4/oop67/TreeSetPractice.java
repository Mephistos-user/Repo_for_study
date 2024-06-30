package oop4.oop67;

import java.io.FileReader;
import java.io.IOException;
import java.util.TreeSet;

public class TreeSetPractice {
    public static void main(String[] args) {

        // TreeSet -как HashSet, но с Comparable сортировкой
        
        TreeSet<Student> treeSet = new TreeSet<>(); // лучше использовать ArrayList или аналогичный

        treeSet.add(new Student("Vasya", 5));
        treeSet.add(new Student("Kolya", 3));
        treeSet.add(new Student("Masha", 5)); // не будет добавлен в сет при сортировке по оценкам
        treeSet.add(new Student("Michael", 4)); // не будет добавлен в сет при сортировке по имени
        treeSet.add(new Student("Nastya", 3)); // не будет добавлен в сет при сортировке по оценкам
        treeSet.add(new Student("Vasya", 4)); // не будет добавлен в сет при сортировке по оценкам и по имени

        System.out.println(treeSet);

    }
}

class Student implements Comparable<Student> {
    String name;
    int grade;

    public Student(String name, int grade) {

        this.name = name;
        this.grade = grade;
    }

    @Override
    public int compareTo(Student student2) {
//        return student2.grade - grade; // сортировка по оценкам
        return name.charAt(0) - student2.name.charAt(0); // сортировка по имени по алфавиту
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                "}\n";
    }
}
