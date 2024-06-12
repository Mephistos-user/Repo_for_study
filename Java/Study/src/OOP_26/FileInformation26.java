package OOP_26;

public class FileInformation26 {
        String absolutePath;
        String fileName;
        long size;

        public boolean isTextFile() {
                if (fileName.endsWith(".txt")) {
                        return true;
                } else {
                        return false;
                }
        }
}
