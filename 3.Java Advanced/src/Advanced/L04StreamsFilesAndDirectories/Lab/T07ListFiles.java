package Advanced.L04StreamsFilesAndDirectories.Lab;

import java.io.File;
import java.util.Scanner;

public class T07ListFiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String path = "D:\\SoftUni-Java\\3.Java Advanced\\src\\Advanced\\L04StreamsFilesAndDirectories\\Lab\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams";
        File file = new File(path);

        if (file.exists()) {
            File[] files = file.listFiles();
            for (int i = 0; i < files.length; i++) {
                if (files[i].isFile()) {
                    System.out.printf("%s: [%s]\n",files[i].getName(),files[i].length());
                }
            }
        }
    }
}
