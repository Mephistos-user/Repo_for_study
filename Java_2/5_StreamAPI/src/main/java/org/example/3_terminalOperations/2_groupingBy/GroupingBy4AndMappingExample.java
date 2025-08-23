/* Пример 4: Группировка и преобразование значений
Мы можем сгруппировать людей по возрасту и при этом собрать имена людей в списки. */
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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

public class GroupingBy4AndMappingExample {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
            new Person("Alice", 23),
            new Person("Bob", 30),
            new Person("Charlie", 28),
            new Person("David", 23)
        );
        Map<Integer, List<String>> namesByAge = people.stream()
                                                      .collect(
                                                        Collectors.groupingBy(
                                                            Person::getAge,
                                                            Collectors.mapping(
                                                                Person::getName,
                                                                Collectors.toList()
                                                       )));

        System.out.println(namesByAge);
        // Output: {23=[Alice, David], 28=[Charlie], 30=[Bob]}
    }
}