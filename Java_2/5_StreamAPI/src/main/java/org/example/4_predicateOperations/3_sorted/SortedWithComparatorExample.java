// 2. sorted(Comparator<? super T> comparator)
/* Операция sorted(Comparator<? super T> comparator) сортирует элементы потока с
использованием заданного компаратора. */
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedWithComparatorExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Charlie", "Alice", "Bob");

        List<String> sortedNames = names.stream()
                                        .sorted(Comparator.reverseOrder())
                                        .collect(Collectors.toList());

        System.out.println(sortedNames);
        // Output: [Charlie, Bob, Alice]
    }
}
