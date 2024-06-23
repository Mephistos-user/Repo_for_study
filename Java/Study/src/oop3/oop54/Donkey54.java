package oop3.oop54;

public class Donkey54 implements Speakable54 {
    @Override
    public void speak(String str) {
        System.out.println(str + "! Ia Ia!");

    }
    @Override
    public void introduceYourself() {
        System.out.println("Im donkey!");
    }
}
