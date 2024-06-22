package oop2.oop42;

public class MyClass42 {
    public static void main(String[] args) {



        // 1 вариант:
//        Printer printer = new Printer();
//        printer.init("HP", 200);

        // конструктор класса
        // 2 вариант:
        Printer printer = new Printer("HP");
        printer.writePrinterInfo();
    }
}
