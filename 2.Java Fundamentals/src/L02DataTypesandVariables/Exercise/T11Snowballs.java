package L02DataTypesandVariables.Exercise;

import java.util.Scanner;

public class T11Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //TODO test
        //fixme dsadas

        int n = Integer.parseInt(scanner.nextLine());
        double max = Double.MIN_VALUE;
        int maxShow = 0;
        int maxTime = 0;
        int maxQuant = 0;
        for (int i = 0; i < n; i++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());
            double del = (double) snowballSnow / snowballTime;
            double value = Math.pow(del, snowballQuality);
            if (value > max) {
                max = value;
                maxShow = snowballSnow;
                maxTime = snowballTime;
                maxQuant = snowballQuality;

            }
        }

        System.out.printf("%d : %d = %.0f (%d)", maxShow, maxTime, max, maxQuant);
    }
}
