/* Пример 3: Обработка и комбинирование данных
Параллельная обработка может использоваться для сложных вычислений, таких как
комбинирование данных из разных источников. */
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStreamCombinationExample {
    public static void main(String[] args) {
        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> numbers2 = Arrays.asList(6, 7, 8, 9, 10);

        int sum = Stream.of(numbers1, numbers2)
                        .parallel()
                        .flatMap(Collection::stream)
                        .reduce(0, Integer::sum);

        System.out.println("Combined sum: " + sum);
        // Output: Combined sum: 55
    }
}
