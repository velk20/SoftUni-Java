package ProgrammingBasicsOnlineExam20and21April2019;

import java.util.Scanner;

public class T05EasterEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countPlaintedEggs = Integer.parseInt(scanner.nextLine());
        int red = 0;
        int orange = 0;
        int blue = 0;
        int green = 0;

        for (int i = 0; i < countPlaintedEggs; i++) {
            String input = scanner.nextLine();
            if (input.equals("red")) {
                red++;
            } else if (input.equals("orange")) {
                orange++;
            }else if (input.equals("blue")) {
                blue++;
            }else if (input.equals("green")) {
                green++;
            }
        }
        String color = "";
        int max = Math.max(Math.max(orange, blue), Math.max(green, red));
        if (max == red) {
            color = "red";
        } else if (max == green) {
            color = "green";
        }else if (max == orange) {
            color = "orange";
        }else if (max == blue) {
            color = "blue";

        }

        System.out.printf("Red eggs: %d\n",red);
        System.out.printf("Orange eggs: %d\n",orange);
        System.out.printf("Blue eggs: %d\n",blue);
        System.out.printf("Green eggs: %d\n",green);
        System.out.printf("Max eggs: %d -> %s",max,color);

    }
}
