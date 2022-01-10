package L05Lists.MoreExercise;

import java.util.*;
import java.util.stream.Collectors;

public class T05DrumSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double savings = Double.parseDouble(scanner.nextLine());
        List<Integer> initialDrums = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> currentDrums = new ArrayList<>(List.copyOf(initialDrums));

        String input = scanner.nextLine();
        while (!input.equals("Hit it again, Gabsy!")) {
            int hitPower = Integer.parseInt(input);
            for (int i = 0; i < currentDrums.size(); i++) {
                int drum = currentDrums.get(i);
                drum -= hitPower;
                if (drum <= 0) {
                    int reqMoney = initialDrums.get(i) * 3;
                    if (reqMoney <= savings) {
                        savings -= reqMoney;
                        drum = initialDrums.get(i);
                        currentDrums.set(i, drum);
                    } else {
                        initialDrums.remove(i);
                        currentDrums.remove(i);
                        i--;
                    }
                }else currentDrums.set(i, drum);
            }
            input = scanner.nextLine();
        }

        System.out.println(currentDrums.stream().map(i->i.toString()).collect(Collectors.joining(" ")));
        System.out.printf("Gabsy has %.2flv.", savings);
    }
}
