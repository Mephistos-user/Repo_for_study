package oop3.oop55;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CsvTableWriter implements TableWriter{
    String fileName;

    CsvTableWriter() {
        this.fileName = "table.csv";
    }

    @Override
    public void writeTable(Row[] table) {


        try {
            FileWriter fileWriter = new FileWriter(this.fileName);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (int i = 0; i < table.length; i++) {
                Row current = table[i];

                bufferedWriter.write(current.left + ";" + current.right + "\n");
            }
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String getOutputPlace() {
        return "CSV file: " + fileName;
    }

//    private String spaceString(Row[] table, int currLength) {
//        int maxLenght = 0;
//        for (int i = 0; i < table.length; i++) {
//            Row current = table[i];
//            if (maxLenght < current.left.length()) {
//                maxLenght = current.left.length();
//            }
//        }
//        int dif = maxLenght - currLength;
//        String space = " ";
//        StringBuilder str = new StringBuilder();
//
//        for (int i = 0; i < dif; i++) {
//            str.append(space);
//        }
//        return str.toString();
//    }
}
