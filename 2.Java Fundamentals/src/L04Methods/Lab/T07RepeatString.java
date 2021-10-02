package L04Methods.Lab;

import java.util.Scanner;

public class T07RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String repeat = repeatedString(scanner.nextLine(), Integer.parseInt(scanner.nextLine()));
        System.out.println(repeat);
    }

    public static String repeatedString(String s, int r) {
        String output="";
        for (int i = 0; i < r; i++) {
            output += s;
        }
        return output;
    }
}
