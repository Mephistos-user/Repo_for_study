// 3. max()
/* Операция max() возвращает максимальный элемент числового потока в виде
OptionalInt. */
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class MaxExample {
    public static void main(String[] args) {
        OptionalInt max = IntStream.of(1, 2, 3, 4, 5).max();
        
        max.ifPresent(System.out::println);
        // Output: 5
    }
}
