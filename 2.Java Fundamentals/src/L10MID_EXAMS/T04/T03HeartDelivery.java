package L10MID_EXAMS.T04;

import java.util.*;
import java.util.stream.Collectors;

public class T03HeartDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> houses = Arrays.stream(scanner.nextLine().split("@")).map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();
        int curSteps = 0;

        while (!input.equals("Love!")) {
            String[] tokens = input.split(" ");
            int steps = Integer.parseInt(tokens[1]);
            curSteps += steps;
            if (curSteps >= houses.size()) {
                curSteps = 0;
            }
            int house = houses.get(curSteps);
            if (house == 0) {
                System.out.printf("Place %d already had Valentine's day.\n", curSteps);
            }else{
                house -= 2;
                if (house <= 0) {
                    System.out.printf("Place %d has Valentine's day.\n", curSteps);
                    houses.set(curSteps, 0);
                } else {
                    houses.set(curSteps, house);
                }

            }

            input = scanner.nextLine();
        }

        System.out.printf("Cupid's last position was %d.\n",curSteps);
        int counterFails = 0;
        for (int i = 0; i < houses.size(); i++) {
            if (!houses.get(i).equals(0)) {
                counterFails++;
            }
        }

        if (counterFails == 0) {
            System.out.println("Mission was successful.");
        } else {
            System.out.printf("Cupid has failed %d places.",counterFails);
        }
    }
}
