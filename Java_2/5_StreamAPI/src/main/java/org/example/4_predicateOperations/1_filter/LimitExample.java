// 3. limit(long maxSize)
/* Операция limit() возвращает поток, усеченный до указанного количества элементов. */
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LimitExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> limitedNumbers = numbers.stream()
                                              .limit(3)
                                              .collect(Collectors.toList());

        System.out.println(limitedNumbers);
        // Output: [1, 2, 3]
    }
}
