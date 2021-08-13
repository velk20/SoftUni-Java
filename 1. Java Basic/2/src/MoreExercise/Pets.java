package MoreExercise;

import java.util.Scanner;

public class Pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int foodInKilograms = Integer.parseInt(scanner.nextLine());
        double foodForDogsKG = Double.parseDouble(scanner.nextLine());
        double foodForCatsKG = Double.parseDouble(scanner.nextLine());
        double foodForTurtlesGR = Double.parseDouble(scanner.nextLine());

        double a = days * foodForDogsKG;
        double b = days * foodForCatsKG;
        double c = days * foodForTurtlesGR / 1000;

        double all = a + b + c;
        if (all <= foodInKilograms) {
            System.out.printf("%.0f kilos of food left.", Math.floor(foodInKilograms - all));
        } else {
            System.out.printf("%.0f more kilos of food are needed.",Math.ceil(all-foodInKilograms));
        }
    }
}
