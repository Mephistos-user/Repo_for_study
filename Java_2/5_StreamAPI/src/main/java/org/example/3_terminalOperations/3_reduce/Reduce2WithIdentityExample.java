/* Пример 2: Использование с начальными значениями (reduce(T identity,
BinaryOperator<T> accumulator))
Эта версия принимает два параметра: - identity: начальное значение, которое используется в
качестве базового для накопления. - accumulator: ассоциативная функция, которая выполняет
операцию над начальным значением и элементами потока. */

import java.util.Arrays;
import java.util.List;
public class Reduce2WithIdentityExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream()
                         .reduce(0, (a, b) -> a + b);
        System.out.println(sum);
        // Output: 15
    }
}