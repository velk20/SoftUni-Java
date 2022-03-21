package Advanced.L03SetsAndMapsAdvanced.Lab;

import java.util.*;

public class T07CitiebyContinentandCountry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Map<String, ArrayList<String>>> map = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String continent = tokens[0];
            String country = tokens[1];
            String city = tokens[2];

            if (!map.containsKey(continent)) {
                ArrayList<String> list = new ArrayList<>();
                list.add(city);
                Map<String, ArrayList<String>> map1 = new LinkedHashMap<>();
                map1.put(country, list);
                map.put(continent, map1);
            } else {
                Map<String, ArrayList<String>> map1 = map.get(continent);
                if (!map1.containsKey(country)) {
                    ArrayList<String> list = new ArrayList<>();
                    list.add(city);
                    map1.put(country, list);
                    map.put(continent, map1);
                } else {
                    ArrayList<String> list = map1.get(country);
                    list.add(city);
                    map1.put(country, list);
                    map.put(continent, map1);
                }
            }
        }

        map.entrySet().stream().forEach(
                e->{
                    System.out.println(e.getKey()+":");
                    Map<String, ArrayList<String>> map1 = e.getValue();
                    for (Map.Entry<String, ArrayList<String>> entry : map1.entrySet()) {
                        System.out.printf("  %s -> ", entry.getKey());
                        System.out.println(String.join(", ", entry.getValue()));
                    }

                }
        );
    }
}
