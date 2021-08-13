package ProgrammingBasicsOnlineExam20and21April2019;

import java.util.Scanner;

public class T04EasterEggsBattle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int player1 = Integer.parseInt(scanner.nextLine());
        int player2 = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        Boolean finished = false;
        while (!input.equals("End of battle")) {
            if (input.equals("one")) {
                player2--;
            } else if (input.equals("two")) {
                player1--;
            }

            if (player1 == 0) {
                System.out.printf("Player one is out of eggs. Player two has %d eggs left.",player2);
                finished = true;
                break;
            } else if (player2 == 0) {
                System.out.printf("Player two is out of eggs. Player one has %d eggs left.",player1);
                finished = true;
                break;
            }

            input = scanner.nextLine();
        }

        if (!finished) {
            System.out.printf("Player one has %d eggs left.\n",player1);
            System.out.printf("Player two has %d eggs left.",player2);

        }
    }
}
