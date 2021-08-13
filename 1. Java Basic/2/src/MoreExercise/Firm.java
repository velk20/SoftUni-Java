package MoreExercise;

import java.util.Scanner;

public class Firm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int neededHours = Integer.parseInt(scanner.nextLine());
        int availableDays = Integer.parseInt(scanner.nextLine());
        int employees = Integer.parseInt(scanner.nextLine());

        double hours = ((availableDays * 0.9) * 8) + (employees * (2 * availableDays));
        hours = Math.floor(hours);

        if (hours >= neededHours) {
            System.out.printf("Yes!%.0f hours left.", hours - neededHours);
        } else {
            System.out.printf("Not enough time!%.0f hours needed.",neededHours-hours);
        }
    }
}
