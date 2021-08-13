package ProgrammingBasicsOnlineExam20and21April2019;

import java.util.Scanner;

public class T06EasterCompetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int maxSum = 0;
        String maxName = "";
        for (int i = 0; i < count; i++) {
            String name = scanner.nextLine();
            String num = scanner.nextLine();
            while (!num.equals("Stop")) {
                int n = Integer.parseInt(num);
                sum += n;
                num = scanner.nextLine();

            }
            System.out.printf("%s has %d points.\n", name, sum);
            if (sum > maxSum) {
                System.out.printf("%s is the new number 1!\n", name);
                maxSum = sum;
                maxName = name;
            }
            sum = 0;
        }

        System.out.printf("%s won competition with %d points!",maxName,maxSum);

    }
}
