package Exercise;

import java.util.Scanner;

public class T01NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int current = 1;
        Boolean isBigger = false;
        for (int row = 1; row <= n ; row++) {
            for (int col = 1; col <=row ; col++) {
                if (current > n) {
                    isBigger = true;
                    break;

                }
                System.out.print(current + " ");
                current++;
            }
            if (isBigger) {
                break;
            }
            System.out.println();
        }
    }
}
