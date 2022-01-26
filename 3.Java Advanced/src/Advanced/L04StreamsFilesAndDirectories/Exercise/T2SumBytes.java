package Advanced.L04StreamsFilesAndDirectories.Exercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class T2SumBytes {
    public static void main(String[] args) throws IOException {
        String input = "D:\\SoftUni-Java\\3.Java Advanced\\src\\Advanced\\L04StreamsFilesAndDirectories\\Exercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        BufferedReader reader = new BufferedReader(new FileReader(input));

        String string = reader.readLine();
        int sum = 0;
        while (string != null) {
            for (int i = 0; i < string.length(); i++) {
                sum += string.charAt(i);
            }
            string = reader.readLine();
        }
        System.out.println(sum);
    }
}
