package T04PizzaCalories;

public class Topping {
    private String toppingType;//meat, veggies, cheese, or sauce.
    private double weight;

    public Topping(String toppingType, double weight) {
        this.setToppingType(toppingType);
        this.setWeight(weight);

    }
//"Cannot place {name of invalid argument} on top of your pizza."
    private void setToppingType(String toppingType) {
        if (toppingType.equals("meat") || toppingType.equals("veggies") || toppingType.equals("cheese") || toppingType.equals("sauce")) {
            this.toppingType = toppingType;

        } else throw new IllegalArgumentException(String.format("Cannot place %s on top of your pizza.", toppingType));
    }

    private void setWeight(double weight) {
        if (weight >= 1 && weight <= 50) {
            this.weight = weight;

        } else
            throw new IllegalArgumentException(String.format("%s weight should be in the range [1..50].", this.toppingType));
    }

//    public double calculateCalories() {
//
//    }
}
