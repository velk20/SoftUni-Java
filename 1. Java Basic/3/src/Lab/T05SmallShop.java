package Lab;

import java.util.Scanner;
//град / продукт	coffee	water	beer	sweets	peanuts
//        Sofia	0.50	0.80	1.20	1.45	1.60
//        Plovdiv	0.40	0.70	1.15	1.30	1.50
//        Varna	0.45	0.70	1.10	1.35	1.55

public class T05SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double coffee, water, beer, sweets, peanuts = 0;
        double res = 0;
        switch (city) {
            case "Sofia":
                coffee = 0.50;
                water = 0.80;
                beer = 1.20;
                sweets = 1.45;
                peanuts = 1.60;
                break;
            case "Plovdiv":
                coffee = 0.40;
                water = 0.70;
                beer = 1.15;
                sweets = 1.30;
                peanuts = 1.50;
                break;
            case "Varna":
                coffee = 0.45;
                water = 0.70;
                beer = 1.10;
                sweets = 1.35;
                peanuts = 1.55;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + city);
        }

        switch (product) {
            case "coffee":
                res = coffee * quantity;
                System.out.println(res);
                break;
            case "water":
                res = water * quantity;
                System.out.println(res);
                break;
                case "beer":
                res = beer * quantity;
                System.out.println(res);
                break;
                case "sweets":
                res = sweets * quantity;
                System.out.println(res);
                break;
                case "peanuts":
                res = peanuts * quantity;
                System.out.println(res);
                break;
        }
    }
}
