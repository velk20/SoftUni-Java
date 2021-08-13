package Exercise;

import java.util.Scanner;

public class T04FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short budgetOfTheGroup = Short.parseShort(scanner.nextLine());
        String season = scanner.nextLine();
        byte numberOfFisherman = Byte.parseByte(scanner.nextLine());
        double boatPrice = 0.0;
        switch (season) {
            case "Spring":
                boatPrice = 3000.0;
                if (numberOfFisherman <= 6) {
                    boatPrice = boatPrice - (boatPrice * 0.1);
                } else if (numberOfFisherman>6 && numberOfFisherman <=11) {

                    boatPrice = boatPrice - (boatPrice * 0.15);

                } else if (numberOfFisherman > 11) {
                    boatPrice = boatPrice - (boatPrice * 0.25);

                }

                if (IsEven(numberOfFisherman)) {
                    boatPrice = boatPrice - (boatPrice * 0.05);
                }
                EnoughBudget(budgetOfTheGroup, boatPrice);


                break;

                case "Summer":
                boatPrice = 4200.0;
                if (numberOfFisherman <= 6) {
                    boatPrice = boatPrice - (boatPrice * 0.1);
                } else if (numberOfFisherman>6 && numberOfFisherman <=11) {

                    boatPrice = boatPrice - (boatPrice * 0.15);

                } else if (numberOfFisherman > 11) {
                    boatPrice = boatPrice - (boatPrice * 0.25);

                }

                if (IsEven(numberOfFisherman)) {
                    boatPrice = boatPrice - (boatPrice * 0.05);
                }
                    EnoughBudget(budgetOfTheGroup, boatPrice);
                    break;

                case "Autumn":
                boatPrice = 4200.0;
                if (numberOfFisherman <= 6) {
                    boatPrice = boatPrice - (boatPrice * 0.1);
                } else if (numberOfFisherman>6 && numberOfFisherman <=11) {

                    boatPrice = boatPrice - (boatPrice * 0.15);

                } else if (numberOfFisherman > 11) {
                    boatPrice = boatPrice - (boatPrice * 0.25);

                }
                    EnoughBudget(budgetOfTheGroup, boatPrice);
                    break;

                case "Winter":
                boatPrice = 2600.0;
                if (numberOfFisherman <= 6) {
                    boatPrice = boatPrice - (boatPrice * 0.1);
                } else if (numberOfFisherman>6 && numberOfFisherman <=11) {

                    boatPrice = boatPrice - (boatPrice * 0.15);

                } else if (numberOfFisherman > 11) {
                    boatPrice = boatPrice - (boatPrice * 0.25);

                }

                    if (IsEven(numberOfFisherman)) {
                        boatPrice = boatPrice - (boatPrice * 0.05);
                    }
                    EnoughBudget(budgetOfTheGroup, boatPrice);
                    break;
        }
    }

    static boolean IsEven(int num) {
        if (num % 2 == 0) {
            return true;
        } else return false;
    }

    static void EnoughBudget(short budget,double cost) {
        if (budget >= cost) {
            System.out.printf("Yes! You have %.2f leva left.",Math.abs(budget-cost));
        }else System.out.printf("Not enough money! You need %.2f leva.",Math.abs(budget-cost));
    }
}
