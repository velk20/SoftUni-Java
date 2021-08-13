package MoreExercise;

import java.util.ArrayList;
import java.util.Scanner;

public class T08EqualPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int numOne = Integer.parseInt(scanner.nextLine());
        int numTwo = Integer.parseInt(scanner.nextLine());

        int sum = numOne + numTwo;
        int currentDiff = 0;
        Boolean check = true;

        for (int i = 0; i < n-1; i++) {
            numOne = Integer.parseInt(scanner.nextLine());
            numTwo = Integer.parseInt(scanner.nextLine());
            int curent = numOne + numTwo;

            if (curent != sum) {
                int diff = Math.abs(curent - sum);
                if (diff > currentDiff) {
                    currentDiff = diff;
                }
                sum = curent;
                check = false;
            }
        }

        if (check) {
            System.out.printf("Yes, value=%d", sum);
        } else {
            System.out.printf("No, maxdiff=%d",currentDiff);
        }
    }
}
