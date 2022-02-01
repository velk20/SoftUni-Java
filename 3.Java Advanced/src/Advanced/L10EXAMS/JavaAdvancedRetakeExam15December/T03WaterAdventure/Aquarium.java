package Advanced.L10EXAMS.JavaAdvancedRetakeExam15December.T03WaterAdventure;

import java.util.LinkedHashMap;
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
        fishInPool = new LinkedHashMap<>();
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
        if (!fishInPool.containsKey(fishName) && capacity > getFishInPool()) {
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
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(String.format("Aquarium: %s ^ Size: %d", this.name, this.size)).append(System.lineSeparator());

            fishInPool.values().stream().forEach(e -> stringBuilder.append(e).append(System.lineSeparator()));


        return stringBuilder.toString();
    }
}
