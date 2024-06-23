package oop3.oop54;

public class Dog implements Speakable {
    @Override
    public void speak(String str) {
        System.out.println(str + "! Gav Gav!");
    }

    @Override
    public void introduceYourself() {
        System.out.println("Im dog!");
    }

}
