package oop.OOP_33;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class MyClass33 {
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
        int start = page.indexOf("wrapperType") + 14;
        int end = page.indexOf("\",", start);
        StringBuilder result = new StringBuilder();
        String wrapperType = page.substring(start, end);

        if (wrapperType.equals("audiobook")) {
            result = buildBookResult(page);

        } else if (wrapperType.equals("track")) {
            String kind = getKind(page);

            if (kind.equals("song")) {
                result= buildSongResult(page);

            } else if (kind.equals("feature-movie")) {
                result = buildMovieResult(page);
            }
        }
        if (result.length() == 0) {
            result.append("Unknown result: ");
            result.append(page);
        }

        System.out.println(result.toString());

    }

    private static String getKind(String page) {
        int end;
        int start;
        start = page.indexOf("kind") + "kind".length() + 3;
        end = page.indexOf("\",", start);
        String kind = page.substring(start, end);
        return kind;
    }

    private static StringBuilder buildSongResult(String page) {
        StringBuilder result = new StringBuilder();
        int start;
        int end;
        start = page.indexOf("artistName") + "artistName".length() + 3;
        end = page.indexOf("\",", start);
        String artistName = page.substring(start, end);

        start = page.indexOf("trackName") + "trackName".length() + 3;
        end = page.indexOf("\",", start);
        String trackName = page.substring(start, end);

        result.append("This is a song.\n");
        result.append(artistName);
        result.append(" - ");
        result.append(trackName);

        return result;
    }

    private static StringBuilder buildMovieResult(String page) {
        StringBuilder result = new StringBuilder();
        int start;
        int end;
        start = page.indexOf("trackName") + "trackName".length() + 3;
        end = page.indexOf("\",", start);
        String movieName = page.substring(start, end);

        start = page.indexOf("longDescription") + "longDescription".length() + 3;
        end = page.indexOf("\"", start);
        String movieDescription = page.substring(start, end).replace("<br />", "\n");

        result.append("This is a movie.\n");
        result.append(movieName);
        result.append(" - ");
        result.append(movieDescription);

        return result;
    }

    private static StringBuilder buildBookResult(String page) {
        StringBuilder builder = new StringBuilder();
        int start;
        int end;
        start = page.indexOf("artistName") + 13;
        end = page.indexOf("\",", start);
        String author = page.substring(start, end);

        start = page.indexOf("collectionName") + "collectionName".length() + 3;
        end = page.indexOf("\",", start);
        String bookName = page.substring(start, end);

        start = page.indexOf("description") + "description".length() + 3;
        end = page.indexOf("\"", start);
        String bookDescription = page.substring(start, end);

        builder.append("This is a book. Author is ");
        builder.append(author);
        builder.append(". The name is: ");
        builder.append(bookName);
        builder.append("\nDescription:\n");
        builder.append(bookDescription);
        return builder;
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
