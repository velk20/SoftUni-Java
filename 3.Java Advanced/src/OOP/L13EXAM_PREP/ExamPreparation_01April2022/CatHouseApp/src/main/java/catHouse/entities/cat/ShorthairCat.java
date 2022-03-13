package OOP.L13EXAM_PREP.ExamPreparation_01April2022.CatHouseApp.src.main.java.catHouse.entities.cat;

public class ShorthairCat extends BaseCat{
    public ShorthairCat(String name, String breed, double price) {
        super(name, breed, price);
        super.setKilograms(7);
    }

    @Override
    public void eating() {
        super.setKilograms(super.getKilograms() + 1);
    }
}
