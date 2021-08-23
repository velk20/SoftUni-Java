package L02DataTypesandVariables.Lab;

import java.util.Scanner;

public class T07ReversedChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char a = scanner.nextLine().charAt(0);
        char b = scanner.nextLine().charAt(0);
        char c = scanner.nextLine().charAt(0);

        StringBuffer sq = new StringBuffer().append(c).append(" ").append(b).append(" ").append(a);
        System.out.println(sq);

    }
}
