package Advanced.L10EXAMS.JavaAdvancedRetakeExam17Dec2019.christmas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Bag {
    private List<Present> data;
    private String color;
    private int capacity;

    public Bag(String color, int capacity) {
        this.color = color;
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public  String getColor() {
        return this.color;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public int count() {
        return this.data.size();
    }

    public void add(Present present) {
        if (capacity > this.data.size()) {
            this.data.add(present);
        }
    }

    public boolean remove(String name) {
        for (Present datum : this.data) {
            if (datum.getName().equals(name)) {
                this.data.remove(datum);
                return true;
            }
        }
        return false;
    }

    public Present heaviestPresent() {
        return this.data.stream().max(Comparator.comparing(v->v.getWeight())).get();
    }

    public Present getPresent(String name) {
        for (Present datum : data) {
            if (datum.getName().equals(name)) {
                return datum;

            }
        }
        return null;
    }
    public String report() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.color).append(" bag contains:").append(System.lineSeparator());
        for (Present datum : data) {
            stringBuilder.append(datum.toString()).append(System.lineSeparator());
        }
        return stringBuilder.toString();
    }
}
