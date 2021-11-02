package L07MapsLambdaAndStreamAPI.Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class T03LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
/*•	Shadowmourne - requires 250 Shards
•	Valanyr - requires 250 Fragments
•	Dragonwrath - requires 250 Motes
*/

        Map<String, Integer> legendary = new TreeMap<>();
        Map<Integer, String> trash = new TreeMap<>();
        List<String> input = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        while (input.size() > 0) {
            int quantity = Integer.parseInt(input.get(0));
            String material = input.get(1).toLowerCase();
            if (material.equals("shards") || material.equals("fragments") || material.equals("motes")) {
                if (!legendary.containsKey(material)) {
                    legendary.put(material, quantity);
                } else {
                    int currentQuantity = legendary.get(material);
                    if (currentQuantity + quantity >= 250) {
                        System.out.printf("%s obtained\n", material);
                        legendary.put(material, currentQuantity + quantity - 250);
                        break;
                    }

                }
            }

            else {
                if (!trash.containsKey(quantity)) {
                    trash.put(quantity, material);
                } else {

                    //TODO
                }
            }
        }

    }
}