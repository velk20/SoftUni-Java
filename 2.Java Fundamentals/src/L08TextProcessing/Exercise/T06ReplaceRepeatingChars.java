package L08TextProcessing.Exercise;

import java.lang.reflect.Array;
import java.util.*;
import java.util.Scanner;

public class T06ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length()-1; i++) {
            char ch1 = text.charAt(i);
            char ch2 = text.charAt(i+1);
            if (ch1 != ch2) {

                sb.append(ch1);

            }
            if (i == text.length() - 2) {
                sb.append(ch2);
                break;
            }
        }
        System.out.println(sb);
    }
}
