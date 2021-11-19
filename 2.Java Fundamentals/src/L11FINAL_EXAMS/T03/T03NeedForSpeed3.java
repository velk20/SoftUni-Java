package L11FINAL_EXAMS.T03;

import java.util.*;

public class T03NeedForSpeed3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> namesAndMiles = new LinkedHashMap<>();
        Map<String, Integer> namesAndFuel = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] tokens  = scanner.nextLine().split("\\|");
            String name = tokens[0];
            int miles = Integer.parseInt(tokens[1]);
            int fuel = Integer.parseInt(tokens[2]);

            namesAndMiles.put(name, miles);
            namesAndFuel.put(name, fuel);
        }


        String input = scanner.nextLine();

        while (!input.equals("Stop")) {
            String[] tokens = input.split(" : ");
            String command = tokens[0];

            switch (command) {
                case "Drive":
                    String name = tokens[1];
                    int distance = Integer.parseInt(tokens[2]);
                    int fuel = Integer.parseInt(tokens[3]);

                    int currentFuel = namesAndFuel.get(name);
                    int currentDistance = namesAndMiles.get(name);

                    if (currentFuel < fuel) {
                        System.out.println("Not enough fuel to make that ride");
                        break;
                    } else {
                        int distanceToPut = currentDistance + distance;

                        namesAndFuel.put(name, currentFuel - fuel);
                        namesAndMiles.put(name, currentDistance + distance);
                        System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed" +
                                ".\n", name, distance, fuel);

                        if (distanceToPut >= 100000) {
                            System.out.printf("Time to sell the %s!\n", name);
                            namesAndFuel.remove(name);
                            namesAndMiles.remove(name);
                            break;

                        }

                    }
                    break;





                case "Refuel":
                    String nameCarRefuel = tokens[1];
                    int fuelToRefuel = Integer.parseInt(tokens[2]);

                    int currentFuelToRefil = namesAndFuel.get(nameCarRefuel);
                    if (currentFuelToRefil + fuelToRefuel > 75) {
                        fuelToRefuel = 75;
                        namesAndFuel.put(nameCarRefuel, fuelToRefuel);
                        System.out.printf("%s refueled with %d liters\n", nameCarRefuel, 75 - currentFuelToRefil);
                    } else {
                        fuelToRefuel = fuelToRefuel + currentFuelToRefil;
                        namesAndFuel.put(nameCarRefuel, fuelToRefuel);
                        System.out.printf("%s refueled with %d liters\n", nameCarRefuel, fuelToRefuel - currentFuelToRefil);

                    }
                    break;

                case "Revert":
                    String carRevert = tokens[1];
                    int kmRevert = Integer.parseInt(tokens[2]);

                    int revertDistance = namesAndMiles.get(carRevert);

                    if (revertDistance - kmRevert < 10000) {
                        namesAndMiles.put(carRevert, 10000);
                    } else {
                        namesAndMiles.put(carRevert, revertDistance - kmRevert);
                        System.out.printf("%s mileage decreased by %d kilometers\n",carRevert,kmRevert);

                    }
                    break;

            }


            input = scanner.nextLine();
        }
//, you need to print all cars in your possession, sorted by their mileage in descending
// order, then by their name in ascending order, in the following format:
//        "{car} -> Mileage: {mileage} kms, Fuel in the tank: {fuel} lt."

        namesAndMiles
                .entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed().thenComparing(Map.Entry.comparingByKey()))
                .forEach(e -> System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.\n", e.getKey(),
                        e.getValue(), namesAndFuel.get(e.getKey())));
    }
}
