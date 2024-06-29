package oop3.oop59;

import oop3.oop55.OutputFileWriter;
import oop3.oop55.Row;
import oop3.oop55.TableWriter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CsvDirectoryScanner implements DirectoryScanner {
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
