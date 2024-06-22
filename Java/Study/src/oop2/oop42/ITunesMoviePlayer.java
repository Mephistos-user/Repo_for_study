package oop2.oop42;

import java.awt.*;
import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ITunesMoviePlayer {
    PageDownloader downloader = new PageDownloader();

    void playMovie(String searchRequest) throws IOException {
        String url =  buildUrl(searchRequest);
        String page = this.downloader.downloadWebPage(url);

        String movieName = getTag(page ,"trackName");
        String previewUrl = getTag(page ,"previewUrl");
        System.out.println(movieName);
        String fileExtention = "." + previewUrl.substring(previewUrl.length()-3);
        String fileName = movieName + fileExtention;

        System.out.println("Will downloaded trailer of movie: " + movieName);
        // save download file
        try (InputStream in = new URL(previewUrl).openStream()) {
            Files.copy(in, Paths.get("C:/Users/Admin/Desktop/"+ fileName));
        }

        System.out.println("Downloaded!");

        // open file
        File file = new File("C:/Users/Admin/Desktop/"+ fileName);
        if(!Desktop.isDesktopSupported()) {
            System.out.println("not supported");
            return;
        }
        Desktop desktop = Desktop.getDesktop();
        if(file.exists()) {
            desktop.open(file);
        }
    }

    private String getTag(String page, String tagName) {
        int start = page.indexOf(tagName) + tagName.length() + 3;
        int end = page.indexOf("\"", start);
        String value = page.substring(start, end);
        return value;
    }

    private String buildUrl(String searchRequest) {
        int limit = 50;
        String term = searchRequest.replace(" ", "+");
        String itunesApi = "https://itunes.apple.com/search?term=";
        String limitParam = "&limit=" + limit;
        String mediaParam = "&media=movie";
        StringBuilder builder = new StringBuilder();
        builder.append(itunesApi);
        builder.append(term);
        builder.append(limitParam);
        builder.append(mediaParam);
        return builder.toString();
    }

}
