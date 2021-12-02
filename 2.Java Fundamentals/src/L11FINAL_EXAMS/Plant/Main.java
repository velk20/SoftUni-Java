package L11FINAL_EXAMS.Plant;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Plant> plantsList = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("<->");
            String name = tokens[0];
            int rare = Integer.parseInt(tokens[1]);
            Plant plant = new Plant(name, rare, 0);
            if (!plantsList.contains(plant)) {
                plantsList.add(plant);
            } else {
                int indexUpdateRarity = plantsList.indexOf(plant);
                Plant newPlant = plantsList.get(indexUpdateRarity);
                plantsList.remove(indexUpdateRarity);
                newPlant.setRarity(rare);
                plantsList.add(newPlant);
            }
        }

        String input = scanner.nextLine();

        while (!input.equals("Exhibition")) {
            String[] tokens = input.split("[:\\s+-]+");
            String command = tokens[0];

            switch (command) {
                case "Rate":
                    String plantNameNewRating = tokens[1];
                    double newRating = Integer.parseInt(tokens[2]);
                    Plant addingNewRating = null;
                    int indexOfAddingRatingPLant = 0;
                    boolean findedTheIndex = false;
                    for (Plant list : plantsList) {
                        if (list.getPlantName().equals(plantNameNewRating)) {
                            indexOfAddingRatingPLant = plantsList.indexOf(list);
                            findedTheIndex = true;
                            break;
                        }
                    }

                    if (findedTheIndex) {
                        addingNewRating = plantsList.get(indexOfAddingRatingPLant);
                        plantsList.remove(indexOfAddingRatingPLant);
                        double oldRating = addingNewRating.getRating();
                        if (oldRating == 0) {
                            addingNewRating.setRating(newRating);
                            plantsList.add(addingNewRating);
                        } else {
                            addingNewRating.setRating((oldRating + newRating) / 2);
                            plantsList.add(addingNewRating);
                        }

                    } else {
                        System.out.println("error");
                        break;
                    }

                    break;

                case "Update":
                    String updatePlantName = tokens[1];
                    int newRarity = Integer.parseInt(tokens[2]);
                    boolean findedName = false;
                    int indexOfNewUpdate = 0;
                    Plant updatePlant = null;
                    for (Plant plant : plantsList) {
                        if (plant.getPlantName().equals(updatePlantName)) {
                            findedName = true;
                            indexOfNewUpdate = plantsList.indexOf(plant);
                            break;
                        }
                    }

                    if (findedName) {
                        updatePlant = plantsList.get(indexOfNewUpdate);
                        plantsList.remove(indexOfNewUpdate);
                        updatePlant.setRarity(newRarity);
                        plantsList.add(updatePlant);
                    } else {
                        System.out.println("error");
                        break;
                    }




                    break;

                case "Reset":
                    String nameOfReset = tokens[1];
                    boolean finded = false;
                    for (Plant plant : plantsList) {
                        if (plant.getPlantName().equals(nameOfReset)) {
                            int indexOfOldPlant = plantsList.indexOf(plant);
                            Plant newPlant = plantsList.get(indexOfOldPlant);
                            plantsList.remove(indexOfOldPlant);
                            newPlant.setRating(0);
                            plantsList.add(newPlant);
                            finded = true;
                            break;
                        }
                    }
                    if (!finded) {
                        System.out.println("error");

                    }
                    break;
            }
            input = scanner.nextLine();
        }

        Collections.sort(plantsList,
                Comparator.comparing(Plant::getRarity).thenComparing(Comparator.comparing(Plant::getRating)).reversed());

        System.out.println("Plants for the exhibition:");
        for (Plant plant : plantsList) {
            System.out.printf("- %s; Rarity: %d; Rating: %.2f\n", plant.getPlantName(), plant.getRarity(), plant.getRating());
        }
    }

    private static class Plant {

        private String plantName;
        private int rarity;
        private double rating;

        public Plant(String plantName, int rarity, double rating) {
            this.plantName = plantName;
            this.rarity = rarity;
            this.rating = rating;
        }

        public String getPlantName() {
            return plantName;
        }

        public void setPlantName(String plantName) {
            this.plantName = plantName;
        }

        public int getRarity() {
            return rarity;
        }

        public void setRarity(int rarity) {
            this.rarity = rarity;
        }

        public double getRating() {
            return rating;
        }

        public void setRating(double rating) {
            this.rating = rating;
        }
    }

}
