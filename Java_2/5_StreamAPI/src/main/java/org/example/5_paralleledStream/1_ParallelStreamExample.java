// Пример 1: Параллельная обработка с использованием parallelStream()
import java.util.Arrays;
import java.util.List;

public class ParallelStreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int sum = numbers.parallelStream()
                         .filter(n -> n % 2 == 0)
                         .mapToInt(Integer::intValue)
                         .sum();

        System.out.println("Sum of even numbers: " + sum);
        // Output: Sum of even numbers: 30
    }
}