package oop2.oop45;

import java.io.File;

public class StandartFile {
    File inputFile;
    String fileName;

    StandartFile (File input) {
        this.inputFile = input;
        this.fileName = input.getName();
    }

    String getInfo() {
        return this.fileName + ": " + this.inputFile;
    }
}
