package OOP.L13EXAM_PREP.christmasRaces;

import OOP.L13EXAM_PREP.christmasRaces.core.ControllerImpl;
import OOP.L13EXAM_PREP.christmasRaces.core.EngineImpl;
import OOP.L13EXAM_PREP.christmasRaces.core.interfaces.Controller;
import OOP.L13EXAM_PREP.christmasRaces.entities.cars.Car;
import OOP.L13EXAM_PREP.christmasRaces.entities.drivers.Driver;
import OOP.L13EXAM_PREP.christmasRaces.entities.races.Race;
import OOP.L13EXAM_PREP.christmasRaces.io.ConsoleReader;
import OOP.L13EXAM_PREP.christmasRaces.io.ConsoleWriter;
import OOP.L13EXAM_PREP.christmasRaces.repositories.CarRepository;
import OOP.L13EXAM_PREP.christmasRaces.repositories.DriverRepository;
import OOP.L13EXAM_PREP.christmasRaces.repositories.RaceRepository;
import OOP.L13EXAM_PREP.christmasRaces.repositories.interfaces.Repository;

public class Main {
    public static void main(String[] args) {
        Repository<Car> carRepository = new CarRepository();
        Repository<Race> raceRepository = new RaceRepository();
        Repository<Driver> driverRepository = new DriverRepository();

        Controller controller = new ControllerImpl(driverRepository, carRepository, raceRepository);

        ConsoleReader reader = new ConsoleReader();
        ConsoleWriter writer = new ConsoleWriter();
        EngineImpl engine = new EngineImpl(reader, writer, controller);
        engine.run();
    }
}
