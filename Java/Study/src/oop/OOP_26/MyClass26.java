package oop.OOP_26;

import java.io.File;

public class MyClass26 {
    public static void main(String[] args) {

        // ООП
        // вывести информацию о большем файле

        File file = new File("text_files/testFile22.txt");

        FileInformation26 info = new FileInformation26();
        info.absolutePath = file.getAbsolutePath();
        info.fileName = file.getName();
        info.size = file.length();

        File file2 = new File("text_files/book.txt");
        FileInformation26 info2 = new FileInformation26();
        info2.absolutePath = file2.getAbsolutePath();
        info2.fileName = file2.getName();
        info2.size = file2.length();

        FileInformation26 bigInfo;

        if (info.size >= info2.size) {
            bigInfo = info;
        } else {
            bigInfo = info2;
        }

        System.out.println("file: " + bigInfo.fileName);
        System.out.println("Path: " + bigInfo.absolutePath);
        System.out.println("size: " + bigInfo.size);
    }
}
