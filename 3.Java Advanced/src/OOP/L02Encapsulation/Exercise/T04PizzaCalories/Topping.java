package OOP.L02Encapsulation.Exercise.T04PizzaCalories;

public class Topping {
    private String toppingType;//meat, veggies, cheese, or sauce.
    private double weight;

    public Topping(String toppingType, double weight) {
        this.setToppingType(toppingType);
        this.setWeight(weight);

    }
//"Cannot place {name of invalid argument} on top of your pizza."
    private void setToppingType(String toppingType) {
        if (toppingType.equals("Meat") || toppingType.equals("Veggies") || toppingType.equals("Cheese") || toppingType.equals("Sauce")) {
            this.toppingType = toppingType;

        } else throw new IllegalArgumentException(String.format("Cannot place %s on top of your pizza.", toppingType));
    }

    private void setWeight(double weight) {
        if (weight >= 1 && weight <= 50) {
            this.weight = weight;

        } else
            throw new IllegalArgumentException(String.format("%s weight should be in the range [1..50].", this.toppingType));
    }

    public double calculateCalories() {
        ToppingsModifiers toppingsModifiers = ToppingsModifiers.valueOf(this.toppingType);
        return 2 * this.weight * toppingsModifiers.getModifier();
    }
}
