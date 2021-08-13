package com.company;

import java.util.Scanner;
import java.util.function.DoubleBinaryOperator;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double yard = Double.parseDouble(scanner.nextLine());
        double price = yard * 7.61;
        double res = price - (price * 0.18);
        System.out.println("The final price is: "+res);
        System.out.println("The discount is: " + price * 0.18);
    }
}
