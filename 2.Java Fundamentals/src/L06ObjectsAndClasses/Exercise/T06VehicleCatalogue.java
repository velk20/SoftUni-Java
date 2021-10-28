package L06ObjectsAndClasses.Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class T06VehicleCatalogue {


    private static class Car {
        String type;
        String model;
        String color;
        int hp;

        public Car(String type,String model, String color, int hp) {
            this.type = type.substring(0, 1).toUpperCase() + type.substring(1);

            this.model = model;
            this.color = color;
            this.hp = hp;
        }

        public String getType() {
            return type;
        }

        public String getColor() {
            return color;
        }

        public String getModel() {
            return model;
        }

        public int getHp() {
            return hp;
        }

        @Override
        public String toString() {
            return String.format("Type: %s\n"+
           "Model: %s\n"+
            "Color: %s\n"+
           "Horsepower: %d",this.type,this.model,this.color,this.hp);
        }


    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Car> carList = new ArrayList<>();

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] tokens = input.split("\\s+");

                Car car = new Car(tokens[0], tokens[1], tokens[2], Integer.parseInt(tokens[3]));
                carList.add(car);


            input = scanner.nextLine();
        }

        String model = scanner.nextLine();
        while (!model.equals("Close the Catalogue")) {

            for (Car car : carList) {
                if (car.getModel().equals(model)) {
                    System.out.println(car);
                }
            }
            model = scanner.nextLine();
        }


        int avrCar = 0;
        avrCar = carList.stream().filter(o -> o.getType().equals("Car")).mapToInt(Car::getHp).sum();
        int avgTruck = 0;
        avgTruck = carList.stream().filter(o->o.getType().equals("Truck")).mapToInt(Car::getHp).sum();

        int countCars = 0;
        countCars = carList.stream().filter(o -> o.getType().equals("Car")).collect(Collectors.toList()).size();
        int countTrucks = 0;
        countTrucks = carList.stream().filter(o -> o.getType().equals("Truck")).collect(Collectors.toList()).size();

        double avg1 = avrCar * 1.0 / countCars;
        if (Double.isNaN(avg1)) {
            System.out.printf("Cars have average horsepower of: 0.00.\n");

        } else {
            System.out.printf("Cars have average horsepower of: %.2f.\n", avg1);

        }


        double avg2 = avgTruck * 1.0 / countTrucks;
        if (Double.isNaN(avg2)) {
            System.out.printf("Trucks have average horsepower of: 0.00.");

        } else{

            System.out.printf("Trucks have average horsepower of: %.2f.", avg2);
        }
    }
}
