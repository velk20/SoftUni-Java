package L02DataTypesandVariables.Exercise;

import java.util.Scanner;

public class T06TriplesLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    char a = (char) ('a'+i);
                    char b = (char) ('a'+j);
                    char c = (char) ('a'+k);
                    System.out.printf("%c%c%c%n", a, b, c);
                }
            }
        }
    }
}
