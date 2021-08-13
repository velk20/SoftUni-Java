package com.company.Tasks;

import java.util.Scanner;

public class BirthdayParty {
    public static void main(String[] args) {
        int budjet = Integer.parseInt(new Scanner(System.in).nextLine());
        double cake = budjet * 0.2;
        double drinks = cake - (cake * 0.45);
        double animator = budjet / 3;
        System.out.println(budjet+cake+drinks+animator);
    }
}
