// 1. sorted()
/* Операция sorted() сортирует элементы потока в естественном порядке. */
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortedExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Charlie", "Alice", "Bob");

        List<String> sortedNames = names.stream()
                                        .sorted()
                                        .collect(Collectors.toList());

        System.out.println(sortedNames);
        // Output: [Alice, Bob, Charlie]
    }
}
