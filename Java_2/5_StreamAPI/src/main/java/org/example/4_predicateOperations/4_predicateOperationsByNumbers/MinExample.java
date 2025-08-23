// 4. min()
/* Операция min() возвращает минимальный элемент числового потока в виде
OptionalInt. */
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class MinExample {
    public static void main(String[] args) {
        OptionalInt min = IntStream.of(1, 2, 3, 4, 5).min();
        
        min.ifPresent(System.out::println);
        // Output: 1
    }
}
