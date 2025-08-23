// 1. sum()
/* Операция sum() используется для вычисления суммы элементов в числовом потоке. */
import java.util.stream.IntStream;

public class SumExample {
    public static void main(String[] args) {
        int sum = IntStream.of(1, 2, 3, 4, 5).sum();
        
        System.out.println(sum);
        // Output: 15
    }
}
