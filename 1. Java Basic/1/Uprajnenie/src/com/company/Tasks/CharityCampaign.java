package com.company.Tasks;

import java.util.Scanner;

public class CharityCampaign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int cooks = Integer.parseInt(scanner.nextLine());
        int cakes = Integer.parseInt(scanner.nextLine());
        int gofretes = Integer.parseInt(scanner.nextLine());
        int pancakes = Integer.parseInt(scanner.nextLine());

        int price1 = cakes * 45;
        double price2 = gofretes * 5.80;
        double price3 = pancakes * 3.20;
        double sum = (price1 + price2 + price3) * cooks;
        double all = sum * days;
        double res = all - (all / 8);
        System.out.printf("%.2f",res);
    }
}
