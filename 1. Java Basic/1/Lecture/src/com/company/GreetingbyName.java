package com.company;

import java.util.Scanner;

public class GreetingbyName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("First way!");
        System.out.println("Hello, " + name+"!");

        System.out.println("#######################");

        System.out.println("Second way!");
        System.out.print("Hello, ");
        System.out.print(name);
        System.out.print("!");

        System.out.println("#######################");

    }
}
