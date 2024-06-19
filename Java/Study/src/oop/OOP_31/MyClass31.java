package OOP_31;

public class MyClass31 {
    public static void main(String[] args) {
        Printer printer1 = new Printer();
        Printer printer2 = new Printer();
        Printer printer3 = new Printer();

        printer1.maker = "HP";
        printer1.price = 100;
        printer2.maker = "Canon";
        printer2.price = 150;
        printer3.maker = "Xerox";
        printer3.price = 300;

        printer1.writePrinterInfo();
        printer2.writePrinterInfo();
        printer3.writePrinterInfo();
        printer3.myMethod();

        printer2.decreasePrice();
        printer2.decreasePrice();
        printer2.decreasePrice();
        printer2.decreasePrice();

        printer2.writePrinterInfo();
    }

}
