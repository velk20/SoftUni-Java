package src.com.company;

import java.util.Scanner;

public class ConcatenateData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fName = scanner.nextLine();
        String lName = scanner.nextLine();
        String age = scanner.nextLine();
        String town = scanner.nextLine();
        System.out.printf("You are %s %s, a %s-years old person from %s.",fName,lName,age,town);
    }
}
