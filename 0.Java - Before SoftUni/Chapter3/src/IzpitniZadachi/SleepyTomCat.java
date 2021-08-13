package IzpitniZadachi;

import java.util.Scanner;

public class SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int X = Integer.parseInt(scanner.nextLine());
        double Y = Double.parseDouble(scanner.nextLine());
        int Z = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());

        double harvestForWine = X * 40 / 100;
        double kilosOfGrapes = Y * harvestForWine;
        double litersOfWine = kilosOfGrapes / 2.5;

        if ((litersOfWine - Z)>0){
            System.out.printf("Good harvest this year! Total wine: %.0f liters.\n",Math.floor(litersOfWine));
            System.out.printf("%.0f liters left -> %.0f liters per person.",Math.ceil(litersOfWine-Z),Math.ceil((litersOfWine-Z)/workers));
        }
        else{
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.",Math.abs(litersOfWine-Z));
        }
    }
}
