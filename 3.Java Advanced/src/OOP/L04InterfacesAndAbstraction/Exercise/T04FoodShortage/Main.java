package OOP.L04InterfacesAndAbstraction.Exercise.T04FoodShortage;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Buyer> buyerMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            if (tokens.length == 4) {
                buyerMap.put(tokens[0],new Citizen(tokens[0], Integer.parseInt(tokens[1]), tokens[2], tokens[3]));
            } else if (tokens.length == 3) {
                buyerMap.put(tokens[0], new Rebel(tokens[0], Integer.parseInt(tokens[1]), tokens[2]));
            }
        }

        String name = scanner.nextLine();
        while (!name.equals("End")) {
            if (buyerMap.containsKey(name)) {
                buyerMap.get(name).buyFood();
            }
            name = scanner.nextLine();
        }

        Integer collect = buyerMap.values().stream().mapToInt(Buyer::getFood).sum();
        System.out.println(collect);
    }
}
