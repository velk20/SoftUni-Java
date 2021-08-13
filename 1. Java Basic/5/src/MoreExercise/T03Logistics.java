package MoreExercise;

import java.util.Scanner;

public class T03Logistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int abc = 0;
        int microBus = 0;
        int truck = 0;
        int train = 0;
        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            sum += num;

            if (num <= 3) {
                abc += (num * 200);
                microBus+=num;
            } else if (num >= 4 && num <= 11) {
                abc += (num * 175);
                truck+=num;

            } else if (num >= 12) {
                abc += (num * 120);
                train+=num;
            }
        }

        System.out.printf("%.2f\n",(double) abc/sum);
        System.out.printf("%.2f%%\n",(double) microBus/sum*100.0);
        System.out.printf("%.2f%%\n",(double) truck/sum*100.0);
        System.out.printf("%.2f%%\n",(double) train/sum*100.0);
    }
}
