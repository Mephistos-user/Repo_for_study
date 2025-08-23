/* Пример 5: Редукция для вычисления произведения чисел
Мы можем использовать reduce() для вычисления произведения элементов списка. */
import java.util.Arrays;
import java.util.List;

public class Reduce5ProductExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int product = numbers.stream()
                             .reduce(1, (a, b) -> a * b);
        System.out.println(product);
        // Output: 120
    }
}