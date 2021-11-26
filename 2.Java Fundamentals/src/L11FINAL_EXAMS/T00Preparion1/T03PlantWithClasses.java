package L11FINAL_EXAMS.T00Preparion1;

import java.util.*;

public class T03PlantWithClasses {
    static class Plant {
        private String name;
        private int rarity;
        private List<Integer> ratings;
        Plant(){}
        Plant (String name, int rarity) {
            this.name = name;
            this.rarity = rarity;
            this.ratings = new ArrayList<>();
        }
        Plant(String name, int rarity, int rating) {
            this(name, rarity);
            this.ratings.add(rating);
        }

        void addRatings(int rating) {
            this.ratings.add(rating);
        }

        void resetRating() {
            this.ratings = new ArrayList<>();
        }
    }

    private static Plant findPlantInTheList(String name, List<Plant> plants) {
        for (Plant plant : plants) {
            if (plant.name.equals(name)) {
                return plant;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Plant> plants = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            Plant plant = new Plant(line.split("<->")[0], Integer.parseInt(line.split("<->")[1]));
            plants.add(plant);
        }
        String input = scanner.nextLine();
        while (!input.equals("Exhibition")) {
            String[] tokens = input.split(": ");
            switch (tokens[0]) {
                case "Rate":
                    String plantToRate = tokens[1].split(" - ")[0];
                    int rating = Integer.parseInt(tokens[1].split(" - ")[1]);
                    Plant toRate = findPlantInTheList(plantToRate, plants);
                    if (toRate != null) {
                        toRate.addRatings(rating);
                    } else {
                        System.out.println("error");
                    }
                    break;
                case "Update":
                    String plantToUpdate = tokens[1].split(" - ")[0];
                    int newRarity = Integer.parseInt(tokens[1].split(" - ")[1]);
                    Plant toUpdate = findPlantInTheList(plantToUpdate, plants);
                    if (toUpdate != null) {
                        toUpdate.rarity = newRarity;
                    } else {
                        System.out.println("error");
                    }
                    break;
                case "Reset":
                    String plantToRemove = tokens[1];
                    boolean found = false;
                    for (Plant plant : plants) {
                        if (plant.name.equals(plantToRemove)) {
                            plant.resetRating();
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("error");
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.println("Plants for the exhibition:");
        plants.stream().sorted((f, s) -> {
            int result = Integer.compare(s.rarity, f.rarity);
            if (result == 0) {
                result = (int) (s.ratings.stream().mapToInt(Integer::intValue).average().orElse(0.0) - (f.ratings.stream().mapToInt(Integer::intValue).average().orElse(0.0)));
            }
            return result;
        }).forEach(element -> {
            System.out.printf("- %s; Rarity: %d; Rating: %.2f%n", element.name, element.rarity, element.ratings.stream().mapToInt(Integer::intValue).average().orElse(0.0));
        });
    }
}
