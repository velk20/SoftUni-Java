package Advanced.L06DefiningClasses.Exercise.T04RawData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Car> cars = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String model = tokens[0];
            int speed = Integer.parseInt(tokens[1]);
            int power = Integer.parseInt(tokens[2]);
            int weight = Integer.parseInt(tokens[3]);
            String type = tokens[4];
            double tire1Pressure = Double.parseDouble(tokens[5]);
            int tire1Age = Integer.parseInt(tokens[6]);
            double tire2Pressure = Double.parseDouble(tokens[7]);
            int tire2Age = Integer.parseInt(tokens[8]);
            double tire3Pressure = Double.parseDouble(tokens[9]);
            int tire3Age = Integer.parseInt(tokens[10]);
            double tire4Pressure = Double.parseDouble(tokens[11]);
            int tire4Age = Integer.parseInt(tokens[12]);

            Engine engine = new Engine(speed, power);
            Cargo cargo = new Cargo(weight, type);
            Tire tire1 = new Tire(tire1Pressure, tire1Age);
            Tire tire2 = new Tire(tire2Pressure, tire2Age);
            Tire tire3 = new Tire(tire3Pressure, tire3Age);
            Tire tire4 = new Tire(tire4Pressure, tire4Age);
            List<Tire> tireList = List.of(tire1, tire2, tire3, tire4);
            Car car = new Car(model, engine, cargo);
            car.getTireList().addAll(tireList);
            cars.add(car);
        }

        String string = scanner.nextLine();

        if (string.equals("fragile")) {
            for (Car car : cars) {
                if (car.getCargo().getType().equals("fragile")) {
                    List<Tire> tireList = car.getTireList();
                    for (Tire tire : tireList) {
                        if (tire.getPressure() < 1) {
                            System.out.println(car.getModel());
                            break;
                        }
                    }
                }
            }
        } else {
            for (Car car : cars) {
                if (car.getEngine().getPower() > 250) {
                    System.out.println(car.getModel());
                }
            }
        }
    }
}

