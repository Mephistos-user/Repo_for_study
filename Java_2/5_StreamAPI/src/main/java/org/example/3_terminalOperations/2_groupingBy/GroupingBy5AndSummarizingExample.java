/* Пример 5: Группировка и статистика
Мы можем сгруппировать людей по возрасту и вычислить статистику по их возрастам,
например, средний возраст. */
import java.util.Arrays;
import java.util.IntSummaryStatistics;
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

public class GroupingBy5AndSummarizingExample {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
            new Person("Alice", 23),
            new Person("Bob", 30),
            new Person("Charlie", 28),
            new Person("David", 23)
        );
        Map<Integer, IntSummaryStatistics> ageStatistics = people.stream()
                                                                 .collect(
                                                                    Collectors.groupingBy(
                                                                        Person::getAge,
                                                                        Collectors.summarizingInt(
                                                                            Person::getAge
                                                                 )));

        System.out.println(ageStatistics);
        /* Output: {
            23=IntSummaryStatistics{count=2, sum=46, min=23, average=23.000000, max=23}, 
            28=IntSummaryStatistics{count=1, sum=28, min=28, average=28.000000, max=28}, 
            30=IntSummaryStatistics{count=1, sum=30, min=30, average=30.000000, max=30}} */
    }
}


