package Exercise;

import java.util.Scanner;

public class T04Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int sum = 0;
        while (!input.equals("Going home")) {

                int num = Integer.parseInt(input);
                sum += num;
                if (sum >= 10000) {
                    System.out.printf("Goal reached! Good job!\n");
                    System.out.printf("%d steps over the goal!",sum-10000);
                    break;
                }

            input = scanner.nextLine();
        }

        if (input.equals("Going home")) {
        int n = Integer.parseInt(scanner.nextLine());
            sum += n;
            if (sum >= 10000) {
                System.out.printf("Goal reached! Good job!\n");
                System.out.printf("%d steps over the goal!", sum - 10000);
            } else {
                System.out.printf("%d more steps to reach goal.", 10000 - sum);
            }

        }

        }


    }

