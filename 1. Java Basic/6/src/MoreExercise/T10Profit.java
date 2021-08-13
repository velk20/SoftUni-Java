package MoreExercise;

import java.util.Scanner;

public class T10Profit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOne = Integer.parseInt(scanner.nextLine());
        int countTwo = Integer.parseInt(scanner.nextLine());
        int countFive = Integer.parseInt(scanner.nextLine());
        int amount = Integer.parseInt(scanner.nextLine());

        int lev = 1;
        int tva = 2;
        int pet = 5;
        for (int i = 0; i <= countOne ; i++) {
            for (int j = 0; j <= countTwo; j++) {
                for (int k = 0; k <= countFive; k++) {
                    if (i * lev + j * tva + k * pet == amount) {
                        System.out.printf("%d * 1 lv. + %d * 2 lv. + %d * 5 lv. = %d lv.\n",i,j,k,amount);
                    }
                }
            }
        }
    }
}
