package OOP.L01WorkingWithAbstraction.Exercise.T04TrafficLights;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] initialColors = scanner.nextLine().split("\\s+");
        int countOfChangesForLight = Integer.parseInt(scanner.nextLine());
        List<Light> lightList = new ArrayList<>();
        for (String initialColor : initialColors) {
            lightList.add(new Light(Color.valueOf(initialColor)));
        }

        for (int i = 0; i < countOfChangesForLight; i++) {
            lightList.forEach(light -> {
                if (light.getColor().equals(Color.RED)) {
                    light.setColor(Color.GREEN);
                }else if (light.getColor().equals(Color.GREEN))
                    light.setColor(Color.YELLOW);
                else if (light.getColor().equals(Color.YELLOW)) {
                    light.setColor(Color.RED);
                }

                System.out.print(light.getColor().toString()+" ");
            });
            System.out.println();

        }
    }
}
