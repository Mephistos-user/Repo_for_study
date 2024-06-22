package oop2.oop44;

public class MyClass44 {
    public static void main(String[] args) {

        // super, конструкторы, наследование

//        1.
//        AwesomeString awesomeString = new AwesomeString("hello");
//        AwesomeString awesomeString1 = new AwesomeString(55);
//
//        awesomeString.name = "superscaner";
//        awesomeString1.name = "awesome-string";
//
//        awesomeString.readString();
//        awesomeString1.readString();
//
//        System.out.println(awesomeString.str);
//        System.out.println(awesomeString1.str);

//        2.
//        LimitedAwesomeString limited = new LimitedAwesomeString("hello, hello",10);
////        limited.name = "dsfsf";
////        limited.readString();
//
//        System.out.println(limited.str);
//        System.out.println(limited.limit);

//        3.
//        AwesomeString awesomeString = new AwesomeString();
//        System.out.println(awesomeString.str);
//
//        4.
//        LimitedAwesomeString limited = new LimitedAwesomeString(150);
//        System.out.println(limited.str);

//        5.
        StringWithDoubleLimit doubleStr = new StringWithDoubleLimit(3333);
        System.out.println(doubleStr.str + " " + doubleStr.limit);

    }


}
