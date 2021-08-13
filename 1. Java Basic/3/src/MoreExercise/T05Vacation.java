package MoreExercise;

import java.util.Scanner;

public class T05Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        if (budget <= 1000) {

            if (season.equals("Summer")) {
                System.out.printf("Alaska - Camp - %.2f",budget*0.65);
            } else if (season.equals("Winter")) {
                System.out.printf("Morocco - Camp - %.2f", budget * 0.45);
            }
        } else if (budget > 1000 && budget<=3000) {

            if (season.equals("Summer")) {
                System.out.printf("Alaska - Hut - %.2f",budget*0.80);
            } else if (season.equals("Winter")) {
                System.out.printf("Morocco - Hut - %.2f", budget * 0.60);
            }
        }else if (budget > 3000) {

            if (season.equals("Summer")) {
                System.out.printf("Alaska - Hotel - %.2f",budget*0.90);
            } else if (season.equals("Winter")) {
                System.out.printf("Morocco - Hotel - %.2f", budget * 0.90);
            }
        }
    }
}
