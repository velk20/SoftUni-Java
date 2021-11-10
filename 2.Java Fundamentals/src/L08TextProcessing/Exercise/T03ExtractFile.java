package L08TextProcessing.Exercise;

import java.util.Scanner;

public class T03ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] path = scanner.nextLine().split("[\\\\.]+");
        System.out.printf("File name: %s\n",path[path.length-2]);
        System.out.printf("File extension: %s\n",path[path.length-1]);
    }
}
