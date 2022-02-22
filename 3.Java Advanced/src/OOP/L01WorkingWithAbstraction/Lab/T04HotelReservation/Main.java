package OOP.L01WorkingWithAbstraction.Lab.T04HotelReservation;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] tokens = scanner.nextLine().split("\\s+");
        PriceCalculator priceCalculator = new PriceCalculator();
        System.out.println(priceCalculator.getTotalPrice(Double.parseDouble(tokens[0]),
                Integer.parseInt(tokens[1]),
                Season.valueOf(tokens[2]),
                Discount.valueOf(tokens[3])));

    }
}
