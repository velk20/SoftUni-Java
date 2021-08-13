package Examtasks;

import java.util.Scanner;

public class BesFootballPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int goals = Integer.parseInt(scanner.nextLine());
        int maxGoals = Integer.MIN_VALUE;
        int counterGoals = 0;
        String lastPlayer = "";
        while (!name.equals("END")) {
            lastPlayer = name;
            if (goals > maxGoals) {
                maxGoals = goals;
            }

            if (maxGoals >= 10) {
                System.out.printf( "%s is the best player!\n",  lastPlayer);
                System.out.printf("He has scored %d goals and made a hat-trick !!!",maxGoals);
                break;
            }




            name = scanner.nextLine();
            if (!name.equals("END")) {
                goals = Integer.parseInt(scanner.nextLine());
            }else break;
        }

        if (name.equals("END")) {
            System.out.printf( "%s is the best player!\n",  lastPlayer);
            if (maxGoals>=3) {
                System.out.printf("He has scored %d goals and made a hat-trick !!!",maxGoals);
            }else System.out.printf("He has scored %d goals.",maxGoals);
        }
    }
}
