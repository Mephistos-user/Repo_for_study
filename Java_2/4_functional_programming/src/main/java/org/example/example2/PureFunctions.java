/* Чистые функции: Чистые функции - это функции, которые возвращают одинаковый результат
для одинаковых входных данных и не имеют побочных эффектов. Они не изменяют состояние
программы и окружения.
Примеры: */

// Функция, которая меняет состояние
import java.util.ArrayList;
import java.util.List;

public class ImpureFunction {
    private static List<Integer> numbers = new ArrayList<>();
    public static void main(String[] args) {
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        int result = sumNumbers(3);
        System.out.println("Sum of numbers: " + result); // Результат: 18
        System.out.println("Updated numbers list: " + numbers); // Обновленный список чисел: [1, 2, 6, 4, 5]
    }
    // Функция для суммирования чисел в списке и обновления списка
    public static int sumNumbers(int newValue) {
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        numbers.set(2, newValue); // Изменение значения элемента в списке
        return sum;
    }
}
// Чистая функция
public class PureFunctions {
    // Чистая функция, складывающая два числа
    public static int add(int x, int y) {
        return x + y;
    }
    public static void main(String[] args) {
        int result = add(3, 5); // результат: 8
        System.out.println("Result: " + result);
    }
}