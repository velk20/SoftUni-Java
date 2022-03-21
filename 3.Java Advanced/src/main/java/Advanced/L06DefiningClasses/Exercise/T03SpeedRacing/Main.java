package Advanced.L06DefiningClasses.Exercise.T03SpeedRacing;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Car> carLinkedList = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            Car car = new Car(tokens[0], Double.parseDouble(tokens[1]), Double.parseDouble(tokens[2]));
            carLinkedList.put(tokens[0], car);
        }

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] tokens = input.split("\\s+");
            String model = tokens[1];
            int amountOfKM = Integer.parseInt(tokens[2]);
            carLinkedList.get(model).travelTime(amountOfKM);
            input = scanner.nextLine();
        }

        carLinkedList.entrySet().stream().forEach(e->{
            Car value = e.getValue();
            System.out.printf("%s %.2f %d\n", value.getModel(), value.getFuelAmount(), value.getDistanceTraveled());
        });
    }
}
