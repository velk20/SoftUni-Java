package OOP.L05Polymorphism.Exercise.T02VehiclesExtension;

import java.text.DecimalFormat;

public abstract class BaseVehicle implements Vehicle {
    private double fuelQuantity;
    private double litersPerKM;
    private double tankCapacity;

    public BaseVehicle(double fuelQuantity, double litersPerKM, double tankCapacity) {
        this.fuelQuantity = fuelQuantity;
        this.litersPerKM = litersPerKM;
        this.tankCapacity = tankCapacity;
    }

    public double getFuelQuantity() {
        return fuelQuantity;
    }

    public void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    public double getLitersPerKM() {
        return litersPerKM;
    }

    public void setLitersPerKM(double litersPerKM) {
        this.litersPerKM = litersPerKM;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public void setTankCapacity(double tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    @Override
    public String drive(double distance) {
        double neededFuel = this.litersPerKM * distance;
        if (neededFuel > this.fuelQuantity) {

            return String.format("%s needs refueling", this.getClass().getSimpleName());
        } else if (neededFuel == this.fuelQuantity) {
            return "Fuel must be a positive number";
        }
        this.fuelQuantity = this.fuelQuantity - neededFuel;
        DecimalFormat decimalFormat = new DecimalFormat("0.##");

        return String.format("%s travelled %s km", this.getClass().getSimpleName(), decimalFormat.format(distance));
    }

    @Override
    public void refuel(double liters) {
        if (liters <= 0) {
            System.out.println("Fuel must be a positive number");
            return;
        }

        if (this.getFuelQuantity() + liters > this.getTankCapacity()) {
            System.out.println("Cannot fit fuel in tank" );
            return;
        }
        this.fuelQuantity += liters;
    }

    @Override
    public String toString(){
        return String.format("%s: %.2f", this.getClass().getSimpleName(), this.getFuelQuantity());
    }
}
