package Lab;

import java.util.Scanner;

public class T04SumofTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int combo = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        Boolean ended = false;

        for (int i = start; i <= end; i++) {
            for (int j = start; j <= end; j++) {
                counter++;
                if (i + j == combo) {
                    System.out.printf("Combination N:%d (%d + %d = %d)\n",counter,i,j,combo);
                    ended = true;
                    break;
                }
                if (ended) {
                    break;
                }
            }
            if (ended) {
                break;
            }
        }

        if (!ended) {
            System.out.printf("%d combinations - neither equals %d",counter,combo);
        }
    }
}
