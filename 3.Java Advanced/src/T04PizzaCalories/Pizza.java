package T04PizzaCalories;

import java.util.List;

public class Pizza {
    private String name;
    private Dough dough;

    private List<Topping> toppingList;

    public Pizza(String name,int numberOfToppings) {
        this.name = name;
    }

    public void setName(String name) {
        if (!name.trim().isEmpty() && name.length() <= 15) {
            this.name = name;
        }else throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    private void setToppings(int number) {
        if (number >= 0 && number <= 10) {

        } else throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
    }
}
