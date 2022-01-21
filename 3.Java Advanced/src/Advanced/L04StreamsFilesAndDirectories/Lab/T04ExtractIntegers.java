package Advanced.L04StreamsFilesAndDirectories.Lab;

import java.io.*;
import java.util.*;

public class T04ExtractIntegers {
    public static void main(String[] args) throws IOException {
        String input = "D:\\SoftUni-Java\\3.Java Advanced\\src\\Advanced\\L04StreamsFilesAndDirectories\\Lab\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String output = "D:\\SoftUni-Java\\3.Java Advanced\\src\\Advanced\\L04StreamsFilesAndDirectories\\Lab\\04. " +
                "Java-Advanced-Files-and-Streams-Lab-Resources\\04.ExtractIntegersOutput.txt";



        FileInputStream inputStream = new FileInputStream(input);
        PrintWriter printWriter = new PrintWriter(new FileOutputStream(output));
        Scanner scanner = new Scanner(inputStream);

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                printWriter.println(number);
            }
            scanner.next();
        }

        inputStream.close();
        printWriter.close();
    }
}
