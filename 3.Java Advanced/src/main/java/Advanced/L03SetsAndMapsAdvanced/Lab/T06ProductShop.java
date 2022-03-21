package Advanced.L03SetsAndMapsAdvanced.Lab;

import java.util.*;

public class T06ProductShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Map<String, Double>> storesMap = new TreeMap<>();

        String input = scanner.nextLine();
        while (!input.equals("Revision")) {
            String[] tokens = input.split(", ");
            String storeName = tokens[0];
            String productName = tokens[1];
            double priceProduct = Double.parseDouble(tokens[2]);

            if (!storesMap.containsKey(storeName)) {
                Map<String, Double> map = new LinkedHashMap<>();
                map.put(productName, priceProduct);
                storesMap.put(storeName, map);
            } else {
                Map<String, Double> map = storesMap.get(storeName);
                map.put(productName, priceProduct);
                storesMap.put(storeName, map);
            }

            input = scanner.nextLine();
        }

        storesMap.entrySet().stream().forEach( e->
                {
            System.out.println(e.getKey()+"->");
            Map<String, Double> map = e.getValue();
            for (Map.Entry<String, Double> entry : map.entrySet()) {
                System.out.printf("Product: %s, Price: %.1f\n", entry.getKey(), entry.getValue());
            }
                }


        );
    }
}
