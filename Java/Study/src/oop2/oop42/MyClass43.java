package oop2.oop42;

import oop2.oop48.RandomMovieNotFoundException;

import java.io.IOException;
import java.util.Scanner;

public class MyClass43 {
    public static void main(String[] args) throws IOException, RandomMovieNotFoundException {
        RandomMoviePicker moviePicker = new RandomMoviePicker();
        Movie[] movies = moviePicker.getRandomMovieNames();
        System.out.println("Chose film to watch: ");
        for (int i = 0; i < movies.length; i++) {
            int number = i + 1;
            System.out.println(number + ": " + movies[i].name + " (" + movies[i].year + ");");
        }
        System.out.print("Film number? ");
        Scanner scanner = new Scanner(System.in);
        int chosenNumber = scanner.nextInt();
        int chosenIndex = chosenNumber - 1;

        ITunesMoviePlayer player = new ITunesMoviePlayer();
        player.playMovie(movies[chosenIndex].name);

    }
}
