import java.io.File;

public class MyClass26 {
    public static void main(String[] args) {
        File file = new File("textFile22.txt");

        FileInformation26 info = new FileInformation26();
        info.absolutePath = file.getAbsolutePath();
        info.fileName = file.getName();
        info.size = file.length();




        File file2 = new File("book.txt");
        FileInformation26 info2 = new FileInformation26();
        info2.absolutePath = file2.getAbsolutePath();
        info2.fileName = file2.getName();
        info2.size = file2.length();


        if (info.size > info2.size) {
            System.out.println("fileName: " + info.fileName);
            System.out.println("absolutePath: " + info.absolutePath);
            System.out.println("size: " + info.size);
        } else {
            System.out.println("fileName: " + info2.fileName);
            System.out.println("absolutePath: " + info2.absolutePath);
            System.out.println("size: " + info2.size);
        }
    }
}
