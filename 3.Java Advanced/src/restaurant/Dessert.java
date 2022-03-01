package restaurant;

import java.math.BigDecimal;

public class Dessert extends Food{
    private double calories;
    public Dessert(String name, BigDecimal price, double grams) {

        super(name, price, grams);
    }

    public double getCalories() {
        return calories;
    }
}
