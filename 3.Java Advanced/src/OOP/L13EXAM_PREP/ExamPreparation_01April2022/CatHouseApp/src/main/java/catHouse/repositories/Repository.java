package OOP.L13EXAM_PREP.ExamPreparation_01April2022.CatHouseApp.src.main.java.catHouse.repositories;

import catHouse.entities.toys.Toy;

public interface Repository {

    void buyToy(Toy toy);

    boolean removeToy(Toy toy);

    Toy findFirst(String type);
}
