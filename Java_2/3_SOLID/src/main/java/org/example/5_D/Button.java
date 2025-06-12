// 5. Принцип инверсии зависимостей (Dependency Inversion Principle - DIP):
public class Button {
    private Lamp lamp;
    public Button() {
        this.lamp = new Lamp();
    }
    public void toggle() {
        if (lamp.isOn()) {
            lamp.turnOff();
        } else {
            lamp.turnOn();
        }
    }
}
public class Lamp {
    private boolean isOn;
    public void turnOn() {
        isOn = true;
    }
    public void turnOff() {
        isOn=false;
    }
    public boolean isOn() {
        return isOn;
    }
}

// Здесь класс Button непосредственно зависит от класса Lamp.
// Рефакторинг:
public interface Switchable {
    void turnOn();
    void turnOff();
    boolean isOn();
}
public class Button {
    private Switchable device;
    public Button (Switchable device) {
        this.device = device;
}
public void toggle() {
    if (device.isOn()) {
        device.turnOff();
    } else {
        device.turnOn();
    }
}
}
public class Lamp implements Switchable {
    private boolean isOn;
    @Override
    public void turnOn() {
        isOn = true;
    }
    @Override
    public void turnOff() {
        isOn=false;
    }
    @Override
    public boolean isOn() {
        return isOn;
    }
}
// Теперь класс Button зависит только от абстракции Switchable, что делает его более гибким и позволяет легко заменять реализации Switchable, например, на другие устройства, не модифицируя сам класс Button.