// 1. map(Function<T, R> mapper)
/* Операция map() преобразует каждый элемент потока с помощью заданной функции. */
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        List<Integer> nameLengths = names.stream()
                                         .map(String::length)
                                         .collect(Collectors.toList());

        System.out.println(nameLengths);
        // Output: [5, 3, 7]
    }
}
