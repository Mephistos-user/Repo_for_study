package oop2.oop48;

public class TooFewMoviesFoundException extends RandomMovieNotFoundException {
    public TooFewMoviesFoundException(int moviesFound) {
        super(("too few movies found: " + moviesFound));
    }
}
