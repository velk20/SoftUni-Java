package MoreExercise;

import java.util.Scanner;

public class T06TruckDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();
        double kilometersPerMonth = Double.parseDouble(scanner.nextLine());
        double total = 0.0;
        if (kilometersPerMonth <= 5000) {
            switch (season) {
                case "Spring":
                case "Autumn":
                    total = kilometersPerMonth * 0.75;
                    total = total * 4;
                    total = total - (total * 0.1);
                    break;

                    case "Summer":
                    total = kilometersPerMonth * 0.90;
                    total = total * 4;
                    total = total - (total * 0.1);
                    break;

                    case "Winter":
                    total = kilometersPerMonth * 1.05;
                    total = total * 4;
                    total = total - (total * 0.1);
                    break;


            }
        } else if (kilometersPerMonth > 500 && kilometersPerMonth <= 10000) {
            switch (season) {
                case "Spring":
                case "Autumn":
                    total = kilometersPerMonth * 0.95;
                    total = total * 4;
                    total = total - (total * 0.1);
                    break;

                case "Summer":
                    total = kilometersPerMonth * 1.10;
                    total = total * 4;
                    total = total - (total * 0.1);
                    break;

                case "Winter":
                    total = kilometersPerMonth * 1.25;
                    total = total * 4;
                    total = total - (total * 0.1);
                    break;


            }
        }
        else if (kilometersPerMonth > 10000 && kilometersPerMonth <=20000) {

            total = kilometersPerMonth * 1.45;
            total = total * 4;
            total = total - (total * 0.1);





        }

        System.out.printf("%.2f",total);
    }
}
