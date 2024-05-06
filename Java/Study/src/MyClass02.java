// скачать HTML-код страницы


import java.io.*;
import java.net.URL;
import java.net.URLConnection;

public class _02Second {
    public static void main(String[] args) throws IOException {

        String sourceCode = downloadWebPage("https://ya.ru");
        writeToFile(sourceCode);

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
    public static void writeToFile (String str) throws IOException {
        BufferedWriter writer = new BufferedWriter((new FileWriter("C:/Users/Admin/Desktop/Скаченные страницы HTML/MyHTML.html")));
        writer.write(str);
        writer.close();
    }
}
