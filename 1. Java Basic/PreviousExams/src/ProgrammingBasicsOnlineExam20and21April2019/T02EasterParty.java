package ProgrammingBasicsOnlineExam20and21April2019;

import java.util.Scanner;

public class T02EasterParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counterGuests = Integer.parseInt(scanner.nextLine());
        double couvert = Double.parseDouble(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());

        if (counterGuests >= 10 && counterGuests <= 15) {
            couvert = couvert - (couvert * 0.15);
        } else if (counterGuests > 15 && counterGuests <= 20) {
            couvert = couvert - (couvert * 0.2);

        } else if (counterGuests > 20) {
            couvert = couvert - (couvert * 0.25);

        }

        double cake = budget * 0.10;

        double sum = (counterGuests * couvert) + cake;
        if (budget >= sum) {
            System.out.printf("It is party time! %.2f leva left.", budget - sum);
        } else {
            System.out.printf("No party! %.2f leva needed.",sum-budget);
        }

    }
}
