/* ** Неизменяемость данных** Неизменяемость данных в функциональном программировании
означает, что данные, как только они были созданы, не могут быть изменены. Вместо этого,
при необходимости создается новый объект с обновленными значениями. Это позволяет
избежать изменений состояния и побочных эффектов, что делает код более надежным и
предсказуемым. */
import java.util.ArrayList;
import java.util.List;

public class ImmutableData {
    public static void main(String[] args) {

        // Исходный список чисел
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // Создаем новый список, в котором каждый элемент увеличен вдвое
        List<Integer> doubledNumbers = doubleListValues(numbers);
        System.out.println("Original list: " + numbers); // Original list: [1, 2, 3, 4, 5]
        System.out.println("Doubled list: " + doubledNumbers); // Doubled list: [2, 4, 6, 8, 10]
    }

    // Метод для удвоения значений списка
    public static List<Integer> doubleListValues(List<Integer> inputList) {
        List<Integer> doubledList = new ArrayList<>();
        for (Integer number : inputList) {
            doubledList.add(number * 2);
        }
        return doubledList;
    }
}
