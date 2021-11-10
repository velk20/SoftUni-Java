package L08TextProcessing.Lab;

import java.util.Scanner;

public class T03Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sWord = scanner.nextLine();
        String string = scanner.nextLine();

        while (string.contains(sWord)) {
            int startIndex = string.indexOf(sWord);
            int endIndex = startIndex + sWord.length();

           String remove =  string.substring(startIndex,endIndex);
           string = string.replace(remove,"");
        }
        System.out.println(string);
    }
}
