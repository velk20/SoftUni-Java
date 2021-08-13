package MoreExercise;

import java.util.Scanner;

public class T07FootballLeague {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int capacity = Integer.parseInt(scanner.nextLine());
        int fans = Integer.parseInt(scanner.nextLine());
        int A = 0;
        int B = 0;
        int V = 0;
        int G = 0;
        for (int i = 0; i < fans; i++) {
            String a = scanner.nextLine();
            if (a.equals("A")) {
                A++;
            } else if (a.equals("B")) {
                B++;
            } else if (a.equals("V")) {
                V++;

            } else if (a.equals("G")) {
                G++;
            }

        }

        System.out.printf("%.2f%%\n",(double) A/fans*100.0);
        System.out.printf("%.2f%%\n",(double) B/fans*100.0);
        System.out.printf("%.2f%%\n",(double) V/fans*100.0);
        System.out.printf("%.2f%%\n",(double) G/fans*100.0);
        System.out.printf("%.2f%%\n",(double) fans/capacity*100.0);
    }
}
