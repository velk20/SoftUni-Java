package Exercise;

import java.util.Scanner;

public class T03NewHouse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String typeOfFlowers = scanner.nextLine();
        int numberOfFlowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double finalPrice = 0.0;
        switch (typeOfFlowers) {
            case "Roses":
                finalPrice = 5.00 * numberOfFlowers;
                if (numberOfFlowers > 80) {
                    finalPrice = finalPrice - (finalPrice * 0.1);
                }

                if (budget >= finalPrice) {
                    System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left."
                            ,numberOfFlowers,typeOfFlowers,budget-finalPrice);
                }else System.out.printf("Not enough money, you need %.2f leva more.",Math.abs(budget-finalPrice));
                break;

                case "Dahlias":
                finalPrice = 3.80 * numberOfFlowers;
                if (numberOfFlowers > 90) {
                    finalPrice = finalPrice - (finalPrice * 0.15);
                }

                if (budget >= finalPrice) {
                    System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left."
                            ,numberOfFlowers,typeOfFlowers,budget-finalPrice);
                }else System.out.printf("Not enough money, you need %.2f leva more.",Math.abs(budget-finalPrice));
                    break;

                case "Tulips":
                finalPrice = 2.80 * numberOfFlowers;
                if (numberOfFlowers > 80) {
                    finalPrice = finalPrice - (finalPrice * 0.15);
                }

                if (budget >= finalPrice) {
                    System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left."
                            ,numberOfFlowers,typeOfFlowers,budget-finalPrice);
                }else System.out.printf("Not enough money, you need %.2f leva more.",Math.abs(budget-finalPrice));
                    break;

                    case "Narcissus":
                finalPrice = 3.00 * numberOfFlowers;
                if (numberOfFlowers < 120) {
                    finalPrice = finalPrice + (finalPrice * 0.15);
                }

                if (budget >= finalPrice) {
                    System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left."
                            ,numberOfFlowers,typeOfFlowers,budget-finalPrice);
                }else System.out.printf("Not enough money, you need %.2f leva more.",Math.abs(budget-finalPrice));
                    break;

                    case "Gladiolus":
                finalPrice = 2.50 * numberOfFlowers;
                if (numberOfFlowers < 80) {
                    finalPrice = finalPrice + (finalPrice * 0.2);
                }

                if (budget >= finalPrice) {
                    System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left."
                            ,numberOfFlowers,typeOfFlowers,budget-finalPrice);
                }else System.out.printf("Not enough money, you need %.2f leva more.",Math.abs(budget-finalPrice));
                    break;

        }
    }
}
