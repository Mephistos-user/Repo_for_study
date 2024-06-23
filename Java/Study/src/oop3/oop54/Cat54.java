package oop3.oop54;

public class Cat implements Speakable {
    @Override
    public void speak(String str) {
        System.out.println(str + "! Meow Meow!");

    }
    @Override
    public void introduceYourself() {
        System.out.println("Im cat!");
    }
}
