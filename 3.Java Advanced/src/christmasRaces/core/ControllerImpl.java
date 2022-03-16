package christmasRaces.core;

import christmasRaces.core.interfaces.Controller;
import christmasRaces.entities.cars.BaseCar;
import christmasRaces.entities.cars.Car;
import christmasRaces.entities.cars.MuscleCar;
import christmasRaces.entities.cars.SportsCar;
import christmasRaces.entities.drivers.Driver;
import christmasRaces.entities.drivers.DriverImpl;
import christmasRaces.entities.races.Race;
import christmasRaces.entities.races.RaceImpl;
import christmasRaces.repositories.CarRepository;
import christmasRaces.repositories.DriverRepository;
import christmasRaces.repositories.RaceRepository;
import christmasRaces.repositories.interfaces.Repository;

import java.util.*;
import java.util.stream.Collectors;

public class ControllerImpl implements Controller {
    private Repository<Driver> driverRepository;
    private Repository<Car> carRepository;
    private Repository<Race> raceRepository;

    public ControllerImpl(Repository<Driver> driverRepository,
                          Repository<Car> carRepository, Repository<Race> raceRepository) {
        this.driverRepository = driverRepository;
        this.carRepository = carRepository;
        this.raceRepository = raceRepository;
    }

    @Override
    public String createDriver(String driver) {
        Driver newDriver = new DriverImpl(driver);
        Driver byName = this.driverRepository.getByName(driver);
        if (byName != null) {

            throw new IllegalArgumentException(String.format("Driver %s is already created.", driver));
        } else {
            this.driverRepository.add(newDriver);
            return String.format("Driver %s is created.", driver);
        }
    }

    @Override
    public String createCar(String type, String model, int horsePower) {
        Car newCar = null;
        if (type.equals("Muscle")) {
            newCar = new MuscleCar(model, horsePower);
        } else if (type.equals("Sports")) {
            newCar = new SportsCar(model, horsePower);
        }

        Car byName = this.carRepository.getByName(model);

        if (byName != null) {
            throw new IllegalArgumentException(String.format("Car %s is already created.", model));
        } else {
            this.carRepository.add(newCar);
            return String.format("%s %s is created.", type + "Car", model);
        }
    }

    @Override
    public String addCarToDriver(String driverName, String carModel) {
        Driver driver = this.driverRepository.getByName(driverName);
        Car car = this.carRepository.getByName(carModel);
        if (driver == null) {
            throw new IllegalArgumentException(String.format("Driver %s could not be found.", driverName));
        } else if (car == null) {
            throw new IllegalArgumentException(String.format("Car %s could not be found.", carModel));
        } else {
            driver.addCar(car);
            return String.format("Driver %s received car %s.", driver.getName(), car.getModel());
        }



    }

    @Override
    public String addDriverToRace(String raceName, String driverName) {
        Race race = this.raceRepository.getByName(raceName);
        Driver driver = this.driverRepository.getByName(driverName);

        if (race == null) {
            throw new IllegalArgumentException(String.format("Race %s could not be found.", raceName));
        } else if (driver == null) {
            throw new IllegalArgumentException(String.format("Driver %s could not be found.", driverName));
        } else {
            race.addDriver(driver);
            return String.format("Driver %s added in %s race.", driver.getName(), race.getName());
        }
    }

    @Override
    public String startRace(String raceName) {
        Race currentRaces = this.raceRepository.getByName(raceName);

        if (currentRaces == null) {
            throw new IllegalArgumentException(String.format("Race %s could not be found.", raceName));
        } else if (currentRaces.getDrivers().size() < 3) {
            throw new IllegalArgumentException(String.format("Race %s cannot start with less than 3 participants.",
                    raceName));
        } else {
            Collection<Driver> drivers = currentRaces.getDrivers();
            Map<String, Car> carMap = new LinkedHashMap<>();
            for (Driver driver : drivers) {
                carMap.put(driver.getName(), driver.getCar());
            }

            LinkedHashMap<String, Car> collect = carMap.entrySet().stream()
                    .sorted((e1, e2) ->
                            Double.compare(e2.getValue().calculateRacePoints(currentRaces.getLaps())
                                    , e1.getValue().calculateRacePoints(currentRaces.getLaps())))
                    .limit(3)
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                            (e1, e2) -> e1, LinkedHashMap::new));

            StringBuilder stringBuilder = new StringBuilder();
            Iterator<Map.Entry<String, Car>> iterator = collect.entrySet().iterator();

            stringBuilder.append(String.format("Driver %s wins %s race.",
                    iterator.next().getKey(), currentRaces.getName())).append(System.lineSeparator());
            stringBuilder.append(String.format("Driver %s is second in %s race.",
                    iterator.next().getKey(), currentRaces.getName())).append(System.lineSeparator());
            stringBuilder.append(String.format("Driver %s is third in %s race.",
                    iterator.next().getKey(), currentRaces.getName())).append(System.lineSeparator());
            return stringBuilder.toString();
        }

    }

    @Override
    public String createRace(String name, int laps) {
        Race race = new RaceImpl(name, laps);
        if (this.raceRepository.getByName(name) == null) {
            this.raceRepository.add(race);
            return String.format("Race %s is created.", name);
        }
        throw new IllegalArgumentException(String.format("Race %s is already created.", name));
    }
}
