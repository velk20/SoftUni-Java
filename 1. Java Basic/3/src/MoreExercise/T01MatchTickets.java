package MoreExercise;

import java.util.Scanner;

public class T01MatchTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        int people = Integer.parseInt(scanner.nextLine());
        double finalPrice = 0.0;
        switch (category) {
            case "VIP":
                finalPrice = people * 499.99;
                if (people >= 1 && people <= 4) {
                    budget = budget - (budget * 0.75);

                } else if (people >= 5 && people <= 9) {
                    budget = budget - (budget * 0.6);
                }else if (people >= 10 && people <= 24) {
                    budget = budget - (budget * 0.5);
                }else if (people >= 25 && people <= 49) {
                    budget = budget - (budget * 0.4);
                }else if (people >= 50) {
                    budget = budget - (budget * 0.25);
                }

                if (budget >= finalPrice) {
                    System.out.printf("Yes! You have %.2f leva left.",Math.abs(budget-finalPrice));
                }else System.out.printf("Not enough money! You need %.2f leva.",Math.abs(budget-finalPrice));

                break;

                case "Normal":
                finalPrice = people * 249.99;
                if (people >= 1 && people <= 4) {
                    budget = budget - (budget * 0.75);

                } else if (people >= 5 && people <= 9) {
                    budget = budget - (budget * 0.6);
                }else if (people >= 10 && people <= 24) {
                    budget = budget - (budget * 0.5);
                }else if (people >= 25 && people <= 49) {
                    budget = budget - (budget * 0.4);
                }else if (people >= 50) {
                    budget = budget - (budget * 0.25);
                }

                if (budget >= finalPrice) {
                    System.out.printf("Yes! You have %.2f leva left.",Math.abs(budget-finalPrice));
                }else System.out.printf("Not enough money! You need %.2f leva.",Math.abs(budget-finalPrice));

                break;
        }

    }
}
