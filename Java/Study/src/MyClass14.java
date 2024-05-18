import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Paths;

public class MyClass14 {
    public static void main(String[] args) throws IOException {

        // сохранение ежедневного снимка космоса NASA в файл:

        String page = downloadWebPage("https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY");
        int urlBegin = page.lastIndexOf("hdurl\":");
        int urlEnd = page.lastIndexOf("media_type");
        String url = page.substring(urlBegin + 8, urlEnd - 3);
        System.out.println(url);

        try (InputStream in = new URL(url).openStream()) {
            Files.copy(in, Paths.get("C:/Users/Admin/Desktop/Снимки_космоса_HD1.jpg"));
        }

        System.out.print("Готово!");

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
