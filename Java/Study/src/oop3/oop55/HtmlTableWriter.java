package oop3.oop55;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class HtmlTableWriter implements TableWriter, OutputFileWriter {
    String fileName;

    HtmlTableWriter() {
        this.fileName = "table.html";
    }

    @Override
    public void writeTable(Row[] table) {


        try {
            FileWriter fileWriter = new FileWriter(this.fileName);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write("<table border=1><tr><td>");
            Row header = table[0];
            bufferedWriter.write(header.left);
            bufferedWriter.write("</td><td>");
            bufferedWriter.write(header.right);
            bufferedWriter.write("</td></tr>");
            for (int i = 1; i < table.length; i++) {
                Row current = table[i];

                bufferedWriter.write("<tr><td>" + current.left + "</td><td>" + current.right + "</td></tr>");
            }
            bufferedWriter.write("</table>");
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String getOutputPlace() {
        return "HTML file: " + fileName;
    }

    @Override
    public String getFileName() {
        return this.fileName;
    }
}
