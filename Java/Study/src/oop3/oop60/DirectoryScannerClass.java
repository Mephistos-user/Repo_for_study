package oop3.oop60;

import java.io.File;

public abstract class DirectoryScannerClass {

    String directoryPath;

    DirectoryScannerClass(String inputDir) {
        this.directoryPath = inputDir;
    }

    abstract void printDirectoryFiles(File[] files);

    File[] getDirectoryFiles() {
        File directory = new File(this.directoryPath);
        return directory.listFiles();
    }

    void readAndPrint(String directorypath) {
        File[] files = getDirectoryFiles();
        printDirectoryFiles(files);
    }
}
