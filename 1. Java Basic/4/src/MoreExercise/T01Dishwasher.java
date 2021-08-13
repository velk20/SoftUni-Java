package MoreExercise;

import java.util.Scanner;

public class T01Dishwasher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bottles = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int full = 750*bottles;
        int countPlates = 0;
        int countTigan = 0;
        int counter = 0;
        while (!input.equals("End")) {
            int num = Integer.parseInt(input);
            counter++;
            int plates = 0;
            if (counter % 3 != 0) {
                countPlates += num;
                 plates = num * 5;
                full -= plates;
            } else {
                countTigan += num;
                 plates = num * 15;
                full -= plates;
            }

            if (full < 0) {
                System.out.printf("Not enough detergent, %d ml. more necessary!", Math.abs(full));
                break;
            }
            input = scanner.nextLine();

        }

        if (input.equals("End")) {
            System.out.println("Detergent was enough!");
            System.out.printf("%d dishes and %d pots were washed.\n",countPlates,countTigan);
            System.out.printf("Leftover detergent %d ml.",full);
        }

    }
}
