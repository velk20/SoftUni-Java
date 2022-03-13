package OOP.L13EXAM_PREP.ExamPreparation_01April2022.CatHouseApp.src.main.java.catHouse.repositories;

import catHouse.entities.toys.Toy;

import java.util.ArrayList;
import java.util.List;


public class ToyRepository implements Repository {
    private List<Toy> toys;

    public ToyRepository() {
        toys = new ArrayList<>();
    }

    @Override
    public void buyToy(Toy toy) {
        this.toys.add(toy);
    }

    @Override
    public boolean removeToy(Toy toy) {
        return this.toys.remove(toy);
    }

    @Override
    public Toy findFirst(String type) {
        for (Toy toy : toys) {
            if (toy.getClass().getSimpleName().equals(type)) {
                return toy;
            }
        }
        return null;
    }
}

