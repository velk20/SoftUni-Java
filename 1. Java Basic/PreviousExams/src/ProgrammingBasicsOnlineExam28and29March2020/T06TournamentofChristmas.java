package ProgrammingBasicsOnlineExam28and29March2020;

import java.util.Scanner;

public class T06TournamentofChristmas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        double sum = 0;
        double allSum = 0;
        int winCounter = 0;
        int winAllCounter = 0;
        int lostAllCounter = 0;
        int lostCounter = 0;
        for (int i = 0; i < days; i++) {
            String sport = scanner.nextLine();
            while (!sport.equals("Finish")) {
                String winLost = scanner.nextLine();
                if (winLost.equals("win")) {
                    sum += 20;
                    winCounter++;
                } else {
                    lostCounter++;
                }
                sport = scanner.nextLine();

            }
            if (winCounter > lostCounter) {
                sum = sum + (sum * 0.1);
                allSum += sum;
            } else {
                allSum += sum;
            }
            winAllCounter += winCounter;
            lostAllCounter += lostCounter;
            sum = 0;
            winCounter = 0;
            lostCounter = 0;
        }

        if (winAllCounter > lostAllCounter) {
            allSum += allSum * 0.2;
            System.out.printf("You won the tournament! Total raised money: %.2f", allSum);
        } else {
            System.out.printf("You lost the tournament! Total raised money: %.2f",allSum);
        }
    }
}
