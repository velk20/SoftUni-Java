package Advanced.L10EXAMS.JavaAdvancedExam28June2020.parking;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Parking {
    private List<Car> data;
    private String type;
    private int capacity;

    public Parking(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public void add(Car car) {
        if (this.data.size() < this.capacity) {
            this.data.add(car);
        }
    }

    public boolean remove(String manufacturer, String model) {
        for (Car datum : data) {
            if (datum.getManufacturer().equals(manufacturer) &&
                    datum.getModel().equals(model)) {
                this.data.remove(datum);
                return true;
            }
        }
        return false;
    }

    //TODO Check if it return right
    public Car getLatestCar() {
        return this.data.stream().max(Comparator.comparing(Car::getYear)).orElse(null);
    }

    //TODO Check if it return right
    public Car getCar(String manufacturer, String model) {
        return this.data.stream().filter(e -> e.getManufacturer().equals(manufacturer) && e.getModel().equals(model)).findAny().orElse(null);
    }

    public int getCount() {
        return this.data.size();
    }

    public String getStatistics() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(String.format("The cars are parked in %s:", this.type)).append(System.lineSeparator());
        for (Car datum : data) {
            stringBuilder.append(datum.toString()).append(System.lineSeparator());
        }
        return stringBuilder.toString();
    }




}
