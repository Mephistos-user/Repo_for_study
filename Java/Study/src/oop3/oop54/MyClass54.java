package oop3.oop54;

public class MyClass54 {
    public static void main(String[] args) {
        Speakable54 speakable = new Dog54();
        sayHello(speakable);
    }

    public static void sayHello(Speakable54 speakable) {
        speakable.speak("Hello");
        speakable.introduceYourself();
    }
}
