package Lab;

import java.util.Scanner;

public class T09Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        int V = width * length * height;
        int sum = 0;
        String input = scanner.nextLine();

        while (!input.equals("Done")) {
            int amount = Integer.parseInt(input);
            sum += amount;
            if (sum > V) {
                System.out.printf("No more free space! You need %d Cubic meters more.",sum-V);
                break;
            }

            input= scanner.nextLine();
        }

        if (sum < V) {
            System.out.printf("%d Cubic meters left.",V-sum);
        }
    }
}
