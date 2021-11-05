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

        Map<String, Integer> keyMaterials = new TreeMap<>();
        keyMaterials.put("shards",0);
        keyMaterials.put("fragments",0);
        keyMaterials.put("motes",0);
        Map<String, Integer> junk = new TreeMap<>();
        boolean finished = false;
        String input = scanner.nextLine().toLowerCase();
        while (true ) {
            List<String> list = Arrays.stream(input.split(" ")).collect(Collectors.toList());
            while (list.size()>0) {
                int count = Integer.parseInt(list.get(0));
                String nameMaterial = list.get(1).toLowerCase();

                if (nameMaterial.equals("shards") || nameMaterial.equals("fragments") || nameMaterial.equals("motes")) {
                    if (!keyMaterials.containsKey(nameMaterial)) {
                        keyMaterials.put(nameMaterial, count);
                        list.remove(0);
                        list.remove(0);
                    } else {
                        keyMaterials.put(nameMaterial, keyMaterials.get(nameMaterial) + count);
                        list.remove(0);
                        list.remove(0);
                    }

                    if (keyMaterials.get(nameMaterial) >= 250) {
                        switch (nameMaterial) {
                            case "shards":
                                System.out.println("Shadowmourne obtained!");
                                keyMaterials.put(nameMaterial, keyMaterials.get(nameMaterial) - 250);
                                finished = true;
                                break;

                                case "fragments":
                                    System.out.println("Valanyr obtained!");
                                    keyMaterials.put(nameMaterial, keyMaterials.get(nameMaterial) - 250);
                                    finished = true;

                                    break;

                                case "motes":
                                    System.out.println("Dragonwrath obtained!");
                                    keyMaterials.put(nameMaterial, keyMaterials.get(nameMaterial) - 250);
                                    finished = true;

                                    break;
                        }
                    }

                } else {
                    if (!junk.containsKey(nameMaterial)) {
                        junk.put(nameMaterial, count);
                        list.remove(0);
                        list.remove(0);
                    } else {
                        junk.put(nameMaterial, junk.get(nameMaterial) + count);
                        list.remove(0);
                        list.remove(0);
                    }
                }

                if (finished) {
                    break;
                }
            }
            if (finished) {
                break;
            }
            input = scanner.nextLine();
        }


        keyMaterials
                .entrySet()
                .stream()
                .sorted(Map.Entry.<String,Integer>comparingByValue().reversed().thenComparing(Map.Entry.comparingByKey()))
                .forEach(e-> System.out.println(e.getKey()+": "+e.getValue()));

        junk
                .entrySet()
                .stream()
                .sorted(Map.Entry.<String,Integer>comparingByKey())
                .forEach(e-> System.out.println(e.getKey()+": "+e.getValue()));

    }
}