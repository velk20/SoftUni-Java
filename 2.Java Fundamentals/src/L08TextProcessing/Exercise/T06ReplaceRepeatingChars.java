package L08TextProcessing.Exercise;

import java.util.Scanner;

public class T06ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        for (int i = 0; i < text.length()-1; i++) {
            char ch1 = text.charAt(i);
            char ch2 = text.charAt(i+1);
            if (ch1==ch2) {
                String currtex = text.substring(0,i+1);
                text = currtex +  text.replace(ch2+"","");
            }
        }
        System.out.println(text);
    }
}
