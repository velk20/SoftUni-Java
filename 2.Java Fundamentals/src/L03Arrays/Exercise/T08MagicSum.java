package L03Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class T08MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int kicker = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < num.length; i++) {
            int checkNum = num[i];
            for (int j = 1; j < num.length; j++) {
                if (checkNum + num[j] == kicker && i<j) {
                    System.out.printf("%d %d\n", checkNum, num[j]);
                }
            }
        }
    }
}
