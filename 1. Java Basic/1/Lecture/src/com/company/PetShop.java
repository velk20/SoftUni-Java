package com.company;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dogs = Integer.parseInt(scanner.nextLine());
        int others = Integer.parseInt(scanner.nextLine());
        System.out.println((dogs*2.50)+(others*4)+" lv.");
    }
}
