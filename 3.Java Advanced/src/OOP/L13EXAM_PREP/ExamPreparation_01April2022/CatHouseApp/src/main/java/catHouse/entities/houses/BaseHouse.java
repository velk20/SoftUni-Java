package OOP.L13EXAM_PREP.ExamPreparation_01April2022.CatHouseApp.src.main.java.catHouse.entities.houses;

import catHouse.common.ExceptionMessages;
import catHouse.entities.cat.Cat;
import catHouse.entities.toys.Toy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class BaseHouse implements House {
    private String name;
    private int capacity;
    private List<Toy> toys;
    private List<Cat> cats;

    public BaseHouse(String name, int capacity) {
        this.setName(name);
        this.capacity = capacity;
        toys = new ArrayList<>();
        cats = new ArrayList<>();
    }

    @Override

    public int sumSoftness() {
        return toys.stream().mapToInt(Toy::getSoftness).sum();
    }

    @Override
    public void addCat(Cat cat) {
        if (cats.size() < capacity) {
            this.cats.add(cat);
        } else throw new IllegalArgumentException("Not enough capacity for this cat.");
    }

    @Override
    public void removeCat(Cat cat) {
        this.cats.remove(cat);
    }

    @Override
    public void buyToy(Toy toy) {
        this.toys.add(toy);
    }

    @Override
    public void feeding() {
        for (Cat cat : cats) {
            cat.eating();
        }
    }

    @Override
    public String getStatistics() {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(String.format("%s %s:",this.getName(),this.getClass().getSimpleName())).append(System.lineSeparator());
        if (this.cats.isEmpty()) {
            stringBuilder.append("Cats: none").append(System.lineSeparator());
        }else {
            stringBuilder.append("Cats: ");
            for (Cat cat : cats) {
                stringBuilder.append(cat.getName()).append(" ");
            }
            stringBuilder.append(System.lineSeparator());
        }
        stringBuilder.append(String.format("Toys: %d Softness: %d", this.toys.size(),
                this.toys.stream().mapToInt(Toy::getSoftness).sum()));
        return stringBuilder.toString();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new NullPointerException(ExceptionMessages.HOUSE_NAME_CANNOT_BE_NULL_OR_EMPTY);
        }
        this.name = name;
    }

    @Override
    public Collection<Cat> getCats() {
        return this.cats;
    }

    @Override
    public Collection<Toy> getToys() {
        return this.toys;
    }
}
