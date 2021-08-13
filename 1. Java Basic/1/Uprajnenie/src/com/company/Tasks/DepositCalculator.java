package com.company.Tasks;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double depozit = Double.parseDouble(scanner.nextLine());
        int srok = Integer.parseInt(scanner.nextLine());
        double lihva = Double.parseDouble(scanner.nextLine());

        double suma = depozit + (srok * ((depozit * lihva / 100) / 12));
        System.out.printf("%.2f",suma);

    }
}
