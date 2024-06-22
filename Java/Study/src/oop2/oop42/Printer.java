package oop2.oop42;

public class Printer {

    String maker;
    int price;


    // 1 вариант
//    void init(String inputMaker, int inputPrice) {
//        this.maker = inputMaker;
//        this.price = inputPrice;
//    }

    // конструктор класса
    // 2 вариант
    Printer(String inputMaker, int inputPrice) {
        this.maker = inputMaker;
        this.price = inputPrice;
    }
    // конструкторов может быть несколько в зависимости от типа или количества аргументов или вообще их отсутствия
    Printer(String inputMaker) {
        this.maker = inputMaker;
    }
    // пустой конструктор без передачи аргументов может быть использован для задания значений по-умолчанию
    Printer() {
        this.price = 500;
        System.out.println("Set printer price to default");
    }


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
