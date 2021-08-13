package ProgrammingBasicsOnlineExam28and29March2020;

import java.util.Scanner;

public class T03FitnessCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double amount = Double.parseDouble(scanner.nextLine());
        char sex = scanner.nextLine().charAt(0);
        int age = Integer.parseInt(scanner.nextLine());
        String sport = scanner.nextLine();
        double suma = 0;

        switch (sport) {
            case "Gym":
                if (sex == 'm') {
                    suma = 42;
                } else {
                    suma = 35;
                }
                break;

            case "Boxing":
                if (sex == 'm') {
                    suma = 41;
                } else {
                    suma = 37;
                }
                break;

            case "Yoga":
                if (sex == 'm') {
                    suma = 45;
                } else {
                    suma = 42;

                }
                break;

            case "Zumba":
                if (sex == 'm') {
                    suma = 34;
                } else {
                    suma = 31;

                }
                break;

            case "Dances":
                if (sex == 'm') {
                    suma = 51;
                } else {
                    suma = 53;

                }
                break;

            case "Pilates":
                if (sex == 'm') {
                    suma = 39;
                } else {
                    suma = 37;

                }
                break;
        }

        if (age <= 19) {
            suma = suma * 0.8;
        }

        if (amount >= suma) {
            System.out.printf("You purchased a 1 month pass for %s.",sport);
        } else System.out.printf("You don't have enough money! You need $%.2f more.", Math.abs(amount - suma));
    }
}
