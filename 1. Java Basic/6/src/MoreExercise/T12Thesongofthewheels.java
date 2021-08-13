package MoreExercise;

import java.util.Scanner;

public class T12Thesongofthewheels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = Integer.parseInt(scanner.nextLine());
        Boolean finished = false;
        int counter = 0;
        int finalNum = 0;
        for (int a = 1; a <=9 ; a++) {
            for (int b = 1; b <= 9; b++) {
                for (int c = 1; c <= 9; c++) {
                    for (int d = 1; d <= 9 ; d++) {
                        if (a < b && c > d && a * b + c * d == m) {
                            counter++;
                            if (counter == 4) {
                                String num = String.format("%d%d%d%d", a, b, c, d);
                                finalNum = Integer.parseInt(num);
                                finished = true;

                            }
                            System.out.printf("%d%d%d%d ",a,b,c,d);
                        }
                    }
                }
            }
        }
        if (counter > 0) {
            System.out.println();
        }

        if (finished) {
            System.out.printf("Password: %d", finalNum);
        }else System.out.printf("No!");
    }
}
