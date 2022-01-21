package Advanced.L04StreamsFilesAndDirectories.Exercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class T1SumLines {
    public static void main(String[] args) throws IOException {

        String input = "D:\\SoftUni-Java\\3.Java Advanced\\src\\Advanced\\L04StreamsFilesAndDirectories\\Exercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        List<String> allLines = Files.readAllLines(Path.of(input));
        BufferedReader reader = new BufferedReader(new FileReader(input));

        //purvi nachin
        String string = reader.readLine();
        while (string != null) {
            int sum = 0;
            for (int i = 0; i < string.length(); i++) {
                sum += string.charAt(i);
            }
            System.out.println(sum);
            string = reader.readLine();
        }

        //vtori nachin
        allLines.stream()
                .map(line->line.toCharArray())
                .forEach(arr-> {
                            int sum = 0;
                            for (char c : arr) {
                                sum += c;
                            }
                            System.out.println(sum);
                        }
                        );

    }
}
