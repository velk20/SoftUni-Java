package T04PizzaCalories;

public class Dough {
    private String flourType;//white or wholegrain
    private String bakingTechnique;
    private double weight;

    public Dough(String flourType, String bakingTechnique, double weight) {
        this.setFlourType(flourType);
        this.setBakingTechnique(bakingTechnique);
        this.setWeight(weight);

    }

    private void setFlourType(String flourType) {
        if (flourType.equals("white") || flourType.equals("wholegrain")) {
            this.flourType = flourType;
        }else throw new IllegalArgumentException("Invalid type of dough.");

    }

    private void setBakingTechnique(String bakingTechnique) {
        this.bakingTechnique = bakingTechnique;
    }

    private void setWeight(double weight) {
        if (weight >= 1 && weight <= 200) {
            this.weight = weight;
        }else throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
    }

//    public double calculateCalories() {
//
//    }
}
