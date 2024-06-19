package oop.OOP_34;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class MyClass35 {
    public static void main(String[] args) throws IOException {
        // itunes API - по запросу ищем только первый ответ с фильмом

        // userInput
        String term = getUserInput();
        // buildUrl
        int limit = 300;
        String url = buildUrl(term, limit);
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
        String info = scanner.nextLine(); // war of world, terminator
        return info;
    }

    static String buildUrl(String term, int limit) {
        String termWithoutSpaces = term.replace(" ", "+");
        String itunesApi = "https://itunes.apple.com/search?term=";
        String limitParam = "&limit=" + limit;
        StringBuilder url = new StringBuilder();
        url.append(itunesApi);
        url.append(termWithoutSpaces);
        url.append(limitParam);
        return url.toString();
    }

    static String downloadPage(String url) throws IOException {
        String page = downloadWebPage(url);
        return page;
    }

    static void printResult(String page) {

        StringBuilder result = buildMovieResult(page);

        if (result.length() == 0) {
            result.append("Unknown result: ");
            result.append(page);
        }

        System.out.println(result.toString());

    }

    private static StringBuilder buildMovieResult(String page) {
        StringBuilder result = new StringBuilder();

        int start, end;
        int moviesCount = 0;
        int currentMovieIndex = 0;
        while (moviesCount < 10) {
            currentMovieIndex = page.indexOf("feature-movie", currentMovieIndex + 20);

            start = page.indexOf("trackName", currentMovieIndex + 20) + "trackName".length() + 3;
            end = page.indexOf("\",", start);
            String movieName = page.substring(start, end);

            start = page.indexOf("primaryGenreName", currentMovieIndex + 20) + "primaryGenreName".length() + 3;
            end = page.indexOf("\",", start);
            String primaryGenreName = page.substring(start, end);

            start = page.indexOf("longDescription", currentMovieIndex + 20) + "longDescription".length() + 3;
            end = page.indexOf("\"", start);
            String movieDescription = page.substring(start, end).replace("<br />", "\n");

            if (primaryGenreName.equals("Comedy")) {
                result.append("Finally found comedy.\n");
                result.append(movieName);
                result.append("\nDescription:\n");
                result.append(movieDescription);
                break;
            } else {
                result.append("This is a movie.\n");
                result.append(movieName);
                result.append("\nDescription:\n");
                result.append(movieDescription + "\n");
                moviesCount++;
            }
        }
        return result;
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
