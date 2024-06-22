package oop2.oop45;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ITunesPreviewPlayer {
    void play(ITunesProduct product) throws IOException {
        System.out.println("Will download" + product.collectionName);
        String name = product.collectionName;
        String extension = product.previewUrl.substring(product.previewUrl.length() - 3);
        String fileName = name + extension;

        try (InputStream in = new URL(product.previewUrl).openStream()) {
            Files.copy(in, Paths.get("C:/Users/Admin/Desktop/"+ fileName));
        }

        System.out.println("Downloaded!");

        File file = new File("C:/Users/Admin/Desktop/"+ fileName);
        if(!Desktop.isDesktopSupported()) {
            System.out.println("File opening not supported");
            return;
        }
        Desktop desktop = Desktop.getDesktop();
        if(file.exists()) {
            desktop.open(file);
        }
    }
}