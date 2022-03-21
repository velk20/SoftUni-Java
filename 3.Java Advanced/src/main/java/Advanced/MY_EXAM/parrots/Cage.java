package Advanced.MY_EXAM.parrots;

import java.util.ArrayList;
import java.util.List;

public class Cage {
    private String name;
    private int capacity;
    private List<Parrot> data;

    public Cage(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void add(Parrot parrot) {
        if (this.data.size() < this.capacity) {
            data.add(parrot);
        }
    }

    public boolean remove(String name) {
        for (Parrot datum : this.data) {
            if (datum.getName().equals(name)) {
                this.data.remove(datum);
                return true;
            }
        }
        return false;
    }

    public Parrot sellParrot(String name) {
        for (Parrot datum : this.data) {
            if (datum.getName().equals(name)) {
                datum.setAvailable(true);
                this.data.remove(datum);
                return datum;
            }
        }
        return null;
    }

    public List<Parrot> sellParrotBySpecies(String species) {
        List<Parrot> speciessssss = new ArrayList<>();
        for (int i = 0; i < data.size(); i++) {
            Parrot parrot = data.get(i);
            if (parrot.getSpecies().equals(species)) {
                speciessssss.add(parrot);
                this.data.remove(parrot);
                i--;
            }
        }
        return speciessssss;
    }

    public int count() {
        return this.data.size();
    }

    public String report() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(String.format("Parrots available at %s:", this.name)).append(System.lineSeparator());
        for (Parrot datum : data) {
            stringBuilder.append(datum.toString()).append(System.lineSeparator());

        }
        return stringBuilder.toString();
    }

}
