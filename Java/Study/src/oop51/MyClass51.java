package oop51;

public class MyClass51 {
    public static void main(String[] args) {
        ExampleDefaultValues exampleDefaultValues = new ExampleDefaultValues();
//        exampleDefaultValues.cat27 = new Cat27("name", 2);
//        System.out.println(exampleDefaultValues.cat27);
//        exampleDefaultValues.cat27.sayMeow();
        Cat27 cat1 = new Cat27("name1", 10);
        Cat27 cat2 = new Cat27("name2", 12);
        cat1 = cat2;
        cat2.name = "123";
        System.out.println(cat1.name);
//        if (cat1 == null) {
//            System.out.println("there is no cat");
//        } else {
//            System.out.println("There is a cat: " + cat1.name);
//        }
        cat1 = null;
        showCat(cat1);

    }

    public static void showCat(Cat27 cat) {
        if (cat == null) {
            System.out.println("there is no cat");
        } else {
            System.out.println(cat.name);
        }
    }
}
