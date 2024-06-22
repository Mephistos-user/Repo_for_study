package oop2.oop48;

import java.io.IOException;

public class RandomMovieNotFoundException extends Exception {
    public RandomMovieNotFoundException() {
        super("Random films not found. Something wrong with site?");
    }

    public RandomMovieNotFoundException(Exception cause) {
        super("Random films not found. Something wrong with site?", cause);
    }

    public RandomMovieNotFoundException(String text){
        super(text);
    }
}
