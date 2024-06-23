package oop3.oop54;

public class Donkey implements Speakable {
    @Override
    public void speak(String str) {
        System.out.println(str + "! Ia Ia!");

    }
    @Override
    public void introduceYourself() {
        System.out.println("Im donkey!");
    }
}
