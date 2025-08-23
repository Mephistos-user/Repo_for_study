/* Пример 3: Использование с параллельными потоками (reduce(U identity,
BiFunction<U, ? super T, U> accumulator, BinaryOperator<U> combiner))
Эта версия принимает три параметра: - identity: начальное значение. - accumulator:
функция, которая выполняет операцию над элементами и накопителем. - combiner: функция,
которая комбинирует два накопителя (используется при параллельной обработке). */
import java.util.Arrays;
import java.util.List;

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
}

public class Reduce3WithCombinerExample {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
            new Person("Alice", 23),
            new Person("Bob", 30),
            new Person("Charlie", 28),
            new Person("David", 23)
        );

        int totalAge = people.parallelStream()
                             .reduce(0, (sum, person) -> sum + person.getAge(), Integer::sum);

        System.out.println(totalAge);
        // Output: 104
    }
}