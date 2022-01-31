package Advanced.L06DefiningClasses.Exercise.T05CarSalesman;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Engine> mapEngines = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            Engine engine = null;
            String engineName = tokens[0];
            int power = Integer.parseInt(tokens[1]);
            Integer displacement = null;
            String efficiency = null;
            if (tokens.length == 2) {
                engine = new Engine(engineName, power);

            } else if (tokens.length == 3) {
                try {
                    displacement = Integer.parseInt(tokens[2]);
                    engine = new Engine(engineName, power, displacement);
                } catch (Exception e) {
                    efficiency = tokens[2];
                    engine = new Engine(engineName, power, efficiency);

                }
            } else if (tokens.length == 4) {
                displacement = Integer.parseInt(tokens[2]);
                efficiency = tokens[3];
                engine = new Engine(engineName, power, displacement, efficiency);

            }

            mapEngines.put(engineName, engine);
        }

        int m = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < m; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String modelCar = tokens[0];
            Engine engine = mapEngines.get(tokens[1]);
            Car car = null;
            Integer weight = null;
            String color = null;
            if (tokens.length == 2) {
                car = new Car(modelCar, engine);
            } else if (tokens.length == 3) {
                try {
                    weight = Integer.parseInt(tokens[2]);
                    car = new Car(modelCar, engine, weight);
                } catch (Exception e) {
                    color = tokens[2];
                    car = new Car(modelCar, engine, color);

                }
            } else if (tokens.length == 4) {
                weight = Integer.parseInt(tokens[2]);
                color = tokens[3];
                car = new Car(modelCar, engine, weight, color);

            }
            System.out.println(car);
        }
    }
}
