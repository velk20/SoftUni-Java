package Advanced.L04StreamsFilesAndDirectories.Lab;

import java.io.File;
import java.util.*;

public class T08NestedFolders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String path = "D:\\SoftUni-Java\\3.Java Advanced\\src\\Advanced\\L04StreamsFilesAndDirectories\\Lab\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams";
        File file = new File(path);

        File folder = new File(path);

        ArrayDeque<File> queue = new ArrayDeque<>();
        queue.addFirst(folder);

        int folderCount = 0;

        while (!queue.isEmpty()) {
            File currentFile = queue.poll();

            if (currentFile.isDirectory()) {
                System.out.println(currentFile.getName());
                queue.addAll(Arrays.asList(Objects.requireNonNull(currentFile.listFiles())));
                folderCount++;
            }
        }

        System.out.printf("%s folders", folderCount);
    }

    }

