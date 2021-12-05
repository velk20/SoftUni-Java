package L11FINAL_EXAMS.T03;

import java.util.*;

public class NeedForSpeedWithClasses {
    private static class Car{
        private String name;
        private int mileage;
        private int fuel;

        public Car(String name, int mileage, int fuel) {
            this.name = name;
            this.mileage = mileage;
            this.fuel = fuel;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getMileage() {
            return mileage;
        }

        public void setMileage(int mileage) {
            this.mileage = mileage;
        }

        public int getFuel() {
            return fuel;
        }

        public void setFuel(int fuel) {
            this.fuel = fuel;
        }
    }


    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\|");
            String name = tokens[0];
            int mile = Integer.parseInt(tokens[1]);
            int fuel = Integer.parseInt(tokens[2]);
            carList.add(new Car(name, mile, fuel));
        }

        String input = scanner.nextLine();
        while (!input.equals("Stop")) {
            String[] tokens = input.split(" : ");
            String command = tokens[0];

            if (command.equals("Drive")) {
                String carName = tokens[1];
                int distance = Integer.parseInt(tokens[2]);
                int fuel = Integer.parseInt(tokens[3]);

                Car car = getCar(carName, carList);
                int indexOfCar = carList.indexOf(car);
                int currentMile = car.getMileage();
                int currentFuel = car.getFuel();
                if (currentFuel- fuel >= 0) {
                    carList.get(indexOfCar).setFuel(currentFuel-fuel);
                    carList.get(indexOfCar).setMileage(currentMile + distance);
                    System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.\n",carName,distance,fuel);
                } else {
                    System.out.printf("Not enough fuel to make that ride\n");
                }

                if (carList.get(indexOfCar).getMileage() >= 100000) {
                    carList.remove(indexOfCar);
                    System.out.printf("Time to sell the %s!\n",carName);
                }

            } else if (command.equals("Refuel")) {
                String carName = tokens[1];
                int fuel = Integer.parseInt(tokens[2]);

                Car car = getCar(carName, carList);
                int indexOfCar = carList.indexOf(car);
                int currentFuel = car.getFuel();

                if (currentFuel + fuel >= 75) {
                    carList.get(indexOfCar).setFuel(75);
                    System.out.printf("%s refueled with %d liters\n", carName, 75 - currentFuel);
                } else {
                    carList.get(indexOfCar).setFuel(currentFuel + fuel);
                    System.out.printf("%s refueled with %d liters\n", carName, fuel);

                }
            } else if (command.equals("Revert")) {
                String carName = tokens[1];
                int kilometers = Integer.parseInt(tokens[2]);

                Car car = getCar(carName, carList);
                int indexOfCar = carList.indexOf(car);
                int currentMile = car.getMileage();

                if (currentMile - kilometers < 10000) {
                    carList.get(indexOfCar).setMileage(10000);
                } else {
                    carList.get(indexOfCar).setMileage(currentMile - kilometers);
                    System.out.printf("%s mileage decreased by %d kilometers\n",carName,kilometers);
                }
            }

            input = scanner.nextLine();
        }

carList.sort(Comparator.comparing(Car::getMileage).reversed().thenComparing(Car::getName));
        for (Car car : carList) {
            System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.\n"
                    , car.getName(), car.getMileage(), car.getFuel());
        }
    }

    private static Car getCar(String name, List<Car> carList) {
        for (Car car : carList) {
            if (car.getName().equals(name)) {
                return car;
            }
        }
        return null;
    }
}
