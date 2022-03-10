package OOP.L05Polymorphism.Exercise.T01Vehicles;

public abstract class Vehicle {
    private Double fuelQuantity;
    private Double litersPerKM;

    public Vehicle(Double fuelQuantity, Double litersPerKM) {
        this.fuelQuantity = fuelQuantity;
        this.litersPerKM = litersPerKM;
    }

    public Double getFuelQuantity() {
        return fuelQuantity;
    }

    public Double getLitersPerKM() {
        return litersPerKM;
    }

    public void setFuelQuantity(Double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    public void setLitersPerKM(Double litersPerKM) {
        this.litersPerKM = litersPerKM;
    }

    protected abstract void refuel(double liters);
    protected abstract void drive(double km);

    @Override
    public String toString(){
        return String.format("%s: %.2f", this.getClass().getSimpleName(), this.getFuelQuantity());
    }
}
