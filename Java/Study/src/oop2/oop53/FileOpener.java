package oop2.oop53;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class FileOpener {
    File file;

    FileOpener(File file) {
        this.file = file;
    }

    // переопределение методов при наследовании

    public void openFile() {
        Desktop desktop = Desktop.getDesktop();
        try {
            desktop.open(this.file);
        } catch (IOException e) {
            throw new RuntimeException("Error when opening file", e);
        }
    }

    public void printFileInfo() {
        System.out.println("This is file " + file.getName());
        System.out.println("It stored on path: " + file.getAbsolutePath());
    }
}
