package MoreExercise;

import java.util.Scanner;

public class T01BackToThePast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = 18;
        double money = Double.parseDouble(scanner.nextLine());
        int yearToLive = Integer.parseInt(scanner.nextLine());
        int los = 12000;
        for (int i = 1800; i <= yearToLive ; i++) {
            if (i % 2 == 0) {
                money -= los;
            } else {
                money -= (los + (age * 50));
            }
            age++;
        }

        if (money >= 0) {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.",money);
        }else System.out.printf("He will need %.2f dollars to survive.",Math.abs(money) );
    }
}
