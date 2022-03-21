package Advanced.L04StreamsFilesAndDirectories.Exercise;

import java.io.File;

public class T8GetFolderSize {
    public static void main(String[] args) {
        String path = "D:\\SoftUni-Java\\3.Java Advanced\\src\\Advanced\\L04StreamsFilesAndDirectories\\Exercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources";

        File folder = new File(path);
        File[] allFiles = folder.listFiles();

        int folderSize = 0; //размер на папката
        for (File file : allFiles) {
            folderSize += file.length();
        }

        System.out.println("Folder size: " + folderSize);
    }
}
