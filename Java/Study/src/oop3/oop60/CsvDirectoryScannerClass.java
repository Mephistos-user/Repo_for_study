package oop3.oop60;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class CsvDirectoryScannerClass extends DirectoryScannerClass {

    CsvDirectoryScannerClass(String inputDir) {
        super(inputDir);
    }

    @Override
    public void printDirectoryFiles(File[] files) {
        try {
            FileWriter fileWriter = new FileWriter("dir.csv");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (int i = 0; i < files.length; i++) {
                bufferedWriter.write(files[i].getName() + ";");
                if (files[i].isDirectory()) {
                    bufferedWriter.write("Directory");
                } else {
                    bufferedWriter.write("File");
                }
                bufferedWriter.write("\n");
            }
            bufferedWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
