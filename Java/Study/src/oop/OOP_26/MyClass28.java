package OOP_26;

import java.io.File;

public class MyClass28 {
    public static void main(String[] args) {

        File dir = new File("text_files");
        File[] files = dir.listFiles();
        int filesCount = files.length;
//        long[] sizes = new long[filesCount];
//        String[] fileNames = new String[filesCount];
//        String[] absolutePathes = new String[filesCount];
        FileInformation26[] fileInfos = new FileInformation26[filesCount];

        for (int i = 0; i < filesCount; i++) {
            File currentFile = files[i];
            FileInformation26 info = new FileInformation26();
            info.absolutePath = currentFile.getAbsolutePath();
            info.fileName = currentFile.getName();
            info.size = currentFile.length();

            fileInfos[i] = info;
        }

        long maxSize = 0;
        for (int i = 0; i < filesCount; i++) {
//            FileInformation26 current = fileInfos[i];
//            System.out.println("file " + (i + 1) + ": " + current.fileName);
            if (fileInfos[i].isTextFile()) {
                System.out.println("file " + fileInfos[i].fileName + " is text file");
            }
            System.out.println("file " + (i + 1) + ": " + fileInfos[i].fileName);

            if (fileInfos[i].size > maxSize) {
                maxSize = fileInfos[i].size;
            }
        }
        System.out.println("max files size in bytes = " + maxSize);
    }
}
