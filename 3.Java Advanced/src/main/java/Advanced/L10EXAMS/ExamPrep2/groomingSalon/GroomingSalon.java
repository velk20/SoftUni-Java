package Advanced.L10EXAMS.ExamPrep2.groomingSalon;

import java.util.ArrayList;
import java.util.List;

public class GroomingSalon {
    private List<Pet> data;
    private int capacity;

    public GroomingSalon(int capacity) {
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public void add(Pet pet) {
        if (data.size() < capacity) {
            this.data.add(pet);
        }
    }

    public boolean remove(String name) {
        for (Pet datum : data) {
            if (datum.getName().equals(name)) {
                this.data.remove(datum);
                return true;
            }
        }
        return false;

    }

    public Pet getPet(String name, String owner) {
        Pet myPet = null;
        for (Pet datum : data) {
            if (datum.getName().equals(name) && datum.getOwner().equals(owner)) {
                myPet = datum;
                return myPet;
            }
        }
        return null;
    }

    public int getCount(){
        return this.data.size();
    }

    public String getStatistics(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("The grooming salon has the following clients:").append(System.lineSeparator());
        for (Pet datum : data) {
            stringBuilder.append(datum.getName()).append(" ").append(datum.getOwner()).append(System.lineSeparator());
        }
        return stringBuilder.toString();
    }
}
