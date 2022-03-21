package OOP.L02Encapsulation.Exercise.T04PizzaCalories;

public class Dough {
    private String flourType;//white or wholegrain
    private String bakingTechnique;//crispy,chewy,homemade
    private double weight;

    public Dough(String flourType, String bakingTechnique, double weight) {
        this.setFlourType(flourType);
        this.setBakingTechnique(bakingTechnique);
        this.setWeight(weight);

    }

    private void setFlourType(String flourType) {
        if (flourType.equals("White") || flourType.equals("Wholegrain")) {
            this.flourType = flourType;
        }else throw new IllegalArgumentException("Invalid type of dough.");

    }

    private void setBakingTechnique(String bakingTechnique) {
        if (bakingTechnique.equals("Crispy") || bakingTechnique.equals("Chewy") || bakingTechnique.equals("Homemade")) {
            this.bakingTechnique = bakingTechnique;
        } else throw new IllegalArgumentException("Invalid bakingTechnique of dough.");
    }

    private void setWeight(double weight) {
        if (weight >= 1 && weight <= 200) {
            this.weight = weight;
        }else throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
    }

    public double calculateCalories() {
        DoughModifiers flourTypeModifier = DoughModifiers.valueOf(this.flourType);
        DoughModifiers bakingTechniqueModifier = DoughModifiers.valueOf(this.bakingTechnique);

        return (2 * this.weight) * flourTypeModifier.getModifier() * bakingTechniqueModifier.getModifier();
    }
}
