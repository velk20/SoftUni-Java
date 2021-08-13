package MoreExercise;

import java.util.Scanner;

public class T03Flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hrizantemi = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int laleta = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String holiday = scanner.nextLine();
        double hrizantemiPrize = 0.0;
        double rosesPrize = 0.0;
        double laletaPrize = 0.0;
        double allFlowers = hrizantemi + roses + laleta;
        double total = 0.0;
        switch (season) {
            case "Spring":
            case "Summer":
                hrizantemiPrize = 2.00;
                rosesPrize = 4.10;
                laletaPrize = 2.50;
                total = (hrizantemi * hrizantemiPrize) + (roses * rosesPrize) + (laletaPrize * laleta);
                if (holiday.equals("Y")) {
                    total = total + (total * 0.15);
                }
                if (season.equals("Spring") && laleta > 7) {
                    total = total - (total * 0.05);
                } if (allFlowers > 20) {
                    total = total - (total * 0.2);

                }

                System.out.printf("%.2f",total + 2);
                break;

            case "Autumn":
            case "Winter":

                hrizantemiPrize = 3.75;
                rosesPrize = 4.50;
                laletaPrize = 4.15;
                total = (hrizantemi * hrizantemiPrize) + (roses * rosesPrize) + (laletaPrize * laleta);
                if (holiday.equals("Y")) {
                    total = total + (total * 0.15);
                }
                if (season.equals("Winter") && roses >= 10) {
                    total = total - (total * 0.1);
                } if (allFlowers > 20) {
                    total = total - (total * 0.2);

                }
                System.out.printf("%.2f",total + 2);
                break;
        }
    }
}
