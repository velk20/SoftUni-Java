package L02DataTypesandVariables.MoreExercise;

import java.util.Scanner;

public class T02FromLefttoTheRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            long numLeft = Long.parseLong(scanner.next());
            long numRight = Long.parseLong(scanner.next());
            long sum = 0;
            if (numLeft > numRight) {
                long LeftNum = numLeft;
                while (LeftNum != 0) {
                    sum += Math.abs(LeftNum % 10);
                    LeftNum = Math.abs(LeftNum / 10);
                }
            } else {
                long RightNum = numRight;
                while (RightNum != 0) {
                    sum += Math.abs(RightNum % 10);
                    RightNum = Math.abs(RightNum / 10);
                }
            }
            System.out.println(Math.abs(sum));

        }
    }
}
