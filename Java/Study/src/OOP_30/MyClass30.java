package OOP_30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class MyClass30 {
    public static void main(String[] args) throws IOException {

        // itunes API

        // userInput
        String term = getUserInput();
        // buildUrl
        String url = buildUrl(term);
        // downloadWebPages
        String page = downloadPage(url);
        // parseResult
        printResult(page);

        // тоже вариант
//        printResult(downloadPage(buildUrl(getUserInput())));

    }

    static String getUserInput() {
        System.out.println("What you looking in tunes?");
        Scanner scanner = new Scanner(System.in);
        String term = scanner.nextLine(); // war of world
        return term;
    }

    static String buildUrl(String term) {
        String termWithoutSpaces = term.replace(" ", "+");
        String url = "https://itunes.apple.com/search?term=" + termWithoutSpaces + "&limit=1";
        return url;
    }

    static String downloadPage(String url) throws IOException {
        String page = downloadWebPage(url);
        return page;
    }

    static void printResult(String page) {
        int start = page.indexOf("kind") + 7;
        int end = page.indexOf("\"", start);
        System.out.println(page.substring(start, end));
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
