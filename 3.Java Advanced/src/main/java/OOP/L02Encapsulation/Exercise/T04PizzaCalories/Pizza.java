package OOP.L02Encapsulation.Exercise.T04PizzaCalories;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String name;
    private Dough dough;
    private List<Topping> toppingList;

    public Pizza(String name,int numberOfToppings) {
        this.setName(name);
        this.setToppings(numberOfToppings);

    }

    private void setName(String name) {
        if (name.trim().length() >= 1 && name.trim().length() <= 15) {
            this.name = name;
        }else throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    private void setToppings(int number) {
        if (number >= 0 && number <= 10) {
            this.toppingList = new ArrayList<>(number);
        } else throw new IllegalArgumentException("Number of toppings should be in range [0." +
                ".10].");
    }

    public String getName() {
        return name;
    }

    public void addTopping(Topping topping) {

            this.toppingList.add(topping);

    }

    public double getOverallCalories () {
        double sumOfCalories = 0.0;
        sumOfCalories += this.dough.calculateCalories();
        for (Topping topping : toppingList) {
            sumOfCalories += topping.calculateCalories();
        }

        return sumOfCalories;
    }
}
