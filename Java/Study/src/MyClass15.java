import java.io.File;
import java.io.IOException;

public class MyClass15 {
    public static void main(String[] args) throws IOException {
        int x = 1;
        while (x <1000) {
            File file = new File("files/" + x);
            file.createNewFile();
            x++;
        }
    }
}
