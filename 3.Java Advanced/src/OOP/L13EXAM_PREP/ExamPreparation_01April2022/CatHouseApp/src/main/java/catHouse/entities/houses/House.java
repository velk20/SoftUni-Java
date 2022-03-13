package OOP.L13EXAM_PREP.ExamPreparation_01April2022.CatHouseApp.src.main.java.catHouse.entities.houses;

import catHouse.entities.cat.Cat;
import catHouse.entities.toys.Toy;

import java.util.Collection;

public interface House {
    int sumSoftness();

    void addCat(Cat cat);

    void removeCat(Cat cat);

    void buyToy(Toy toy);

    void feeding();

    String getStatistics();

    String getName();

    void setName(String name);

    Collection<Cat> getCats();

    Collection<Toy> getToys();
}
