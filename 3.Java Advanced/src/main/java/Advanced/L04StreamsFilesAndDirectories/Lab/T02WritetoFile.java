package Advanced.L04StreamsFilesAndDirectories.Lab;

import java.io.*;
import java.util.*;

public class T02WritetoFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "D:\\SoftUni-Java\\3.Java Advanced\\src\\Advanced\\L04StreamsFilesAndDirectories\\Lab\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String output = "D:\\SoftUni-Java\\3.Java Advanced\\src\\Advanced\\L04StreamsFilesAndDirectories\\Lab\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\02.WriteToFileOutput.txt";
        Set<Character> set = new HashSet<>();
        Collections.addAll(set, '.', '!', ',', '?');

        try(InputStream inputStream = new FileInputStream(input);
            OutputStream outputStream = new FileOutputStream(output)) {
            int oneByte = inputStream.read();
            while (oneByte >= 0) {
                char myByteChar = (char) oneByte;
                if (!set.contains(myByteChar)) {
                    outputStream.write(oneByte);
                }
                oneByte = inputStream.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
