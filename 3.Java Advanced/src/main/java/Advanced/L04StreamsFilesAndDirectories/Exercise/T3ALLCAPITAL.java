package Advanced.L04StreamsFilesAndDirectories.Exercise;

import java.io.*;

public class T3ALLCAPITAL {
    public static void main(String[] args) throws IOException {
        String input = "D:\\SoftUni-Java\\3.Java Advanced\\src\\Advanced\\L04StreamsFilesAndDirectories\\Exercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        String output = "D:\\SoftUni-Java\\3.Java Advanced\\src\\Advanced\\L04StreamsFilesAndDirectories\\Exercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\output.txt";

        BufferedReader reader = new BufferedReader(new FileReader(input));
        PrintWriter printWriter = new PrintWriter(new FileOutputStream(output));
        String string = reader.readLine();
        while (string != null) {
            printWriter.println(string.toUpperCase());

            string = reader.readLine();
        }
        printWriter.close();

    }
}
