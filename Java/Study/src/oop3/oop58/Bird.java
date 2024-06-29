package oop3.oop58;

public class Bird {

    String name;
    int age;
    String description;

    public Bird(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Bird)) {
            return false;
        } else {
            Bird objBird = (Bird) obj;
            return this.name.equals(objBird.name) && this.age == objBird.age;
        }
    }
}
