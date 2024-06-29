package oop3.oop59;

import java.io.File;

public class ConsoleDirectoryOnlyFilesScanner implements DirectoryScanner{

    @Override
    public void printDirectoryFiles(File[] files) {
        for (int i = 0; i < files.length; i++) {
            System.out.println(files[i].getName());
        }
    }

    @Override
    public File[] getDirectoryFiles(String dirPath) {
        File directory = new File(dirPath);
        File[] filesAndDirs = directory.listFiles();

        int filesCount = getFilesCount(filesAndDirs);

        File[] filesOnly = new File[filesCount];
        int lastIndex = 0;
        for (int i = 0; i < filesAndDirs.length; i++) {
            if (filesAndDirs[i].isFile()) {
                filesOnly[lastIndex] = filesAndDirs[i];
                lastIndex++;
            }
        }
        return filesOnly;
    }

    private static int getFilesCount(File[] filesAndDirs) {
        int filesCount = 0;
        for (int i = 0; i < filesAndDirs.length; i++) {
            if (filesAndDirs[i].isFile()) {
                filesCount++;
            }
        }
        return filesCount;
    }


}
