package com.company;

import java.util.Scanner;

public class InchestoCentimeters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double inc = Double.parseDouble(scanner.nextLine());
        System.out.println(inc * 2.54);
    }
}
