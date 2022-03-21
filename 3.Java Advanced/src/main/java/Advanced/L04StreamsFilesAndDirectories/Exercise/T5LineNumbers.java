package Advanced.L04StreamsFilesAndDirectories.Exercise;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class T5LineNumbers {
    public static void main(String[] args) throws IOException {
        Path input = Paths.get("D:\\SoftUni-Java\\3.Java Advanced\\src\\Advanced\\L04StreamsFilesAndDirectories\\Exercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputLineNumbers.txt");
        String output = "D:\\SoftUni-Java\\3.Java Advanced\\src\\Advanced\\L04StreamsFilesAndDirectories\\Exercise" +
                "\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\output.txt";

        List<String> lines = Files.readAllLines(input);
        PrintWriter printWriter = new PrintWriter(new FileOutputStream(output));
        int counter = 1;
        for (String line : lines) {
            printWriter.println(counter + ". " + line);
            counter++;
        }
        printWriter.close();

    }
}
