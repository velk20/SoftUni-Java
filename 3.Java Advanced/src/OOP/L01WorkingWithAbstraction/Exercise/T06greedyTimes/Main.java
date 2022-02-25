
package OOP.L01WorkingWithAbstraction.Exercise.T06greedyTimes;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long bagCapacity = Long.parseLong(scanner.nextLine());
        String[] itemsAndQuantityPairs = scanner.nextLine().split("\\s+");

        LinkedHashMap<String, LinkedHashMap<String, Long>> myBag = new LinkedHashMap<String,
                LinkedHashMap<String, Long>>();
        long goldAmount = 0;
        long rockAmount = 0;
        long moneyAmount = 0;

        for (int i = 0; i < itemsAndQuantityPairs.length; i += 2) {
            String name = itemsAndQuantityPairs[i];
            long currentItemAmount = Long.parseLong(itemsAndQuantityPairs[i + 1]);

            String typeOfItem = getTypeOfItem(name);

            if (typeOfItem.equals("")) {
                continue;
            } else if (bagCapacity < myBag.values().stream().map(Map::values).flatMap(Collection::stream).mapToLong(e -> e).sum() + currentItemAmount) {
                continue;
            }

            switch (typeOfItem) {
                case "Gem":
                    if (checkItem(myBag, typeOfItem, "Gold", currentItemAmount)) continue;
                    break;
                case "Cash":
                    if (checkItem(myBag, typeOfItem, "Gem", currentItemAmount)) continue;
                    break;
            }

            if (!myBag.containsKey(typeOfItem)) {
                myBag.put((typeOfItem), new LinkedHashMap<String, Long>());
            }

            if (!myBag.get(typeOfItem).containsKey(name)) {
                myBag.get(typeOfItem).put(name, 0L);
            }


            myBag.get(typeOfItem).put(name, myBag.get(typeOfItem).get(name) + currentItemAmount);
            if (typeOfItem.equals("Gold")) {
                goldAmount += currentItemAmount;
            } else if (typeOfItem.equals("Gem")) {
                rockAmount += currentItemAmount;
            } else if (typeOfItem.equals("Cash")) {
                moneyAmount += currentItemAmount;
            }
        }

        for (var x : myBag.entrySet()) {
            Long sumValues = x.getValue().values().stream().mapToLong(l -> l).sum();

            System.out.println(String.format("<%s> $%s", x.getKey(), sumValues));

            x.getValue().entrySet().stream().sorted((e1, e2) -> e2.getKey().compareTo(e1.getKey())).forEach(i -> System.out.println("##" + i.getKey() + " - " + i.getValue()));

        }
    }

    private static boolean checkItem(LinkedHashMap<String, LinkedHashMap<String, Long>> myBag, String typeOfItem, String Gold, long currentItemAmount) {
        if (!myBag.containsKey(typeOfItem)) {
            if (myBag.containsKey(Gold)) {
                if (currentItemAmount > myBag.get(Gold).values().stream().mapToLong(e -> e).sum()) {
                    return true;
                }
            } else {
                return true;
            }
        } else if (myBag.get(typeOfItem).values().stream().mapToLong(e -> e).sum() + currentItemAmount > myBag.get(Gold).values().stream().mapToLong(e -> e).sum()) {
            return true;
        }
        return false;
    }

    private static String getTypeOfItem(String name) {
        if (name.length() == 3) {
            return  "Cash";
        } else if (name.toLowerCase().endsWith("gem")) {
            return "Gem";
        } else if (name.toLowerCase().equals("gold")) {
            return "Gold";
        }
        return null;
    }
}