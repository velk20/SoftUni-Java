package MoreExercise;

import java.util.Scanner;

public class T05GameOfIntervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int q = 0;
        int w = 0;
        int e = 0;
        int r = 0;
        int t = 0;
        int y = 0;

        double sum = 0;
        for (int i = 0; i < n; i++) {
            double num = Double.parseDouble(scanner.nextLine());
            if (num >= 0 && num <= 9) {
                sum += (num * 0.2);
                q++;
            } else if (num >= 10 && num <= 19) {
                sum += (num * 0.3);
                w++;
            } else if (num >= 20 && num <= 29) {
                sum += (num * 0.4);
                e++;
            } else if (num >= 30 && num <= 39) {
                sum += 50;
                r++;
            } else if (num >= 40 && num <= 50) {
                sum += 100;
                t++;
            } else {
                sum=sum / 2;
                y++;
            }


        }

        System.out.printf("%.2f\n", sum);
        System.out.printf("From 0 to 9: %.2f%%\n", (double)q/n*100.0);
        System.out.printf("From 10 to 19: %.2f%%\n", (double)w/n*100.0);
        System.out.printf("From 20 to 29: %.2f%%\n", (double)e/n*100.0);
        System.out.printf("From 30 to 39: %.2f%%\n", (double)r/n*100.0);
        System.out.printf("From 40 to 50: %.2f%%\n", (double)t/n*100.0);
        System.out.printf("Invalid numbers: %.2f%%", (double)y/n*100.0);


    }
}
