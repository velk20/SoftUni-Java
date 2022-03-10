package OOP.L05Polymorphism.Exercise.T02VehiclesExtension;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] vehicle = scanner.nextLine().split("\\s+");
        BaseVehicle car = new Car(Double.parseDouble(vehicle[1]), Double.parseDouble(vehicle[2]),
                Double.parseDouble(vehicle[3]));

        vehicle = scanner.nextLine().split("\\s+");
        BaseVehicle truck = new Truck(Double.parseDouble(vehicle[1]), Double.parseDouble(vehicle[2]),
                Double.parseDouble(vehicle[3]));

        vehicle = scanner.nextLine().split("\\s+");
        BaseVehicle bus = new Bus(Double.parseDouble(vehicle[1]), Double.parseDouble(vehicle[2]),
                Double.parseDouble(vehicle[3]));

        Map<String, BaseVehicle> vehicleMap = new LinkedHashMap<>();
        vehicleMap.put("Car", car);
        vehicleMap.put("Truck", truck);
        vehicleMap.put("Bus", bus);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String command = tokens[0];
            String type = tokens[1];
            double distanceOrNumber = Double.parseDouble(tokens[2]);


                switch (command) {
                    case "Drive":
                        System.out.println(vehicleMap.get(type).drive(distanceOrNumber));
                        break;
                    case "Refuel":
                        vehicleMap.get(type).refuel(distanceOrNumber);
                        break;
                    case "DriveEmpty":
                        BaseVehicle baseVehicle = vehicleMap.get(type);
                        Bus myBus = (Bus) baseVehicle;
                        System.out.println(myBus.driveEmpty(distanceOrNumber));
                        break;
                }



        }
        vehicleMap.values().forEach(System.out::println);

    }
}
