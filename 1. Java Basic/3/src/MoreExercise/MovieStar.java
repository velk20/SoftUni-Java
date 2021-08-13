package MoreExercise;

import java.util.Scanner;

public class MovieStar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String name = scanner.nextLine();
double salary = 0.0;
        while (!name.equals("ACTION") && budget >= 0) {


            if (name.length() >= 15) {

                budget = budget - (budget * 0.2);

                name = scanner.nextLine();

                try {
                    salary = Double.parseDouble(scanner.nextLine());
                    budget = budget - salary;

                } catch (Exception e) {
                    budget = budget - salary;

                    continue;
                }


            } else {
                 salary = Double.parseDouble(scanner.nextLine());
                budget = budget - salary;

                name = scanner.nextLine();
            }

        }

        if (budget >= 0) {
            System.out.printf("We are left with %.2f leva.",budget - salary);
        } else {
            System.out.printf("We need %.2f leva for our actors.",Math.abs(budget - salary));
        }
    }
}
