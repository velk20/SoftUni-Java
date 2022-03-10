package OOP.L05Polymorphism.Exercise.T02VehiclesExtension;

public class Car extends BaseVehicle {
    private static final double AIR_CONDITIONER_CONSUMPTION =0.9;


    public Car(double fuelQuantity, double litersPerKM, double tankCapacity) {
        super(fuelQuantity, litersPerKM + AIR_CONDITIONER_CONSUMPTION, tankCapacity);
    }
}
