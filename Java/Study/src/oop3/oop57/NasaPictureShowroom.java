package oop3.oop57;

import java.util.Scanner;

public class NasaPictureShowroom {
    public void show() {
        NasaRandomPicturesFinder randomPicturesFinder = new NasaRandomPicturesFinder();
        System.out.println("Searching pictures...");
        NasaPictureInfo[] pictures = randomPicturesFinder.findRandomPictures(5);
        System.out.println("Found pictures: ");
        for (int i = 0; i < pictures.length; i++) {
            System.out.println(i + ": " + pictures[i]);
        }
        System.out.println("Which picture you want to see?");
        Scanner scanner = new Scanner(System.in);
        int answer = scanner.nextInt();

        NasaPictureDownloader downloader = new NasaPictureDownloader();
        downloader.downloadAndOpen(pictures[answer]);


    }
}
