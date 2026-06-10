// Methods of File class:
// Method	         Purpose
// createNewFile()	Creates a new file
// delete()         Deletes the file
// exists()         Checks if the file exists
// getName()        Returns the name of the file
// getAbsolutePath() Returns the absolute path of the file
// canWrite()       Checks if the file is writable
// canRead()        Checks if the file is readable
// length()         Returns the size of the file in bytes

import java.io.File;

public class FileInfo {
    public static void main(String[] args) {
        File file = new File("example.txt");

        if (file.exists()) {
            System.out.println("File Name: " + file.getName());
            System.out.println("Absolute Path: " + file.getAbsolutePath());
            System.out.println("Writable: " + file.canWrite());
            System.out.println("Readable: " + file.canRead());
            System.out.println("File Size: " + file.length() + " bytes");
        }
        else{
            System.out.println("File not exists");
        }
    }
}