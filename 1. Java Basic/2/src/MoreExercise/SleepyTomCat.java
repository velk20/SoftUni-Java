package MoreExercise;

import java.util.Scanner;

public class SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int weekends = Integer.parseInt(scanner.nextLine());
        int workDay = 63;
        int breakDay = 127;

        int work = 365 - weekends;
        int playTime = (work * workDay) + (breakDay * weekends);

        if (playTime <= 30000) {
            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %d minutes less for play", (30000-playTime) / 60, (30000-playTime) % 60);
        } else {
            System.out.println("Tom will run away");
            System.out.printf("%d hours and %d minutes more for play",(playTime-30000) / 60, (playTime-30000) % 60);
        }

    }
}
