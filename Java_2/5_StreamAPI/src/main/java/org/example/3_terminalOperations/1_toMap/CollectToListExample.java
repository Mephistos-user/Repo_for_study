// Терминальные операции

/* Операции перебора: forEach(), forEachOrdered():
    – forEach(): Применяет заданное действие к каждому элементу потока. Порядок
выполнения действия не гарантируется для параллельных потоков. */
List<String> items = Arrays.asList("apple", "banana", "cherry");
items.stream().forEach(System.out::println);
// Output: apple, banana, cherry (порядок может быть разным в параллельном потоке)

/*  – forEachOrdered(): Применяет заданное действие к каждому элементу потока в
порядке, определенном источником данных, даже для параллельных потоков. */
items.stream().parallel().forEachOrdered(System.out::println);
// Output: apple, banana, cherry (порядок гарантирован)

// Сбор данных в коллекции: collect():
/* Метод collect() является одной из наиболее мощных и гибких терминальных операций
в Stream API. Он используется для преобразования потока в различные типы коллекций
и других структур данных. collect() принимает реализацию интерфейса Collector,
который определяет, как собирать элементы потока. */
class Person {
    String name;
    int age;

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

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectToListExample {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
            new Person("Alice", 23),
            new Person("Bob", 30),
            new Person("Charlie", 28),
            new Person("David", 23)
        );

        people = people.stream()
                                    .collect(Collectors.toList());

        System.out.println(filteredPeople);
        // Output: [Bob (30), Charlie (28)]

        // Теперь предположим, что мы хотим собрать уникальные возраста из списка людей
        Set<Integer> uniqueAges = people.stream()
                                        .map(Person::getAge)
                                        .collect(Collectors.toSet());
    }
}

