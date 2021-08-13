package com.company.Tasks;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lon = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        int V = lon * width * height;
        double lit = V * 0.001;
        double per = percent * 0.01;
        double res = lit * (1 - per);

        System.out.printf("%.2f",res);
    }
}
