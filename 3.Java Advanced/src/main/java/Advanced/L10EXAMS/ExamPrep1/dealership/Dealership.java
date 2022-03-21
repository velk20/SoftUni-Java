package Advanced.L10EXAMS.ExamPrep1.dealership;

import java.util.ArrayList;
import java.util.List;

public class Dealership {
    public String name;
    public int capacity;
    private List<Car> data;

    public Dealership(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public void add(Car car) {
        if (data.size() < capacity) {
            this.data.add(car);
        }
    }

    public boolean buy(String manufacturer, String model) {
        for (Car datum : data) {
            if (datum.getManufacturer().equals(manufacturer) && datum.getModel().equals(model)) {
                this.data.remove(datum);
                return true;
            }
        }
        return false;
    }

    public Car getLatestCar() {
        Car car = null;
        if (this.data.isEmpty()) {
            return car;
        } else {
            car = this.data.get(0);
            for (Car datum : data) {
                if (datum.getYear() > car.getYear()) {
                    car = datum;
                }
            }
            return car;
        }
    }

    public Car getCar(String manufacturer, String model) {
        Car car = null;
        for (Car datum : data) {
            if (datum.getManufacturer().equals(manufacturer) && datum.getModel().equals(model)) {
                car = datum;
                return car;
            }
        }
        return car;
    }

    public int getCount(){
        return this.data.size();
    }

    public String getStatistics() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(String.format("The cars are in a car Advanced.L10EXAMS.ExamPrep1.dealership %s:", this.name)).append(System.lineSeparator());
        for (Car datum : data) {
            stringBuilder.append(datum.toString()).append(System.lineSeparator());
        }

        return stringBuilder.toString();

    }


}
