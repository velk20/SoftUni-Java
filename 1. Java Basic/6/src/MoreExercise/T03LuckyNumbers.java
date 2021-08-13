package MoreExercise;

import java.util.Scanner;

public class T03LuckyNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int i = 1;
        int j = 1;
        int k = 1;
        int l = 1;
        String num = "";
        int num1 = 0;
        int sumOfFirsts = 0;
        int sumOfLasts = 0;
        for ( i = 1; i <=9 ; i++) {
            for ( j = 1; j <=9; j++) {
                for ( k = 1; k <=9; k++) {
                    for ( l = 1; l <=9; l++) {
                         num = "" + i + j + k + l;
                         num1 = Integer.parseInt(num);
                         sumOfFirsts = i + j;
                         sumOfLasts = k + l;

                        if (sumOfLasts == sumOfFirsts && n %sumOfFirsts == 0) {
                            System.out.printf("%d ",num1);
                        }
                    }
                }
            }
        }
    }
}
