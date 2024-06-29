package oop3.oop54;

public class Cat54 implements Speakable54 {

    public String name;
    public int age;

    @Override
    public String toString() {
        return this.name + ", " + this.age + " years old";
    }

    @Override
    public void speak(String str) {
        System.out.println(str + "! Meow Meow!");

    }
    @Override
    public void introduceYourself() {
        System.out.println("Im cat!");
    }
}
