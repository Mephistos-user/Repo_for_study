/* Пример 3: Группировка с пользовательской фабрикой карты (groupingBy(classifier,
mapFactory, downstream))
Эта версия принимает три параметра: - classifier: функция, которая преобразует элемент в
ключ. - mapFactory: поставщик, который создает пустую карту для хранения групп. -
downstream: коллектор, который будет применяться к сгруппированным элементам. */
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}
public class GroupingBy3WithMapFactoryExample {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
            new Person("Alice", 23),
            new Person("Bob", 30),
            new Person("Charlie", 28),
            new Person("David", 23)
        );

        Map<Integer, List<Person>> peopleByAge = people.stream()
                                                       .collect(Collectors.groupingBy(
                                                            Person::getAge,
                                                            ConcurrentHashMap::new,
                                                            Collectors.toList()
                                                        ));

        System.out.println(peopleByAge);
        // Output: {23=[Alice (23), David (23)], 28=[Charlie (28)], 30=[Bob (30)]}
    }
}