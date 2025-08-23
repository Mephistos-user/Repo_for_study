/* Ссылка на метод - это способ ссылаться на метод без его вызова. В Java ссылки на методы
могут быть использованы для передачи методов как параметров в функции, которые ожидают
функциональные интерфейсы. */
/* Синтаксис:
Существует несколько форм ссылок на методы:
1. Ссылка на статический метод:
ClassName::staticMethodName
2. Ссылка на метод экземпляра объекта:
objectName::instanceMethodName
3. Ссылка на метод конструктора:
ClassName::new
Примеры: */

// 1. Ссылка на статический метод:
// пример использования ссылки на метод println объекта System.out:
import java.util.function.Consumer;

public class MethodReferenceExample {
    public static void main(String[] args) {
        Consumer<String> consumer = System.out::println;
        consumer.accept("Hello, world!");
    }
}
/* Этот код создает функциональный интерфейс Consumer, который принимает аргумент типа
String. Затем мы создаем объект Consumer, используя ссылку на метод println объекта
System.out. Когда мы вызываем метод accept этого объекта Consumer, передавая ему строку,
он вызывает метод println, выводя переданную строку в консоль. */

/* Этот пример иллюстрирует, как можно использовать ссылки на методы для вызова методов
объектов в качестве параметров функциональных интерфейсов. Предположим, у вас есть
метод, который принимает функциональный интерфейс Function и вызывает его метод apply: */
public class MethodReferenceExample2 {
    public static String transform(String input, Function<String, String> function) {
        return function.apply(input);
    }
    public static String toUpperCase(String str) {
        return str.toUpperCase();
    }
    public static void main(String[] args) {
        String result = transform("hello", MethodReferenceExample::toUpperCase);
        System.out.println(result); // Output: HELLO
    }
}

// 2. Ссылка на метод экземпляра объекта:
import java.util.function.Function;

public class MethodReferenceExample3 {
    public String toUpperCase(String str) {
        return str.toUpperCase();
    }
    public static void main(String[] args) {
        MethodReferenceExample example = new MethodReferenceExample();
        String result = example.transform("hello", example::toUpperCase);
        System.out.println(result); // Output: HELLO
    }
    public String transform(String input, Function<String, String> function) {
        return function.apply(input);
    }
}

// 3. Ссылка на конструктор:
import java.util.function.Supplier;

public class MethodReferenceExample4 {
    public static void main(String[] args) {
        Supplier<Person> personSupplier = Person::new;

        Person person1 = personSupplier.get();

        person1.setName("Artem");
        System.out.println(person1);
    }
}
class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
