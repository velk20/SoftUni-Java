package MoreExercise;

import java.util.Scanner;

public class T05ChallengetheWedding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = Integer.parseInt(scanner.nextLine());
        int f = Integer.parseInt(scanner.nextLine());
        int maxNum = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= f; j++) {
                if (counter < maxNum) {
                    System.out.printf("(%d <-> %d) ", i, j);
                    counter++;
                }else break;
            }
        }
    }
}
