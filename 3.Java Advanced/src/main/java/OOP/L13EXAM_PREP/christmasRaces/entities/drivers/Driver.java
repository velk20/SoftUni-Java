package OOP.L13EXAM_PREP.christmasRaces.entities.drivers;

import OOP.L13EXAM_PREP.christmasRaces.entities.cars.Car;

public interface Driver {
    String getName();

    Car getCar();

    int getNumberOfWins();

    void addCar(Car car);

    void winRace();

    boolean getCanParticipate();
}
