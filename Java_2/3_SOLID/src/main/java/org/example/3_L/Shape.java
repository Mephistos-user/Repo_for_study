// 3. Принцип подстановки Барбары Лисков (Liskov Substitution Principle - LSP):
/*
class Rectangle {
    protected int width;
    protected int height;
    public void setWidth (int width) {
        this.width = width;
    }
    public void setHeight (int height) {
        this.height = height;
    }
    public int calculateArea() {
        return width * height;
    }
}
class Square extends Rectangle {
    @Override
    public void setWidth (int width) {
        this.width = width;
        this.height = width;
    }
    @Override
    public void setHeight (int height) {
        this.width = height;
        this.height = height;
    }
}
*/
// В этом примере класс Square наследует класс Rectangle, и методы setWidth() и setHeight() в Square изменены так, чтобы они всегда устанавливали одинаковые значения для ширины и высоты. Это приводит к нарушению ожидаемого поведения для объектов типа Rectangle, что является нарушением принципа подстановки Барбары Лисков.
// Рефакторинг:
interface Shape {
    int calculateArea();
}
class Rectangle implements Shape {
    protected int width;
    protected int height;
    public void setWidth (int width) {
        this.width = width;
    }
    public void setHeight (int height) {
        this.height = height;
    }
    @Override
    public int calculateArea() {
        return width * height;
    }
}
class Square implements Shape {
    protected int side;
    public void setSide (int side) {
        this.side = side;
    }
    @Override
    public int calculateArea() {
        return side * side;
    }
}
// В этом рефакторинге класс Square больше не наследует класс Rectangle, а вместо этого реализует интерфейс Shape. Теперь методы setWidth() и setHeight() отсутствуют, и Square имеет свою собственную логику для вычисления площади. Таким образом, мы избежали нарушения принципа подстановки Барбары Лисков, сделав классы более предсказуемыми и согласованными.