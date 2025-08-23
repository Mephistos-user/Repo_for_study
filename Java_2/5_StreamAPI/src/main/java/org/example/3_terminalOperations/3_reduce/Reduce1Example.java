// Редукция данных: reduce()
/* Метод reduce() в Java Stream API используется для агрегирования элементов потока в одно
значение. Этот метод позволяет накапливать элементы потока с использованием
ассоциативной функции.
Перегруженные версии reduce()
1. reduce(BinaryOperator<T> accumulator)
2. reduce(T identity, BinaryOperator<T> accumulator)
3. reduce(U identity, BiFunction<U, ? super T, U> accumulator,
BinaryOperator<U> combiner) */

/* Пример 1: Простое использование (reduce(BinaryOperator<T> accumulator))
Эта версия принимает один параметр: - accumulator: ассоциативная функция, которая
выполняет операцию над двумя элементами и возвращает результат. */
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reduce1Example {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Optional<Integer> sum = numbers.stream()
                                       .reduce((a, b) -> a + b);
        sum.ifPresent(System.out::println);
        // Output: 15
    }
}