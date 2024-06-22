package oop2.oop48;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MyClass50 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
//        BufferedWriter writer = new BufferedWriter((new FileWriter("out.txt")));
//
//        try {
//            System.out.print("x: ");
//            int x = scanner.nextInt();
//            System.out.print("y: ");
//            int y = scanner.nextInt();
//
//            writer.write(x + "/" + y + "=" + x/y);
//        } catch (Exception e) {
//            writer.write("There is a error: " + e);
//            throw e;
//        } finally {
//            writer.close();
//            System.out.println("written to out.txt");
//        }

        // чтобы файл всегда автоматически закрывался:
        try (BufferedWriter writer = new BufferedWriter((new FileWriter("out.txt")))) {
            // но в таком случае объект writer можно использовать только внутри блока try
            System.out.print("x: ");
            int x = scanner.nextInt();
            System.out.print("y: ");
            int y = scanner.nextInt();

            writer.write(x + "/" + y + "=" + x/y);
        } catch (Exception e) {
//            writer.write("There is a error: " + e);
            throw e;
        }

    }
}
