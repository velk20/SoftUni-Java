package MoreExercise;

import java.util.Scanner;

public class T04CarToGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String type = "";
        double total = 0.0;
        double cabrio = 0.0;
        double jeep = 0.0;
        if (budget <= 100) {
            type = "Economy class";
            System.out.println(type);
            if (season.equals("Summer")) {
                cabrio = budget * 0.35;
                System.out.printf("Cabrio - %.2f",cabrio);
            } else if (season.equals("Winter")) {
                jeep = budget * 0.65;
                System.out.printf("Jeep - %.2f",jeep);

            }
        } else if (budget > 100 && budget <= 500) {
            type = "Compact class";
            System.out.println(type);
            if (season.equals("Summer")) {
                cabrio = budget * 0.45;
                System.out.printf("Cabrio - %.2f",cabrio);
            } else if (season.equals("Winter")) {
                jeep = budget * 0.80;
                System.out.printf("Jeep - %.2f",jeep);

            }
        }else if (budget > 500) {
            type = "Luxury class";
            System.out.println(type);

                jeep = budget * 0.90;
                System.out.printf("Jeep - %.2f",jeep);


        }
    }
}
