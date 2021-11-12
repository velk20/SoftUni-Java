package L11FINAL_EXAMS.T02;

import java.security.Key;
import java.util.*;

public class T03PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> plantsMap = new HashMap<>();
        Map<String, List<Double>> ratings = new HashMap<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] inputPlant = scanner.nextLine().split("<->");
            String plant = inputPlant[0];
            int rare = Integer.parseInt(inputPlant[1]);

            plantsMap.put(plant, rare);
            ratings.put(plant, new ArrayList<>());

        }

        String input = scanner.nextLine();
        while (!input.equals("Exhibition")) {
            String [] tokens = input.split("[: \\- ]+");
            String command = tokens[0];
            String plant = tokens[1];
            switch (command) {
                case "Rate":
                    Double rating = Double.parseDouble(tokens[2]);
                    if (ratings.containsKey(plant)) {
                        List<Double> currentRating = ratings.get(plant);
                        currentRating.add(rating);
                        ratings.put(plant, currentRating);

                    } else {
                        System.out.println("error");

                    }
                    break;
                case "Update":
                    int newRarity = Integer.parseInt(tokens[2]);
                    if (plantsMap.containsKey(plant)) {
                        plantsMap.put(plant, newRarity);

                    }else {
                        System.out.println("error");

                    }
                    break;
                case "Reset":
                    if (ratings.containsKey(plant)) {
                        ratings.put(plant, new ArrayList<>());

                    }else {
                        System.out.println("error");

                    }
                    break;
                default:
                    System.out.println("error");

                    break;

            }

            input = scanner.nextLine();
        }

        System.out.println("Plants for the exhibition:");

        plantsMap.entrySet()
                .stream()
                .sorted(Map.Entry.<String,Integer>comparingByValue()
                        .thenComparingDouble(x->ratings.get(x.getKey()).stream()
                                .mapToDouble(Double::doubleValue)
                                .average().orElse(0.0))
                        .reversed())
                .forEach(e -> System.out.printf("- %s; Rarity: %d; Rating: %.2f%n",
                        e.getKey(),e.getValue(),
                        ratings.get(e.getKey()).stream().mapToDouble(Double::doubleValue).average().orElse(0.0)));
    }
}
