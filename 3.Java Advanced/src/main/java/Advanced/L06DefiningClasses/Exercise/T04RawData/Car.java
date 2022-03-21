package Advanced.L06DefiningClasses.Exercise.T04RawData;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String model;
    private Engine engine;
    private Cargo cargo;
    private List<Tire> tireList;

    public Car(String model, Engine engine, Cargo cargo) {
        this.model = model;
        this.engine = engine;
        this.cargo = cargo;
        tireList = new ArrayList<>();
    }

    public List<Tire> getTireList() {
        return tireList;
    }

    public void setTireList(List<Tire> tireList) {
        this.tireList = tireList;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
}
