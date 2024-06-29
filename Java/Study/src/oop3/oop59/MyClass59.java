package oop3.oop59;

import java.io.File;

public class MyClass59 {
    public static void main(String[] args) {

        DirectoryScanner directoryScanner = new ConsoleDirectoryOnlyFilesScanner();
//        File[] files = directoryScanner.getDirectoryFiles("C:/Users/Admin/Repositories/Repo_for_study/Java/Study");
        directoryScanner.readAndPrint("C:/Users/Admin/Repositories/Repo_for_study/Java/Study");
    }


}
