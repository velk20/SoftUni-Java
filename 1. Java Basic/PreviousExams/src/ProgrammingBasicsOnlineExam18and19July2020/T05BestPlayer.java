package ProgrammingBasicsOnlineExam18and19July2020;

import java.util.Scanner;

public class T05BestPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bestGoals = 0;
        String bestPLayer = "";

        String name = scanner.nextLine();

        while (!name.equals("END")) {
            int goals = Integer.parseInt(scanner.nextLine());
            if (goals >= 10) {
                bestGoals = goals;
                bestPLayer = name;

                break;
            }


            if (bestGoals<goals) {
                bestGoals = goals;
                bestPLayer = name;
            }
            name = scanner.nextLine();

        }

        if (bestGoals >= 3) {
            System.out.printf("%s is the best player!\n",bestPLayer);
            System.out.printf("He has scored %d goals and made a hat-trick !!!",bestGoals);
        } else if (bestGoals < 3) {
            System.out.printf("%s is the best player!\n",bestPLayer);
            System.out.printf("He has scored %d goals.",bestGoals);
        }
    }
}
