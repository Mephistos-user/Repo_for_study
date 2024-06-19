package OOP_36;

import java.io.IOException;
import java.util.Scanner;

public class MyClass37 {
    public static void main(String[] args) throws IOException {

        // плеер itunes - скачивание и проигрывание preview-записей музыки (30 сек)

        ITunesMusicPlayer player = new ITunesMusicPlayer();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which song you are looking for?");
        String name = scanner.nextLine();
        player.playSong(name);
    }
}
