package ProgrammingBasicsOnlineExam18and19July2020;

import java.util.Scanner;

public class T02AddBags {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceMore20 = Double.parseDouble(scanner.nextLine());
        double kilos = Double.parseDouble(scanner.nextLine());
        int daysTrip = Integer.parseInt(scanner.nextLine());
        int count = Integer.parseInt(scanner.nextLine());
        double price = 0;
        if (kilos < 10) {
            price = priceMore20 * 0.2;
        } else if (kilos >= 10 && kilos <= 20) {
            price = priceMore20 / 2;
        } else if (kilos > 20) {
            price = priceMore20;
        }

        if (daysTrip < 7) {
            price = price + (price * 0.4);
        } else if (daysTrip >= 7 && daysTrip <= 30) {
            price = price + (price * 0.15);
        } else if (daysTrip > 30) {
            price = price + (price * 0.1);
        }

        double allrpices = price * count;
        System.out.printf("The total price of bags is: %.2f lv.",allrpices);
    }
}
