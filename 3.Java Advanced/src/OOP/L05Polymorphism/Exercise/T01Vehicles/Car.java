package OOP.L05Polymorphism.Exercise.T01Vehicles;

import java.text.DecimalFormat;

public class Car extends Vehicle{
    public Car(Double fuelQuantity, Double litersPerKM) {
        super(fuelQuantity, litersPerKM + 0.9);

    }

    @Override
    protected void refuel(double liters) {
        super.setFuelQuantity(super.getFuelQuantity() + liters);
    }

    @Override
    protected void drive(double km) {
        DecimalFormat decimalFormat = new DecimalFormat("0.##");
        double neededFuelForDriving = km * super.getLitersPerKM();
        if (super.getFuelQuantity() >= neededFuelForDriving) {
            super.setFuelQuantity(super.getFuelQuantity() - neededFuelForDriving);
            System.out.printf("Car travelled %s km\n",decimalFormat.format(km));
        }else System.out.println("Car needs refueling");
    }
}
