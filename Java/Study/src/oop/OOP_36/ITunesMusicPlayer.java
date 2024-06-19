package oop.OOP_36;

import java.awt.*;
import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ITunesMusicPlayer {

    void playSong(String searchRequest) throws IOException {
        playSongInternal(searchRequest, 1);
    }

    void playSong(String searchRequest, int limit) throws IOException {
        playSongInternal(searchRequest, limit);
    }

    private void playSongInternal(String searchRequest, int limit) throws IOException {
        String url =  buildUrl(searchRequest, limit);
        String page = downloadWebPage(url);

        String artictName = getTag(page ,"artistName");
        String trackName = getTag(page ,"trackName");
        String previewUrl = getTag(page ,"previewUrl");

        // save download file
        try (InputStream in = new URL(previewUrl).openStream()) {
            Files.copy(in, Paths.get("C:/Users/Admin/Desktop/"+ artictName + " - " + trackName + ".m4a"));
        }

        System.out.println("Downloaded!");
        System.out.println(artictName + " - " + trackName);

        // open file
        File file = new File("C:/Users/Admin/Desktop/"+ artictName + " - " + trackName + ".m4a");
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

    private String buildUrl(String searchRequest, int limit) {
        String term = searchRequest.replace(" ", "+");
        String itunesApi = "https://itunes.apple.com/search?term=";
        String limitParam = "&limit=" + limit;
        String mediaParam = "&media=music";
        StringBuilder builder = new StringBuilder();
        builder.append(itunesApi);
        builder.append(term);
        builder.append(limitParam);
        builder.append(mediaParam);
        return builder.toString();
    }

    private static String downloadWebPage(String url) throws IOException {

        StringBuilder result = new StringBuilder();
        String line;
        URLConnection urlConnection = new URL(url).openConnection();
        urlConnection.addRequestProperty("User-Agent", "Mozilla");
        try (InputStream is = urlConnection.getInputStream();
             BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
            while ((line = br.readLine()) != null) {
                result.append(line);
            }
        }
        return result.toString();

    }
}
