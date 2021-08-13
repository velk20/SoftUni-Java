package MoreExercise;

import java.util.Scanner;

public class Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int grapes = Integer.parseInt(scanner.nextLine());
        double grapesPerMeter = Double.parseDouble(scanner.nextLine());
        int neededLitersWine = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());

        double allGrapes = grapes * grapesPerMeter;
        double wine = 0.4 * allGrapes / 2.5;
        if (wine < neededLitersWine) {
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", Math.floor(neededLitersWine - wine));
        } else {
            System.out.printf("Good harvest this year! Total wine: %.0f liters.\n",Math.floor(wine));
            System.out.printf("%.0f liters left -> %.0f liters per person.",Math.ceil(wine-neededLitersWine),Math.ceil((wine-neededLitersWine)/workers));
        }
    }
}
