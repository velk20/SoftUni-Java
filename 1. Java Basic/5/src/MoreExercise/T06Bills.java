package MoreExercise;

import java.nio.file.Watchable;
import java.util.Scanner;

public class T06Bills {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int months = Integer.parseInt(scanner.nextLine());
        double sumEVN = 0;
        double cost = 0;

        for (int i = 0; i < months; i++) {
            double EVN = Double.parseDouble(scanner.nextLine());
            sumEVN += EVN;
            double tok = EVN;
            double water = 20;
            double net = 15;
            double all = EVN + water + net;
            cost += (all * 0.2) + all;

        }
double average = (cost+sumEVN+(months*20)+(months*15))/months;
        System.out.printf("Electricity: %.2f lv\n", sumEVN);
        System.out.printf("Water: %.2f lv\n", (double)months * 20.0);
        System.out.printf("Internet: %.2f lv\n", (double)months * 15.0);
        System.out.printf("Other: %.2f lv\n", cost);
        System.out.printf("Average: %.2f lv", average);

    }
}
