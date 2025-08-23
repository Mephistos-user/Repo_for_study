// 2. flatMap(Function<T, Stream<R>> mapper)
/* Операция flatMap() преобразует каждый элемент потока в поток и затем объединяет
все полученные потоки в один. */
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {
    public static void main(String[] args) {
        List<List<String>> nestedList = Arrays.asList(
            Arrays.asList("a", "b"),
            Arrays.asList("c", "d"),
            Arrays.asList("e", "f")
        );

        List<String> flatList = nestedList.stream()
                                          .flatMap(List::stream)
                                          .collect(Collectors.toList());

        System.out.println(flatList);
        // Output: [a, b, c, d, e, f]
    }
}
