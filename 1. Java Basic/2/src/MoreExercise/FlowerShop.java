package MoreExercise;

import java.util.Scanner;

public class FlowerShop {
    public static void main(String[] args) {
        //• Magnolias - 3.25 leva
        //• Hyacinths - 4 levs
        //• Roses - BGN 3.50
        //• Cacti - 8 leva
        //Tax - 5%

        Scanner scanner = new Scanner(System.in);
        int countMagnolias = Integer.parseInt(scanner.nextLine());
        int countHyacinths = Integer.parseInt(scanner.nextLine());
        int countRoses = Integer.parseInt(scanner.nextLine());
        int countCacti = Integer.parseInt(scanner.nextLine());
        double priceOfPresent = Double.parseDouble(scanner.nextLine());

        double sum = (countMagnolias * 3.25) + (countHyacinths * 4) + (countRoses * 3.50) + (countCacti * 8);
        double tax = sum * 0.95;

        if (tax >= priceOfPresent) {
            System.out.printf("She is left with %.0f leva.", Math.floor(tax-priceOfPresent));
        } else {
            System.out.printf("She will have to borrow %.0f leva.",Math.ceil(priceOfPresent-tax));
        }
    }
}
