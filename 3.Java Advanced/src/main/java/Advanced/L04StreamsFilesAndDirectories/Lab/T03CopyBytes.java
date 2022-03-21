package Advanced.L04StreamsFilesAndDirectories.Lab;

import java.io.*;
import java.util.*;

public class T03CopyBytes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = "D:\\SoftUni-Java\\3.Java Advanced\\src\\Advanced\\L04StreamsFilesAndDirectories\\Lab\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String output = "D:\\SoftUni-Java\\3.Java Advanced\\src\\Advanced\\L04StreamsFilesAndDirectories\\Lab\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\03.CopyBytesOutput.txt";

        try (InputStream inputStream = new FileInputStream(input);
             OutputStream outputStream = new FileOutputStream(output)) {
            int oneByte = inputStream.read();

            while (oneByte >= 0) {
                if (oneByte == 32 || oneByte == 10) {
                    outputStream.write((char)oneByte);
                } else {
                    String digits = String.valueOf(oneByte);
                    for (int i = 0; i < digits.length(); i++) {
                        outputStream.write(digits.charAt(i));
                    }
                }
                oneByte = inputStream.read();
            }


        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
