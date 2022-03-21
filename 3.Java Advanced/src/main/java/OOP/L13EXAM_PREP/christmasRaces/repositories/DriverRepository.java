package OOP.L13EXAM_PREP.christmasRaces.repositories;

import OOP.L13EXAM_PREP.christmasRaces.entities.drivers.Driver;
import OOP.L13EXAM_PREP.christmasRaces.repositories.interfaces.Repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class DriverRepository implements Repository<Driver> {

    private List<Driver> models;

    public DriverRepository() {
        this.models = new ArrayList<>();
    }

    @Override
    public Driver getByName(String name) {
        return models.stream().filter(e -> e.getName().equals(name)).findFirst().orElse(null);
    }

    @Override
    public Collection<Driver> getAll() {
        return this.models;
    }

    @Override
    public void add(Driver model) {
        if (model != null) {
            this.models.add(model);
        }
    }

    @Override
    public boolean remove(Driver model) {
        return this.models.remove(model);
    }
}
