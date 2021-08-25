package L02DataTypesandVariables.Lab;

import java.util.Scanner;

public class T06CharstoString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char a = scanner.nextLine().charAt(0);
        char b = scanner.nextLine().charAt(0);
        char c = scanner.nextLine().charAt(0);

        StringBuffer sq = new StringBuffer().append(a).append(b).append(c);
        System.out.println(sq.toString());
    }
}
