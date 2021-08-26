package L01BasicSyntaxStatementsLoops.MoreExercise;

import java.util.Scanner;
import java.util.UnknownFormatConversionException;

public class T01SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <3 ; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            if (num > max) {
                max = num;
            } else if (num < min) {
                min = num;
            }

        }

    }
}
