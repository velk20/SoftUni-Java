package Advanced.L06DefiningClasses.Exercise.T05CarSalesman;

public class Engine {
    private String model;
    private int power;
    private int displacement;//optional
    private  String efficiency;//optional

    public Engine(String model, int power) {
        this.model = model;
        this.power = power;
        this.displacement = -1;
        this.efficiency = "n/a";
    }

    public Engine(String model, int power, int displacement) {
        this(model, power);
        this.displacement = displacement;
        this.efficiency = "n/a";
    }

    public Engine(String model, int power, String efficiency) {
        this(model, power);
        this.efficiency = efficiency;
        this.displacement = -1;
    }


    public Engine(String model, int power, int displacement, String efficiency) {
        this.model = model;
        this.power = power;
        this.displacement = displacement;
        this.efficiency = efficiency;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getDisplacement() {
        return displacement;
    }

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    public String getEfficiency() {
        return efficiency;
    }

    public void setEfficiency(String efficiency) {
        this.efficiency = efficiency;
    }

    @Override
    public String toString() {
        return String.format("%s:\nPower: %d\nDisplacement: %s\nEfficiency: %s\n", this.model, this.power,
                (isMinusOne(this.displacement) ? "n/a" : String.valueOf(this.displacement)), this.efficiency);
    }

    public boolean isMinusOne(int a) {
        return a==-1;
    }
}
