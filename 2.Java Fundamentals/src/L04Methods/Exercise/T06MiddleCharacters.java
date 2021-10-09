package L04Methods.Exercise;

import java.util.Scanner;

public class T06MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(findMiddleCharacter(input));

    }

    public static String findMiddleCharacter(String s) {

        if (s.length() % 2 != 0) {
           char ch = s.charAt(s.length() / 2);

            return ""+ch;

        } else {
            char ch = s.charAt(s.length() / 2);
            char chs = s.charAt((s.length() / 2) - 1);
            return ""+chs + ch;
        }
    }
}
