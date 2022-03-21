package OOP.L02Encapsulation.Exercise.T04PizzaCalories;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] pizza = scanner.nextLine().split("\\s+");
        Pizza pizza1 = new Pizza(pizza[1], Integer.parseInt(pizza[2]));
        pizza = scanner.nextLine().split("\\s+");
        Dough dough = new Dough(pizza[1], pizza[2], Double.parseDouble(pizza[3]));
        pizza1.setDough(dough);
        String string = scanner.nextLine();
        while (!string.equals("END")) {
            String[] tokens = string.split("\\s+");
            Topping topping = new Topping(tokens[1], Double.parseDouble(tokens[2]));
            pizza1.addTopping(topping);
            string = scanner.nextLine();
        }

        System.out.printf("%s - %.2f", pizza1.getName(), pizza1.getOverallCalories());
    }
}