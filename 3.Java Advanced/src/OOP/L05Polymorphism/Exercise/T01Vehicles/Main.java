package OOP.L05Polymorphism.Exercise.T01Vehicles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] vehicle = scanner.nextLine().split("\\s+");
        Car car = new Car(Double.parseDouble(vehicle[1]), Double.parseDouble(vehicle[2]));
        vehicle = scanner.nextLine().split("\\s+");
        Truck truck = new Truck(Double.parseDouble(vehicle[1]), Double.parseDouble(vehicle[2]));

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String command = tokens[0];
            String type = tokens[1];
            Double distanceOrNumber = Double.parseDouble(tokens[2]);

            if (type.equals("Car")) {

                switch (command) {
                    case "Drive":
                        car.drive(distanceOrNumber);
                        break;
                    case "Refuel":
                        car.refuel(distanceOrNumber);
                        break;
                }
            } else {
                switch (command) {
                    case "Drive":
                        truck.drive(distanceOrNumber);
                        break;

                    case "Refuel":
                        truck.refuel(distanceOrNumber);
                        break;
                }
            }
        }


        System.out.println(car);
        System.out.println(truck);
    }
}
