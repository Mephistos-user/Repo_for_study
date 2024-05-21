import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyClass22 {
    public static void main(String[] args) throws IOException, FileNotFoundException {

        // чтение из файла, сохранение строк в массиве и вывод в обратной последовательности в интервале:

        FileReader fileReader = new FileReader("testFile22.txt");
        BufferedReader reader = new BufferedReader(fileReader);

        String [] part = new String[100];

        for (int i = 0; i < 100; i++) {
            part[i] = reader.readLine();
        }
        for (int i = 30; i > 20; i--) {
            System.out.println(part[i]);
        }

        System.out.print("Готово!");

    }
}
