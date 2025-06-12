// Повторяющийся код
/*
public class Calculator {
    public int add(int a, int b) {
        if (a == null || b == null) {
            return 0;
        }
        return a + b;
    }
    public int multiply (int a, int b) {
        if (a == null || b == null) {
            return 0;
        }
        return a * b;
    }
}
*/

//В этом примере кода у нас есть дублирование проверки на null, что делает его менее читаемым и более трудоемким для поддержки.
// Рефакторинг: Для улучшения этого кода мы можем выделить повторяющийся участок в отдельный метод или класс.

public class Calculator1 {
    public int add (Integer a, Integer b) {
        if (checkNull(a, b)) {
            return 0;
        } return a + b;
    }
    public int multiply (Integer a, Integer b) {
        if(checkNull(a, b)) {
            return 0;
        }
        return a * b;
    }
    private boolean checkNull(Integer a, Integer b) {
        return a == null || b == null;
    }
}
