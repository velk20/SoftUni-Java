package MoreExercise;

import java.util.Scanner;

public class T09SumofTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magicNum = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        Boolean finished = false;

        for (int i = start  ; i <=end ; i++) {
            for (int j = start; j <= end; j++) {
                counter++;
                if (i + j == magicNum) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", counter, i, j, magicNum);
                    finished = true;
                    break;
                }
            }
            if (finished) {
                break;
            }
        }

        if (!finished) {
            System.out.printf("%d combinations - neither equals %d",counter,magicNum);
        }
    }
}
