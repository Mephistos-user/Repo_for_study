/* Пример 4: Редукция для объединения строк
Мы можем использовать reduce() для объединения строк с разделителем. */
import java.util.Arrays;
import java.util.List;

public class Reduce4StringExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Stream", "API", "is", "powerful");
        String concatenatedString = words.stream()
                                         .reduce("", (a, b) -> a.isEmpty() ? b : a + " " + b);
        System.out.println(concatenatedString);
        // Output: Stream API is powerful
    }
}