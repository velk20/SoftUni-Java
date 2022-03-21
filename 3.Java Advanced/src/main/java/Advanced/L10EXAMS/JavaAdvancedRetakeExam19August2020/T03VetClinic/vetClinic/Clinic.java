package Advanced.L10EXAMS.JavaAdvancedRetakeExam19August2020.T03VetClinic.vetClinic;


import java.nio.channels.Pipe;
import java.util.ArrayList;
import java.util.List;

public class Clinic {
    private int capacity;
    private List<Pet> data;

    public Clinic(int capacity) {
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public void add(Pet pet) {
        if (data.size() + 1 <= capacity) {
            data.add(pet);
        }
    }

    public boolean remove(String name) {
        for (Pet pet : data) {
            if (pet.getName().equals(name)) {
                this.data.remove(pet);
                return true;
            }
        }
        return false;
    }

    public Pet getPet(String name,String owner){
        for (Pet datum : data) {
            if (datum.getName().equals(name) && datum.getOwner().equals(owner)) {
                return datum;
            }
        }
        return null;
    }

    public Pet getOldestPet() {
        Pet oldest = this.data.get(0);
        for (Pet datum : data) {
            if (datum.getAge() > oldest.getAge()) {
                oldest = datum;
            }
        }
        return oldest;
    }

    public int getCount() {
        return this.data.size();
    }

    public String getStatistics(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("The clinic has the following patients:").append(System.lineSeparator());
        for (Pet datum : data) {
            stringBuilder.append(String.format("%s %s",datum.getName(),datum.getOwner())).append(System.lineSeparator());

        }
        return stringBuilder.toString();
    }

}
