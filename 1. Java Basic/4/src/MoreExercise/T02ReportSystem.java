package MoreExercise;

import java.util.Scanner;

public class T02ReportSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int money = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int counter = 0;
        int Cs = 0;
        int Cc = 0;
        int counterCs = 0;
        int counterCc = 0;
        int sum = 0;
        while (!input.equals("End")) {
            int num = Integer.parseInt(input);
            counter++;

            if (sum < money) {
                if (counter % 2 != 0) {
                    if (num <= 100) {
                        counterCs++;
                        Cs += num;
                        sum += num;
                        System.out.println("Product sold!");
                    } else {

                        System.out.println("Error in transaction!");
                    }
                } else {
                    if (num >= 10) {
                        counterCc++;
                        Cc += num;
                        sum += num;
                        System.out.println("Product sold!");
                    } else {
                        System.out.println("Error in transaction!");

                    }
                }
            }
            if (sum>=money) {
                System.out.printf("Average CS: %.2f\n", 1.0 * (Cs) / counterCs);
                System.out.printf("Average CC: %.2f", 1.0 * (Cc) / counterCc);
                break;
            }







            input = scanner.nextLine();
        }

        if (input.equals("End") && sum < money) {
            System.out.println("Failed to collect required money for charity.");
        }
    }
}
