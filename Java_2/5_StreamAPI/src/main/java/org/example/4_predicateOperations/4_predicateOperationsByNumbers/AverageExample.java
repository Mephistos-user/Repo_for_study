// 2. average()
/* Операция average() возвращает среднее значение элементов числового потока в виде
OptionalDouble. */
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class AverageExample {
    public static void main(String[] args) {
        OptionalDouble average = IntStream.of(1, 2, 3, 4, 5).average();
        
        average.ifPresent(System.out::println);
        // Output: 3.0
    }
}