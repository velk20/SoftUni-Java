package Advanced.L04StreamsFilesAndDirectories.Lab;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class T06SortLines {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path input = Paths.get ("D:\\SoftUni-Java\\3.Java Advanced\\src\\Advanced\\L04StreamsFilesAndDirectories\\Lab" +
                "\\04" +
                ". " +
                "Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt");


        String output = "D:\\SoftUni-Java\\3.Java Advanced\\src\\Advanced\\L04StreamsFilesAndDirectories\\Lab\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\06.SortLinesOutput.txt";

        List<String> lines = Files.readAllLines(input);
        Collections.sort(lines);
        PrintWriter printWriter = new PrintWriter(new FileOutputStream(output));

        for (String line : lines) {
            printWriter.println(line);
            System.out.println(line);
        }

        printWriter.close();
    }
}
