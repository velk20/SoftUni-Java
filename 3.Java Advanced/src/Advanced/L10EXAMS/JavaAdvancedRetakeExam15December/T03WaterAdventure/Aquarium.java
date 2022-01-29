package Advanced.L10EXAMS.JavaAdvancedRetakeExam15December.T03WaterAdventure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Aquarium {
    private String name;
    private int capacity;
    private int size;
    private Map<String,Fish> fishInPool;

    public Aquarium(String name, int capacity, int size) {
        this.name = name;
        this.capacity = capacity;
        this.size = size;
        fishInPool = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getSize() {
        return size;
    }

    public int getFishInPool() {
        return this.fishInPool.size();
    }

    public void add(Fish fish) {
        String fishName = fish.getName();
        if (!fishInPool.containsKey(fishName)) {
            fishInPool.put(fishName, fish);
        }
    }

    public boolean remove(String name) {
        if (fishInPool.containsKey(name)) {
            fishInPool.remove(name);
            return true;
        }return false;
    }

    public Fish findFish(String name) {
        if (fishInPool.containsKey(name)) {
            return fishInPool.get(name);
        }
        return null;
    }

    public String report() {
        return String.format("Aquarium: %s ^ Size: %d\n", this.name, this.size) +
                fishInPool.values().stream().toString();
    }
}
