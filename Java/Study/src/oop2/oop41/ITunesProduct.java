package oop2.oop41;

public class ITunesProduct {
    String artistName;
    String collectionName;
    String previewUrl;
    String country;
    String releaseDate;

    void printIntroducePreview() {
        System.out.println(this.artistName + " - " + this.collectionName);
        System.out.println("url to preview: " + this.previewUrl);
    }

    void printReleaseDate() {
        System.out.println(this.collectionName + " be to relised " + this.releaseDate);
    }
}
