package Exercise;

import java.util.Scanner;

public class GodzillavsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int extras = Integer.parseInt(scanner.nextLine());
        double priceCloths = Double.parseDouble(scanner.nextLine());

        double decor = budget * 0.1;
        double cloths = extras * priceCloths;

        if (extras > 150) {
            double discount = cloths * 0.1;
            cloths = cloths - discount;
        }

        double finalPrice = decor + cloths;
        double res = budget - finalPrice;

        if (res < 0) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.",Math.abs(res));
        }else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.",res);
        }


    }
}
