package Advanced.L04StreamsFilesAndDirectories.Exercise;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class T7MergeTwoFiles {
    public static void main(String[] args) throws IOException {
        String path1 = "D:\\SoftUni-Java\\3.Java Advanced\\src\\Advanced\\L04StreamsFilesAndDirectories\\Exercise\\04" +
                ". Java-Advanced-Files-and-Streams-Exercises-Resources\\inputOne.txt";
        String path2 = "D:\\SoftUni-Java\\3.Java Advanced\\src\\Advanced\\L04StreamsFilesAndDirectories\\Exercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputTwo.txt";

        List<String> file1 = Files.readAllLines(Path.of(path1));
        List<String> file2 = Files.readAllLines(Path.of(path2));

        for (String s : file1) {
            System.out.println(s);
        }
        for (String s : file2) {
            System.out.println(s);
        }
    }
}
