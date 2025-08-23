/* Функции высшего порядка: Функции высшего порядка - это функции, которые могут
принимать другие функции в качестве аргументов или возвращать их как результат. Это
позволяет строить сложные операции из простых функций.*/

import java.util.function.BinaryOperator;
import java.util.function.Function;

public class HigherOrderFunctions {
    public static void main(String[] args) {

        // Функция, которая возводит число в квадрат
        Function<Integer, Integer> square = x -> x * x;

        // Функция, которая складывает два числа
        BinaryOperator<Integer> binaryOperator = (v1, v2) -> v1 + v2;

        // Применение функции высшего порядка к функции square и значению 5
        int result1 = applyFunction1(square, 5); // результат: 25
        System.out.println("Result1: " + result1);

        // Применение функции высшего порядка к функции binaryOperator и значениям 5 и 7
        int result2 = applyFunction2(binaryOperator, 5, 7); // результат: 12
        System.out.println("Result2: " + result2);
    }
    // Функции высшего порядка, принимающие функцию в качестве аргумента
    // и применяющая ее к значению
    public static Integer applyFunction1(Function<Integer, Integer> func, Integer value) {
        return func.apply(value);
    }
    public static Integer applyFunction2(BinaryOperator<Integer> func, Integer value1, Integer value2) {
        return func.apply(value1, value2);
    }
}
