package oop3.oop59;

import java.io.*;

public class TextFileDirectoryScanner implements DirectoryScanner{

    @Override
    public void printDirectoryFiles(File[] files) {
        try {
            FileWriter fileWriter = new FileWriter("dir.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (int i = 0; i < files.length; i++) {
                bufferedWriter.write(files[i].getName() + "\n");
            }
            bufferedWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
