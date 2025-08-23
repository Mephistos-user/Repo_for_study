// Пример 2: Параллельная обработка сложных объектов
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Person {
    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class ParallelStreamComplexExample {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
            new Person("Alice", 30),
            new Person("Bob", 25),
            new Person("Charlie", 35),
            new Person("David", 28),
            new Person("Edward", 22)
        );

        List<String> sortedNames = people.parallelStream()
                                         .filter(person -> person.getAge() > 25)
                                         .sorted(Comparator.comparing(Person::getName))
                                         .map(Person::getName)
                                         .collect(Collectors.toList());

        System.out.println(sortedNames);
        // Output: [Alice, Charlie, David]
    }
}
