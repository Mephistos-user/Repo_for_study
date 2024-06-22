package oop2.oop45;

import java.io.File;

public class MyClass45 {
    public static void main(String[] args) {

        // ВСЕГДА можно заменить наследника родителем:

//        File input = new File("C:/Users/Admin/Desktop/Experimenter.m4v");
//        StandartFile standartFile = new StandartFile(input); // родитель

        File mile = new File("C:/Users/Admin/Desktop/The Dressmaker.m4v");
        TextFile textFile = new TextFile(mile); // наследник

//        StandartFile newFile = new StandartFile(mile);
//        StandartFile notNewFile = standartFile;
//
//        System.out.println(newFile.fileName);
//        System.out.println(standartFile.fileName);
//        notNewFile.fileName = "changed";
//        System.out.println(notNewFile.fileName);
//        System.out.println(standartFile.fileName);

        StandartFile standart = textFile;

        System.out.println(textFile.linesCount);
        System.out.println(textFile.fileName);
        System.out.println(standart.fileName);

        printFile(standart);
        printFile(textFile);

    }

    static void printFile(StandartFile file) {
        // если функция принимает на вход базовый класс, то она автоматически может принимать и всех его наследников
        System.out.println("info:" + file.getInfo());
    }
}
