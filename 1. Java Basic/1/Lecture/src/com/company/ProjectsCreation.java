package com.company;
import java.util.Scanner;
public class ProjectsCreation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int hours = Integer.parseInt(scanner.nextLine());
        System.out.println("The architect "+name+" will need "+hours*3+" hours to complete " +hours+ " project/s.");

    }
}
