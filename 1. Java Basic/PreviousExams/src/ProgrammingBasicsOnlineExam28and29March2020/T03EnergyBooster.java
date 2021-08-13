package ProgrammingBasicsOnlineExam28and29March2020;

import java.util.Scanner;

public class T03EnergyBooster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String plot = scanner.nextLine();
        String size = scanner.nextLine();
        int orders = Integer.parseInt(scanner.nextLine());
        double priceForOne = 0;
        double finale = 0;
        double a = 0.0;
        switch (plot) {
            case "Watermelon":
                if (size.equals("big")) {
                    priceForOne = 28.70;
                    a = 5 * priceForOne;
                    finale = a * orders;
                } else {
                    priceForOne = 56;
                    a = 2 * priceForOne;
                    finale = a * orders;                }
                break;

                case "Mango":
                if (size.equals("big")) {
                    priceForOne = 19.60;
                    a = 5 * priceForOne;
                    finale = a * orders;
                } else {
                    priceForOne = 36.66;
                    a = 2 * priceForOne;
                    finale = a * orders;
                }
                break;


                case "Pineapple":
                if (size.equals("big")) {
                    priceForOne = 24.80;
                    a = 5 * priceForOne;
                    finale = a * orders;
                } else {
                    priceForOne = 42.10;
                    a = 2 * priceForOne;
                    finale = a * orders;
                }
                break;

                case "Raspberry":
                if (size.equals("big")) {
                    priceForOne = 15.20;
                    a = 5 * priceForOne;
                    finale = a * orders;
                } else {
                    priceForOne = 20;
                    a = 2 * priceForOne;
                    finale = a * orders;                }
                break;
        }

        if (finale >= 400 && finale <= 1000) {
            finale = finale * 0.85;
        }
        if (finale > 1000) {
            finale = finale / 2;
        }

        System.out.printf("%.2f lv.",finale);
    }
}
