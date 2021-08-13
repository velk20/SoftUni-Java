package Lab.conditionalStatment;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceExcursion = Double.parseDouble(scanner.nextLine());
        int numberOfPuzzels = Integer.parseInt(scanner.nextLine());
        int numberOfDolls = Integer.parseInt(scanner.nextLine());
        int numberOfTeddyBears = Integer.parseInt(scanner.nextLine());
        int numberOfMinions = Integer.parseInt(scanner.nextLine());
        int numberOfTrucks = Integer.parseInt(scanner.nextLine());


        double puzzels = numberOfPuzzels * 2.60;
        double dolls = numberOfDolls * 3;
        double bears = numberOfTeddyBears * 4.10;
        double minions = numberOfMinions * 8.20;
        double trucks = numberOfTrucks * 2;


        double numberOfToys = numberOfDolls + numberOfMinions + numberOfTrucks + numberOfPuzzels + numberOfTeddyBears;
        double finalPrice = puzzels + dolls + bears + minions + trucks;

        if (numberOfToys >= 50) {
             finalPrice = finalPrice - (finalPrice * 0.25);
        }

        finalPrice= finalPrice - (finalPrice * 0.10);

        if (finalPrice >= priceExcursion) {
            System.out.printf("Yes! %.2f lv left.",finalPrice - priceExcursion);
        }else System.out.printf("Not enough money! %.2f lv needed.",Math.abs(finalPrice - priceExcursion));
    }
}
