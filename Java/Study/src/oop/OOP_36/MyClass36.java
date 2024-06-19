package oop.OOP_36;

public class MyClass36 {
    public static void main(String[] args) {

        // перегрузка методов

        Printer36_MFU printer = new Printer36_MFU();

        setPrinterPrice(printer, 349.99);
        System.out.println(printer.price);

        setPrinterPrice(printer, "369");
        System.out.println(printer.price);

        setPrinterPrice(printer, 300);
        System.out.println(printer.price);

    }

    static void setPrinterPrice(Printer36_MFU balalaika, double price) {
        price = price + 50;
        balalaika.price = price;
    }

    static void setPrinterPrice(Printer36_MFU printer, int price) {
        price = price + 50;
        printer.price = price;
    }

    static void setPrinterPrice(Printer36_MFU printer, String price) {
        double priceDouble = Double.parseDouble(price);
        priceDouble += 50;
        printer.price = priceDouble;
    }
}
