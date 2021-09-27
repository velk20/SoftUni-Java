package L03Arrays.Exams;

import java.util.Arrays;
import java.util.Scanner;

public class ProblemTheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        int[] wagons = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int readyToGoPeople = 0;
        boolean fullWagon = false;

        for (int i = 0; i < wagons.length; i++) {
            int curWagonSpace = wagons[i];
            int isThisFree = 4 - curWagonSpace;
            if (readyToGoPeople>=people) {
                break;
            }
            if (isThisFree > 0) {

                    readyToGoPeople += isThisFree;
                if (people > readyToGoPeople) {

                    wagons[i] = isThisFree + curWagonSpace;
                } else {
                    wagons[i] = people-(readyToGoPeople - isThisFree + curWagonSpace);
                }
            }

        }
        for (int i = 0; i < wagons.length; i++) {
            if (wagons[i] == 4) {
                fullWagon = true;
            } else {
                fullWagon = false;
                break;
            }
        }
        if (readyToGoPeople < people) {
            System.out.printf("There isn't enough space! %d people in a queue!\n",people-readyToGoPeople);
            for (int e :
                    wagons) {
                System.out.printf("%d ",e);
            }
        } else if (fullWagon && readyToGoPeople == people) {
            for (int e :
                    wagons) {
                System.out.printf("%d ",e);
            }

        } else if (!fullWagon) {
            System.out.println("The lift has empty spots!");
            for (int e :
                    wagons) {
                System.out.printf("%d ",e);
            }
        }

    }
}
