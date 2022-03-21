package OOP.L05Polymorphism.Exercise.T01Vehicles;

import java.text.DecimalFormat;

public class Truck extends Vehicle{
    public Truck(Double fuelQuantity, Double litersPerKM) {
        super(fuelQuantity, litersPerKM+1.6);
    }

    @Override
    protected void refuel(double liters) {
        liters = liters * 0.95;
        super.setFuelQuantity(super.getFuelQuantity() + liters);

    }

    @Override
    protected void drive(double km) {
        DecimalFormat decimalFormat = new DecimalFormat("0.##");
        double needFuelForDrive = km * super.getLitersPerKM();
        if (super.getFuelQuantity() >= needFuelForDrive) {
            super.setFuelQuantity(super.getFuelQuantity() - needFuelForDrive);
            System.out.printf("Truck travelled %s km\n",decimalFormat.format(km));
        }else System.out.println("Truck needs refueling");

    }
}
