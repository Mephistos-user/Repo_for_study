package oop2.oop51;

public class Cat27 {
    public String name;
    public int age;

    public Cat27(String name1, int age1) {
//        this.name = name;
//        this.age = age;
        name = name1;
        age = age1;
    }

    public void sayMeow() {
        System.out.println("Meow! Im " + name);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Cat27) {
            Cat27 cat2 = (Cat27) obj;
            return this.name.equals(cat2.name) && this.age == cat2.age;
        } else {
            return false;
        }
    }
}
