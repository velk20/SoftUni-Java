package L11FINAL_EXAMS.T00Preparion2;

import java.util.*;

public class T04Pirates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> cityAndPopulation = new LinkedHashMap<>();
        Map<String, Integer> cityAndGold = new LinkedHashMap<>();


        String targets = scanner.nextLine();
        while (!targets.equals("Sail")) {
            String[] townInfo = targets.split("[|][|]");
            String city = townInfo[0];
            int population = Integer.parseInt(townInfo[1]);
            int gold = Integer.parseInt(townInfo[2]);

            if (!cityAndPopulation.containsKey(city)) {
                cityAndPopulation.put(city, population);
                cityAndGold.put(city, gold);
            } else {
                cityAndPopulation.put(city, cityAndPopulation.get(city) + population);
                cityAndGold.put(city, cityAndGold.get(city) + gold);
            }

            targets = scanner.nextLine();

        }

        String commands = scanner.nextLine();
        while (!commands.equals("End")) {
            String[] tokens = commands.split("=>");
            String command = tokens[0];

            switch (command) {
                case "Plunder":
                    String cityPlunder = tokens[1];
                    int peopleKilled = Integer.parseInt(tokens[2]);
                    int goldStolen = Integer.parseInt(tokens[3]);

                    System.out.printf("%s plundered! %d gold stolen, %d citizens killed.\n",cityPlunder,goldStolen,peopleKilled);

                    int currentPeople = cityAndPopulation.get(cityPlunder);
                    int currentGold = cityAndGold.get(cityPlunder);

                    currentPeople -= peopleKilled;
                    currentGold -= goldStolen;
                    if (currentPeople == 0 || currentGold == 0) {
                        System.out.printf("%s has been wiped off the map!\n", cityPlunder);
                        cityAndGold.remove(cityPlunder);
                        cityAndPopulation.remove(cityPlunder);
                    } else {
                        cityAndGold.put(cityPlunder,currentGold);
                        cityAndPopulation.put(cityPlunder, currentPeople);
                    }


                    break;


                case "Prosper":
                    String townProsper = tokens[1];
                    int goldProsper = Integer.parseInt(tokens[2]);
                    if (goldProsper < 0) {
                        System.out.println("Gold added cannot be a negative number!");
                        break;
                    } else {
                        System.out.printf("%d gold added to the city treasury. %s now has %d gold.\n", goldProsper,
                                townProsper, cityAndGold.get(townProsper) + goldProsper);
                        cityAndGold.put(townProsper, cityAndGold.get(townProsper) + goldProsper);
                    }


                    break;

            }

            commands = scanner.nextLine();
        }

        if (cityAndPopulation.size() <= 0) {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        } else {
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:\n",cityAndPopulation.size());
            cityAndGold
                    .entrySet()
                    .stream()
                    .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()
                            .thenComparing(Map.Entry.comparingByKey()))
                    .forEach(e -> System.out.printf("%s -> Population: %d citizens, Gold: %d kg\n", e.getKey(),
                            cityAndPopulation.get(e.getKey()), e.getValue()));

        }
    }
}
