package MoreExercise;

import java.util.Scanner;

public class T02LettersCombinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String start = scanner.nextLine();
        String end = scanner.nextLine();
        String skip = scanner.nextLine();
        int counter = 0;
        char startC = start.charAt(0);
        char endC = end.charAt(0);
        char skipC = skip.charAt(0);

        for (char i = startC; i <= endC; i++) {
            for (char j = startC; j <= endC; j++) {
                for (char k = startC; k <= endC; k++) {
                    if (i != skipC && j!= skipC && k!= skipC) {
                        counter++;
                        System.out.printf("%c%c%c ",i,j,k);
                    }
                }
            }
        }
        System.out.printf("%d",counter);

    }
}
