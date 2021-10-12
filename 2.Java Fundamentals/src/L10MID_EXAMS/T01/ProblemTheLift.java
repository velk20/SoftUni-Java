package L10MID_EXAMS.T01;

import java.util.*;

public class ProblemTheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int peopleWaiting = Integer.parseInt(scanner.nextLine());
        int[] wagons = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        boolean fullWagons = true;

        for (int i = 0; i < wagons.length; i++) {
            int currentWagon = wagons[i];
            if (currentWagon < 4) {
                int availableSpace = 4 - currentWagon;
                if (peopleWaiting >= availableSpace) {
                    wagons[i] = 4;
                    peopleWaiting -= availableSpace;
                } else {
                    wagons[i] += peopleWaiting;
                    peopleWaiting = 0;
                }
            }
        }
        for (int n :
                wagons) {
            if (n != 4) {
                fullWagons = false;
                break;

            }
        }
        if (peopleWaiting == 0) {
            if (!fullWagons) {
                System.out.println("The lift has empty spots!");
                for (int n :
                        wagons) {

                    System.out.printf("%d ", n);
                }

            } else {
                for (int n :
                        wagons) {

                    System.out.printf("%d ", n);
                }
            }
        } else  {
            System.out.printf("There isn't enough space! %d people in a queue!\n",peopleWaiting);
            for (int n :
                    wagons) {

                System.out.printf("%d ", n);
            }
        }
    }
}
