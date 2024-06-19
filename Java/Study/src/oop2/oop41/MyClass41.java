package oop2.oop41;

public class MyClass41 {
    public static void main(String[] args) {

        // наследование

        ITunesSong song = new ITunesSong();
        song.trackName = "Billie Jean";
        song.trackCensoredName = "***** ***";
        song.artistName = "Michael Jackson";
        song.previewUrl = "http://itunes.com/billiejeam.mp3";
        song.collectionName = "Best of MJ";
        song.printIntroducePreview();
        song.releaseDate = "2020";

        ITunesMovie movie = new ITunesMovie();
        movie.shortDescription = "the best movie ever";
        movie.artistName = "Brad Pitt";
        movie.previewUrl = "http://itunes.com/bradpitt.mp4";
        movie.collectionName = "Best of BP";
        movie.printIntroducePreview();
        movie.releaseDate = "2022";

        song.printReleaseDate();
        movie.printReleaseDate();

        ITunesComedyMovie comedy = new ITunesComedyMovie();
        comedy.shortDescription = "the best comedy ever";
        comedy.artistName = "Jim Carry";
        comedy.previewUrl = "http://itunes.com/carry.mp4";
        comedy.collectionName = "Best of JC";
        comedy.printIntroducePreview();
        comedy.releaseDate = "2019";
        comedy.comedyGenre = "trash";
        comedy.rating = 10;
    }
}
