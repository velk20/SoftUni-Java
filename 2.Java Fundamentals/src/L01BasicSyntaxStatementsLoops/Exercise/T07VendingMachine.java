package L01BasicSyntaxStatementsLoops.Exercise;

import java.util.Scanner;

public class T07VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nuts = 2.0;
        double water = 0.7;
        double crisps = 1.5;
        double soda = 0.8;
        double coke = 1.0;
        double sumCoins = 0;
        String input = scanner.nextLine();

        while (!input.equals("Start")) {
            double coins = Double.parseDouble(input);
            if (coins == 0.1 || coins == 0.2 || coins == 0.5 || coins == 1.0 || coins == 2.0) {
                sumCoins += coins;
            } else {
                System.out.printf("Cannot accept %.2f\n", coins);
            }
            input = scanner.nextLine();

        }

        input = scanner.nextLine();
        while (!input.equals("End")) {
            if (input.equals("Nuts") || input.equals("Water") || input.equals("Crisps") || input.equals("Soda")
                    || input.equals("Coke")) {

                if (input.equals("Nuts")) {
                    if (sumCoins >= nuts) {
                        sumCoins -= nuts;
                        System.out.printf("Purchased %s\n", input);
                    } else {
                        System.out.printf("Sorry, not enough money\n");
                    }
                } else if (input.equals("Water")) {
                    if (sumCoins >= water) {
                        sumCoins -= water;
                        System.out.printf("Purchased %s\n", input);
                    } else {
                        System.out.printf("Sorry, not enough money\n");
                    }

                } else if (input.equals("Crisps")) {
                    if (sumCoins >= crisps) {
                        sumCoins -= crisps;
                        System.out.printf("Purchased %s\n", input);
                    } else {
                        System.out.printf("Sorry, not enough money\n");
                    }
                } else if (input.equals("Soda")) {
                    if (sumCoins >= soda) {
                        sumCoins -= soda;
                        System.out.printf("Purchased %s\n", input);
                    } else {
                        System.out.printf("Sorry, not enough money\n");
                    }
                } else if (input.equals("Coke")) {
                    if (sumCoins >= coke) {
                        sumCoins -= coke;
                        System.out.printf("Purchased %s\n", input);
                    } else {
                        System.out.printf("Sorry, not enough money\n");
                    }
                }

            } else {
                System.out.printf("Invalid product\n");
            }

            input = scanner.nextLine();
        }

        if (sumCoins >= 0) {
            System.out.printf("Change: %.2f\n",sumCoins);
        }
    }
}
