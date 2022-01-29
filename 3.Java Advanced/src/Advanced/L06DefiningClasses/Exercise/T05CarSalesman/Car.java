package Advanced.L06DefiningClasses.Exercise.T05CarSalesman;

public class Car {
    private String model;
    private Engine engine;
    private int weight;//optional
    private String color;//optional

    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
        this.weight = -1;
        this.color = "n/a";
    }

    public Car(String model, Engine engine,int weight) {
        this.model = model;
        this.engine = engine;
        this.weight = weight;
        this.color = "n/a";
    }

    public Car(String model, Engine engine,String color) {
        this.model = model;
        this.engine = engine;
        this.color = color;
        this.weight = -1;
    }

    public Car(String model, Engine engine, int weight, String color) {
        this.model = model;
        this.engine = engine;
        this.weight = weight;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("%s:\n"+this.engine+"Weight: %s\nColor: %s",this.model,(isMinusOne(weight)?"n/a":
                String.valueOf(weight)),this.color);
    }

    public boolean isMinusOne(int a) {
        return a==-1;
    }
}
