package oop3.oop59;

import java.io.File;

public class ConsoleDirectoryScanner implements DirectoryScanner{

    @Override
    public void printDirectoryFiles(File[] files) {
        for (int i = 0; i < files.length; i++) {
            System.out.println(files[i].getName());
        }
    }

    @Override
    public File[] getDirectoryFiles(String dirPath) {
        File directory = new File(dirPath);
        return directory.listFiles();
    }
}
