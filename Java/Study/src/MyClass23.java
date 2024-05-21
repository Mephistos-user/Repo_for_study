import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class MyClass23 {
    public static void main(String[] args) throws IOException, InterruptedException {

        // с помощью API и тернарного оператора получить 30 случайных цитат из "Во все тяжкие"

        String[] quotes = new String[30];
        for (int i = 0; i < 30; i++) {
            quotes[i] = "";
        }

        for (int i = 0; i < quotes.length; i++) {
            String page = downloadWebPage("https://api.breakingbadquotes.xyz/v1/quotes");
            Thread.sleep(500);
            int quoteStart = page.indexOf("quote");
            int quoteEnd = page.indexOf("author");
            int quoteLength = page.length();

            String quote = page.substring(quoteStart + 7, quoteEnd - 2);
            String author = "\n" + "- " + page.substring(quoteEnd + 9, quoteLength - 3);

            // если цитата длинная, то выведем только 50 символов из нее:
            String outputString = (quote.length() > 50) ? (quote.substring(0, 50) + "...\"" + author) : (quote + author);

            System.out.println("Quote " + i + " saved");
            boolean wordInArray = false;
            for (int j = 0; j < i; j++) {
                String currentQuote = quotes[j];
                if (outputString.equals(currentQuote)) {
                    wordInArray = true;
                }
            }
            if (wordInArray) {
                System.out.println("quote already in array");
            } else {
                quotes[i] = outputString;
            }

        }
        System.out.println("Готово!");

        for (int i = 0; i < quotes.length; i++) {
            System.out.println("Quote # " + i + ": " + quotes[i]);
        }

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
