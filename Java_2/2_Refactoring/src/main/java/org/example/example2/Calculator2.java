package org.example.example2;
// Название классов и методов
public class Calc {
    public int plus (Integer a, Integer b) {
        if (a == null || b == null) {
            return 0;
        }
        return a + b;
    }
    public int mult (Integer a, Integer b) {
        if (a == null || b == null) {
            return 0;
        }
        return a * b;
    }
}


// Рефакторинг:
public class Calculator {
    public int add (Integer firstNumber, Integer secondNumber) {
        if (isNull(firstNumber, secondNumber)) {
            return 0;
        }
        return firstNumber + secondNumber;
    }
    public int multiply (Integer firstNumber, Integer secondNumber) {
        if (isNull(firstNumber,secondNumber)) {
            return 0;
        }
        return firstNumber * secondNumber;
    }
    private boolean isNull (Integer firstNumber, Integer secondNumber) {
        return firstNumber == null || secondNumber == null;
    }
}
// В этом рефакторинге изменили название классас Calc наболее информативное Calculator. Методы plus и mult были переименованы в add и multiply соответственно, чтобы их названия лучше отражали их функциональность. Также было изменено название переменных с a, b на более понятные firstNumber, secondNumber, чтобы их назначения были яснее.