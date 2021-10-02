package L04Methods.Exercise;

import java.util.Locale;
import java.util.Scanner;

public class T02VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int vowelsCounter = counterOfVowels(input);
        System.out.println(vowelsCounter);

    }

    public static int counterOfVowels(String s) {
        //{'a', 'e', 'i', 'o', 'u' }
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.toLowerCase().charAt(i);
            if (ch == 'a' || ch == 'e' || ch=='i'||ch=='o'||ch=='u') {
                counter++;
            }
        }
        return counter;

    }
}
