// Сбор данных в группы: Collectors.groupingBy()
/* Метод Collectors.groupingBy() используется для группировки элементов потока по
заданному критерию. Он возвращает карту (Map), где ключами являются значения,
полученные из функции классификации, а значениями — списки элементов, соответствующие
этим ключам. */
/* Перегруженные версии Collectors.groupingBy()
    11. groupingBy(classifier)
    12. groupingBy(classifier, downstream)
    13. groupingBy(classifier, mapFactory, downstream) */

/* Пример 1: Простая группировка (groupingBy(classifier))
Эта версия принимает один параметр: - classifier: функция, которая преобразует элемент в
ключ. */
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

public class GroupingBy1Example {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
            new Person("Alice", 23),
            new Person("Bob", 30),
            new Person("Charlie", 28),
            new Person("David", 23)
        );

        Map<Integer, List<Person>> peopleByAge = people.stream()
                                                       .collect(Collectors.groupingBy(
                                                            Person::getAge
                                                        ));
        System.out.println(peopleByAge);
        // Output: {23=[Alice (23), David (23)], 28=[Charlie (28)], 30=[Bob (30)]}
    }
}