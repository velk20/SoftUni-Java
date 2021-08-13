package ProgrammingBasicsOnlineExam28and29March2020;

import java.util.Scanner;

public class T02CatWalking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minutesWalk = Integer.parseInt(scanner.nextLine());
        int countWalks = Integer.parseInt(scanner.nextLine());
        int calories = Integer.parseInt(scanner.nextLine());

        int minutes = minutesWalk * countWalks;
        minutes = minutes * 5;
        calories = calories - (calories / 2);

        if (minutes >= calories) {
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.", minutes);
        } else {
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %d.",minutes);
        }
    }
}
