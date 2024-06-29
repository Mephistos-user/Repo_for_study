package oop3.oop59;

import java.io.File;

public interface DirectoryScanner {
    void printDirectoryFiles(File[] files);

    default File[] getDirectoryFiles(String dirPath) {
        File directory = new File(dirPath);
        return directory.listFiles();
    }

    default void readAndPrint(String directorypath) {
        File[] files = getDirectoryFiles((directorypath));
        printDirectoryFiles(files);
    }
}
