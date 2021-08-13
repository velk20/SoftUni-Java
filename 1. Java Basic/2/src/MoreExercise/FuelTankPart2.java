package MoreExercise;

import java.util.Scanner;

public class FuelTankPart2 {
    public static void main(String[] args) {
//•	Бензин – 2.22 лева за един литър,
//•	Дизел – 2.33 лева за един литър
//•	Газ – 0.93 лева за литър

//Ако водача има карта за отстъпки,  той се възползва от следните
// намаления за литър гориво: 18 ст. за литър бензин, 12 ст.
// за литър дизел и 8 ст. за литър газ.
//Ако шофьора е заредил между 20 и 25 литра включително,
// той получава 8 процента отстъпка от крайната цена, при повече
// от 25 литра гориво, той получава 10 процента отстъпка от крайната цена.

        Scanner scanner = new Scanner(System.in);

        String fuel = scanner.nextLine();
        double liters = Double.parseDouble(scanner.nextLine());
        String hasCard = scanner.nextLine();
        double priceOfLiter = 0;
        double res = 0;
        if (fuel.equals("Gas")) {
            priceOfLiter = 0.93;
            if (hasCard.equals("Yes")) {
                priceOfLiter -= 0.08;
            }
            res = liters * priceOfLiter;
            if (liters >= 20 && liters <= 25) {
                res = res * 0.92;
            } else if (liters > 25) {
                res = res * 0.9;
            }

        }else if (fuel.equals("Gasoline")) {
            priceOfLiter = 2.22;
            if (hasCard.equals("Yes")) {
                priceOfLiter -= 0.18;
            }
            res = liters * priceOfLiter;
            if (liters >= 20 && liters <= 25) {
                res = res * 0.92;
            } else if (liters > 25) {
                res = res * 0.9;
            }

        }else if (fuel.equals("Diesel")) {
            priceOfLiter = 2.33;
            if (hasCard.equals("Yes")) {
                priceOfLiter -= 0.12;
            }
            res = liters * priceOfLiter;
            if (liters >= 20 && liters <= 25) {
                res = res * 0.92;
            } else if (liters > 25) {
                res = res * 0.9;
            }

        }

        System.out.printf("%.2f lv.",res);
    }
}
