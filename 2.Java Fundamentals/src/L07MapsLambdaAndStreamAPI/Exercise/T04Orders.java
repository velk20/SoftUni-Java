package L07MapsLambdaAndStreamAPI.Exercise;

import java.util.*;

public class T04Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Map<Double, Integer>> map = new LinkedHashMap<>();
        String input = scanner.nextLine();

        while (!input.equals("buy")) {
            String[] product = input.split(" ");
            String name = product[0];
            double price = Double.parseDouble(product[1]);
            int quantity = Integer.parseInt(product[2]);
            if (!map.containsKey(name)) {
                Map<Double, Integer> newMap = new LinkedHashMap<>();
                newMap.put(price, quantity);
                map.put(name, newMap);
            } else {
                Map<Double, Integer> newMap = map.get(name);
                for (Map.Entry<Double, Integer> entry : newMap.entrySet()) {
                    if (entry.getKey() != price) {
                        int oldQuantity = entry.getValue();
                        newMap.remove(entry.getKey());
                        newMap.put(price, quantity + oldQuantity);
                        map.put(name, newMap);
                    }
                }
            }

            input = scanner.nextLine();

        }

        for (Map.Entry<String, Map<Double, Integer>> stringMapEntry : map.entrySet()) {
            String name = stringMapEntry.getKey();
            Map<Double, Integer> qwe = stringMapEntry.getValue();
            for (Map.Entry<Double, Integer> doubleIntegerEntry : qwe.entrySet()) {

                System.out.printf("%s -> %.2f\n", name, doubleIntegerEntry.getKey() * doubleIntegerEntry.getValue());
            }
        }
    }
}
