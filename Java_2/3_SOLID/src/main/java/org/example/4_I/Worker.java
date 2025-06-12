// 4. Принцип разделения интерфейсов (Interface Segregation Principle - ISP):
/*
public interface Worker {
    void work();
    void eat();
}
public class Programmer implements Worker {
    @Override
    public void work() {
        // работа программиста
    }
    @Override
    public void eat() {
        // обед программиста
    }
}
public class Robot implements Worker {
    @Override
    public void work() {
        // работа робота
    }
    @Override
    public void eat() {
        // робот не может есть
    }
}
*/
// Здесь класс Robot наследует интерфейс Worker, хотя он не имеет нужды в методе eat().
// Рефакторинг:
public interface Workable {
    void work();
}
public interface Eatable {
    void eat();
}
public class Programmer implements Workable, Eatable {
    @Override
    public void work() {
        // работа программиста
    }
    @Override
    public void eat() {
        // обед программиста
    }
}
public class Robot implements Workable {
    @Override
    public void work() {
        // работа робота
    }
}
// Теперь интерфейсы разделены на Workable и Eatable, что позволяет классу Robot реализовать только те методы, которые ему нужны