// 2. Принцип открытости/закрытости (Open/Closed Principle - OCP):
/*
public class Circle {
    public double radius;
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
public class Rectangle {
    public double width;
    public double height;
    public double calculateArea() {
        return width * height;
    }
}
*/
// В этом примере для добавления новых фигур (например, треугольников) нам пришлось бы изменять существующий код.
// Рефакторинг:
public interface Shape {
    double calculateArea();
}
public class Circle implements Shape {
    private double radius;
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
public class Rectangle implements Shape {
    private double width;
    private double height;
    @Override
    public double calculateArea() {
        return width * height;
    }
}
// Теперь мы можем легко добавлять новые фигуры, не изменяя существующий код