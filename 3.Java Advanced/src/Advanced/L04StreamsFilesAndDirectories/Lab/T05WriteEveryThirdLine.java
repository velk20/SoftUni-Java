package Advanced.L04StreamsFilesAndDirectories.Lab;

import java.io.*;
import java.util.Scanner;

public class T05WriteEveryThirdLine {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String input = "D:\\SoftUni-Java\\3.Java Advanced\\src\\Advanced\\L04StreamsFilesAndDirectories\\Lab\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String output = "D:\\SoftUni-Java\\3.Java Advanced\\src\\Advanced\\L04StreamsFilesAndDirectories\\Lab\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\05.WriteEveryThirdLineOutput.txt";

        BufferedReader in = new BufferedReader(new FileReader(input));
        PrintWriter out = new PrintWriter(new FileOutputStream(output));

        String string = in.readLine();
        int counter = 1;
        while (string != null) {
            if (counter % 3 == 0) {
                out.println(string);
            }
            counter++;
            string = in.readLine();
        }

        in.close();
        out.close();
    }
}
