// Стандартные функциональные интерфейсы
/* В Java 8 и выше поставляются встроенные функциональные интерфейсы в пакете
java.util.function. Эти интерфейсы предоставляют удобные абстракции для обработки
данных и облегчают работу с лямбда-выражениями. Вот некоторые из наиболее часто
используемых стандартных функциональных интерфейсов:*/

/* 1. Supplier:
Supplier используется для поставки значений без каких-либо входных параметров. Он
полезен, когда нужно получить значение, но не требуется передавать ему аргументы.*/
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Supplier<Double> randomNumberSupplier = () -> Math.random();

        double randomValue = randomNumberSupplier.get();
        System.out.println("Random value: " + randomValue);
    }
}

/* 2. Consumer:
Consumer принимает аргумент и выполняет некоторые операции над ним, но не возвращает
результат. */
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Consumer<String> greetingConsumer = message -> System.out.println("Hello, " + message);

        greetingConsumer.accept("John");
    }
}

/* 3. Predicate:
Predicate используется для проверки некоторого условия на входном значении и возвращает
true или false. */
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> isEven = number -> number % 2 == 0;

        System.out.println("Is 10 even? " + isEven.test(10)); // Выводит "true"
        System.out.println("Is 15 even? " + isEven.test(15)); // Выводит
        "false"
    }
}

/* 4. Function<T, R>:
Function принимает аргумент и возвращает результат после выполнения определенной
функции. */
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<Integer, String> intToString = number -> "Number as string: " + String.valueOf(number);

        String result = intToString.apply(42);
        System.out.println(result); // Выводит "Number as string: 42"
    }
}

/* 5. UnaryOperator:
UnaryOperator принимает один аргумент и возвращает результат того же типа. */
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        UnaryOperator<Integer> square = number -> number * number;

        int result = square.apply(8);
        System.out.println("Square of 8 is: " + result); // Выводит "Square of 8 is: 64"
    }
}

/* 6. BinaryOperator:
BinaryOperator принимает два аргумента и возвращает результат того же типа. */
import java.util.function.BinaryOperator;

public class Main {
    public static void main(String[] args) {
        BinaryOperator<Integer> sum = (a, b) -> a + b;
        
        int result = sum.apply(5, 3);
        System.out.println("Sum of 5 and 3 is: " + result); // Выводит "Sum of 5 and 3 is: 8"
    }
}