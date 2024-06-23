package oop3.oop54;

public class Dog54 implements Speakable54 {
    @Override
    public void speak(String str) {
        System.out.println(str + "! Gav Gav!");
    }

    @Override
    public void introduceYourself() {
        System.out.println("Im dog!");
    }

}
