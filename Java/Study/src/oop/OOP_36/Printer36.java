package OOP_36;

public class Printer36 {

    String maker;

    int price;

    void myMethod() {
        System.out.println("this is method");
    }

    void writePrinterInfo() {
        System.out.println("Im printer");
        System.out.println("My maker is " + this.maker);
        System.out.println("My price is " + this.price);
    }

    void decreasePrice() {
        this.price = this.price - 10;
    }
}
