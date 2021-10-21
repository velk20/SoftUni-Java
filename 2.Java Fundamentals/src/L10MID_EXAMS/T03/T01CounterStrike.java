package L10MID_EXAMS.T03;

import java.util.*;

public class T01CounterStrike {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int energy = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int wonCounter = 0;
        boolean win = true;
        while (!input.equals("End of battle")) {
            int steps = Integer.parseInt(input);
            energy -= steps;
            if (energy < 0) {
                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy", wonCounter,
                        energy+steps);
                win=false;
                break;
            } else {
                wonCounter++;
                if (wonCounter % 3 == 0) {
                    energy += wonCounter;
                }
            }

            input = scanner.nextLine();
        }

        if (win) {
            System.out.printf("Won battles: %d. Energy left: %d",wonCounter,energy);
        }
    }
}
