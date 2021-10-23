package L10MID_EXAMS.T06;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T03ManOWar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> pirateShip =
                Arrays.stream(scanner.nextLine().split("\\>")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> warShip =
                Arrays.stream(scanner.nextLine().split("\\>")).map(Integer::parseInt).collect(Collectors.toList());
        int maxHealth = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        boolean stealman = false;
        while (!input.equals("Retire")) {
            String[] tokens = input.split(" ");

            switch (tokens[0]) {
                case "Fire":
                    int indexFire = Integer.parseInt(tokens[1]);
                    int damageFire = Integer.parseInt(tokens[2]);
                    if (indexFire>=0 && indexFire < warShip.size()) {
                        int section = warShip.get(indexFire);
                        if (section - damageFire <= 0) {
                            System.out.println("You won! The enemy ship has sunken.");
                            stealman = true;

                            return;
                        } else {
                            warShip.set(indexFire, section - damageFire);
                        }
                    }
                    break;

                case "Defend":
                    int startIndex = Integer.parseInt(tokens[1]);
                    int endIndex = Integer.parseInt(tokens[2]);
                    int damageDefend = Integer.parseInt(tokens[3]);
                    if (startIndex >= 0 && startIndex < pirateShip.size() && endIndex >= 0 && endIndex < pirateShip.size() && startIndex < endIndex) {
                        for (int i = startIndex; i <= endIndex; i++) {
                            int section = pirateShip.get(i);
                            if (section - damageDefend <= 0) {
                                System.out.println("You lost! The pirate ship has sunken.");
                                stealman = true;
                                return;
                            } else {
                                pirateShip.set(i, section - damageDefend);
                            }
                        }
                    }
                    break;

                case "Repair":
                    int indexRepair = Integer.parseInt(tokens[1]);
                    int healthRepair = Integer.parseInt(tokens[2]);
                    if (indexRepair >= 0 && indexRepair < pirateShip.size()) {
                        if (pirateShip.get(indexRepair) + healthRepair >= maxHealth) {
                            pirateShip.set(indexRepair, maxHealth);
                        } else pirateShip.set(indexRepair, pirateShip.get(indexRepair) + healthRepair);
                    }
                    break;

                case "Status":
                    int count = 0;
                    for (int i = 0; i < pirateShip.size(); i++) {
                        if (pirateShip.get(i) < maxHealth * 0.2) {
                            count++;
                        }
                    }
                    System.out.printf("%d sections need repair.\n", count);
                    break;

            }

            input = scanner.nextLine();


        }
        if (!stealman) {
            System.out.printf("Pirate ship status: %d\n",pirateShip.stream().mapToInt(Integer::intValue).sum());
            System.out.printf("Warship status: %d\n",warShip.stream().mapToInt(Integer::intValue).sum());
        }
    }
}
