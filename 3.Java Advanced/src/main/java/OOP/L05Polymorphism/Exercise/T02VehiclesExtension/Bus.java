package OOP.L05Polymorphism.Exercise.T02VehiclesExtension;

public class Bus extends BaseVehicle {
    private final static double BUS_AC_CONSUMPTION = 1.4;

    public Bus(double fuelQuantity, double litersPerKM, double tankCapacity) {
        super(fuelQuantity, litersPerKM+BUS_AC_CONSUMPTION, tankCapacity);
    }


    public String driveEmpty(double distance) {
        this.setLitersPerKM(this.getLitersPerKM() - BUS_AC_CONSUMPTION);
        String drive = super.drive(distance);
        this.setLitersPerKM(this.getLitersPerKM() + BUS_AC_CONSUMPTION);
        return drive;
    }
}
