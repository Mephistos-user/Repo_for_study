/* Пример 2: Группировка с дополнительным коллектором (groupingBy(classifier,
downstream))
Эта версия принимает два параметра: - classifier: функция, которая преобразует элемент в
ключ. - downstream: коллектор, который будет применяться к сгруппированным элементам. */
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
    public int getAge() {
        return age;
    }
    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class GroupingBy2WithCollectorExample {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
            new Person("Alice", 23),
            new Person("Bob", 30),
            new Person("Charlie", 28),
            new Person("David", 23)
        );

        Map<Integer, Long> ageCount = people.stream()
                                            .collect(Collectors.groupingBy(
                                                Person::getAge,
                                                Collectors.counting()
                                            ));
        System.out.println(ageCount);
        // Output: {23=2, 28=1, 30=1}
    }
}