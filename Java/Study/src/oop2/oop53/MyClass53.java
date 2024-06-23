package oop2.oop53;

import javax.swing.JFileChooser;
import java.io.File;
import java.util.Scanner;

public class MyClass53 {
    public static void main(String[] args) {

        // открывать файл с помощью диалога

////         если не запускается диалоговое окно (например, на маке)
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Press enter to continue...");
//        scanner.nextLine();

        JFileChooser fileChooser = new MyFileChooser(); // выбиратель файлов
        fileChooser.showOpenDialog(null); // диалоговое окно выбора (null - без указания родительского окна)
        File file = fileChooser.getSelectedFile(); // получить выбранный файл и сохранить в объект типа File

        String[] nameParts = file.getName().split("\\.");
        String extention = nameParts[nameParts.length - 1];

        FileOpener opener;
        if (extention.equals("txt") || extention.equals("log") || extention.equals("md")) {
            opener = new TextFileOpener(file);
        } else if (extention.equals("mp3") || extention.equals("m4v") || extention.equals("jpg")) {
            opener = new MediaFileOpener(file);
        } else {
            opener = new FileOpener(file);
        }
        executeFile(opener);

    }

    public static void executeFile(FileOpener opener) {
        opener.printFileInfo();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to open file? (y/n)");
        String answer = scanner.next();
        if (answer.equals("y")) {
            opener.openFile();
        } else {
            System.out.println("Program will terminate");
        }
    }
}
