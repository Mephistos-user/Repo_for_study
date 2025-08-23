/* Функциональный интерфейс в Java - это интерфейс, содержащий только один абстрактный
метод. Он используется для представления лямбда-выражений, которые представляют собой
анонимные функции.
Для создания функционального интерфейса в Java используется аннотация
@FunctionalInterface. Это не обязательно, но это хорошая практика, чтобы явно указать, что
ваш интерфейс предназначен для функционального программирования.*/

@FunctionalInterface
interface MyFunctionalInterface {
    void myMethod(); // Абстрактный метод
}
/*@FunctionalInterface: Эта аннотация помогает компилятору проверить, что ваш интерфейс
соответствует требованиям функционального интерфейса. Если вы попытаетесь добавить в
ваш интерфейс еще один абстрактный метод, компилятор выдаст ошибку.*/

// Пример 1: Функциональный интерфейс с одним методом
@FunctionalInterface
interface MyFunctionalInterface {
    void myMethod(); // Абстрактный метод
}
// Пример 2: Реализация функционального интерфейса с помощью лямбда-выражения
public class Main {
    public static void main(String[] args) {
        // Лямбда-выражение для метода myMethod интерфейса MyFunctionalInterface
        MyFunctionalInterface myFunctionalInterface = () -> System.out.println("Вызван метод myMethod");
        // Вызов метода через лямбда-выражение
        myFunctionalInterface.myMethod();
    }
}
/*Это простой пример использования функциональных интерфейсов в Java. Лямбда-выражение
позволяет нам создавать экземпляры интерфейсов на лету, что делает код более компактным и
читаемым.*/

// Функциональный интерфейс с параметрами
@FunctionalInterface
interface Calculator {
    int calculate(int a, int b); // Абстрактный метод с параметрами
}
public class Main {
    public static void main(String[] args) {
    // Лямбда-выражение для метода calculate интерфейса Calculator
        Calculator add = (a, b) -> a + b;
        Calculator subtract = (a, b) -> a - b;
        // Вызов метода через лямбда-выражение
        System.out.println("Сумма: " + add.calculate(5, 3)); // Вывод: 8
        System.out.println("Разность: " + subtract.calculate(5, 3)); // Вывод: 2
    }
}

// Функциональный интерфейс с возвращаемым значением
@FunctionalInterface
interface StringConverter {
    String convert(int number); // Абстрактный метод с возвращаемым значением
}
public class Main {
    public static void main(String[] args) {
        // Лямбда-выражение для метода convert интерфейса StringConverter
        StringConverter converter = number -> {
            String result = "";
            switch(number) {
                case 1:
                result = "One";
                break;
                case 2:
                result = "Two";
                break;
                case 3:
                result = "Three";
                break;
                default:
                result = "Unknown";
            }
            return result;
        };
        // Вызов метода через лямбда-выражение
        System.out.println("Converted number: " + converter.convert(2)); // Вывод: Two
    }
}