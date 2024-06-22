package oop2.oop44;

public class LimitedAwesomeString extends AwesomeString {
    // конструктор базового класса обязательно должен вызываться в дочернем классе (с помощью super),
    // если нет default-конструктора в базовом классе
    // ВСЕГДА при компиляции сначала вызывается конструктор базового класса потом дочернего (даже по-умолчанию)
    // super ОБЯЗАТЕЛЬНО пишется первой строчкой в конструкторе наследника

    int limit;

    LimitedAwesomeString(int inputLimit) {
//        super("randomString"); // вызывает конструктор базового класса. Обязателен, если нет default-конструктора в базовом классе
        System.out.println("LimitedAwesomeString begin");
        this.limit = inputLimit;
        System.out.println("LimitedAwesomeString end");
    }
    LimitedAwesomeString(String inputString, int inputLimit) {
//        super(inputString); // вызывает конструктор базового класса. Обязателен, если нет default-конструктора в базовом классе
        this.limit = inputLimit;
    }
    LimitedAwesomeString(String inputString) {
        super(inputString); // вызывает конструктор базового класса. Обязателен, если нет default-конструктора в базовом классе
    }

}
