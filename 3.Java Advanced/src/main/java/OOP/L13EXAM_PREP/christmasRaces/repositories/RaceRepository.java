package OOP.L13EXAM_PREP.christmasRaces.repositories;

import OOP.L13EXAM_PREP.christmasRaces.entities.races.Race;
import OOP.L13EXAM_PREP.christmasRaces.repositories.interfaces.Repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class RaceRepository implements Repository<Race> {

    private List<Race> models;

    public RaceRepository() {
        this.models = new ArrayList<>();
    }

    @Override
    public Race getByName(String name) {
        return models.stream().filter(e -> e.getName().equals(name)).findFirst().orElse(null);
    }

    @Override
    public Collection<Race> getAll() {
        return this.models;
    }

    @Override
    public void add(Race model) {
        if (model != null) {
            this.models.add(model);
        }
    }

    @Override
    public boolean remove(Race model) {
        return this.models.remove(model);
    }
}
