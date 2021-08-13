package MoreExercise;

import java.util.Scanner;

public class T02BikeRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int juniors = Integer.parseInt(scanner.nextLine());
        int seniors = Integer.parseInt(scanner.nextLine());
        String track = scanner.nextLine();
        double juniorPrice = 0.0;
        double seniorPrice = 0.0;
        double finalPrice = 0.0;

        switch (track) {
            case "trail":
                juniorPrice = 5.5;
                seniorPrice = 7.0;
                finalPrice = (juniorPrice*juniors) + (seniorPrice*seniors);
                finalPrice = finalPrice - (finalPrice * 0.05);
                System.out.printf("%.2f",finalPrice);
                break;
            case "cross-country":
                int people = juniors + seniors;
                juniorPrice =8;
                seniorPrice = 9.50;
                finalPrice = (juniorPrice*juniors) + (seniorPrice*seniors);
                if (people >= 50) {
                    finalPrice = finalPrice - (finalPrice * 0.25);
                }
                finalPrice = finalPrice - (finalPrice * 0.05);
                System.out.printf("%.2f",finalPrice);
                break;

            case "downhill":
                juniorPrice = 12.25;
                seniorPrice = 13.75;
                finalPrice = (juniorPrice*juniors) + (seniorPrice*seniors);
                finalPrice = finalPrice - (finalPrice * 0.05);
                System.out.printf("%.2f",finalPrice);
                break;

            case "road":
                juniorPrice = 20.0;
                seniorPrice = 21.50;
                finalPrice = (juniorPrice*juniors) + (seniorPrice*seniors);
                finalPrice = finalPrice - (finalPrice * 0.05);
                System.out.printf("%.2f",finalPrice);
                break;

        }
    }
}
