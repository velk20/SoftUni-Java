package com.company;

import java.util.Scanner;

public class UserReadingFirstTIme {
    public static void main(String[] args) {
        String text = "Input Your Name!";
        System.out.println(text);
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello " + name);
    }


}
