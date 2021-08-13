package MoreExercise;

import java.util.Locale;
import java.util.Scanner;

public class FuelTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fuel = scanner.nextLine();
        double liters = Double.parseDouble(scanner.nextLine());

        if (fuel.equals("Diesel") || fuel.equals("Gasoline") || fuel.equals("Gas")) {
            if (liters >= 25) {
                System.out.printf("You have enough %s.", fuel.toLowerCase());
            } else if (liters < 25) {
                System.out.printf("Fill your tank with %s!", fuel.toLowerCase());
            }

        } else {
            System.out.println("Invalid fuel!");
        }

    }
}
