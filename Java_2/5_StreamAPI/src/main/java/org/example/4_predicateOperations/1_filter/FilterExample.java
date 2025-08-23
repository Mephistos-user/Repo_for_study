// 1. filter(Predicate<T> predicate)
/* Операция filter() принимает предикат (функцию, возвращающую boolean) и
возвращает поток, содержащий только те элементы, которые соответствуют предикату. */
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        List<String> filteredNames = names.stream()
                                          .filter(name -> name.startsWith("A"))
                                          .collect(Collectors.toList());

        System.out.println(filteredNames);
        // Output: [Alice]
    }
}
