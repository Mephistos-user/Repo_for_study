/* Сбор данных в отображение: Collectors.toMap()
Метод Collectors.toMap() позволяет собирать элементы потока в отображение (Map).
Существует несколько перегруженных версий этого метода, которые позволяют различным
образом управлять ключами, значениями и обработкой коллизий ключей. */

/* Перегруженные версии Collectors.toMap()
    1. toMap(keyMapper, valueMapper)
    2. toMap(keyMapper, valueMapper, mergeFunction)
    3. toMap(keyMapper, valueMapper, mergeFunction, mapSupplier) */

/* Пример 1: Простое создание отображения (toMap(keyMapper, valueMapper))
Эта версия принимает два параметра: - keyMapper: функция, которая преобразует элемент в
ключ. - valueMapper: функция, которая преобразует элемент в значение. */
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

public class ToMapExample1 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
            new Person("Alice", 23),
            new Person("Bob", 30),
            new Person("Charlie", 28),
            new Person("David", 23)
        );

        Map<String, Integer> personMap = people.stream()
                                               .collect(Collectors.toMap(
                                                    Person::getName,
                                                    Person::getAge
                                                ));

        System.out.println(personMap);
        // Output: {Alice=23, Bob=30, Charlie=28, David=23}
    }
}