package OOP.L13EXAM_PREP.christmasRaces.repositories;

import OOP.L13EXAM_PREP.christmasRaces.entities.cars.Car;
import OOP.L13EXAM_PREP.christmasRaces.repositories.interfaces.Repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CarRepository implements Repository<Car> {
    private List<Car> models;

    public CarRepository() {
        this.models = new ArrayList<>();
    }

    @Override
    public Car getByName(String name) {
        return models.stream().filter(e -> e.getModel().equals(name)).findFirst().orElse(null);
    }

    @Override
    public Collection<Car> getAll() {
        return this.models;
    }

    @Override
    public void add(Car model) {
        if (model != null) {
            this.models.add(model);
        }
    }

    @Override
    public boolean remove(Car model) {

            return this.models.remove(model);

    }
}
