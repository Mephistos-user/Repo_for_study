import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class MyClass18 {
    public static void main(String[] args) throws IOException {

        // сохранение ежедневных снимков космоса NASA по дате за месяц в файлы:

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month: ");
        String month = scanner.next();
        System.out.print("Enter year: ");
        String year = scanner.next();

        for (int day = 1; day < 31; day++) {
            String page = downloadWebPage("https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY&date=" + year + "-" + month + "-" + day);
            int urlBegin = page.lastIndexOf("hdurl\":");
            if (urlBegin != -1) {
                int urlEnd = page.lastIndexOf("media_type");
                String url = page.substring(urlBegin + 8, urlEnd - 3);
                System.out.println(url);

                try (InputStream in = new URL(url).openStream()) {
                    Files.copy(in, Paths.get("C:/Users/Admin/Desktop/cosmos_" + year + "_" + month + "_" + day + ".jpg"));
                }
            }
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
