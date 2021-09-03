package L02DataTypesandVariables.Exercise;

import java.util.Scanner;

public class T07WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int capacity = 255;
        int sum = 0;

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            int liters = Integer.parseInt(scanner.nextLine());
            sum += liters;
            if (sum > capacity) {
                System.out.println("Insufficient capacity!");
                sum -= liters;
            }
        }

        System.out.println(sum);

    }
}
