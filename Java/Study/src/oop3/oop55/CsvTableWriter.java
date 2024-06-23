package oop3.oop55;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CsvTableWriter implements TableWriter, OutputFileWriter {
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

    @Override
    public String getFileName() {
        return this.fileName;
    }
}
