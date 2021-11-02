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
        //TODO
        Map<String, Integer> map = new TreeMap<>();
        List<String> input = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        boolean finished = false;
        while (true) {
            int quantity = Integer.parseInt(input.get(0));

            String material = input.get(1);

            if (!map.containsKey(material)) {
                map.put(material, quantity);
            }else{
                map.put(material, map.get(material) + quantity);
            }

            switch (material) {
                case "Shadowmourne":
                    if (map.get(material) >= 250) {
                        System.out.println("Shadowmourne obtained!");
                        finished = true;
                    }
                    break;
                case "Valanyr":
                    if (map.get(material) >= 250) {
                        System.out.println("Valanyr obtained!");
                        finished = true;
                    }
                    break;
                    case "Dragonwrath":
                    if (map.get(material) >= 250) {
                        System.out.println("Dragonwrath obtained!");
                        finished = true;
                    }
                    break;
            }
            if (finished) {
                break;
            }
            input.remove(0);
            input.remove(0);


            if (input.size() == 0) {
                break;
            }
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.printf("%s: %d\n", entry.getKey(), entry.getValue());
        }
    }
}
