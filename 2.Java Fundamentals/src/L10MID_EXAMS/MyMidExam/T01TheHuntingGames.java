package L10MID_EXAMS.MyMidExam;

import java.util.Scanner;

public class T01TheHuntingGames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int people = Integer.parseInt(scanner.nextLine());
        double groupEnergy = Double.parseDouble(scanner.nextLine());
        double waterPerPerson = Double.parseDouble(scanner.nextLine());
        double foodPerPerson = Double.parseDouble(scanner.nextLine());

        double waterSupply = days * people * waterPerPerson;
        double foodSupply = days * people * foodPerPerson;

        for (int i = 1; i <= days; i++) {
            double energyLoss = Double.parseDouble(scanner.nextLine());
            groupEnergy -= energyLoss;
            if (groupEnergy > 0) {
                if (i % 2 == 0) {
                    groupEnergy = groupEnergy + (groupEnergy * 0.05);
                    waterSupply = waterSupply * 0.7;
                }
                if (i % 3 == 0) {
                    foodSupply = foodSupply - (foodSupply / people);
                    groupEnergy = groupEnergy + (groupEnergy * 0.10);
                }

            }else break;
        }

        if (groupEnergy > 0) {
            System.out.printf("You are ready for the quest. You will be left with - %.2f energy!",groupEnergy);
        }else System.out.printf("You will run out of energy. You will be left with %.2f food and %.2f water.",
                foodSupply,waterSupply);
    }
}
