package Advanced.L06DefiningClasses.Exercise.T03SpeedRacing;

public class Car {
    private String model;
    private double fuelAmount;
    private double fuelCostByKM;
    private int distanceTraveled;

    public Car(String model, double fuelAmount, double fuelCostByKM) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.fuelCostByKM = fuelCostByKM;
        this.distanceTraveled = 0;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getFuelAmount() {
        return fuelAmount;
    }

    public void setFuelAmount(int fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public double getFuelCostByKM() {
        return fuelCostByKM;
    }

    public void setFuelCostByKM(double fuelCostByKM) {
        this.fuelCostByKM = fuelCostByKM;
    }

    public int getDistanceTraveled() {
        return distanceTraveled;
    }

    public void setDistanceTraveled(int distanceTraveled) {
        this.distanceTraveled = distanceTraveled;
    }

    public void travelTime(int distance) {
        if (distance*this.fuelCostByKM <= this.fuelAmount) {
            this.fuelAmount -= (distance*this.fuelCostByKM);
            this.distanceTraveled += distance;
        } else {
            System.out.println("Insufficient fuel for the drive");
        }
    }
}
