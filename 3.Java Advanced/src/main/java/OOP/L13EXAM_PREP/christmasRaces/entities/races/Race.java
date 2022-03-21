package OOP.L13EXAM_PREP.christmasRaces.entities.races;

import OOP.L13EXAM_PREP.christmasRaces.entities.drivers.Driver;

import java.util.Collection;

public interface Race {
    String getName();

    int getLaps();

    Collection<Driver> getDrivers();

    void addDriver(Driver driver);
}
