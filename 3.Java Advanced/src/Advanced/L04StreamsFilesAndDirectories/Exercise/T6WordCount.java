package Advanced.L04StreamsFilesAndDirectories.Exercise;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class T6WordCount {
    public static void main(String[] args) throws IOException {
        Path input = Paths.get("D:\\SoftUni-Java\\3.Java Advanced\\src\\Advanced\\L04StreamsFilesAndDirectories\\Exercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\words.txt");
        Path input1 = Paths.get("D:\\SoftUni-Java\\3.Java Advanced\\src\\Advanced\\L04StreamsFilesAndDirectories\\Exercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\text.txt");

        String output = "D:\\SoftUni-Java\\3.Java Advanced\\src\\Advanced\\L04StreamsFilesAndDirectories\\Exercise" +
                "\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\output.txt";

        Set<String> lines = new HashSet<>(Files.readAllLines(input));

    }
}
