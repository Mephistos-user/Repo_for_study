package oop3.oop57;

import java.awt.Desktop;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NasaPictureDownloader {
    public void downloadAndOpen(NasaPictureInfo info) {
        System.out.println("Will download " + info + " ...");
        System.out.println("Description: " + info.getPrettyExplanation());

        // download and open
        try (InputStream in = new URL(info.fileUrl).openStream()) {
            String[] arr = info.fileUrl.split("\\.");
            String fileExtention = arr[arr.length - 1];
            String fileName = "C:/Users/Admin/Desktop/cosmos/" + info.title + " (" + info.date + ")." + fileExtention;
            Files.copy(in, Paths.get(fileName));
            System.out.print("File saved!");
            Desktop desktop = Desktop.getDesktop();
            desktop.open(new File(fileName));

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
