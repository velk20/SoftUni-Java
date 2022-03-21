package OOP.L05Polymorphism.Exercise.T02VehiclesExtension;

public class Truck extends BaseVehicle{
    private static final double AIR_CONDITIONER_CONSUMPTION = 1.6;
    private static final double REFUELLING_FUEL_HOLE_LOST = 0.95;

    public Truck(double fuelQuantity, double litersPerKM, double tankCapacity) {
        super(fuelQuantity, litersPerKM+AIR_CONDITIONER_CONSUMPTION, tankCapacity);
    }

    @Override
    public void refuel(double liters) {
        super.refuel(liters * REFUELLING_FUEL_HOLE_LOST);
    }
}
