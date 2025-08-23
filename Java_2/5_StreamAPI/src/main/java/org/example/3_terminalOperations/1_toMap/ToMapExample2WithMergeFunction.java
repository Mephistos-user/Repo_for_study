/* Пример 2: Обработка коллизий ключей (toMap(keyMapper, valueMapper,
mergeFunction))
Эта версия дополнительно принимает третий параметр: - mergeFunction: функция, которая
определяет, как обрабатывать коллизии ключей (т. е. когда несколько элементов имеют
одинаковый ключ). */
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

public class ToMapExample2WithMergeFunction {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
            new Person("Alice", 23),
            new Person("Bob", 30),
            new Person("Charlie", 28),
            new Person("David", 23),
            new Person("Alice", 25) // Duplicate name
        );

        Map<String, Integer> personMap = people.stream()
                                               .collect(Collectors.toMap(
                                                    Person::getName,
                                                    Person::getAge,
                                                    (age1, age2) -> age1 > age2 ?
                                                    age1 : age2 // Keep the older age
                                                ));

        System.out.println(personMap);
        // Output: {Alice=25, Bob=30, Charlie=28, David=23}
    }
}