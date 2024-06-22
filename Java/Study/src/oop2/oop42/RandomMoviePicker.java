package oop2.oop42;

import oop2.oop48.RandomMovieNotFoundException;
import oop2.oop48.TooFewMoviesFoundException;

import java.io.IOException;

public class RandomMoviePicker {
    PageDownloader downloader = new PageDownloader();

    Movie[] getRandomMovieNames() throws RandomMovieNotFoundException {
        String url = "https://randommer.io/random-movies";
//        String url = "https://ya.ru"; // test exception

        String page;
        try {
            page = this.downloader.downloadWebPage(url);
        } catch (Exception e) {
//            throw new RandomMovieNotFoundException();
            Movie[] defaultMovies = new Movie[3];
            defaultMovies[0] = new Movie("The Terminator", "2003");
            defaultMovies[1] = new Movie("Alien", "1993");
            defaultMovies[2] = new Movie("Lier, lier", "2006");
            return defaultMovies;
        }

        Movie[] movies = new Movie[16];
        int endIndex = 0;
        int moviesFound = 0;
        for (int i = 0; i < 16; i++) {
            int captionIndex = page.indexOf("<div class=caption", endIndex);
            moviesFound = checkIfMovieFound(captionIndex, i, moviesFound);
            int startIndex = captionIndex + 22;
            endIndex = page.indexOf("</div>", startIndex);
            String movieName = page.substring(startIndex, endIndex);
            String nameWithoutYear = movieName.substring(0, movieName.length() - 7);
            String year = movieName.substring(movieName.length() - 5, movieName.length() - 1);
            movies[i] = new Movie(nameWithoutYear, year);
        }

        if (moviesFound < 3) {
            try {
                throw new TooFewMoviesFoundException(moviesFound);
            } catch (TooFewMoviesFoundException e) {
                System.out.println(e);
                throw new RuntimeException(e);
            }
        }
        return movies;
    }

    private static int checkIfMovieFound(int captionIndex, int i, int moviesFound) throws RandomMovieNotFoundException {
        if (captionIndex == -1 && i == 0) {

//                throw new RuntimeException("Random films not found. Something wrong with randommer.io?");
//                throw new RandomMovieNotFoundException("Random films not found. Something wrong with randommer.io?");
            throw new RandomMovieNotFoundException();
        } else {
            moviesFound++;
        }
        return moviesFound;
    }
}
